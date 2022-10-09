package cucumber.framework.scenariotest.jcadmin.total;

public enum JCAdminTesting {
	/*
	 * NISA
	 */
	A001(" User valid login Outlinee"),
	A002("User valid login uppercase user Outlinee"),
	A003("User valid login uppercase email Outlinee"),
	A004("User valid login uppercase Outlinee"),
	A005("User valid login upperlower case user Outlinee"),
	A006("User valid login upperlower case email Outlinee"),
	A007("User valid login upperlower case Outlinee"),
	A008("Admin invalid login simpan"),
	A009("Admin invalid login klik submit"),
	A010("Admin invalid login input username"),
	A011("Admin invalid login input password"),
	A012("Admin invalid login input password uppercase"),
	A013("Admin invalid login upper"),
	A014("Admin invalid login input spasi"),
	A015("Admin invalid login user tanpa format email"),
	A016("Menambah daftar testimonial active"),
	A017("Menambah daftar testimonial noactive"),
	A018("Menambah daftar testimonial active format gambar"),
	A019("Menambah testimonial no active format gambar"),
	A020("Menambah testi active karakter beda"),
	A021("Menambah testi no active format karakter beda"),//terakhir sama 
	A022("Menambah daftar negative testimonial active"),//mulai beda
	A023("Menambah daftar negative testimonial no active"),
	A024("Menambah daftar negative testimonial kosong isi active"),
	A025("Menambah daftar negative testimonial kosong isi no active"),
	A026("Menambah daftar negative testimonial panjang karakter active"),
	A027("Menambah data negative testimonial karakter no active"),
	A028("Menambah daftar negative testimonial nama kecuali active"),
	A029("Menambah daftar negative testimonial nama char no active"),
	A030("Mengedit gambar di data pertama"),
	A031("Mengedit dropdown rating nol"),
	A032("Mengedit dropdown menu rating satu"),
	A033("Mengedit menu dropdown rating dua"),
	A034("Mengedit rating tiga dropdown"),
	A035("Mengedit rating empat menu dropdown"),
	A036("Mengedit rating lima dropdown menu"),
	A037("Mengedit nama peserta di data pertama"),
	A038("Mengedit isi testimonial"),
	A039("Mengedit active no active"),
	A040("Mengedit no active active"),
	A041("Mengedit nama peserta dengan karakter dikecualikan pada data pertama"),
	A042("Mengedit nama peserta full di data pertama"),
	A043("Mencari nama peserta"),
	A044("Mencari nama peserta dengan karakter"),
	A045("Mencari isi testimonial peserta"),
	A046("Mencari dan edit gambar"),
	A047("Mencari dan edit nama"),
	A048("Mencari dan edit isi"),
	A049("Mencari dan edit publish"),
	A050("Melihat data dalam page list testimonials"),
	A051("Memindahkan halaman pertama"),
	A052("Memindahkan halaman kedua"),
	A053("Memindahkan halaman ketiga"),
	
	
	
	/*
	 * NICO
	 */
    N001("Membuka halaman about"),
    N002("Menambah daftar trainer status"),
    N003("Menambah daftar trainer dengan banyak ekstensi gambar eks"),
    N004("Tambah trainer negative masukkan foto dengan eks"),
    N005("Tambah trainer negative invalid input nama"),
    N006("Tambah trainer negative invalid input jabatan"),
    N007("Tambah trainer negative invalid input profile"),
    N008("Tambah trainer negative input nama500 karakter"),
    N009("Tambah trainer negative input jabatan500 karakter"),
    N010("Tambah trainer negative input profile500 karakter"),
    N011("Mencari data trainer"),
    N012("Berpindah halaman list trainer"),
    N013("Mencari data trainer dengan case"),
    N014("Mengedit data trainer publish status"),
    N015("Mengubah foto trainer"),
    N016("Mengubah nama trainer"),
    N017("Mengubah jabatan trainer"),
    N018("Mengubah profile trainer"),
    N019("Mengedit foto trainer negative dengan case"),
    N020("Mengedit case trainer negative"),
    N021("Mengedit case trainer negative dengan500 karakter"),
    N022("Negative : Mengubah foto trainer edit cari"),
    N023("Negative : Mengubah nama trainer edit cari"),
    N024("Negative : Mengubah jabatan trainer edit cari"),
    N025("Negative : Mengubah profile trainer edit cari"),
    N026("Negative : Mengedit data trainer publish status edit cari"),
    N027("Admin mengubah foto blog"),
    N028("Admin mengubah judul blog"),
    N029("Admin mengubah status blog status ke ubah"),
    N030("Mengubah nilai value dari case"),
    N031("Mengubah nilai dari Content Preview invalid"),
    N032("Membuka halaman Contact Messages"),
    N033("Admin sorting data berdasarkan sorting"),
    N034("Admin cari data berdasarkan sorting sorting"),
    N035("Berpindah halaman list Messages dengan angka angka"),
    N036("Berpindah halaman list Messages dengan panah"),
    N037("Admin mencari data data berdasarkan Nama"),
    N038("Admin mencari data data berdasarkan Email"),
    N039("Admin mencari data data berdasarkan Phone Number"),
    N040("Admin mencari data data berdasarkan Subject"),
    N041("Admin mencari data sorting dengan tekan tombol cari")
	;
	
	private String testName;
	
	private JCAdminTesting(String value) {
		testName = value;
	}
	
	public String getTestName() {
		return testName;
	}
}