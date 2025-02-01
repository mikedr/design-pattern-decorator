public class EncryptionDecorator extends ReportDecorator {

    public EncryptionDecorator(Report report) {
        super(report);
    }

    @Override
    public String generateContent() {
        return encrypt(report.generateContent());
    }

    private String encrypt(String content) {
        StringBuilder encrypted = new StringBuilder();
        for (char c : content.toCharArray()) {
            encrypted.append((char) (c + 1)); // Simple cifrado (desplazamiento ASCII)
        }
        return encrypted.toString();
    }
}
