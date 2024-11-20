Overview

This project is a simple appointment management system for a health service.   It allows patients to make appointments with different types of health professionals, such as general practitioners and specialists.   The system was developed in Java and demonstrates the use of object-oriented programming concepts like inheritance, encapsulation, and polymorphism.

The system includes:

A base class (HealthProfessional) representing health professionals in general.

Two child classes (GeneralPractitioner and Specialist) representing specific types of health professionals.

An Appointment class to manage patient appointments with different health professionals.

A main class (AssignmentOne) that manages the entire system including appointment creation, viewing, and cancellation.

Classes Structure

HealthProfessional: This is the base class that contains common properties for health professionals, such as id, name, and department.   It also has methods to set and get these properties.

GeneralPractitioner: A subclass of HealthProfessional, representing general practitioners.   This class includes additional information such as clinicHours.

Specialist: A subclass of HealthProfessional, representing specialists with a specific specialization field.

Appointment: Represents an appointment made by a patient with a specific health professional.   It includes information like patientName, mobile, preferredTime, and the associated health professional.

AssignmentOne: The main class that demonstrates the use of the above classes by creating objects, adding appointments, printing the details, and managing the collection of appointments.

Key Features

Inheritance: The project uses inheritance by extending the HealthProfessional class to create specific types of health professionals (GeneralPractitioner and Specialist).

Encapsulation: The use of setter and getter methods allows for encapsulation, ensuring that instance variables are accessible only through these controlled interfaces.

Polymorphism: The Appointment class accepts a HealthProfessional object, allowing it to handle different types of health professionals polymorphically.

Collection Management: Appointments are managed using an ArrayList, allowing the system to add, view, and cancel appointments.

Getting Started

Prerequisites

Java Development Kit (JDK) installed

An IDE such as VS Code, IntelliJ, or Eclipse

Running the Project

Clone this repository to your local machine.

Open the project in your IDE.

Navigate to the AssignmentOne class and run it.

How to Use

The system will create a few sample HealthProfessional and Appointment objects.

It will display details about general practitioners, specialists, and appointments.

The program will also demonstrate adding new appointments and canceling existing ones.

Class Details

HealthProfessional

Attributes: id, name, department

Methods: Constructor, setters, getters, printDetails()

GeneralPractitioner (Extends HealthProfessional)

Attributes: clinicHours

Methods: Constructor, printDetails() (overrides base class)

Specialist (Extends HealthProfessional)

Attributes: specialization

Methods: Constructor, printDetails() (overrides base class)

Appointment

Attributes: patientName, mobile, preferredTime, doctor

Methods: Constructor, printDetails(), getMobile()

AssignmentOne

Methods: main(), createAppointment(), printExistingAppointments(), cancelBooking()

Example Output

The program will output the details of health professionals, appointments created, and updated appointment lists after cancellations.
