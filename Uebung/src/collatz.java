
public class collatz {
	public static void main (String [] args){
		int i=30;
		while (i>1)	 {
			if (i%2==0) {
				System.out.println(i);
				i /=2;
			}else {
				System.out.println(i);
				i =i*3+1;
			}
		}
		System.out.println(1);
	}
}
