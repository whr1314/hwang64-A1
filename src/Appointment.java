public class Appointment {
    // Instance variables for patient details
    private String patientName;       // Patient's name
    private String mobile;            // Patient's mobile phone number
    private String preferredTime;     // Preferred appointment time (e.g., 08:00, 10:00, 14:30)
    private HealthProfessional doctor; // Doctor for the appointment (General Practitioner or Specialist)

    // Default constructor
    public Appointment() {
        this.patientName = ""; // Initialize patient name as empty string
        this.mobile = ""; // Initialize mobile phone as empty string
        this.preferredTime = ""; // Initialize preferred time as empty string
        this.doctor = null; // Initialize doctor as null
    }

    // Constructor to initialize all instance variables
    public Appointment(String patientName, String mobile, String preferredTime, HealthProfessional doctor) {
        this.patientName = patientName;
        this.mobile = mobile;
        this.preferredTime = preferredTime;
        this.doctor = doctor;
    }

    // Method to print details of the appointment
    public void printDetails() {
        System.out.println("Appointment Details:");
        System.out.println("Patient Name: " + patientName);
        System.out.println("Mobile: " + mobile);
        System.out.println("Preferred Time: " + preferredTime);
        System.out.print("Doctor Details: ");
        if (doctor != null) {
            doctor.printDetails(); // Call the printDetails() method of the associated doctor
        } else {
            System.out.println("No doctor assigned.");
        }
    }

    // Getter for mobile, useful for finding appointment by patient's mobile
    public String getMobile() {
        return mobile;
    }
}
