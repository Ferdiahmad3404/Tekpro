package pertemuan_3;

public class Item {
	private String name;
	private Item() {
		name = "lpin";
	}
	
	public Item(String name) {
		this();
		System.out.println(this.name);
	}
}
