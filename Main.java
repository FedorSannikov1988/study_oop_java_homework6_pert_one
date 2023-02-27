public class Main {

	public static void main(String[] args) {

		User user = new User("Илья Муромец");
		//предрологаем что пользователь может сформировать два возможных типа отчета
		Report report = new Report(user);

		//сохраняем два возможных типа отчета в двух возможных форматах файлов:
		SaveInFile forSaveFile = new SaveInFile(report);
		forSaveFile.saveReportTypeOneInCSV();
		forSaveFile.saveReportTypeTwoInCSV();
		forSaveFile.saveReportTypeOneInTXT();
		forSaveFile.saveReportTypeTwoInTXT();

		//выводим на экран два типа отчетов:
		new Screen().outputReportTypeOne(report);
		new Screen().outputReportTypeTwo(report);

		//распечатываем два типа отчетов:
		new Printer().outputReportTypeOne(report);
		new Printer().outputReportTypeTwo(report);
	}
}