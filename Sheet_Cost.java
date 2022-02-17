import java.util.Scanner;

class two_D {
    int length, breadth;

    void getdataRectangle() {
        System.out.println("Enter the dimension length and breadth");
        Scanner scanner = new Scanner(System.in);
        length = scanner.nextInt();
        breadth = scanner.nextInt();
    }
    void CostRectangle() {
        System.out.println("the cost of sheet  is " + 40 * length * breadth);
    }

    void getdataSquare() {
        System.out.println("Enter the dimension Sides");
        Scanner scanner = new Scanner(System.in);
        length = scanner.nextInt();
    }

    void CostSquare() {
        System.out.println("the cost of sheet  is " + length * length * 40);
    }
}

class three_D extends two_D {
    int height;

    void getdataCubic() {
        System.out.println("Enter the dimension length ,breadth and heigth");
        Scanner scanner = new Scanner(System.in);
        length = scanner.nextInt();
        breadth = scanner.nextInt();
        height = scanner.nextInt();
    }

    void CostCubic() {
        int tas = length * breadth * height;
        System.out.println("the cost of sheet  is " + tas * 60);
    }
}

public class Sheet_Cost {

    public static void main(String[] args) {
        two_D tD = new two_D();
        three_D thD = new three_D();
        System.out.println("Enter the Shape\n1.2D\n2.3D");
        Scanner scanner = new Scanner(System.in);
        int Shape = scanner.nextInt();
        switch (Shape) {
            case 1:
                System.out.println("1.Square \n2.Rectangle");
                Scanner scanner1 = new Scanner(System.in);
                int no = scanner1.nextInt();
                switch (no) {
                    case 1:
                        tD.getdataSquare();
                        tD.CostSquare();
                        break;
                    case 2:
                        tD.getdataRectangle();
                        tD.CostRectangle();

                        break;
                    default:
                        System.out.println("Invalid shape");
                }
                break;
            case 2:
                thD.getdataCubic();
                thD.CostCubic();
                break;
            default:
                System.out.println("Invalid shape");
        }
    }

}
