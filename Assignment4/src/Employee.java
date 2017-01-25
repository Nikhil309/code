
public class Employee 
{
	
	    private int employeeId;
	    private String designation;
	    private float salary;

	    public int getEmployeeId()
	    {
	        return employeeId;
	    }
	 
	    public String getEmployeeDesignation()
	    {
	       return designation;
	    }

	    public float getEmployeeSalary()
	    {
	        return salary;
	    }

	    public void setEmployeeId(int eId)
	    {
	     employeeId=eId;
	    }

	    public void setEmployeeDesignation(String desig)
	    {
	     designation=desig;
	    }

	   public void setEmployeeSalary(float salar)
	    {
	          salary=salar;
	    }

	public static void main(String args[])
	{
	    Employee Nikhil=new Employee();
	    Employee Ritu=new Employee();
	    Employee Madhuri=new Employee();
	    Nikhil.setEmployeeId(10464);
	    Nikhil.setEmployeeDesignation("Trainee");
	    Nikhil.setEmployeeSalary(15000);
	    System.out.println("EmployeeId:"+Nikhil.getEmployeeId());
	    System.out.println("Designation"+Nikhil.getEmployeeDesignation());
	    System.out.println("Salary"+Nikhil.getEmployeeSalary());
	    System.out.println("\n\n");
	    
	    Ritu.setEmployeeId(10463);
	    Ritu.setEmployeeDesignation("Trainee");
	    Ritu.setEmployeeSalary(15000);
	    System.out.println("EmployeeId:"+Ritu.getEmployeeId());
	    System.out.println("Designation"+Ritu.getEmployeeDesignation());
	    System.out.println("Salary"+Ritu.getEmployeeSalary());
	    System.out.println("\n\n");

	    Madhuri.setEmployeeId(10462);
	    Madhuri.setEmployeeDesignation("Trainee");
	    Madhuri.setEmployeeSalary(15000);
	    System.out.println("EmployeeId:"+Madhuri.getEmployeeId());
	    System.out.println("Designation"+Madhuri.getEmployeeDesignation());
	    System.out.println("Salary"+Madhuri.getEmployeeSalary());

	}


	}

