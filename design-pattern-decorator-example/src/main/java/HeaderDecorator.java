public class HeaderDecorator extends ReportDecorator {

    public HeaderDecorator(Report report) {
        super(report);
    }

    @Override
    public String generateContent() {
        return "<header> Report Header </header> "+report.generateContent();
    }
}
