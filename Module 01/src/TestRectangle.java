
public class TestRectangle {

	public static void main(String[] args) {

		// Create object rectangle1 with width 4 and height 40
		Rectangle rectangle1 = new Rectangle(4, 40);
		System.out.println("The area of the rectangle with width " + rectangle1.width + " and height "
				+ rectangle1.height + " has an area of " + rectangle1.getArea() + " and a perimeter of "
				+ rectangle1.getPerimeter());

		// Create object rectangle2 with width 3.5 and height 35.9
		Rectangle rectangle2 = new Rectangle(3.5, 35.9);
		System.out.println("The area of the rectangle with width " + rectangle2.width + " and height "
				+ rectangle2.height + " has an area of " + rectangle2.getArea() + " and a perimeter of "
				+ rectangle2.getPerimeter());

		// Modify the rectangle height
		rectangle2.height = 50;
		System.out.println("The area of the rectangle with width " + rectangle2.width + " and height "
				+ rectangle2.height + " has an area of " + rectangle2.getArea() + " and a perimeter of "
				+ rectangle2.getPerimeter());

	}

}
