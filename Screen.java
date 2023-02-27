public class Screen implements InformationOutput {

    @Override
    public void outputReportTypeOne(Report report) {
        System.out.println("\n" + "Screen:" + " " + report.reportTypeOne() + "\n");
    }

    @Override
    public void outputReportTypeTwo(Report report) {
        System.out.println("\n" + "Screen:" + " " + report.reportTypeTwo() + "\n");
    }
}
