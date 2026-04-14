import javax.swing.*;
class Calculator{
	public static void main(String[]args){
	
	String num1=JOptionPane.showInputDialog("Enter first number");
	int n1=Integer.parseInt(num1);
	
	String num2=JOptionPane.showInputDialog("Enter second number");
	int n2=Integer.parseInt(num2);
	
	int c;
	
	String ch=JOptionPane.showInputDialog("Press + for addtion\nPress - for Substraction\nPress * for Multiplication\nPress / for Division");
	
	switch(ch){
		
		case "+":
				 c=n1+n2;
				System.out.println("Addtion is: "+c);
				break;
		case "-":
		
				 c=n1-n2;
				System.out.println("Substraction is: "+c);
				break;
				
		case "*":
				 c=n1*n2;
				System.out.println("Multiplication is: "+c);
				break;
				
		case "/":
				 c=n1/n2;
				System.out.println("Division is: "+c);
				break;
				
		default:
				System.out.println("Invalid choice");
	}
	}
}