public class Report implements TypesReports {

    private User user;

    private String report = "";

    public Report(User user) {
        this.user = user;
    }

    @Override
    public String reportTypeOne() {
        report = "GenerateReportTypeOne for user:" + " " + user.getNameUser();
        return report;
    }

    @Override
    public String reportTypeTwo() {
        report = "GenerateReportTypeTwo for user:" + " " + user.getNameUser();
        return report;
    }
}
