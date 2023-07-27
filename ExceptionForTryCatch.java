package jaavaTutorial;

public class ExceptionForTryCatch {

	public static void main(String[] args) {
		
		//uncomment code from program one by one and run and check exception
		
//		//program 1 
//		System.out.println("I don't have exception.");
//		System.out.println(5/0);//this program has arithmetic exception
//		System.out.println("I am running.");//this program doesn't run because of second line exception
	
		//program 2 handling the exception
//		System.out.println("Hello this is the world");
//		try {
//			int airthmeticExcep = 5/0;
//			System.out.println("This block handle the exception.");
//			System.out.println("This line also executes.");
//		}
//		catch(ArithmeticException AE) { //this block will get the exception message after execution.
//			System.out.println(AE.getMessage());
//		}
//		System.out.println("Exception handled and execute this line.");
	
		
		//program 3 handling multiple exception
//		System.out.println("I am trying to handle multiple exception.");
//		int []array = {11,22,33,44,55};//defining array
//		
//		try {
//			System.out.println(array[2]);//no exception occurred 
//			System.out.println(array[7]);//exception occurred
//			System.out.println(array[3]);//no exception occurred
//			System.out.println(array[6]);//exception occurred
//			System.out.println(5/0);
//		}
//		catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println(e.getMessage());
//			System.out.println("I am displaying.");
//			
//		}
//		//we don't need to write two exception to handle multiple exception so below code don't need
//		//catch(ArrayIndexOutOfBoundsException e) {
//		//System.out.println(e.getMessage());
//			
//		//}
//		catch(ArithmeticException e) {
//			System.out.println(e.getMessage());
//		System.out.println("I am displaying again.");		
//		}
//		catch(Exception e) {
//			System.out.println(e.getMessage());
//		System.out.println("I am displaying one more time.");		
//		}
		
		
		//program 4 handling exception with finally keyword .
		//finally keyword will help to execute the program even there is an exception
		System.out.println("Handling with finally block.");
		
		try {
			System.out.println(5/5);
		}
		catch(Exception e) {
			System.out.println("Exception managed successully");
			String msg = e.getMessage();
			System.out.println(msg);
		}
		finally {
			System.out.println("It will execute finally.");
		}
		
	
	}

}
