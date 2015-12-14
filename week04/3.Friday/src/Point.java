public class Point {

	private final int x;
	private final int y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	// default constructor
	public Point() {
		this.x = 0;
		this.y = 0;
	}

	// copy constructor
	public Point(Point aPoint) {
		this(aPoint.getX(), aPoint.getY());
	}

	// returns the origin of the coordinate system
	public Point getOrigin() {
		Point point = new Point();
		return point;
	}
	
	public String toString() {

		String result = "";

		result = "Point(" + getX() + "," + getY() + ")";

		return result;

	}

	@Override
	public boolean equals(Object point) {
		boolean result = false;

		if (((Point) point).getX() == this.getX() && ((Point) point).getY() == this.getY()) {
			result = true;
		}

		return result;
	}
	
	@Override
	public int hashCode() {
		Integer hash = 17;
		Integer one = new Integer(x);
		Integer two = new Integer(y);
		hash = hash * 23 + one.hashCode();
		hash = hash * 23 + two.hashCode();
		return hash;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public static void main(String[] args) {
		Point point = new Point();
		System.out.println(point.toString());
		Point point2 = new Point(1, 1);
		Point point3 = new Point(0, 0);
		System.out.println(point.equals(point2));
		System.out.println(point.equals(point3));
		System.out.println(point.hashCode());
	}

}