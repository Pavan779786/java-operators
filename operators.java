package pavan;

public class operators {
	
	  int a = 10;
	  int b = 20;
	  static int c = 30;
	  static int  d = 40;

	public static void main(String[] args) {
		
		//Assignments operators
		
		 operators obj1=new operators();
		 operators obj2=new operators();
		 
		 System.out.println(obj1.a + obj2.b);
		 System.out.println(obj1.a - obj2.b);
		 System.out.println(obj1.a * obj2.b);
		 System.out.println(obj1.a / obj2.b);
		 System.out.println(obj1.a % obj2.b);
		 
//		 increment and decrement operator
		 
		 System.out.println(c++);  //first print c value and increae only 1 i.e print 30 and then add +1 = 31
		 System.out.println(c);    //in the above the value of c is 31 so its print 31
		 System.out.println(++c);  //first it add +1 to c and then print c i.e 31 + 1 print 32
		 System.out.println(c);   //in the above the value of c is 32
		 
		 // conditonal operators
		 
		 System.out.println(c==d && c/d==0);
		 System.out.println(c==d || c/d==0);

         
	}

}
