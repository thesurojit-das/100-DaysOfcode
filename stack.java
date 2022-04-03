import java.util.Scanner;

class StackOverflowException extends Exception{
    private static final long serialVersionUID = 1L;
    StackOverflowException(String s) {
        super(s);
    }
}
class StackUnderflowException extends Exception{
    private static final long serialVersionUID = 1L;
    StackUnderflowException(String s) {
        super(s);
    }
}
class Stack{
    int stackSize,top=-1;
    int[] arr;
    Stack(int stackSize){
        this.stackSize=stackSize;
        arr = new int[stackSize];
    }
     
    public void push(int element) throws StackOverflowException {
        if(top>=stackSize-1)
            throw new StackOverflowException("Stack OverFlow Occured");
        else
            arr[++top] = element;
    }
    public int pop() throws StackUnderflowException{
        if(top==-1)
            throw new StackUnderflowException("Stack UnderFlow Occured\n");
        else
            return arr[top--];
    }
    public void peek() throws StackUnderflowException{
        if(top==-1)
            throw new StackUnderflowException("Stack UnderFlow Occured\n");
        else
            System.out.println(arr[top]+"  top of Stack\n"); 
    }
}
public class stack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the stack: ");
        int size = sc.nextInt();
        Stack S = new Stack(size);

        boolean flag=true; 

        System.out.println(" 1 to push");
            System.out.println("2 to Pop");
            System.out.println(" 3 to Peek");
            System.out.println(" 4 to Exit");

        while(flag){
            System.out.print("\nChocie: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter a number to push into the stack: ");
                    int num = sc.nextInt(); 
                    try{
                        S.push(num);
                    }
                    catch(StackOverflowException e){
                        System.out.println("Exception  "+e);
                    }  
                break;
                case 2:
                    try{
                        System.out.println(S.pop()+" poped out ");
                    }
                    catch(StackUnderflowException e){
                        System.out.println("Exception Occured: "+e);
                    }
                    break;
                case 3:
                    try{
                        S.peek();
                    }
                    catch(StackUnderflowException e){
                        System.out.println("Exception Occured: "+e);
                    }
                    break;
                case 4:
                    System.out.println("Exiting...\n");
                    flag=false;
                break;
                default:
                    System.out.println("Wrong Chocie!! Please Enter again");
            }
        }
        sc.close();
    }
}