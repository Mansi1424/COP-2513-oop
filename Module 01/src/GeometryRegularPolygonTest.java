
public class GeometryRegularPolygonTest {

	public static void main(String[] args) {
		
		GeometryRegularPolygon Polygon1 = new GeometryRegularPolygon();
		
		GeometryRegularPolygon Polygon2 = new GeometryRegularPolygon(6 , 4);
		
		GeometryRegularPolygon Polygon3 = new GeometryRegularPolygon(10, 4 , 5.6, 7.8);
		
		System.out.println("The area of Polygon1 is " + Polygon1.getArea()); 
		System.out.println("The perimeter of Polygon1 is " + Polygon1.getPerimeter());
		
		System.out.println("The area of Polygon2 is " + Polygon2.getArea()); 
		System.out.println("The perimeter of Polygon2 is " + Polygon2.getPerimeter());
		
		System.out.println("The area of Polygon3 is " + Polygon3.getArea()); 
		System.out.println("The perimeter of Polygon3 is " + Polygon3.getPerimeter());
	}

}
