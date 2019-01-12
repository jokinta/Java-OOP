package enums;


public class Main {
    public enum Days {
        MONDAY(1), TUESDAY(2), WEDNESDAY(3),
        THURSDAY(4), FRIDAY(5), SATURDAY(6), SUNDAY(7);

        public int position;

        Days(int position){
            this.position=position;
        }

    }

    public static void main(String[] args) {
        Days day = Days.MONDAY;

        System.out.println(day);

    }
}
