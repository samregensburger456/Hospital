package staff;
public class Nurse extends Employee
{
  public Nurse(String name)
  {
    this.setName(name);
  

    setWage(20.00);
  

    setemployeeType(super.nurseType);
  

    //setEmployeeID();
  }
  //**********************
  public void jobAction()
  {
    System.out.println("checking vitals boss");
  }
}