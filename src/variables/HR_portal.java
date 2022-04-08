package variables;

public class HR_portal 
{

	public static void main(String[] args) 
	{
		Employee SachinT = new Employee();
		SachinT.Emp_name = "Sachin tendulkar";
		SachinT.Emp_code =10;
		SachinT.Emp_grade = 'A';
		SachinT.Emp_salary= 9919199.99f;
		
		
		
		Employee RahulD = new Employee();
		RahulD.Emp_name ="Rahul Dravid";
		RahulD.Emp_code =5;
		RahulD.Emp_grade ='A';
		RahulD.Emp_salary =5634500.65f;
		
		SachinT.Emp_info();
		RahulD.Emp_info();
		

	}

}
