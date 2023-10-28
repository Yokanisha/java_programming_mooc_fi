package Part9.Warehousing;


import java.util.ArrayList;

public class ChangeHistory {

    private ArrayList<Double> changeHistory;
    public ChangeHistory() {
        this.changeHistory = new ArrayList<>();
    }


    public void add(double status) {
        this.changeHistory.add(status);
    }

    public void clear() {
        changeHistory.clear();
    }

    public String toString() {
        return changeHistory.toString();
    }

    public double maxValue() {
        if(changeHistory.isEmpty()) {
            return 0.0;
        }

        double maxValue = 0;
        for(double value : changeHistory) {
            if(value > maxValue) {
                maxValue = value;
            }
        }
        return maxValue;
    }

    public double minValue() {
        if(changeHistory.isEmpty()) {
            return 0.0;
        }

        double minValue = 999_999_999;
        for(double value : changeHistory) {
            if(value < minValue) {
                minValue = value;
            }
        }
        return minValue;
    }

    public double average() {
        if(changeHistory.isEmpty()) {
            return 0.0;
        }

        int count = 0;
        double avg = 0;
        for(double value : changeHistory) {
            avg += value;
            count++;
            }

        return avg/count;
    }




}
