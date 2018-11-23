
import javax.swing.*;
import java.awt.GridLayout;

public class patientForm {
    static int count = 0;  // this line stumpped me for ages but got help with Jb on it
    static patient[] patients;
    JFrame frame; //creating globally

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

            patients[count] = new patient(fname, sname, address, town, ppsn, phoneNumber/*, patientID*/,  medicalCard, doc);
            count++;

            answer = JOptionPane.showInputDialog("Do you have a patient to enter ? please answer yes or no");
        }


        display();
    }// closing off main

    public static void display() {


        JTextArea jta = new JTextArea("Patients:\n\n");

        for (int x = 0; x < count; x++) {
            jta.append("patientID: " + patients[x].getPatientID() + "\n");
            jta.append("Name: " + patients[x].getFname() + " " + patients[x].getSname() + "\n");
            jta.append("Address: " + patients[x].getAddress() + "\n");
            jta.append("Town: " + patients[x].getTown() + "\n");
            jta.append("PPSN Number: " + patients[x].getPpsn() + "\n");
            jta.append("Phone Number:  " + patients[x].getPhoneNumber() + "\n");
            // jta.append("DoctorID:  " + patients[x].getDoc() + "\n"); already displayed in doctor doc.
            jta.append("Medical Card: " + patients[x].getMedicalCard() + "\n");
        }

        JOptionPane.showMessageDialog(null, jta);

    }  // closes the display method

    public patientForm()
    {
        frame = new JFrame("Patient Details");
        frame.setSize(700,700);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        frame.setLayout(new GridLayout(30,30));

        JLabel patientIDLabel = new JLabel("Patient ID:");
        frame.add(patientIDLabel);

        JTextField patientIDField= new JTextField(1);
        frame.add(patientIDField);

        JLabel fnameIDLabel = new JLabel("First name: ");
        frame.add(fnameIDLabel);

        JTextField fnameField = new JTextField(1);
        frame.add(fnameField);

        JLabel snameLabel = new JLabel("Second name: ");
        frame.add(snameLabel);

        JTextField snameField = new JTextField(1);
        frame.add(snameField);

        JLabel addressLabel = new JLabel("What is your address: ");
        frame.add(addressLabel);

        JTextField addressField = new JTextField(1);
        frame.add(addressField);

        JLabel townLabel = new JLabel("What is your Town: ");
        frame.add(townLabel);

        JTextField townField = new JTextField(1);
        frame.add(townField);

        JLabel ppsnLabel = new JLabel("What is your ppsn number ? : ");
        frame.add(ppsnLabel);

        JTextField ppsnField = new JTextField(1);
        frame.add(ppsnField);

        JLabel mobileLabel = new JLabel("What is your mobile number: ");
        frame.add(mobileLabel);

        JTextField mobileField = new JTextField(1);
        frame.add(mobileField);

        JLabel medicalCardLabel = new JLabel("Do you have a medical card: ");
        frame.add(medicalCardLabel);

        JTextField medicalCardField = new JTextField(1);
        frame.add(medicalCardField);

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new patientForm();
    }

}