package service;

import java.util.LinkedList;
import java.util.Iterator;

public class AppointmentService {

    private LinkedList<String> appointments = new LinkedList<>();

    public void initializeAppointments() {
        // TODO: Add 3 normal appointments
        // TODO: Add 1 urgent appointment at the beginning
        appointments.add("Doctor's appointment");
        appointments.add("Meeting with client");
        appointments.add("Lunch with friend");
        appointments.addFirst("Urgent: Call plumber");
    }

    public void cancelLast() {
        // TODO: Remove last appointment
        if (!appointments.isEmpty()) {
            appointments.removeLast();
        }
    }

    public void showFirstAndLast() {
        // TODO: Print first and last appointment
        if (!appointments.isEmpty()) {
            System.out.println("First appointment: " + appointments.getFirst());
            System.out.println("Last appointment: " + appointments.getLast());
        }
    }

    public void printAppointments() {
        // TODO: Traverse using Iterator
        Iterator<String> iterator = appointments.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        } 
    }
}
