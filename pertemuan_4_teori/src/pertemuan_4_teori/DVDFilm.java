package pertemuan_4_teori;

public class DVDFilm extends DVD {
	private String pemeran;
	private String sutradara;
	private String kategori;
	
	public DVDFilm(String judul, String publisher, int stok, String pemeran, String sutradara, String kategori) {
		super(judul, publisher, stok);
		this.pemeran = pemeran;
		this.sutradara = sutradara;
		this.kategori = kategori;
	}
	
	public void tampilkanSemuaAtribut() {
		System.out.println("Judul : " + super.getJudul());
		System.out.println("Pemeran : " + pemeran);
		System.out.println("Sutradara : " + sutradara);
		System.out.println("Publisher : " + super.getPublisher());
		System.out.println("Kategori : " + kategori);
		System.out.println("Stok : " + super.getStok());
	}
}