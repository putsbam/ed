public class TestePilha {

	public static void main(String[] args) {

		Pilha p = new Pilha(5);
		System.out.println(p.StackEmpty());
		
		p.Push(10);
		System.out.println(p.StackEmpty());
		
		try {
			p.Pop();
		} catch (Exception e) {
			System.out.println("Pilha vazia");
		}
		System.out.println(p.StackEmpty());
		
		try {
			p.Pop();
		} catch (Exception e) {
			System.out.println("Pilha vazia");
		}

	}

}
