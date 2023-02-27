public class SaveInFile implements TypesSaveFile {

    private Report report = null;

    public SaveInFile(Report report) {
        this.report = report;
    }

    @Override
    public void saveReportTypeOneInTXT() {
        System.out.println("Save report type one in txt:" + " " + report.reportTypeOne());
    }

    @Override
    public void saveReportTypeOneInCSV() {
        System.out.println("Save report type one in csv:" + " " + report.reportTypeOne());
    }

    @Override
    public void saveReportTypeTwoInTXT() {
        System.out.println("Save report type two in txt:" + " " + report.reportTypeTwo());
    }

    @Override
    public void saveReportTypeTwoInCSV() {
        System.out.println("Save report type two in csv:" + " " + report.reportTypeTwo());
    }
}
