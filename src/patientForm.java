/* David Hopkins Medical project for java 2018.
 final patent form.  I am leaving in commented out earlier versions of the code
 importing the javax for the dialog b/* David Hopkins Medical project for java 2018.
 final patent form.  I am leaving in commented out earlier versions of the code
 importing the javax for the dialog boxes */

import javax.swing.*;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/* decided to use grid layout as it was the easiest and simplest way I could set the form.
without having to directly set every piece of the form.  */


public class patientForm {
    static int count = 1;  // this line stumpped me for ages but got help with Jb on it
    static patient[] patients;
    JFrame frame; //creating globally
    JButton newSubmitButton, newCancelButton;  // reference two seperate methods so needs to be set globally

    static ArrayList<patient> allpatients = new ArrayList<>();




    JTextField fnameField;
    JTextField snameField;
    JTextField addressField;
    JTextField townField;
    JTextField ppsnField;
    JTextField phoneNumberField;
    JRadioButton medicalCard;



  /* This was earlier test code.  Commentted out !

   public static void main2(String[] args) {


        // creating a user input for patients

        String answer;

        //int count = 0;
        String fname, sname, address, town, patientID, doctorID;
        String ppsn;
        int phoneNumber;
        boolean medicalCard;
        patients = new patient[5000];// patient array


        answer = JOptionPane.showInputDialog("Do you have a patient to enter ? please answer yes or no");

        //user defined input, each time the user says yes it starts a new entry...using a while loop

        while (answer.toUpperCase().equals("YES")) {


    // patientID = JOptionPane.showInputDialog("Please enter a new ID for Pateient ?"); //autoincremented
    fname = JOptionPane.showInputDialog("Please enter a first name");
    sname = JOptionPane.showInputDialog("Please enter a second name?");
    address = JOptionPane.showInputDialog("Please enter an address");
    town = JOptionPane.showInputDialog("Please enter a town");
    ppsn = JOptionPane.showInputDialog("Please enter a ppsn number ?");
    phoneNumber = Integer.parseInt(JOptionPane.showInputDialog("Please enter a phone number ?"));
    doctorID = JOptionPane.showInputDialog("Please enter a doctorID ?");
    medicalCard = Boolean.parseBoolean("Do you have a medical card ? y/n");

    doctor doc = new doctor();

    patients[count] = new patient(fname, sname, address, town, ppsn, phoneNumber/*, patientID*//*,  medicalCard, doc);
    count++;

    answer = JOptionPane.showInputDialog("Do you have a patient to enter ? please answer yes or no");
    }


    display();
    }// closing off main*/

    public static void display() {


        JTextArea jta = new JTextArea("Patients:\n\n");

        for (int x = 0; x < count; x++) {
            jta.append("patientID: " + patients[x].getPatientID() + "\n");
            jta.append("Name: " + patients[x].getFname() + " " + patients[x].getSname() + "\n");
            jta.append("Address: " + patients[x].getAddress() + "\n");
            jta.append("Town: " + patients[x].getTown() + "\n");
            jta.append("PPSN Number: " + patients[x].getPpsn() + "\n");
            jta.append("Phone Number:  " + patients[x].getPhoneNumber() + "\n");
            // jta.append("DoctorID:  " + patients[x].getDoc() + "\n"); // already displayed in doctor doc.
            jta.append("Medical Card: " + patients[x].getMedicalCard() + "\n");
        }

        JOptionPane.showMessageDialog(null, jta);

    }  // closes the display method

