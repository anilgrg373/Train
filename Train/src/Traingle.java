
public class Traingle {
	public int a,b,c;
	
	public double getArea() {
		double s =(a+b+c) /2.0;
		return Math.pow((s*(s-a)*(s-b)*(s-c)), .5);
		
	}
	public double getParameter() {
	return (a+b+c)/2.0;
	}

	
		public static void main(String[] args) {
			Traingle tg = new Traingle();
			tg.a=3;
			tg.b=4;
			tg.c=5;
			
			System.out.println(tg.getArea());
			System.out.println(tg.getParameter());
		}
	
		
			
		
	
}
