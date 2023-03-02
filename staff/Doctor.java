package staff;
public class Doctor extends Employee
{
  public Doctor(String name)
  {
    this.setName(name);
  

    setWage(30.00);
  

    setemployeeType(super.doctorType);
  

    //setEmployeeID();
  }
  //**********************
  public void jobAction()
  {
    System.out.println("Doing Doctor stuff boss");
  }
}