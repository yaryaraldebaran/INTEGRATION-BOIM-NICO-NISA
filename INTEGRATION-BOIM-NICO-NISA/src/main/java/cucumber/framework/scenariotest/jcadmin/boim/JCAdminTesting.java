package cucumber.framework.scenariotest.jcadmin.boim;

public enum JCAdminTesting {
	T1("Menambah daftar rincian biaya baru active"),
	T2("Menambah daftar rincian biaya baru inactive"),
	T3("Mengedit nama program di data pertama rincian biaya baru"),
	T4("Mengedit harga normal di data pertama rincian biaya baru"),
	T5("Mengedit diskon di data pertama rincian biaya baru"),
	T6("Mengedit keunggulan1 di data pertama rincian biaya baru"),
	T7("Mengedit keunggulan2 di data pertama rincian biaya baru"),
	T8("Mengedit keunggulan3 di data pertama rincian biaya baru"),
	T9("Mengedit keunggulan4 di data pertama rincian biaya baru"),
	T10("Mengedit keunggulan5 di data pertama rincian biaya baru"),
	;
	
	private String testName;
	
	private JCAdminTesting(String value) {
		testName = value;
	}
	
	public String getTestName() {
		return testName;
	}
}
