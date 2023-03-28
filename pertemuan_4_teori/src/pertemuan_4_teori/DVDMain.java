package pertemuan_4_teori;

public class DVDMain {

	public static void main(String[] args) {
		
		DVDMusik musik = new DVDMusik("Glimpse Of Us", "88Rising", 100,"Joji", "Connor McDonough", "R&B", "Test Drive, Slow Dancing in the Dark,Run, High Hopes");

		DVDFilm film = new DVDFilm("Harry Potter", "Bloomsbury Publishing",50, "Daniel Radcliffe, Emma Watson, Rupert Grint, Michael Gambon, RalphFiennes", "David Yates", "R");

		film.tampilkanSemuaAtribut();
		System.out.println("\n");
		musik.tampiilkanSemuaAtribut();
	}
}
