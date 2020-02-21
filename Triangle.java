
public class Triangle{
	private int x;
	private int y;
	private int z;
	public void setX(int p){x=p;}
	public int getX(){return x;}
	public void setY(int q){y=q;}
	public int getY(){return y;}
	public void setZ(int r){z=r;}
	public int getZ(){return z;}
	
	Triangle()
	{
		System.out.println("No Input");
	}
	
	Triangle(int p, int q, int r)
	{
		x=p;
		y=q;
		z=r;
	}
	
	public void showInfo(){
		System.out.println("X is:"+x);
		System.out.println("Y is:"+y);
		System.out.println("Z is:"+z);
	}
	public void testTriangle(){
		if(x==y && y==z){
					System.out.println("Equilateral");	
			
		}
		else if(x==y || y==z || x==z){
			System.out.println("Isosceles");
		}
		else
		{
			System.out.println("Scalene");
			}
			
			
	}
	
	
	
}
