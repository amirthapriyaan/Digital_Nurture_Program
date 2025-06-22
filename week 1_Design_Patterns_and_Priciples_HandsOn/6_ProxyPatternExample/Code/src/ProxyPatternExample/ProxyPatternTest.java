package ProxyPatternExample;

public class ProxyPatternTest {
	
	public static void main(String args[]) {
		
		Image img1=new ProxyImage("Img1.jpg");
		Image img2=new ProxyImage("Img2.jpg");
		
		img1.show();
		img1.show();
		img1.show();
		
		img2.show();
	}
	
}
