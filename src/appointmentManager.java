/* David Hopkins 2018, medical project.  Appointmeanager with some validation in it
   using the action listener links in with GUi class

 */


import javax.swing.*;

public class appointmentManager extends patientForm {
    public static void main(String[] args) {
        String appTime, appointDate, fname, sname;


        fname = JOptionPane.showInputDialog("Please enter first name");
        sname = JOptionPane.showInputDialog("Please enter second name");


        appTime = JOptionPane.showInputDialog("Please enter a time of the appointment in the form HH:MM");

        if (appTime.equals("") || appTime.length() != 5 || (appTime.charAt(0) < '0' || appTime.charAt(0) > '2')
                    || (appTime.charAt(0) == '2' && appTime.charAt(1) > '3')
                    || !Character.isDigit(appTime.charAt(1))
                    || appTime.charAt(2) != ':' || (appTime.charAt(3) < '0' || appTime.charAt(3) > '5')
                    || !Character.isDigit(appTime.charAt(4))) {
            appTime = JOptionPane.showInputDialog("Invalid, please re-enter the time in the correct format");
        }

        //using x  as the sentinal value

        appointDate = JOptionPane.showInputDialog("Please enter a date for the appointment in the form dd-mm-yyyy (x to exit ");
        if(!appointDate.equals("x"))
        {
            while(!isValidDate(appointDate)) {
                appointDate = JOptionPane.showInputDialog("Invalid! Please re-enter the date of the appointment in the form dd-mm-yyyy (x to exit): ");
            }
            JOptionPane.showMessageDialog(null, "The appointment time for " + fname + " " + sname + " " + "\nis on  " + appointDate + "at " + " " + appTime, "Appointment Time",
                    JOptionPane.INFORMATION_MESSAGE);
        } else {
            System.exit(0);
        }


    }// closes main


    public static boolean isValidDate(String d)
    {
        boolean valid=false;
        String dayAsString,monthAsString;
        int day,month;


        // code was gained from JB notes last year
        
        if(d.length()==10)
        {
            if(Character.isDigit(d.charAt(0)) && Character.isDigit(d.charAt(1)) &&
                    d.charAt(2)=='-' && Character.isDigit(d.charAt(3)) &&
                    Character.isDigit(d.charAt(4)) && d.charAt(5)=='-' &&
                    Character.isDigit(d.charAt(6)) && Character.isDigit(d.charAt(7)) &&
                    Character.isDigit(d.charAt(8)) && Character.isDigit(d.charAt(9)))
            {
                dayAsString = d.substring(0,2);
                day = Integer.parseInt(dayAsString);

                if(day>=1 && day<=31)
                {
                    monthAsString = d.substring(3,5);
                    month = Integer.parseInt(monthAsString);

                    if(month>=1 && month<=12)
                    {
                        if(((month==4 || month==6 || month==9 || month==11) &&
                                day<=30) || (month==2 && day<=28))
                            valid=true;
                        else if((month==1 || month==3 || month==5 || month==7 || month==8 ||
                                month==10 || month==12) && day<=31)
                            valid=true;

                    }
                }
            }
        }

        return valid;
    }

} // closes the main method


