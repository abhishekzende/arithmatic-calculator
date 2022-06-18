import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {
		
		int a,b,r;
		
		System.out.println("ENTER TWO NUMBER");
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		b=s.nextInt();
		
		int ch;
		System.out.println("ENTER THE CHOICE");
		Scanner s2=new Scanner(System.in);
		ch=s2.nextInt();
		
		switch(ch) {
		
		case 1:r=a+b;
		       System.out.println("addition="+r);
		       break;
		       
		case 2:r=a-b;
		       System.out.println("subtraction="+r);
		       break;
		       
		case 3:r=a*b;
		       System.out.println("multiplication="+r);
		       break;
		       
		case 4:r=a/b;
		       System.out.println("division="+r);
		       break;
		       
		default: System.out.println("invalid option");       
		       
                  		
		
		
		
		
		}
		
		
		
		
		

	}

}
