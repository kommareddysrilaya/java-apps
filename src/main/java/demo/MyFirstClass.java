package demo;

public class MyFirstClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int i=2/0;
//			System.out.println(exceptionTest());
//			exceptionTest2();
		}
		
		public static int exceptionTest()
		{
			int i=6;
			try{
				throw new NullPointerException();
			}
			catch(Exception e)
			{
				i=10;
				System.out.println("The exception occured in exceptiontest is " +e);
				return i;
			}
		}

		public static void exceptionTest2()
		{
			try{
				int a[]= {1,2,3,4};
//				System.out.println(a[5]);
				int i=2/0;
				
			}
			catch(Exception e)
			{
				System.out.println("after");
				System.out.println("The exception occured in exceptionTest2 is " +e);
			}
			finally {
				System.out.println("logout");
			}
		}

	}

