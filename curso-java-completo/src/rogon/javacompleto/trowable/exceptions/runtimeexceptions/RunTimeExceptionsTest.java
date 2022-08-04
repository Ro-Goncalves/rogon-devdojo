package rogon.javacompleto.trowable.exceptions.runtimeexceptions;

public class RunTimeExceptionsTest {
	public static void main(String[] args) {
		
//		Object o = null;
		int b = 0;
		int a = 10;
		try{
			divisao(a, b);
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
//		if(b != 0) {
//			int c = a/b;
//			
//			System.out.println(c);
//		}
//		
//		//NullPointerException
//		//System.out.println(o.toString());
//		int[] d = new int[2];
//		
//		System.out.println(d[2]);
	}
	
	public static void divisao(int num1, int num2) {
		if (num2 == 0) {
			throw new IllegalArgumentException("Passe um valor diferente de 0 para num2");
		}
		int result = num1/num2;
		System.out.println(result);
	}
}
