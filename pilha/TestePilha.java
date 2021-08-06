package pilha;

public class TestePilha {

	public static void main(String[] args) {

		Pilha p = new Pilha(5);
		p.Push(10);
		p.Push(15);
		
		try {
			System.out.println(p.Pop());
			System.out.println(p.Pop());
			System.out.println(p.Pop());
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
