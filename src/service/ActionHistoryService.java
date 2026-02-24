package service;

import java.util.ArrayDeque;
import java.util.Iterator;

public class ActionHistoryService {

    private ArrayDeque<String> actions = new ArrayDeque<>();   // -> (stack)

    public void initializeActions() {
        // TODO: Add 4 actions
        actions.addLast("Submitted Assignment");
        actions.addLast("Dropped Course");
        actions.addLast("Registered Course");
        actions.addLast("Updated Profile");
    }

    public void undoLastAction() {
        // TODO: Remove last action   (LIFO)
        if (!actions.isEmpty()) {
            System.out.println("Undo: " + actions.removeLast());
        }
    }

    public void addRequestedTranscript() {
        // TODO: Add "Requested Transcript"
        actions.addLast("Requested Transcript");

    }

    public void showFirstAndLast() {
        // TODO: Print first and last action
        if (actions.isEmpty()) {
            System.out.println("No actions available");
            return;
        }
        System.out.println("First action: " + actions.peekFirst());
        System.out.println("Last action: " + actions.peekLast());
    }

    public void printHistory() {
        // TODO: Iterate through history
        Iterator<String> iterator = actions.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
