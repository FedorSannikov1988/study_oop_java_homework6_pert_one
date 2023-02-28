public class Main {

	public static void main(String[] args) {

		//создаем пользователя
		User userOne = new User("Илья Муромец");

		//создаем объект report в классе которого предусмотрено два
		//метода для формирования отчетов двух различных типов
		//при передаче 1-ого пользователя (объекта типа User):
		Report report = new Report(userOne);

		//выводим на экран отчет типа 1 и типа 2:
		new Screen().outputReportTypeOne(report);
		new Screen().outputReportTypeTwo(report);

		//распечатываем отчет типа 1 и типа 2:
		new Printer().outputReportTypeOne(report);
		new Printer().outputReportTypeTwo(report);

		//сохраняем отчет первого и второго типа в файле формата TXT
		SaveReport saveReportInFileFormatTXT = new SaveInFileFormatTXT(report);
		saveReportInFileFormatTXT.saveReportTypesOne();
		saveReportInFileFormatTXT.saveReportTypesTwo();

		//сохраняем отчет первого и второго типа в файле формата CSV
		SaveReport saveReportInFileFormatCSV = new SaveInFileFormatCSV(report);
		saveReportInFileFormatCSV.saveReportTypesOne();
		saveReportInFileFormatCSV.saveReportTypesTwo();
	}
}