interface Motor{
	float capacity=10;
	public void run();
	public void consume();
}
class Washing_Machine implements  Motor{
	public void run() {
		System.out.println("I'm from interface method name run "+capacity);
	}
	public void consume() {
		System.out.println("I'm from interface method name consume "+capacity);
	}
}
public class Interface {
	public static void main(String[] args) {
		Washing_Machine WM=new Washing_Machine();
		WM.run();
		WM.consume();
	}
}
