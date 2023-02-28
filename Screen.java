public class Screen implements InformationOutput {

    /*
    данный класс нужен только чтобы вывести на экран
    нужный тип отчета
    */
    @Override
    public void outputReportTypeOne(Report report) {
        System.out.println("\n" + "Screen:" + " " + report.reportTypeOne() + "\n");
    }

    @Override
    public void outputReportTypeTwo(Report report) {
        System.out.println("\n" + "Screen:" + " " + report.reportTypeTwo() + "\n");
    }
}
