package pkgShape;

import java.util.Comparator;

public class SortbyArea implements Comparator<Cuboid> {
	
	 SortbyArea() {
	}

	@Override
	public int compare(Cuboid area1, Cuboid area2) {
		
		if(area1.area() > area2.area()) {
			return 1;
		}
		
		else if(area1.area() < area2.area()) {
			return -1;
		}
		
		return 0;
	}
	
	
	

}
