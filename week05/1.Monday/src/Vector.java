import java.util.ArrayList;

public class Vector {
	
	public static ArrayList vector = new ArrayList();
	private static int n;
	public static final Vector a = new Vector();
	
	public Vector(){
		n = 0;
	}
	
	//conctructor that takes variable number of arguments
	public Vector(ArrayList vector, int n) {
		this.vector = vector;
		this.n = n;
	}
	//constructor that copies an existing vector
	public Vector(Vector aVector){
		this(vector, n);
	}
	//get and set each coordinate of the vector
	
	
	public int getN(){
		return n;
	}
	
	public ArrayList getVector(){
		return vector;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
