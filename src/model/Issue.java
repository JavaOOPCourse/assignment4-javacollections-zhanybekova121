package model;

public class Issue implements Comparable<Issue> {

    // TODO: declare fields
    private String description;
    private int urgencyLevel; // 1 = most urgent

    // TODO: create constructor
    public Issue(String description, int urgencyLevel) {
        this.description = description;
        this.urgencyLevel = urgencyLevel;
    }

    // TODO: implement compareTo()
    @Override
    public int compareTo(Issue other) {
        // TODO: implement priority logic
        return Integer.compare(this.urgencyLevel, other.urgencyLevel);
    }

    // TODO: override toString()
    public String toString() {
        return "Description: " + description + " , urgency level: " + urgencyLevel;
    }

    public int getUrgencyLevel() {
        return urgencyLevel;
    }
    public String getdesription() {
        return description;
    }


}
