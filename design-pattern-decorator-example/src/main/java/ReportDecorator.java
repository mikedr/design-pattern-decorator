public abstract class ReportDecorator implements Report {
    Report report;

    public ReportDecorator(Report report) {
        this.report = report;
    }

    public abstract String generateContent();
}
