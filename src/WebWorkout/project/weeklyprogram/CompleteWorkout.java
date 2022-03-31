package WebWorkout.project.weeklyprogram;

public class CompleteWorkout {
    public static boolean trainingDays(Days days) {
        switch(days) {
            case TUE:
            case MON:
            case WED:
            case THU:
            case FRI: return true;
            default: return false;
        }
    }

    public static void main(String[] args) {
        for(Days days : Days.values()){
            System.out.printf("%s -> Training for Daily Workout = %b%n", days.toString(), trainingDays(days));
        }
        Days weekend = Days.valueOf("SAT");
        Days weekend2 = Days.valueOf("SUN");
        System.out.printf("%s [%d] -> Rest Day or Cardio = %b%n", weekend, weekend.ordinal(), trainingDays(weekend));
        System.out.printf("%s [%d] -> Rest Day or Cardio = %b%n", weekend2, weekend2.ordinal(), trainingDays(weekend2));
    }
}
