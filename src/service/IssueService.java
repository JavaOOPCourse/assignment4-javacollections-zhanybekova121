package service;

import model.Issue;
import java.util.PriorityQueue;
import java.util.Iterator;

public class IssueService {

    private PriorityQueue<Issue> issues = new PriorityQueue<>();

    public void initializeIssues() {
        // TODO: Add at least 5 issues
        issues.add(new Issue("problem1", 2));
        issues.add(new Issue("problem2", 2));
        issues.add(new Issue("problem3", 1));
        issues.add(new Issue("problem4", 5));
        issues.add(new Issue("problem5", 3));

    }

    public void showMostUrgent() {
        // TODO: Show most urgent issue
        if (issues.isEmpty()) {
            System.out.println("No issues available");
            return;
        }
        System.out.println(issues.peek());
    }

    public void resolveIssues() {
        // TODO: Remove 2 issues
        for (int i = 0; i< 2; i++) {
            if (!issues.isEmpty()) {
                Issue resolved = issues.poll();
                System.out.println("Resolved: " + resolved);
            }
        }
        
    }

    public void printRemainingIssues() {
        // TODO: Print using iterator
        Iterator<Issue> iterator = issues.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public void addNewIssue(String description, int urgency) {
        // TODO: Add new issue
        issues.add(new Issue(description, urgency));
    }

    public void showEmergencyIssues() {
    PriorityQueue<Issue> copy = new PriorityQueue<>(issues);

    System.out.println("Emergency issues:");

    boolean found = false;
    while (!copy.isEmpty()) {
        Issue issue = copy.poll();
        if (issue.getUrgencyLevel() == 1) {
            System.out.println(issue);
            found = true;
        } else {
            break;
        }
    }

    if (!found) {
        System.out.println("No emergency issues");
    }
}
}
