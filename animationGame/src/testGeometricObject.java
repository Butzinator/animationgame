public class testGeometricObject {

	public static void main(String[] args) {
		GeometricObject o1 = new GeometricObject(17,4, new Vertex(42,23));
		GeometricObject o2 = new GeometricObject(234,534);

		System.out.println(o1.equals(o2));
		o2.moveTo(42,23);
		System.out.println(o1.equals(o2));
		

	}

}