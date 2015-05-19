public class TestBangun {
	public static void main(String[] args) {
		Segitiga segita = new Segitiga(9, 16, 25);
		segita.CetakSegitiga();
		System.out.println("");
		segita.HitungSegitiga();

		System.out.println();
		System.out.println();

		lingkaran bulat = new lingkaran(10);
		bulat.CetakLingkaran();
		System.out.println("");
		bulat.HitungLingkaran();
	}
}