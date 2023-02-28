public class SaveInFileFormatCSV implements SaveReport {

    /*
    данный класс сохраняет два типа отчетов в формате CSV
    */

    private Report report;

    public SaveInFileFormatCSV(Report report) {
        this.report = report;
    }

    @Override
    public void saveReportTypesOne() {
        System.out.println("Save report type one in csv:" + " " + report.reportTypeOne());
    }

    @Override
    public void saveReportTypesTwo() {
        System.out.println("Save report type two in csv:" + " " + report.reportTypeTwo());
    }
}
