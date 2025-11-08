public class TimeCalc {
    public static void main(String[] args) {
        int hours = Integer.parseInt(args[0].substring(0, 2));
        int mins = Integer.parseInt(args[0].substring(3));
        int minutesToAdd = Integer.parseInt(args[1]);
        
        int totalMins = hours * 60 + mins + minutesToAdd;
        int totalHours = totalMins / 60;
        int newHours = totalHours % 24;
        int newMinutes = totalMins - totalHours *60;
        
        String outHours = "";
        String outMinutes = "";
        // Prefix 0 if needed
        if (newHours == 0) {
            outHours = "00";
        } else if (newHours < 10) {
            outHours += "0" + newHours;
        } else {
            outHours += newHours;
        }
        if (newMinutes == 0) {
            outMinutes = "00";
        } else if (newMinutes < 10) {
            outMinutes += "0" + newMinutes;
        } else {
            outMinutes += newMinutes;
        }
        System.out.println(outHours + ":" + outMinutes);

    }
}
