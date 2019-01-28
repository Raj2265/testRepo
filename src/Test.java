import org.codehaus.jackson.map.ObjectMapper;

public class Test {
	public static void main(String[] args) {
		Employee e=new Employee();
		e.setEmpId(400000);
		e.setEmpName("Venky");
		e.setEmpSal(00000.36);
		try {
			ObjectMapper om=new ObjectMapper();
			String json=om.writeValueAsString(e);
			System.out.println(json);
		} catch (Exception e2) {
			e2.printStackTrace();
		}
	}
	
	
	public static void main(String[] args) {
		String json="{\"empId\":88,\"empName\":\"AA\"}";
		try {
			ObjectMapper om=new ObjectMapper();
			Employee emp=om.readValue(json, Employee.class);
			System.out.println(emp);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
	
	
}
