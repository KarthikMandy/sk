
import java.util.Scanner;

public class Star {

	public static void main(String[] args) {
		
		int a;
		Scanner scan=new Scanner(System.in);
		
		a=scan.nextInt();
		
		for(int i=1;i<=a;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			
			System.out.println();
		}

	}

}
