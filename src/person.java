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


        public person() {
            this("Unknown","Unknown","Unknown","unknown", "Unknown", 0); }

        public person(String fname, String sname, String address, String Town, String ppsn, int phoneNumber) {

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



            this.phoneNumber = phoneNumber;

            //use the setters here for validation purposes
        }

    public person(String unknown1, String unknown2, String unknown3, String unknown4, double ppsn, int phoneNumber) {

    }

    @Override
        public String toString() {
            return "\nName: \"+ fname  + \"  \" + sname + " +
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
            else
                JOptionPane.showMessageDialog(null, "Please type in a suitable name" ,"Warning",
                        JOptionPane.ERROR_MESSAGE);

        }// closes off fname class

        public String getSname() {
        return sname;
        }

        public void setSname(String sname){
                if (!sname.equals(""))
                    this.sname = sname;
                else
                    JOptionPane.showMessageDialog(null, "Please type in a suitable name" ,"Warning",
                            JOptionPane.ERROR_MESSAGE);
            } //closes off class sname


        public String getAddress() {
            return address;
        }

    public void setAddress(String sname){
        if (!address.equals(""))
            this.address = address;
        else
            JOptionPane.showMessageDialog(null, "Please type in a suitable address" ,"Warning",
                    JOptionPane.ERROR_MESSAGE);
    } //closes off address error message validation


        public String getTown(){
            return town;
        }

        public void setTown(String town) {
            if (!town.equals(""))
            this.town = town;
            else
                JOptionPane.showMessageDialog(null, "Please type in a town, this is a mandatory field" ,"Warning",
                        JOptionPane.ERROR_MESSAGE);
        } //closes off town error message validation


        public String getPpsn() {
            return ppsn;
        }

        public void setPpsn(String ppsn) {
            this.ppsn = ppsn;









        }




        public int getPhoneNumber() {
            return phoneNumber;
        }
        public void setPhoneNumber(int phoneNumber){this.phoneNumber = phoneNumber; }

        }// closes the class
