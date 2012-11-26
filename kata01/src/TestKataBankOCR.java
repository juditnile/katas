import java.util.HashMap;
import java.util.Map;

import junit.framework.TestCase;

import org.junit.Test;

public class TestKataBankOCR extends TestCase {

    String[] input = new String[4];
    Map<Long, String[]> expectedValues = new HashMap<Long, String[]>();

    private void initialize() {
	// 1
	String[] value = new String[4];
	value[0] = "   ";
	value[1] = "  |";
	value[2] = "  |";
	value[3] = "   ";
	expectedValues.put(Long.valueOf(1), value);
    }

    @Test
    void testReturnNumber() {
	KataBankOCR kata = new KataBankOCR();
	try {
	    input[0] = "   ";
	    input[1] = "  |";
	    input[2] = "  |";
	    input[3] = "   ";
	    kata.setInput(input);
	} catch (IllegalArgumentException e) {
	    assertFalse(true);
	}
	assertEquals(kata.getResult(),Double.valueOf(1));
    }

    @Test
    public void testValidateInput() {
	KataBankOCR kata = new KataBankOCR();
	try {
	    kata.setInput(input);
	} catch (IllegalArgumentException e) {
	    assertEquals("Input can't be null", e.getMessage());
	}
    }

    @Test
    public void testValidateInput2() {
	input[0] = "   _  _     _  _  _  _  _ ";
	input[1] = " | _| _||_||_ |_   ||_||_|";
	input[2] = " ||_  _|  | _||_|  ||_| _|";
	// input[3] = "                         ";

	KataBankOCR kata = new KataBankOCR();
	try {
	    kata.setInput(input);
	} catch (IllegalArgumentException e) {
	    assertEquals("Input size not valid", e.getMessage());
	}

    }

    @Test
    public void testValidateInput3() {

	input[3] = "             ";

	KataBankOCR kata = new KataBankOCR();
	try {
	    kata.setInput(input);
	} catch (IllegalArgumentException e) {
	    assertEquals("El número de bytes de la entrada debe coincidir",
		    e.getMessage());
	}

    }

    public String[] getInput() {
	return input;
    }

    public void setInput(String[] input) {
	this.input = input;
    }

}
