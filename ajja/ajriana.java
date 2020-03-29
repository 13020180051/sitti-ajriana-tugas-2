import java.util.Scanner;

public class ajriana{
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);
		String nim;
		String nama;
		String jurusan;
		String fakultas;
		System.out.print("masukan nim :");
		nim =input.nextLine();
		System.out.print("masukan nama :");
		nama =input.nextLine();
		System.out.print("masukan jurusan :");
		jurusan = input.nextLine();
		System.out.print("masukan fakultas :");
		fakultas = input.nextLine();

		System.out.println("--------------------");
		System.out.println("nim		: "+nim);
		System.out.println("nama	: "+nama);
		System.out.println("jurusan	: "+jurusan);
		System.out.println("fakultas	: "+fakultas);
	}
}