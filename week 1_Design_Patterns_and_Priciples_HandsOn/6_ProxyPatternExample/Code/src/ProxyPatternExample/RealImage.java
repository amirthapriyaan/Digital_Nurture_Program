package ProxyPatternExample;

public class RealImage implements Image{
	private String file;

	public RealImage(String file) {
		
		this.file = file;
		load();
	}
	private void load() {
		System.out.println("Remote loading : "+file);
	}
	
	@Override
	public void show() {
		System.out.println("Image :"+file);
		
	}
	
}
