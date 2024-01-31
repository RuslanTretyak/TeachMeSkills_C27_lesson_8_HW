## TeachMeSkills_C27_lesson_8_HW
Homework for the eighth lesson

We created a program to simulate the work of a clinic. The program has three classes of doctors: "Surgeon", "Therapist" 
and "Dentist". These classes extend the common parent abstract class "Doctor". Abstract class "Doctor" has method 
"traet()", which implements in classes "Surgeon", "Therapist" and "Dentist" in different ways. There is also a "Patient" 
class with a "Treatment Plan" field and a "Doctor" field. The "Therapist" class has a static method "appointDoctor()" for 
assigning a doctor to a patient according to a treatment plan. Test class "Main" creates an object of the "Patient" 
class and adds a treatment plan to the patient. The patient is then assigned a "Doctor" object through the "Therapist" 
class, and the assigned "Doctor" executes the "Treat" method.