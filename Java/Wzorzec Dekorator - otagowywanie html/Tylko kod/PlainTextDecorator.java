public class PlainTextDecorator extends PlainText{
    protected  PlainText plainText;
    PlainTextDecorator(PlainText plainText){
        this.plainText = plainText;
    }
    @Override
    public String write() {
      return plainText.write();
    }
}
