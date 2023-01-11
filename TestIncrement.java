package Test;

public class TestIncrement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// variable declaration
		int i,ilnc; 
		
		i = 10; 
		ilnc = i++;
		//postfix increment	
		System.out.println("The value of ilnc = " + ilnc);
		System.out.println("The value of i = " + i);
		
		ilnc = ++i;
		//prefix increment
		System.out.println("The value of ilnc = " + ilnc);
		System.out.println("The value of i = " + i);
		
	}

}
