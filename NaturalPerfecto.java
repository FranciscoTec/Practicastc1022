import java.util.Scanner;
public class NaturalPerfecto{
	public static void main(String[] args){
		int counter=1, numero=0, suma=0, counter2=0;
		Scanner kb = new Scanner(System.in);
		System.out.println("Que numero quieres comprobar");
		numero=kb.nextInt();
		counter2=counter++;
		for (counter=0; counter<numero ;counter++) {
			if(numero%counter2==0){
				suma=suma+counter2;
			}
			counter++;
			counter2++;
		}
		if (numero==suma) {
			System.out.println("El numero es natural perfecto");
		}
		else{
			System.out.println("El numero no es natural perfecto");
		}
	}
}