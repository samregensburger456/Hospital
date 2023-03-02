package staff;
public class Admin extends Employee
{
  public Admin(String name)
  {
    this.setName(name);
  

    setWage(50.00);
  

    setemployeeType(super.adminType);
    
    //setEmployeeID();
  }
  //**********************
  public void jobAction()
  {
    System.out.println("Managing Finance Boss");
  }

}