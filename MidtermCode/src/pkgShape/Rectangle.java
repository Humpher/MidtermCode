package pkgShape;

public class Rectangle extends Shape implements Comparable<Rectangle>{
	
	private int iWidth;
	private int iLength;
	
	public Rectangle(int iwidth, int ilength) {
		
		this.iWidth = iwidth;
		this.iLength = ilength;
	}
	
	

	public void setiWidth(int iwidth) {

		this.iWidth = iwidth;

	}
	
	public int getiWidth() {
		return this.iWidth;
	}
	
	public void setiLength(int ilength) {

		this.iLength = ilength;

	}
	
	public int getiLength() {
		return this.iLength;
	}
	

	@Override
	public double area() {
		
		double TheArea;
		
		TheArea = this.iLength * this.iWidth;
		
		return TheArea;
	}

	@Override
	public double perimeter() {
		
		double ThePerimeter;
		
		ThePerimeter = 2*(this.iLength + this.iWidth);
		
		return ThePerimeter;
	}

	

	@Override
	public int compareTo(Rectangle obj) {
		if(this.area() > obj.area()) {
			return 1;
		}
		else if(this.area() < obj.area()) {
			return -1;
		}
		return 0;
	}

}

