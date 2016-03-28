import java.util.Scanner;
public class main {


	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = scan.nextInt();
		int count = 0;
		
		for(int i=1; i<=n; i++){
			count = 0; 
			
			for(int j=2 ; j<=i/2; j++){
				if(i%j== 0) {
					count++;
				}
			}
			if(count==0){
				System.out.println(i);
			}
			
		}
		
		
		
		
	}
	
}