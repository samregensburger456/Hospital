package staff;
public abstract class Employee
{
  private String name;
  private double wage;
  private String employeeType;
  private int employeeID;

  //******************************************8
  public final String adminType = "admin";
  public final String doctorType = "doctor";
  public final String janitorType = "janitor";
  public final String nurseType = "nurse";
  public final String receptionistType = "receptionist";
  public final String surgeonType = "admin";

  //********************************************************8

  public void setName(String name)
  {
    this.name = name;
  }

  public void setWage(double wage)
  {
    this.wage = wage;
  }

  public void setemployeeType(String employeeType)
  {
    this.employeeType = employeeType;
  }

  public void setEmployeeID(int employeeID)
  {
    this.employeeID = employeeID;
  }

  //********************************************************8
  
 public String getName()
  {
    return this.name;
  }

  public double getWage()
  {
    return this.wage;
  }

  public String getEmployeeType()
  {
    return this.employeeType;
  }

  public int getEmployeeID()
  {
    return this.employeeID;
  }

  //****************************************************

  public abstract void jobAction();
}