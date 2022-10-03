Feature: Tambah Testimonial   
  Scenario Outline: Menambah daftar testimonial active
    Given Admin login dan membuka halaman testimonial
    When Admin klik tombol tambah
    And  Admin mengisi form dengan publish <status>
    And Admin menekan tombol simpan
    Then Admin menambah testimonial active valid
    
   Examples:
   	|status|
   	|No Active|
   	|Active|