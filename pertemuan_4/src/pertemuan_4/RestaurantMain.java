package pertemuan_4;

public class RestaurantMain {

	public static void main(String[] args) {
		Restaurant menu = new Restaurant();
		
		menu.tambahMenuMakanan("Gehu", 1000, 20);
		menu.tambahMenuMakanan("Tahu", 1000, 0);
		menu.tambahMenuMakanan("Molen", 1000, 20);

		menu.pesanMakanan("Gehu", 19);

		menu.tampilkanMenuMakanan();
	}
}