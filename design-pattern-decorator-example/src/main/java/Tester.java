public class Tester {
    public static void main(String[] args) {
        Report report = new HTMLReport();
        HeaderDecorator headerDecorator = new HeaderDecorator(report);
        FooterDecorator footerDecorator = new FooterDecorator(headerDecorator);
        EncryptionDecorator encryptionDecorator = new EncryptionDecorator(footerDecorator);
        System.out.println(encryptionDecorator.generateContent());
    }
}
