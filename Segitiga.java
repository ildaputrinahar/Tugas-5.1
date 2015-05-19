public class Segitiga {
	private int alas;
	private int tinggi;
	private int sisimiring;
	private double luas;
	private double keliling;

	public Segitiga(int a, int t, int simir){
		alas = a;
		tinggi = t;
		sisimiring = simir;
	}

	public void CetakSegitiga(){
		System.out.println("*** SEGITIGA ***");
		System.out.println("Alas = " +alas);
		System.out.println("Tinggi = " +tinggi);
		System.out.println("Sisi Miring = " +sisimiring);
	}

	public void HitungSegitiga(){
		luas = 0.5*alas*tinggi;
		System.out.println("Luas Segitiga : a x t= " +luas);

		keliling = alas + tinggi + sisimiring;
		System.out.println("Keliling Segitiga : a + t + simir = " +keliling);
	}
}