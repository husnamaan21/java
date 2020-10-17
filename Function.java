public class Function{
	public static void main(String[] args) {
		int greater = max(57,98,67);
		System.out.println("Maximum number is " + greater);
		
	}
	public static int max (int x,int y,int z){
		int maximun;
		if ((x > y) && (y>z)){
			return x;
		} else if ((y > x) && (y > z)) {
			return y;
			
		} else {
			return z;
		}
	}
}