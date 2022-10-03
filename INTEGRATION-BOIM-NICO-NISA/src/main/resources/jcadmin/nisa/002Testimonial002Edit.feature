Feature: Edit Testimonial
	Background: Background login
		When Admin login dan membuka halaman testimonials
		And Admin klik tombol edit testimonial pertama
		
 Scenario: Mengedit gambar di data pertama
  When TE028P Admin mengedit gambar peserta 
  And TE028P Admin menekan tombol simpan edit gambar peserta
  Then TE028P Admin berhasil edit gambar peserta
		        
 Scenario: Mengedit nama peserta di data pertama
  When TE035P Admin mengedit nama peserta 
  And TE035P Admin menekan tombol simpan edit nama peserta
  Then TE035P Admin berhasil edit nama peserta
  
 Scenario: Mengedit isi testimonial 
  When TE036P Admin mengedit isi testimonial 
  And TE036P Admin menekan tombol simpan edit isi testimonial
  Then TE036P Admin berhasil edit isi testimonial
  
 
  