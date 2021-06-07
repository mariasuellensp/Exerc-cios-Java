import java.util.*; 

public class soma {
	public static void main(String[] args) {
	  
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Informe primeiro o número: ");  
		int n1 = sc.nextInt(); 

        System.out.println("Informe o segundo número: ");  
		int n2 = sc.nextInt();

        System.out.println("Informe o terceiro número: ");  
		int n3 = sc.nextInt();

        if ((n1>n2) && (n2>n3)) {
            int total = n1 + n2;
            System.out.println("O total é: " + total);
        }

        if ((n2>n1) && (n1>n3)) {
            int total = n1 + n2;
            System.out.println("O total é: " + total);
        }

        if ((n2>n3) && (n3>n1)) {
            int total = n2 + n3;
            System.out.println("O total é: " + total);
        }

        
        if ((n3>n2) && (n2>n1)) {
            int total = n2 + n3;
            System.out.println("O total é: " + total);
        }

        
        if ((n3>n1) && (n1>n2)) {
            int total = n1 + n3;
            System.out.println("O total é: " + total);
        }
        
        if ((n1>n3) && (n3>n2)) {
            int total = n1 + n3;
            System.out.println("O total é: " + total);
        }
       
        
  }
}