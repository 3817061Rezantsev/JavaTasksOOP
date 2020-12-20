package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

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
		double[] coe = { 1, 1 };
		MyPolynomial p1 = new MyPolynomial(coe);
		MyPolynomial p2 = new MyPolynomial(coe);
		assertEquals("x^2+2.0x+1.0", p2.multiply(p1).toString());
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
}
