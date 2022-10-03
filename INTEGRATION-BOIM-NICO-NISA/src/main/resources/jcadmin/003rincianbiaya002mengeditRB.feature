Feature: Rincian Biaya
	Background: Background login
		When Admin login dan membuka halaman rincian biaya
		And Admin klik tombol edit rincian biaya pertama
		        
 Scenario: Mengedit nama program di data pertama
  When Admin mengedit nama program dengan <nama program>
  And Admin menekan tombol simpan edit nama program
  Then Admin mengedit nama program
  Examples:
  |nama program|
  |Pemrograman cucumber|
  
 Scenario: Mengedit harga awal di data pertama
  When Admin mengedit harga awal dengan <harga awal>
  And Admin menekan tombol simpan edit harga awal
  Then Admin mengedit harga awal
 Examples:
 |harga awal|
 |50000|
 
  Scenario: Mengedit diskon di data pertama
  When Admin mengedit diskon dengan <diskon>
  And Admin menekan tombol simpan edit diskon
  Then Admin mengedit diskon
  Examples:
  |diskon|
  |30|
  
  Scenario: Mengedit keunggulan1 di data pertama
  When Admin mengedit keunggulan1 dengan <keunggulan1>
  And Admin menekan tombol simpan edit keunggulan1
  Then Admin mengedit keunggulan1
  Examples:
  |keunggulan1|
  |dapat link kerja|
  
  Scenario: Mengedit keunggulan2 di data pertama
  When Admin mengedit keunggulan2 dengan <keunggulan2>
  And Admin menekan tombol simpan edit keunggulan2
  Then Admin mengedit keunggulan2
    Examples:
  |keunggulan2|
  |dapat link kerja|
  
  
   Scenario: Mengedit keunggulan3 di data pertama
  When Admin mengedit keunggulan3 dengan <keunggulan3>
  And Admin menekan tombol simpan edit keunggulan3
  Then Admin mengedit keunggulan3
    Examples:
  |keunggulan3|
  |dapat link kerja|
  
   Scenario: Mengedit keunggulan4 di data pertama
  When Admin mengedit keunggulan4 dengan <keunggulan4>
  And Admin menekan tombol simpan edit keunggulan4
  Then Admin mengedit keunggulan4
    Examples:
  |keunggulan4|
  |dapat link kerja|
