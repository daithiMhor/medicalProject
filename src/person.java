import javax.swing.*;

/** Created by David Hopkins 05/11/2018
 * This is the person class
 * As part of the Object Orientated Element of Software Development Year 2.
 */
public class person {

    private String fname;
    private String sname;
    private String address;
    private String town;
    private String ppsn;
    private int phoneNumber;
    private String invalidFieldData=""; //JB added this attribute to track invalid text-field inputs


    public person() {
        this("Unknown","Unknown","Unknown","unknown", "Unknown", "Unknown"); }

    public person(String fname, String sname, String address, String town, String ppsn, String phoneNumber) {

        //this.fname = fname;  changing some of the data to work for validation purposes in the form
        setFname(fname);

        //this.sname = sname;
        setSname(sname);

        //this.address = address;
        setAddress(address);

        //this.town = town;
        setTown(town);

        //this.ppsn = ppsn;
        setPpsn(ppsn);



        //this.phoneNumber = phoneNumber;
        setPhoneNumber(phoneNumber);

        //use the setters here for validation purposes



    }

    public person(String unknown1, String unknown2, String unknown3, String unknown4, double ppsn, int phoneNumber) {

    }

    @Override
    public String toString() {
        return "\nName: "+ fname  + " " + sname  +
                "\nAddress: " + address +"\n"+
                "Town: " + town +"\n"+
                "Personal PPS Number: " + ppsn +"\n"+
                "Mobile Phone:  " + phoneNumber;
    }



    public String getFname() {

        return fname;
    }

    public void setFname(String fname) {
        if(!fname.equals(""))
            this.fname = fname;
        else {
            invalidFieldData+="Please type in a suitable firstname\n";
            JOptionPane.showMessageDialog(null, "Please type in a suitable firstname" ,"Warning",
            JOptionPane.ERROR_MESSAGE);}

    }// closes off fname class

    public String getSname() {
        return sname;
    }

    public void setSname(String sname){
        if (!sname.equals(""))
            this.sname = sname;
        else{
            invalidFieldData+="Please type in a suitable surname\n";

            JOptionPane.showMessageDialog(null, "Please type in a suitable surname" ,"Warning",
            JOptionPane.ERROR_MESSAGE);}
    } //closes off class sname


    public String getAddress() {
        return address;
    }

    public void setAddress(String address){
        if (!address.equals(""))
            this.address = address;
        else{
            invalidFieldData+="Please type in a suitable address\n";
        JOptionPane.showMessageDialog(null, "Please type in a suitable address" ,"Warning",
                JOptionPane.ERROR_MESSAGE);
        }
    } //closes off address error message validation


    public String getTown(){
        return town;
    }

    public void setTown(String town) {
        if (!town.equals(""))
            this.town = town;
        else{
            invalidFieldData+="Please type in a suitable town value, this is a mandatory field\n";
        JOptionPane.showMessageDialog(null, "Please type in a town, this is a mandatory field" ,"Warning",
                JOptionPane.ERROR_MESSAGE);}
    } //closes off town error message validation


    public String getPpsn() {
        return ppsn;
    }


    public void setPpsn(String ppsn) {

        if(!isValidPPSN(ppsn))
            invalidFieldData+="Invalid PPSN entered - must have the correct format\n";
        else
            this.ppsn = ppsn;
    }

    //skeleton of this routine created by JB, Dave to complete hopefully
    private boolean isValidPPSN(String ppsn) {

            if(ppsn.length()==(9)){
                for(int i=0;i<7;i++)
                    if(Character.isDigit(ppsn.charAt(i)))
                    {}
                    else
                    {
                        JOptionPane.showInputDialog("Invalid! The first seven charatcers must be a digit");
                        return false;
                    }// closes off the for loop


                    if(Character.isDigit(ppsn.charAt(7)) || Character.isUpperCase(ppsn.charAt(7)))

                         if(Character.isUpperCase(ppsn.charAt(8)))

                            return true;
                        else
                            return false;
                    else
                        return false;} //close off the first if
        else
             return false;
    } // closes off the method

            /*else
                ppsn = JOptionPane.showInputDialog("Invalid! The first seven charatcers must be a digit");

            else
                ppsn = JOptionPane.showInputDialog("Invalid! Must be 9 characters. Please re-enter");

            else
                ppsn =JOptionPane.showInputDialog("Invalid! Last two characters must be Uppercase letters. Please re-enter");*/

            //return false; //dummy return value - we'll say for now the value entered is valid (even if it is actually invalid)
    //}  // closes off the while statement




    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber){

                if(!isValidPhoneNumber(phoneNumber))
            invalidFieldData+="Invalid phone number entered - must have the correct format\n";
        else
            this.phoneNumber = Integer.parseInt(phoneNumber); //assuming phoneNumber stays as an integer attribute

    }

    //skeleton of this routine created by JB, Dave to complete hopefully
    private boolean isValidPhoneNumber(String phoneNumber) {
            //while(isValidPhoneNumber(phoneNumber)){
            //    if(phoneNumber.length()==(13))


        return true; //dummy return value - we'll say for now the value entered is valid (even if it is actually invalid)
    }

    public String getInvalidFieldData()
    {
        return invalidFieldData;
    }


}// closes the class