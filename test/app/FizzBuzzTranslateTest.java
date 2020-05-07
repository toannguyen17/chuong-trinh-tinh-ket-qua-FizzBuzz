package app;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTranslateTest {

	@Test
	void translateTest1() {
		int test = 10;
		String expected = FizzBuzzTranslate.translate(test);
		assertEquals(test, expected);
	}

	@Test
	void translateTest2() {
		int test = 5;
		String expected = FizzBuzzTranslate.translate(test);
		assertEquals(test, expected);
	}

	@Test
	void translateTest3() {
		int test = 8;
		String expected = FizzBuzzTranslate.translate(test);
		assertEquals(test, expected);
	}

	@Test
	void translateTest4() {
		int test = 17;
		String expected = FizzBuzzTranslate.translate(test);
		assertEquals(test, expected);
	}

	@Test
	void translateTest5() {
		int test = 88;
		String expected = FizzBuzzTranslate.translate(test);
		assertEquals(test, expected);
	}

	@Test
	void translateTest6() {
		int test = 85;
		String expected = FizzBuzzTranslate.translate(test);
		assertEquals(test, expected);
	}

	@Test
	void translateTest7() {
		int test = 23;
		String expected = FizzBuzzTranslate.translate(test);
		assertEquals(test, expected);
	}

	@Test
	void translateTest8() {
		int test = 35;
		String expected = FizzBuzzTranslate.translate(test);
		assertEquals(test, expected);
	}

	@Test
	void translateTest9() {
		int test = 1;
		String expected = FizzBuzzTranslate.translate(test);
		assertEquals(test, expected);
	}

	@Test
	void translateTest10() {
		int test = 0;
		String expected = FizzBuzzTranslate.translate(test);
		assertEquals(test, expected);
	}

	@Test
	void translateTest11() {
		int test = 3;
		String expected = FizzBuzzTranslate.translate(test);
		assertEquals(test, expected);
	}
}
