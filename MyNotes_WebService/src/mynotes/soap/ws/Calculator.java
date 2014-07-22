package mynotes.soap.ws;

import javax.jws.WebService;

@WebService
public class Calculator {
	
	public long multiply(int x, int y){
		
		return x*y;
	}

}
