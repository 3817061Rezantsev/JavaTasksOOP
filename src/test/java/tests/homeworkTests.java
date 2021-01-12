package tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Iterator;

import org.junit.jupiter.api.Test;

import collections1.ILinkedList;
import collections1.MyLinkedList;
import tasks1.*;
import tasks2.*;

class homeworkTests {

	@Test
	void circleGetAreaTest() {
		Circle c = new Circle(1);
		assertEquals(Math.PI, c.getArea());
		c.setRadius(2);
		assertEquals(4 * Math.PI, c.getArea());
	}

	@Test
	void circleToStringTest() {
		Circle c = new Circle(1);
		assertEquals("Circle[radius=1.0,color=red]", c.toString());
	}

	@Test
	void rectangleGetAreaTest() {
		Rectangle r = new Rectangle(1, 1);
		assertEquals(1, r.getArea());
		r.setLength(2);
		r.setWidth(2);
		assertEquals(4, r.getArea());
	}

	@Test
	void rectangleGetPerimeterTest() {
		Rectangle r = new Rectangle(1, 1);
		assertEquals(4, r.getPerimeter());
		r.setLength(2);
		r.setWidth(2);
		assertEquals(8, r.getPerimeter());
	}

	@Test
	void rectangleToStringTest() {
		Rectangle r = new Rectangle(1, 1);
		assertEquals("Rectangle[length=1.0,width=1.0]", r.toString());
	}

	@Test
	void employeeToStringTest() {
		Employee e = new Employee(1, "A", "B", 0);
		assertEquals("Employee[id=1,name=A B,salary=0]", e.toString());
	}

	@Test
	void bookToStringTest() {
		Author[] a = new Author[3];
		for (int i = 0; i < 3; i++) {
			a[i] = new Author("A", "B", 'M');
		}
		Book b = new Book("S", a, 3);
		assertEquals(
				"Book[name=S,authors={Author[name=A,email=B,gender=M],Author[name=A,email=B,gender=M],Author[name=A,email=B,gender=M]},price=3.0,qty=0]",
				b.toString());
	}

	@Test
	void myTriangleGetPerimeterTest() {
		MyPoint a = new MyPoint(0, 0);
		MyPoint b = new MyPoint(0, 4);
		MyPoint c = new MyPoint(3, 0);
		MyTriangle t = new MyTriangle(a, b, c);
		assertEquals(12, t.getPerimeter());
	}

	@Test
	void myTriangleGetTypeTest() {
		MyPoint a = new MyPoint(0, 0);
		MyPoint b = new MyPoint(0, 4);
		MyPoint c = new MyPoint(3, 0);
		MyTriangle t = new MyTriangle(a, b, c);
		assertEquals("Scalene", t.getType());
		b.setXY(0, 1);
		c.setXY(1, 0);
		t = new MyTriangle(a, b, c);
		assertEquals("Isosceles", t.getType());
		b.setXY(0.5, 0.75);
		t = new MyTriangle(a, b, c);
		assertEquals("Isosceles", t.getType());
		b.setXY(0.5, Math.sqrt(0.75));
		assertEquals("Equilateral", t.getType());
	}

	@Test
	void myTriangleToString() {
		MyPoint a = new MyPoint(0, 0);
		MyPoint b = new MyPoint(0, 4);
		MyPoint c = new MyPoint(3, 0);
		MyTriangle t = new MyTriangle(a, b, c);
		assertEquals("MyTriangle[v1=(0.0,0.0),v2=(0.0,4.0),v3=(3.0,0.0)]", t.toString());
	}

	@Test
	void myComplexReOrImTest() {
		MyComplex c = new MyComplex(1, 0);
		assertTrue(c.isReal());
		c.setImag(1);
		assertTrue(c.isImaginary());
	}

	@Test
	void myComplexEqualsTest() {
		MyComplex c1 = new MyComplex(1, 0);
		MyComplex c2 = new MyComplex(1, 0);
		assertTrue(c1.equals(1, 0));
		assertTrue(c2.equals(c2));
	}

