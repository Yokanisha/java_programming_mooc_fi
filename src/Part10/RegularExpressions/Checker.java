package Part10.RegularExpressions;

public class Checker {

    public boolean isDayOfWeek(String string) {
        if(string.matches("mon|tue|wed|thu|fri|sat|sun")) {
            return true;
        }

        return false;
    }

    public boolean allVowels(String string) {
        if(string.matches( "(a|e|i|o|u)*" )) {
            return true;
        }
        return false;
    }

    public boolean timeOfDay(String string) {
        //00:00:00 - 23:59:59
        if(string.matches("([0-1][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9]")) {
            System.out.println("ture");
            return true;
        }
        return false;
    }







}
