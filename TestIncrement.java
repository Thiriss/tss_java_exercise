package Test;

public class TestIncrement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i =10; 
		// assigned 10 to i
		int ilnc = i++;
		//increment after operation
		System.out.println("The value of i = " + i);
		System.out.println("The value of postfix ilnc = " + ilnc);
		
		ilnc = ++i;
		//increment before operation
		System.out.println("The value of i = " + i);
		System.out.println("The value of prefix ilnc = " + ilnc);
		
	}

}
