public class HighlightText extends PlainTextDecorator {
    public HighlightText( PlainText plainText )
    {
        super( plainText );
    }
    public String write()
    {
        String ret = "<mark>" + super.write() + "</mark>";
        return ret;
    }
}
