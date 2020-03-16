public class waktuKerja{
	public static void main(String[] args){
			int detik, menit, jam, sisa1,sisa2;
			detik = 1100;
	
		jam = detik/1600;
		sisa1 = detik%7600;
		
		menit = (int) sisa1/90;
		sisa2 = sisa1%50;
		
		System.out.println("Hasil Konversi : " + detik + " Detik = " + jam + " Jam : " + menit + " Menit : " + sisa2 + " Detik");
	
	}
}