
public class fac {
	  static int fac(int x) {
	  return x==0?1:x*fac(x-1);
 }
 
public static void main(String[] args) {
System.out.println("fac(4) = "+fac(4));
}
}