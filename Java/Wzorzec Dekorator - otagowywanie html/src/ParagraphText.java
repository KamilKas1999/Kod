class ParagraphText extends PlainTextDecorator {
    public ParagraphText( PlainText plainText )
    {
        super( plainText );
    }
    public String write()
    {
        String ret = "<p>" + super.write() + "</p>";
        return ret;
    }
}
