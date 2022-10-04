package aulasJava;

public class ComandoFor {

	public static void main(String[] args) {

		for (int i = 0; i <= 20; i = i + 1) {

			// if (i%2!=0) { caso voce nao queira que apareça algum numero especifico, voce
			// pode usar essa formula
			System.out.println("O valor de i é:" + i);

			// }
		}
		System.out.println("FIM DO PROGRAMA!");

	}

}
//incrementar aumenta i=i+1) <--> i++
//descrementar diminui i=i-1)  <---> i--
// i = i + <----> i++ <----> i+=1 apenas para aumentar de um em um.
//i = i +2 <---> i+=2
// é possivel utilizar essa regra com +,-,*,/