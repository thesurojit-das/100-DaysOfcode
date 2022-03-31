
public class ArrayIndexOutOfBoundsException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int array[]= {1,2,3,4,5};
			array[6]=90;
		}
		catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("Array index "+e);
		}
		 
		finally {  
		        System.out.println("Finally Block");  
		      }  

	}

}
