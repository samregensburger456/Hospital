package staff;
public class Janitor extends Employee
{
  public Janitor(String name)
  {
    this.setName(name);
  

    setWage(10.00);
  

    setemployeeType(super.janitorType);
  

    //setEmployeeID();
  }
  //**********************
  public void jobAction()
  {
    System.out.println("Wiping the floor boss");
  }
}