public class FooterDecorator extends ReportDecorator {

    public FooterDecorator(Report report) {
        super(report);
    }

    @Override
    public String generateContent() {
        return report.generateContent() + " <footer> Report Footer </footer>";
    }
}
