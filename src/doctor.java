/** This is a doctor class.  This is a child class of person, as each doctor obviously has to
 * be a person.
 *
 * Created for by David Hopkins as part of the Obeject Orientated Design Project
 */
public class doctor extends person{
    String doctorID;
    String name;

    public doctor(String doctorID, String name) {
            setDoctorID("Unknown");
            setName("Unknown");
        }

        // no argument constructor

    public doctor () {
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
    }// close last getname class



} // closes the doctor class
