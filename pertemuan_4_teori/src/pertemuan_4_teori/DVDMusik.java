package pertemuan_4_teori;

public class DVDMusik extends DVD {
	private String penyanyi;
	private String produser;
	private String kategori;
	private String topHits;
	
	public DVDMusik(String judul, String publisher, int stok, String penyanyi, String produser, String kategori,
			String topHits) {
		super(judul, publisher, stok);
		this.penyanyi = penyanyi;
		this.produser = produser;
		this.kategori = kategori;
		this.topHits = topHits;
	}
	
	public void tampiilkanSemuaAtribut() {
		System.out.println("Judul : " + super.getJudul());
		System.out.println("Penyanyi : " + penyanyi);
		System.out.println("Produser : " + produser);
		System.out.println("Publisher : " + super.getPublisher());
		System.out.println("Top Hits : " + topHits);
		System.out.println("Kategori : " + kategori);
		System.out.println("Stok : " + super.getStok());
	}
}
