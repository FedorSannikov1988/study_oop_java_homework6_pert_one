public class SaveInFileFormatTXT implements SaveReport {

    /*
    данный класс сохраняет два типа отчетов в формате CSV
    */

    private Report report;

    public SaveInFileFormatTXT(Report report) {
        this.report = report;
    }

    @Override
    public void saveReportTypesOne() {
        System.out.println("Save report type one in txt:" + " " + report.reportTypeOne());
    }

    @Override
    public void saveReportTypesTwo() {
        System.out.println("Save report type two in txt:" + " " + report.reportTypeTwo());
    }

}
