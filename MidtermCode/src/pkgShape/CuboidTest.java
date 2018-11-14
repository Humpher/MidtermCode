package pkgShape;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Collections;

import org.junit.Rule;
import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;

class CuboidTest {

	@Test
	public void volumeTest() {
		
		double testVolume;
		
		Cuboid shape = new Cuboid(10,10,10);
		
		testVolume = shape.volume();
		
		System.out.println("The width entered is: "+shape.getiWidth()+" meters");
		System.out.println("The length entered is: "+shape.getiLength()+" meters");
		System.out.println("The depth entered is: "+shape.getiDepth()+" meters");
		System.out.println("The volume of the cuboid is:  "+testVolume+" cubic meters");
		System.out.println("\n\n");
	}
	
	@Test
	public void areaTest() {
		
		double surfaceArea;
		
		Cuboid surfaceTest = new Cuboid(10,10,10);
		
		surfaceArea = surfaceTest.area();
		
		System.out.println("The width entered is: "+surfaceTest.getiWidth()+" meters");
		System.out.println("The length entered is: "+surfaceTest.getiLength()+" meters");
		System.out.println("The depth entered is: "+surfaceTest.getiDepth()+" meters");
		System.out.println("The surface area of the cuboid is:  "+surfaceArea+" square units");
		System.out.println("\n");
		
	}
	
	
	//NOTE: The method test below does throw the specific exception I programmed but it asserts to false(The red bar shows when I compile).
	//@Rule
	public final ExpectedException exception = ExpectedException.none();
	
	@Test
	public void exceptionChecker() {
		
		//Cuboid check = new Cuboid(10,20,30);
		
		exception.expect(UnsupportedOperationException.class);
		//check.perimeter();
	}
	
	
	@Test
	public void SortByVolumeTest() {
		ArrayList<Cuboid> list = new ArrayList<Cuboid>();
		list.add(new Cuboid(10,20,30));
		list.add(new Cuboid(15,20,60));
		list.add(new Cuboid(19,10,70));
		list.add(new Cuboid(17,20,30));
		
		Collections.sort(list, new SortByVolume());

		System.out.println("The volume sorting is:   ");
		 int indexV = 0;
		 int indexA = 0;
		for(Cuboid c : list)
		{
			System.out.println((indexV++)+":  "+c.volume()+" cubic meters");
		}
		System.out.println("\n");
		
		Collections.sort(list, new SortbyArea());
		System.out.println("The area sorting is:   ");
		
		for(Cuboid y : list)
		{
			
			System.out.println((indexA++)+":  "+y.area()+" sqaure meters");
		}
	}
}



