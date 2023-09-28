import java.util.Scanner;

public class Binary 
{
	public static void main(String[ ] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter A Number: ");
		int x = sc.nextInt();
		System.out.print(Converter.toBinary(x));
		sc.close();
	}
}
