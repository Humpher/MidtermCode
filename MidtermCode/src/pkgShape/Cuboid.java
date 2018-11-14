package pkgShape;

public class Cuboid extends Rectangle{
	
	private int iDepth;
	private SortbyArea sorter1;
	private SortByVolume sorter2;
	
	public Cuboid(int iwidth, int ilength, int idepth) {
		
		super(iwidth, ilength);
		
		this.iDepth = idepth;
	}

	public void setiDepth(int idepth) {
	
	this.iDepth = idepth;
	
	}
	
	public int getiDepth() {
		
		return this.iDepth;
	}
	
	public double volume() {
		
		double TheVolume;
		
		TheVolume = (super.getiLength()) * (super.getiWidth()) * this.iDepth;
		
		return TheVolume;
	}
	
	
	@Override
	public double area() {
		double TheSurfaceArea;
		
		TheSurfaceArea = 2 * ((super.area()) + (super.getiWidth()*this.iDepth) + (super.getiLength() * this.iDepth));
		
		return TheSurfaceArea;
	}
	
	@Override
	public double perimeter() throws UnsupportedOperationException{
		throw new UnsupportedOperationException("This method call is invalid");
	}
		

}
