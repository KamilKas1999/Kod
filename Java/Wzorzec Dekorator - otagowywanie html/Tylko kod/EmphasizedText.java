public class EmphasizedText extends PlainTextDecorator {

        public EmphasizedText( PlainText plainText )
        {
            super( plainText );
        }
        public String write()
        {
            String ret = "<em>" + super.write() + "</em>";
            return ret;
        }

}
