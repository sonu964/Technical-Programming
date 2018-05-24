import java.util.Scanner;

public class Hello {

	public static void printPattern(int n){
		
		
		for (int i = 0; i < 5; i++) {
			
			for (int j = 0; j < i; j++) {
				
				System.out.print(n);
			}
			n++;
			System.out.println();
			
		}
		n--;
		for (int i = 4; i >=0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print(n);
				
			}
			n--;
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		printPattern(n);
	}
}
