Feature: Rincian Biaya   
  Scenario Outline: Menambah daftar rincian biaya baru active
    Given Admin login dan membuka halaman rincian biaya tambah
    When Admin klik tombol tambah rincian biaya
    And  Admin mengisi form tambah dengan publish <status>
    And Admin menekan tombol simpan tambah rincian biaya
    Then Admin menambah rincian biaya active valid
    
   Examples:
   	|status|
   	|Active|
   	|InActive|