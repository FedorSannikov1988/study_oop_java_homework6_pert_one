public class Report implements TypesReports {

    /*
    данный класс формирует два типа отчета
    для пользователя
     */
    private User user;

    public Report(User user) {
        this.user = user;
    }

    @Override
    public String reportTypeOne() {
        return "GenerateReportTypeOne for user:" + " " + user.getNameUser();
    }

    @Override
    public String reportTypeTwo() {
        return "GenerateReportTypeOne for user:" + " " + user.getNameUser();
    }
}
