package staff;
public class Surgeon extends Employee
{
  public Surgeon(String name)
  {
    this.setName(name);
  

    setWage(40.00);
  

    setemployeeType(super.surgeonType);

    
    //setEmployeeID();
  }
  //**********************
  public void jobAction()
  {
    System.out.println("performing surgery boss");
  }
}