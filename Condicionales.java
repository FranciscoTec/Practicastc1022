import java.util.Scanner;
public class Condicionales{
	public static void main(String[] args){
		int año=0;
		boolean leap=false;
		Scanner kb = new Scanner(System.in);
		System.out.println("Que año");
		año=kb.nextInt();
		if (año%4==0&&!(año%100==0)) {
			leap=true;
		}
		if (leap==true) {
			System.out.println("El año es bisiesto");
		}
		else{
			System.out.println("El año no es bisiesto");
		}
	}
}