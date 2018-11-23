/**
 * This is a patient class.  This is a child class of person, as each patient obviously has to
 * be a person.
 *Created for by David Hopkins as part of the Obeject Orientated Design Project
 */

public class patient extends person {
    //private static final boolean yes = true;
    static int id = 0; //JB added some code to autoincrement id
    private String patientID;
    private boolean medicalCard;
    private doctor doc;


    public patient ( boolean b, doctor doc ) {
        id++;
        setPatientID(String.valueOf(id));
        setMedicalCard(true);
        setDoc(doc);
    }

    public patient ( String fname , String sname , String address , String town , String ppsn , int phoneNumber /*,String patientID*/ , boolean medicalCard, doctor doc) {
        super(fname, sname, address, town, ppsn, phoneNumber);
        id++;
        this.patientID = String.valueOf(id);
        this.medicalCard = medicalCard;
        //this.doc = doc;
        //


        //if (this.medicalCard == true) {
        //} else if (this.medicalCard == false) {
        //}

    }


    @Override
    public String toString () {
        return "\nPatientID: " + patientID + "\n" +
                "Medical Card:  " + medicalCard;
    }

    public String getPatientID () {
        return patientID;
    }


    public void setPatientID ( String patientID ) {
        this.patientID = patientID;
    }

    public boolean getMedicalCard () {
        return medicalCard;
    }

    public void setMedicalCard ( boolean medicalCard ) {
        this.medicalCard = medicalCard;
    }

    public doctor getDoc() {
        return doc;
    }

    public void setDoc(doctor doc) {
        this.doc = doc;
    }
}// closes the class
