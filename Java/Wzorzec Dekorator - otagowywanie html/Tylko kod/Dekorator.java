import java.util.Scanner;

public class Dekorator {
    public static void main(String[] args) {
        Boolean emphasized, highlight ,format,paragraph;
        Scanner scanner = new Scanner(System.in);
        PlainText plainText = new Text();
        PlainText tagText;
        System.out.print("Podaj tekst, który chcesz otagować: ");
        plainText.text = scanner.nextLine();
        for(;;) {
           try {
                System.out.println("Odpowiadaj wpisując true lub false");
                System.out.print("Czy chcesz dodać kursywę? (<em>): ");
                emphasized = scanner.nextBoolean();
                System.out.print("Czy chcesz uwydatnić tekst? (<mark>): ");
                highlight = scanner.nextBoolean();
                System.out.print("Czy chcesz wytłuścić tekst? (<strong>): ");
                format = scanner.nextBoolean();
                System.out.print("Czy chcesz dodać akapit? (<p>): ");
                paragraph = scanner.nextBoolean();
                break;
            } catch (Exception e) {
        System.out.println("Błędne dane");
    }
            scanner.nextLine();
}

            if (emphasized && highlight && format && paragraph) {
                tagText = new EmphasizedText(new HighlightText(new FormatText(new ParagraphText(plainText))));
                System.out.println(tagText.write());
            } else if (emphasized && highlight && format) {
                tagText = new EmphasizedText(new HighlightText((new FormatText(plainText))));
                System.out.println(tagText.write());
            } else if (emphasized && format && paragraph) {
                tagText = new EmphasizedText(new FormatText((new ParagraphText(plainText))));
                System.out.println(tagText.write());
            } else if (highlight && format && paragraph) {
                tagText = new HighlightText(new FormatText((new ParagraphText(plainText))));
                System.out.println(tagText.write());
            } else if (emphasized && highlight && paragraph) {
                tagText = new EmphasizedText(new HighlightText((new ParagraphText(plainText))));
                System.out.println(tagText.write());
            } else if (emphasized && highlight) {
                tagText = new EmphasizedText(new HighlightText(plainText));
                System.out.println(tagText.write());
            } else if (emphasized && format) {
                tagText = new EmphasizedText(new FormatText(plainText));
                System.out.println(tagText.write());
            } else if (emphasized && paragraph) {
                tagText = new EmphasizedText(new ParagraphText(plainText));
                System.out.println(tagText.write());
            } else if (highlight && format) {
                tagText = new HighlightText(new FormatText(plainText));
                System.out.println(tagText.write());
            } else if (highlight && paragraph) {
                tagText = new HighlightText(new ParagraphText(plainText));
                System.out.println(tagText.write());
            } else if (format && paragraph) {
                tagText = new FormatText(new ParagraphText(plainText));
                System.out.println(tagText.write());
            } else if (emphasized) {
                tagText = new EmphasizedText(plainText);
                System.out.println(tagText.write());
            } else if (highlight) {
                tagText = new EmphasizedText(plainText);
                System.out.println(tagText.write());
            } else if (format) {
                tagText = new EmphasizedText(plainText);
                System.out.println(tagText.write());
            } else if (paragraph) {
                tagText = new EmphasizedText(plainText);
                System.out.println(tagText.write());
            } else {
                System.out.println(plainText.text);
            }


        }
    }

