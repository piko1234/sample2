package variables;

public class Employee
{
    String Emp_name;//declaring global non static variable
    int Emp_code;
    char Emp_grade;
    float Emp_salary;
     
    public void Emp_info()
    {
       System.out.println("--------------------");
       System.out.println("Employee name is "+Emp_name);
       System.out.println("Employee code is "+Emp_code);
       System.out.println("Employee grade is "+Emp_grade);
       System.out.println("Employee salary is "+Emp_salary);
       System.out.println("------------------------");
    }
    
	

}
