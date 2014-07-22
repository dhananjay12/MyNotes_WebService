package mynotes.soap.ws;

import java.util.ArrayList;
import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class EmployeeDetails {
	
	@WebMethod
	public List<String> getAllEmployees(){		
		List<String> mylist=new ArrayList<String>();
		//some DB connection
		mylist.add("Emp1");
		mylist.add("Emp2");
		mylist.add("Emp3");		
		return mylist;
		
	}
	
	@WebMethod
	public int getTotalEmpCount(){
		return Integer.MAX_VALUE;
	}

}
