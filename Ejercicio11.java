import java.util.Random;
import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce dimension");
		int a = sc.nextInt();
		//Rellenamos primera array numeros random
		int num[] = rellenar(a);
		//Rellenamos un array de posiciones random entre 0 y el tamaño
		int num_aux[] = rellenar_aux(a);
		//Rellenamos la segunda array
		int num2[]= new int [a];
		for(int i = 0; i < num2.length; i++) {
			num2[num_aux[i]] = num[i];
		}
		//Rellenamos tercera array multiplicando
		int num_final[] = multiplicar(a, num, num2);
		
		imprimir(num);
		imprimir(num2);
		imprimir(num_final);

	}
	
	public static void imprimir(int lista[]) {
		for (int i = 0; i < lista.length; i++) {
			System.out.println("En la posicion "+i+ " hay el valor "+lista[i]);
		}
	}
	
	public static int [] multiplicar (int a, int num[], int num2[]) {
		int num_final[] = new int [a];
		for(int i = 0; i<num_final.length; i++) {
			num_final[i] = num[i]*num2[i];
		}
		return num_final;
	}
	
	public static int [] rellenar (int a) {
		Random r = new Random();
		int num[]= new int [a];
		for(int i = 0; i < num.length; i++) {
			num[i] = r.nextInt();
		}
		
		return num;
	}
	
	public static int [] rellenar_aux (int a) {
		int max = a;
		int min = -1;
		int num[]= new int [a];
		for(int i = 0; i < num.length; i++) {
			num[i] = (int) (Math.random() * (max - min - 1) + (min)) + 1;
		}
		
		return num;
	}

}