	@Test
	void myPolynomialToString() {
		double[] coeff = { 1, 1 };
		MyPolynomial p1 = new MyPolynomial(coeff);
		assertEquals("x+1.0", p1.toString());
		MyPolynomial p2 = new MyPolynomial(coeff);
		MyPolynomial p3 = p2.add(p1);
		assertEquals("2.0x+2.0", p3.toString());
	}

	@Test
	void myPolynomialMulTest() {
		double[] coe = { 1, 1, 0 };
		MyPolynomial p1 = new MyPolynomial(coe);
		MyPolynomial p2 = new MyPolynomial(coe);
		assertEquals("x^2+2.0x+1.0", p2.multiply(p1).toString());
		double[] coe11 = { 1, 0, 0 };
		p1 = new MyPolynomial(coe11);
		p2 = new MyPolynomial(coe11);
		assertEquals("+1.0", p2.multiply(p1).toString());
	}

	@Test
	void containerCollidesTest() {
		Ball ball = new Ball(0, 0, 1, 2, 3);
		Container c1 = new Container(-2, -2, 4, 4);
		Container c2 = new Container(-1, -1, 2, 2);
		assertTrue(c1.collides(ball));
		assertTrue(!c2.collides(ball));
	}

	@Test
	void myPolynomialEvaluateTest() {
		double[] coe = { 1, 1 };
		MyPolynomial p1 = new MyPolynomial(coe);
		assertEquals(2, p1.evaluate(1));
		double[] coe2 = { 1, 2, 1 };
		MyPolynomial p2 = new MyPolynomial(coe2);
		assertEquals(4, p2.evaluate(1));
	}

	@Test
	void myLinkedListAddAndGetTest() {
		ILinkedList<Integer> list = new MyLinkedList<>();
		list.add(0);
		list.add(-1);
		list.add(2);
		list.add(2);
		list.add(2);
		list.add(2);
		list.add(2);
		list.add(2);
		list.add(2);
		assertEquals(0, list.get(0));
		assertEquals(-1, list.get(1));
		assertEquals(2, list.get(2));
		list.add(0, -1);
		assertEquals(-1, list.get(0));
		assertEquals(0, list.get(1));
		list.add(2, 5);
		assertEquals(5, list.get(2));
		assertEquals(0, list.get(1));
		assertEquals(-1, list.get(3));
		list.add(4, 5);
	}

	@Test
	public void myLinkedListWrongGetTest() {
		ILinkedList<Integer> list = new MyLinkedList<>();
		list.add(0);
		try {
			list.get(1);
			assertTrue(false);
		} catch (IllegalArgumentException i) {
			assertTrue(true);
		}
	}

	@Test
	public void myLinkedListIndexOfTest() {
		ILinkedList<Integer> list = new MyLinkedList<>();
		list.add(0);
		list.add(1);
		list.add(2);
		assertEquals(0, list.indexOf(0));
		assertEquals(1, list.indexOf(1));
		assertEquals(2, list.indexOf(2));
	}

	@Test
	public void myLinkedListRemoveTest() {
		ILinkedList<Integer> list = new MyLinkedList<>();
		list.add(0);
		list.add(1);
		list.add(2);
		list.remove(1);
		assertEquals(0, list.get(0));
		assertEquals(2, list.get(1));
	}

	@Test
	public void myLinkedListSetTest() {
		ILinkedList<Integer> list = new MyLinkedList<>();
		list.add(0);
		list.add(1);
		list.add(2);
		list.set(1, -1);
		assertEquals(-1, list.get(1));
	}

	@Test
	public void myLinkedListSizeTest() {
		ILinkedList<Integer> list = new MyLinkedList<>();
		list.add(0);
		list.add(1);
		list.add(2);
		assertEquals(3, list.size());
	}

	@Test
	public void myLinkedListToArrayTest() {
		ILinkedList<Integer> list = new MyLinkedList<>();
		list.add(0);
		list.add(1);
		list.add(2);
		Integer[] i = list.toArray();
		assertEquals(i[0], list.get(0));
		assertEquals(i[1], list.get(1));
		assertEquals(i[2], list.get(2));
	}

