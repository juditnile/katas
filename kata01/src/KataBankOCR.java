
public class KataBankOCR {

    String[] input;
    
    
    private void validate(){
	if(input==null){
	    throw new IllegalArgumentException("Input can't be null");
	}
	if(input.length != 4){
	    throw new IllegalArgumentException("Input size not valid");
	}
	if(input.length == 4){
	    int size = input[0].length();
	    for (int i = 0; i < input.length; i++) {
		String s = input[i];
		if(s.length()!=size){
		    throw new IllegalArgumentException("El número de bytes de la entrada debe coincidir");
		}
	    }
	}
    }
    
    public void setInput(String[] input) {
	this.input = input;
	
    }

}
