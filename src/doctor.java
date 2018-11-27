/** This is a doctor class.  This is a child class of person, as each doctor obviously has to
 * be a person.
 *
 * Created for by David Hopkins as part of the Obeject Orientated Design Project

public class doctor extends person{
    String doctorID;
    String name;

    public doctor() {
            setDoctorID("Unknown");
            setName("Unknown");
        }

        // no argument constructor

    public doctor (String doctorID, String name) {
        this.doctorID = doctorID;
        this.name = name;
    }

    @Override
    public String toString() {
       return "\nDoctorID: " + doctorID +"\nName:  " + name;
    }// closes overide


    public void setDoctorID(String doctorID) {
        this.doctorID = doctorID;
    }
    public String getDoctorID(){
        return doctorID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }// close last getname class  THIS WAS ALL MY OWN CODE, below JB improved it



} // closes the doctor class  */

/** This is a doctor class.  This is a child class of person, as each doctor obviously has to
 * be a person.
 *
 * Created for by David Hopkins as part of the Obeject Orientated Design Project
 */

public class doctor extends person{
    String doctorID; //if you can think of any other possible Doctor-specific attributes, add them here
    //String name;

    public doctor() {
        setDoctorID("Unknown");
        //setName("Unknown");
    }

    // no argument constructor

    //JB added constructor here to ensure patientForm runs smoothly
    public doctor (String fname , String sname , String address , String town , String ppsn , String phoneNumber, String doctorID){
        super(fname, sname, address, town, ppsn, phoneNumber);
        this.doctorID = doctorID;
        //this.name = name;
    }

    @Override
    public String toString() {
        return super.toString() + "\nDoctorID: " + doctorID; //+"\nName:  " + name;
    }// closes overide


    public void setDoctorID(String doctorID) {
        this.doctorID = doctorID;
    }
    public String getDoctorID(){
        return doctorID;
    }

    /*public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }// close last getname class*/



} // closes the doctor class
