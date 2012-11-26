import org.junit.Test;

import junit.framework.TestCase;

public class TestKataBankOCR extends TestCase {

    @Test
    public void testReturnValue() {

	String[] input = new String[4];
	input[0] = "    _  _     _  _  _  _  _ ";
	input[1] = "  | _| _||_||_ |_   ||_||_|";
	input[2] = "  ||_  _|  | _||_|  ||_| _|";
	input[3] = "                           ";
	
	KataBankOCR kata = new KataBankOCR();
	kata.setInput(input);
	int i = kata.getResult();
	assertEquals(123456789, i);

    }
    
    @Test
    public void testReturnValue2(){
	String[] input = new String[4];
	input[0] = "    _  _  _  _  _  _  _  _ ";
	input[1] = "  | _| _||_||_ |_   ||_||_|";
	input[2] = "  ||_  _||_| _||_|  ||_| _|";
	input[3] = "                           ";
	
	KataBankOCR kata = new KataBankOCR();
	kata.setInput(input);
	int i = kata.getResult();
	assertEquals(123856789, i);
    }
    
    @Test
    public void testReturnValue3(){
	String[] input = new String[4];
	input[0] = "    _  _  _  _  _  _  _  _ ";
	input[1] = "  | _| _||_ |_ |_   ||_||_|";
	input[2] = "  ||_  _||_| _||_|  ||_| _|";
	input[3] = "                           ";
	
	KataBankOCR kata = new KataBankOCR();
	kata.setInput(input);
	int i = kata.getResult();
	assertEquals(123656789, i);
	
    }

}
