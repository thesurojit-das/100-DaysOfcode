import java.util.Scanner;
class HrsException extends Exception {
    private static final long serialVersionUID = 1L;

    HrsException(String s) {
        super(s);
    }
}
class MinException extends Exception {
    private static final long serialVersionUID = 1L;
    MinException(String s) {
        super(s);
    }
}
class SecException extends Exception {
    private static final long serialVersionUID = 1L;

    SecException(String s) {
        super(s);
    }
}
class Time {
    int hrs, min, sec;

    Time(int h, int m, int s) {
        hrs = h;
        min = m;
        sec = s;
    }
void display() throws HrsException,MinException,SecException {
        if (hrs < 0 || hrs > 24)
            throw new HrsException("not valid");
        else
            System.out.print(hrs + " hr ");
        if (min < 0 || min > 60)
            throw new MinException("not valid");
        else
            System.out.print(min + " min ");
        if (sec < 0 || sec > 60)
            throw new SecException("not vaild");
        else
            System.out.print(sec + " sec");
    }
}

public class UserDefineExpection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hours ");
        int hours = sc.nextInt();
        System.out.println("Min ");
        int minutes = sc.nextInt();
        System.out.println("sec  ");
        int seconds = sc.nextInt();
        sc.close();

        Time mytime = new Time(hours,minutes,seconds);
        try{
            System.out.println("Time is: ");
            mytime.display();
        } 
        catch(HrsException e){
            System.out.println(e);
        }
        catch(MinException e){
            System.out.println(e);
        }
        catch(SecException e){
            System.out.println(e);
        }
    }
}