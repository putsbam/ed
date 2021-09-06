package pilha;

public class TestePilha {

	public static void main(String[] args) {

		Pilha p = new Pilha(5);

		try {
			p.Push(10);
			p.Push(15);
			System.out.println(p.Pop());
			System.out.println(p.Pop());
			System.out.println(p.Pop());
		} catch (Exception e) {
			System.out.println(e);
		}

		try {

			System.out.println("\n\t======= BEGIN MODIFICATIONS =======\n");

			System.out.println("Return StackFull(): " + p.StackFull()); // Q2 (não cheia)

				System.out.println(p.Push(10));
				System.out.println(p.Push(11));
				System.out.println(p.Push(12));
				System.out.println(p.Push(13));
				System.out.println(p.Push(14));

			System.out.println("Return StackFull(): " + p.StackFull()); // Q2 (cheia)

				System.out.println(p.Push(15)); // Exception trigger

		} catch (Exception e) {
			System.out.println(e);
		}
	}
}