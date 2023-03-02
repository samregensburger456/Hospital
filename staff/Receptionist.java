package staff;
public class Receptionist extends Employee
{
  public Receptionist(String name)
  {
    this.setName(name);
  

    setWage(15.00);
  

    setemployeeType(super.receptionistType);
  

    //setEmployeeID();
  }
  //**********************
  public void jobAction()
  {
    System.out.println("greeting people boss");
  }
}