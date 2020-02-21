import java.util.Scanner;
public class TMain{
	public static void main(String a[]){
		
		Scanner sin=new Scanner(System.in);
		System.out.println("Input X:");
		int x=sin.nextInt();
		System.out.println("Input Y:");
		int y=sin.nextInt();
		System.out.println("Input Z:");
		int z=sin.nextInt();
		Triangle tr=new Triangle(x,y,z);
		tr.showInfo();
		tr.testTriangle();
		
	} 
}