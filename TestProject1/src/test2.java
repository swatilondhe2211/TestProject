
public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //without using temporary variable
		int a=10,b=20,temp=0;
		System.out.println("before swapping");
		System.out.println("a= "+a+"  " +"b= "+b);
		System.out.println("after swapping");
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("a= "+a+"  " +"b= "+b);

       //using temporary variable
	System.out.println("before swapping");
		System.out.println("a= "+a+"  " +"b= "+b);
		System.out.println("after swapping");
		temp=a;
		a=b;
		b=temp;
		System.out.println("a= "+a+"  " +"b= "+b);	
	}

}
