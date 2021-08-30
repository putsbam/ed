package arranjo;

import java.util.Scanner;
import java.lang.Thread;

import static java.lang.Integer.parseInt;

public class TesteArranjo {

    public static void main(String[] args) {

        Scanner scanned = new Scanner(System.in);

		Arranjo<String> arr1 = new Arranjo<String>(5);
		
		arr1.Set(0,"a");
        arr1.Set(1,"b");
        System.out.println(arr1.Get(1));
        arr1.Set(2,"c");
        arr1.Imprime();
		arr1.Set(3,"d");
        arr1.Imprime();

        // Begin questao 3

        /*
        a) Inserir um dado na última posição não ocupada do arranjo. O dado é parâmetro do método.
        */

        System.out.println("\n\tQ.3 - a)\n");
        System.out.println("Qual dado a ser inserido na ultima posiçao do arranjo?");
        arr1.q3a(scanned.nextLine());
        arr1.Imprime();

        sleepMethod(2000);

        /*
        b) Inserir um dado na primeira posição do arranjo. Movendo o conteudo e preservando os dados
        */

        System.out.println("\n\tQ.3 - b)\n");
        System.out.println("Qual dado a ser inserido na primeira posiçao arranjo?");
        arr1.q3b(scanned.nextLine());
        arr1.Imprime();

        sleepMethod(2000);

        /*
        c) Inserir um dado em uma dada posição do arranjo
        */

        System.out.println("\n\tQ.3 - d)\n");
        System.out.println("Qual posiçao voce quer inserir o dado de teste 't'?");
        arr1.q3c(parseInt(scanned.nextLine()), "t");
        arr1.Imprime();

        sleepMethod(2000);

        /*
        d) Remover e retornar o dado da última posição ocupada do arranjo. Movendo o conteudo e preservando os dados
        */

        System.out.println("\n\tQ.3 - d)\n");
        System.out.println("Removendo ultimo dado...");
        System.out.println(arr1.q3d() + " foi removido!");
        arr1.Imprime();

        sleepMethod(2000);

        /*
        e) Remover e retornar o dado da primeira posição ocupada do arranjo. Movendo o conteudo e preservando os dados
        */

        System.out.println("\n\tQ.3 - e)\n");
        System.out.println("Removendo primeiro dado...");
        System.out.println(arr1.q3e() + " foi removido!");
        arr1.Imprime();

        sleepMethod(2000);

        /*
        f) Remover o dado da posição determinada do arranjo. Movendo o conteudo e preservando os dados
        */

        System.out.println("\n\tQ.3 - f)\n");
        System.out.println("Qual posiçao voce quer remover o dado?");
        arr1.q3f(parseInt(scanned.nextLine()));
        arr1.Imprime();

        sleepMethod(2000);
	}

    static void sleepMethod(int time) { // function só pra ter um timeout entre as questoes

        try {
            Thread.sleep(time);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}

