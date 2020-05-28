
class FormatText extends PlainTextDecorator {
    String text;
    public FormatText(PlainText plainText) {
        super(plainText);
        this.text = plainText.text;
    }

    public String write()
    {
        String ret = "<strong>" + super.write() + "</strong>";
        return ret;
    }
}