    public patientForm()
    {

        //JB a little help here. Set sizes from last years labsheets.

        frame = new JFrame("Patient Details");
        frame.setSize(500,500);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



        frame.setLayout(new GridLayout(9,1));

       /* JLabel patientIDLabel = new JLabel("Patient ID:");
        frame.add(patientIDLabel);

        JTextField patientIDField= new JTextField(1);
        frame.add(patientIDField);*/

        JLabel fnameIDLabel = new JLabel("First name: ");
        frame.add(fnameIDLabel);

        fnameField = new JTextField(1);
        frame.add(fnameField);

        JLabel snameLabel = new JLabel("Second name: ");
        frame.add(snameLabel);

        snameField = new JTextField(1);
        frame.add(snameField);

        JLabel addressLabel = new JLabel("What is your address: ");
        frame.add(addressLabel);

        addressField = new JTextField(1);
        frame.add(addressField);

        JLabel townLabel = new JLabel("What is your Town: ");
        frame.add(townLabel);

        townField = new JTextField(1);
        frame.add(townField);

        JLabel ppsnLabel = new JLabel("What is your ppsn number ? : ");
        frame.add(ppsnLabel);

        ppsnField = new JTextField(1);
        frame.add(ppsnField);

        JLabel phoneNumberLabel = new JLabel("What is your mobile number: ");
        frame.add(phoneNumberLabel);

        phoneNumberField = new JTextField(1);
        frame.add(phoneNumberField);

        JLabel medicalCardLabel = new JLabel("Do you have a medical card: ");
        frame.add(medicalCardLabel);

        //JTextField medicalCardField = new JTextField(1);

        // google how to do this via internet and found it easier to do just one, otherwise tricky!!

        medicalCard = new JRadioButton("Yes");
        frame.add(medicalCard);

        //creating the submit and cancel buttons for the end of the patient form

        newSubmitButton = new JButton("Submit");
        frame.add(newSubmitButton);

        newCancelButton = new JButton("Cancel");
        frame.add(newCancelButton);

        //creating the button handlers

        patientForm.ButtonEventHandler buttonHandler = new patientForm.ButtonEventHandler();

        newSubmitButton.addActionListener(buttonHandler);
        newCancelButton.addActionListener(buttonHandler);

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new patientForm();
    }

    private class ButtonEventHandler implements ActionListener {

        public void actionPerformed(ActionEvent e)
        {
            if(e.getSource()== newSubmitButton) {
                // create dummy doctor for now


                doctor doctor1 = new doctor("Joe","Bloggs","Anyplace","Anytown","1234567AB","0667123456","123");

                // creating patient from text boxes
                String fname = fnameField.getText();
                String sname = snameField.getText();
                String address = addressField.getText();
                String town = townField.getText();
                String ppsn = ppsnField.getText();

                //JB Advice - you can validate phone number if you want to add some extra complexity
                //Take the phone number from the text-field, as a String, and then do some checks on it
                //e.g. must begin with 3-digit area code, then a space or dash, followed by say 7 or 8 more digits
                //So when the submit button is clicked, you'll take the value and have the validation right here, within
                //this method (you could have a separate method called isValidPhoneNumber(String num) to do this too
                //if you wish. If the phone-number is valid then other fields will be validated through their setter methods
                //and if the phone-number is invalid you can put out on message dialog to indicate the problem with the number
                //I have added a "skeleton" validation test, called in the person class setPhoneNumber(), see if you
                //can do the validation for the isValidPhoneNumber(String num) method


                String phoneNumber = phoneNumberField.getText();

                medicalCard.isSelected();  //for some insane reason this seems to work after tearing my hair out !


                //JB Advice - if all the fields have good values then a new patient object will get created with the values
                //taken from the text-fields (for most of the arguments, they will be validated through the setter method that
                //corresponds to it and a message dialog will display to indicate any problems. You could have a String attribute
                //called invalidFieldData in the patient class that would be initialised to empty string and, as each field is
                //validated, if it turns out to be invalid, the corresponding setter method could add information on to this
                //attribute. I've added some code to person class to reflect this.

                patient p = new patient(fname, sname, address, town, ppsn, phoneNumber,  medicalCard.isSelected(), doctor1);

                if(p.getInvalidFieldData().equals("")){

                    JOptionPane.showMessageDialog(null, "All data entered was good - patient now created" ,"Patient Created!",
                            JOptionPane.INFORMATION_MESSAGE);
                    allpatients.add(p);
                }
                else
                    JOptionPane.showMessageDialog(null, "Some of the data entered was bad as follows:\n\n" + p.getInvalidFieldData() ,"Warning",
                            JOptionPane.ERROR_MESSAGE);

                allpatients.add(p);

                //quick tests - what is the size of the array list now? If there was anything wrong with the data, then the patient object will not
                //be added to the arraylist so its size remains the same as before

                System.out.println(allpatients.size());

                //if there are patient objects in the array list, what values do they contain?
                for(patient pat: allpatients)
                    System.out.println(pat);


                frame.setVisible(false);
                new guiClass();








                //System.out.println("Account button clicked"); that was in earlier versions I knew where event handling was
                // in latest version this is where I plan to save patient details !
            }


            // cancel button closes patientfrom and reopens gui class

            else if(e.getSource()==newCancelButton) {
                frame.setVisible(false);
                new guiClass();  //  !
            }
        }
    }  // end button eventhandler class

    public void setNewSubmitButton(JButton newSubmitButton) {
        this.newSubmitButton = newSubmitButton;
    }

    public void newCancelButton(JButton newCancelButton) {
        this.newCancelButton = newCancelButton;
    }




}