package cucumber.framework.scenariotest.jcadmin.total;

public enum JCAdminTesting {
	B001("Menambah daftar rincian biaya baru active"),
	B002("Menambah daftar rincian biaya baru inactive"),
	B003("Mengedit nama program di data pertama rincian biaya baru"),
	B004("Mengedit harga normal di data pertama rincian biaya baru"),
	B005("Mengedit diskon di data pertama rincian biaya baru"),
	B006("Mengedit keunggulan1 di data pertama rincian biaya baru"),
	N001("Membuka halaman about"),
	N002("Menambah daftar trainer"),
	N004("Mencari data trainer"),
	N005("Berpindah halaman list trainer"),
	N006("Mengedit data trainer publish"),
	N008("Mengubah foto trainer"),
	N009("Mengubah nama trainer"),
	N010("Mengubah jabatan trainer"),
	N011("Mengubah profile trainer"),
	N012("Mengubah foto trainer edit cari"),
	N013("Mengubah nama trainer edit cari"),
	N014("Mengubah jabatan trainer edit cari"),
	N015("Mengubah profile trainer edit cari"),
	;
	
	private String testName;
	
	private JCAdminTesting(String value) {
		testName = value;
	}
	
	public String getTestName() {
		return testName;
	}
}
