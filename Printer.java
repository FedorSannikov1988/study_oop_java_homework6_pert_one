public class Printer implements InformationOutput {

    @Override
    public void outputReportTypeOne(Report report) {
        System.out.println("\n" + "Print:" + " " + report.reportTypeOne() + "\n");
    }

    @Override
    public void outputReportTypeTwo(Report report) {
        System.out.println("\n" + "Print:" + " " + report.reportTypeTwo() + "\n");
    }
}
