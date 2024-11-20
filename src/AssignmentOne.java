import java.util.ArrayList;

public class AssignmentOne {
    // Part 5 – Collection of appointments
    // Declare an ArrayList to store appointments
    static ArrayList<Appointment> appointments = new ArrayList<>();

    public static void main(String[] args) {
        // Part 3 – Using classes and objects
        System.out.println("Part 3 – Using classes and objects:");

        // Create GeneralPractitioner objects
        GeneralPractitioner gp1 = new GeneralPractitioner(1, "Dr. Hong Gou", "General Medicine", "8:00 AM - 5:00 PM");
        GeneralPractitioner gp2 = new GeneralPractitioner(2, "Dr. Xao LI", "General Medicine", "9:00 AM - 4:00 PM");

        // Create Specialist objects
        Specialist sp1 = new Specialist(3, "Dr. Mai Tek", "Cardiology", "Heart Specialist");

        // Part 4 – Create Appointments
        System.out.println("Part 4 – Create Appointments:");

        // Create and add appointment objects using createAppointment method
        createAppointment("Wei Long", "1234567890", "08:00 AM", gp1);
        createAppointment("Hong Lan", "0987654321", "10:00 AM", sp1);
        createAppointment("Tom Luna", "1122334455", "02:00 PM", gp2);
        createAppointment("Emily Uluru", "5566778899", "03:00 PM", sp1);

        // Part 5 – Collection of appointments
        System.out.println("Part 5 – Collection of appointments:");
        printExistingAppointments();
        System.out.println("------------------------------");

        // Cancel one appointment by mobile number
        cancelBooking("1234567890");

        // Print existing appointments again after cancellation
        System.out.println("Updated list of appointments after cancellation:");
        printExistingAppointments();
        System.out.println("------------------------------");
    }

    // Method to create a new appointment and add it to the ArrayList
    public static void createAppointment(String patientName, String mobile, String time, HealthProfessional doctor) {
        if (patientName.isEmpty() || mobile.isEmpty() || time.isEmpty() || doctor == null) {
            System.out.println("Invalid appointment details! Appointment not created.");
            return;
        }
        Appointment newAppointment = new Appointment(patientName, mobile, time, doctor);
        appointments.add(newAppointment);
        System.out.println("Appointment created for " + patientName + " at " + time);
    }

    // Method to print existing appointments
    public static void printExistingAppointments() {
        if (appointments.isEmpty()) {
            System.out.println("No appointments available.");
        } else {
            for (Appointment appointment : appointments) {
                appointment.printDetails();
                System.out.println("------------------------------");
            }
        }
    }

    // Method to cancel a booking using the patient's mobile phone number
    public static void cancelBooking(String mobile) {
        boolean found = false;
        for (int i = 0; i < appointments.size(); i++) {
            if (appointments.get(i).getMobile().equals(mobile)) {
                appointments.remove(i);
                System.out.println("Appointment cancelled for mobile: " + mobile);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("No appointment found with mobile: " + mobile);
        }
    }
}
