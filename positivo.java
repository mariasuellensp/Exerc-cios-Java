import java.util.*; 

public class positivo {
	public static void main(String[] args) {
	  
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Informe o número: ");  
		int n = sc.nextInt(); 
        
        if (n==0) {
            System.out.println("O número é zero: ");
        }

        if (n>0) {
            System.out.println("O número é positivo: ");
        }

        if (n<0) {
            System.out.println("O número é negativo: ");
        }
  }
}
