public class lingkaran {
	private int jari;
	private double luas;
	private double keliling;

	public lingkaran(int r){
		jari = r;
	}

	public void CetakLingkaran(){
		System.out.println("*** LINGKARAN ***");
		System.out.println("Jari-Jari lingkaran = " +jari);
	}

	public void HitungLingkaran(){
		luas = Math.PI*jari*jari;
		System.out.println("Luas Lingkaran : 3,14 X Jari-Jari X Jari-Jari = " +luas);

		keliling= Math.PI*(jari+jari);
		System.out.println("Kelililng Lingkaran : 3,14 X Diameter = " +keliling);
	}
}