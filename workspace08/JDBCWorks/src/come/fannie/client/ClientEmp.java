package come.fannie.client;

import com.fannie.bean.Employee;
import com.fannie.dao.EmployeeDAO;
import com.fannie.interfaces.IEmployeeDAO;

public class ClientEmp {
	public static void main(String[] args) {
		IEmployeeDAO dao = new EmployeeDAO();
		System.out.println("-------------------");
	System.out.println("insert :"+dao.insertEmployee(
			new Employee("Jim", 2222222, "jim@fanniemae.com")));
	
	System.out.println("-------------------");
	for(Employee emp : dao.getAllEmps()){
		System.out.println("current employee: "+emp);
	}	
		
	System.out.println("-------------------");
	for(Employee emp : dao.getAllEmps()){
		dao.updateEmp(emp.getEmpId(), 7777777);
	}	
	
	/*	Employee emp = dao.getEmp(1);
		
		System.out.println("emp id " + emp.getEmpId());
		System.out.println("Emp Name " + emp.getEmpName());
		System.out.println("Emp Sal " + emp.getEmpSal());
		System.out.println("Emp Email " + emp.getEmpEmail());
*/
	System.out.println("-------------------");
	for(Employee emp : dao.getAllEmps()){
		System.out.println("After Update: "+emp );
	}
	
	System.out.println("-------------------");
	for(Employee emp : dao.getAllEmps()){
			System.out.println(emp + " delete " + dao.deleteEmp(emp.getEmpId()));
		}
		
		
	}
}
