package rogon.javacompleto.trowable.exceptions.runtimeexceptions;

public class RunTimeExceptionsTest {
	public static void main(String[] args) {
		
		Object o = null;
		int b = 0;
		int a = 10;
		if(b != 0) {
			int c = a/b;
			
			System.out.println(c);
		}
		
		//NullPointerException
		//System.out.println(o.toString());
		int[] d = new int[2];
		
		System.out.println(d[2]);
	}
}
