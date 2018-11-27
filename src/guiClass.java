/*David Hopkins
borrowed some of this code from a basic gui from,
John Brosnan's notes from last year !!

 */
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;


public class guiClass {
    JTextField usernameField;
    JPasswordField passwordField;
    JButton newAccountButton, viewAccountButton, generateAccountButton, appointmentAccountButton,removeAccountButton ;
    String usernames[] = new String[100];
    String passwords[] = new String[100];
    JFrame jFrameWindow;

    public guiClass()
    {
        jFrameWindow = new JFrame("Medical Supevisor System");

        FlowLayout flowLayout = new FlowLayout();

        jFrameWindow.setLayout(flowLayout);

        jFrameWindow.setSize(500,150);

        jFrameWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel promptLabel = new JLabel("Welcome Administrator.  " +
                "Which task would you like to proceed with?");

        jFrameWindow.add(promptLabel);

        newAccountButton = new JButton("Enter Patients");
        jFrameWindow.add(newAccountButton);

        viewAccountButton = new JButton("Enter Doctors");
        jFrameWindow.add(viewAccountButton);

         removeAccountButton = new JButton("Remove Account");
        jFrameWindow.add(removeAccountButton);

         appointmentAccountButton = new JButton("Make Appointment");
        jFrameWindow.add(appointmentAccountButton);

        ButtonEventHandler buttonHandler = new ButtonEventHandler();

        // creates the handlers for the four buttons

        newAccountButton.addActionListener(buttonHandler);
        viewAccountButton.addActionListener(buttonHandler);
        removeAccountButton.addActionListener(buttonHandler);
        appointmentAccountButton.addActionListener(buttonHandler);

        jFrameWindow.setVisible(true);
    }

    public static void main(String args[])
    {
        guiClass guiApp = new guiClass();
    }

    //code for private class ButtonEventHandler here

    private class ButtonEventHandler implements ActionListener{

        public void actionPerformed(ActionEvent e)
        {
            if(e.getSource()==newAccountButton) {

                new patientForm();     //this creates a new patient form, small bit of help from Jason Dowling !

                //System.out.println("Account button clicked"); that was in earlier versions I knew where event handling was

            }
            else if(e.getSource()==viewAccountButton)
                System.out.println("view button clicked");
            else if(e.getSource()==appointmentAccountButton)

                // displaying the array

                for (int i =0; i < patientForm.allpatients.size(); i++){
                    JOptionPane.showMessageDialog(null, patientForm.allpatients.get(i).getFname());
                }




            else
                System.out.println("remove button clicked");
        }
    }

    public void setViewAccountButton(JButton viewAccountButton) {
        this.viewAccountButton = viewAccountButton;
    }

    public void setGenerateAccountButton(JButton generateAccountButton) {
        this.generateAccountButton = generateAccountButton;
    }

    public void setNewAccountButton(JButton newAccountButton) {
        this.newAccountButton = newAccountButton;
    }

    public void setAppointmentAccountButton(JButton appointmentAccountButton) {
        this.appointmentAccountButton = appointmentAccountButton;
    }


} // closes gui class

