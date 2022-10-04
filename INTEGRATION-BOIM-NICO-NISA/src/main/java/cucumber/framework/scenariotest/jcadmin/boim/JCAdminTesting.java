package cucumber.framework.scenariotest.jcadmin.boim;

public enum JCAdminTesting {
	B001("Menambah daftar rincian biaya baru active"),
	B002("Menambah daftar rincian biaya baru inactive"),
	B003("Mengedit nama program di data pertama rincian biaya baru"),
	B004("Mengedit harga normal di data pertama rincian biaya baru"),
	B005("Mengedit diskon di data pertama rincian biaya baru"),
	B006("Mengedit keunggulan1 di data pertama rincian biaya baru"),
	B007("Mengedit keunggulan2 di data pertama rincian biaya baru"),
	B008("Mengedit keunggulan3 di data pertama rincian biaya baru"),
	B009("Mengedit keunggulan4 di data pertama rincian biaya baru"),
	B010("Mengedit keunggulan5 di data pertama rincian biaya baru"),
	;
	
	private String testName;
	
	private JCAdminTesting(String value) {
		testName = value;
	}
	
	public String getTestName() {
		return testName;
	}
}
