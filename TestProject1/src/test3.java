
public class test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int f0=0,f1=1,fib=0,n=0;
    System.out.println("fibonacci series is ");
    System.out.print(f0+" "+f1);
    while(n<10)
    {
    fib=f0+f1;
    System.out.print(" "+fib);
    f0=f1;
    f1=fib;
    n++;
	}
	}
}
