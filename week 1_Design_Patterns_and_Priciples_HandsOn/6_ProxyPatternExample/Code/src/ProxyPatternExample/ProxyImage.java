package ProxyPatternExample;

public class ProxyImage implements Image{
	private String file;
	private RealImage real;
	
	public ProxyImage(String file) {
		this.file=file;
	}
	
	@Override
	public void show() {
		if(real==null) {
			real=new RealImage(file);
		}
		real.show();
	}
}
