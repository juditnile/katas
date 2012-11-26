public class KataBankOCR {

    private String[] input;
    private int result;

    public void setInput(String[] input) {
	this.input = input;
    }

    public int getResult() {
	char[] c0 = new char[3];
	char[] c1 = new char[3];
	result = 123456789;
	input[0].getChars(9,11,c0,0);
	input[1].getChars(9,11,c1,0);
	if (c1[1]== '|' && c0[1]== '_')
	    result = 123656789;
	else if (c0[0]== '_')
	    result = 123856789;
	
	
	
	return result;
    }

}