	@Test
	public void myLinkedListIteratorTest() {
		ILinkedList<Integer> list = new MyLinkedList<>();
		list.add(0);
		list.add(1);
		list.add(2);
		Iterator<Integer> iter = list.iterator();
		int k = 0;
		while (iter.hasNext()) {
			assertEquals(k, iter.next());
			k++;
		}
		k = 0;
		for (Integer i : list) {
			assertEquals(k, i);
			k++;
		}
	}

	@Test
	public void authorEqualTest() {
		Author a = new Author("A", "A", 'M');
		Author b = new Author("A", "A", 'M');
		Author c = new Author("C", "C", 'F');
		assertTrue(a.equals(b));
		assertFalse(a.equals(c));
	}

	@Test
	public void bookEqualTest() {
		Author[] author = { new Author("A", "A", 'M'), new Author("C", "C", 'F') };
		Book a = new Book("A", author, 1);
		Book b = new Book("A", author, 1);
		Book c = new Book("C", author, 1);
		assertTrue(a.equals(b));
		assertFalse(a.equals(c));
	}

	@Test
	public void circleEqualTest() {
		Circle a = new Circle();
		Circle b = new Circle();
		Circle c = new Circle(3);
		assertTrue(a.equals(b));
		assertFalse(a.equals(c));
	}

	@Test
	public void eployeeEqualTest() {
		Employee a = new Employee(1, "A", "A", 1);
		Employee b = new Employee(1, "A", "A", 1);
		Employee c = new Employee(1, "A", "B", 1);
		assertTrue(a.equals(b));
		assertFalse(a.equals(c));
	}

	@Test
	public void myPointEqualTest() {
		MyPoint a = new MyPoint();
		MyPoint b = new MyPoint();
		MyPoint c = new MyPoint(3, 5);
		assertTrue(a.equals(b));
		assertFalse(a.equals(c));
	}

	@Test
	public void myTriangleEqualTest() {
		MyPoint v1 = new MyPoint();
		MyPoint v2 = new MyPoint();
		MyPoint v3 = new MyPoint(3, 5);
		MyTriangle a = new MyTriangle(v1, v2, v3);
		MyTriangle b = new MyTriangle(v1, v2, v3);
		MyTriangle c = new MyTriangle(v3, v2, v1);
		assertTrue(a.equals(b));
		assertFalse(a.equals(c));
	}

	@Test
	public void rectangleEqualTest() {
		Rectangle a = new Rectangle();
		Rectangle b = new Rectangle();
		Rectangle c = new Rectangle(3, 5);
		assertTrue(a.equals(b));
		assertFalse(a.equals(c));
	}

	@Test
	public void ballEqualTest() {
		Ball a = new Ball(1, 1, 1, 1, 1);
		Ball b = new Ball(1, 1, 1, 1, 1);
		Ball c = new Ball(1, 1, 1, 3, 5);
		assertTrue(a.equals(b));
		assertFalse(a.equals(c));
	}

	@Test
	public void containerEqualTest() {
		Container a = new Container(1, 1, 1, 1);
		Container b = new Container(1, 1, 1, 1);
		Container c = new Container(1, 1, 3, 5);
		assertTrue(a.equals(b));
		assertFalse(a.equals(c));
	}

	@Test
	public void myComplexEqualTest() {
		MyComplex a = new MyComplex();
		MyComplex b = new MyComplex();
		MyComplex c = new MyComplex(3, 5);
		assertTrue(a.equals(b));
		assertFalse(a.equals(c));
	}

	@Test
	public void myPolinomialEqualTest() {
		MyPolynomial a = new MyPolynomial();
		MyPolynomial b = new MyPolynomial();
		MyPolynomial c = new MyPolynomial(3, 5);
		assertTrue(a.equals(b));
		assertFalse(a.equals(c));
	}
}
