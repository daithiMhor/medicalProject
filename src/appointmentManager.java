import javax.swing.*;

public class appointmentManager extends patientForm {
    public static void main(String[] args) {
        String appTime, appointDate;

        appTime =  JOptionPane.showInputDialog("Please enter a time of the appointment in the form HH:MM (x to exit)");


        //appTime = JOptionPane.showInputDialog("Please enter an appointment time (x to exit)");

        while(!appTime.equals("x"))
        {
            while(!appTime.equals("x") && !isValidAppTime(appTime))
                appTime = JOptionPane.showInputDialog("Invalid! Please re-enter the appointment time (x to exit): ");

                   if(!appTime.equals("x"))
                       appTime = JOptionPane.showInputDialog("Please enter another time for an appointment in the correct format (x to exit) ");






    }// closes the main string
} // closes the class
