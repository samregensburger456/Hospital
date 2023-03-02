import staff.*;
public class Hospital
{
  
  private Admin admin;
  private Doctor doctor;
  private Janitor janitor;
  private Nurse nurse;
  private Receptionist receptionist;
  private Surgeon surgeon;
  
  //**************************
  Hospital()
  {
    hireEmployees();
    doYourTasks();
  }

  //*************************
  
  public void hireEmployees()
  {
    admin = new Admin("joe");
    doctor = new Doctor("mama");
    janitor = new Janitor("juerda");
    nurse = new Nurse("familigo");
    receptionist = new Receptionist("taco");
    surgeon = new Surgeon("Sarvo");
  }

//**********************************************
  
  public void doYourTasks()
  {
    admin.jobAction();
    doctor.jobAction();
    janitor.jobAction();
    nurse.jobAction();
    receptionist.jobAction();
    surgeon.jobAction();
  }

  
}