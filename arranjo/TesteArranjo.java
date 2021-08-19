package arranjo;

public class TesteArranjo {
    public static void main(String[] args) {

		Arranjo<String> arr1 = new Arranjo<String>(5);
		
		arr1.Set(0,"a");
        arr1.Set(1,"b");
        System.out.println(arr1.Get(1));
        arr1.Set(2,"c");
        arr1.Imprime();
		arr1.Set(3,"d");
        arr1.Imprime();
	}   
}
