package Davaleba1;

public class Hours {
    int Hour;
    int Minute;

    public Hours(int hour, int minute) {
        Hour = hour;
        Minute = minute;
        normalizeTime();
    }

    private void normalizeTime() {
        if (Minute >= 60) {
            Hour += Minute / 60;
            Minute = Minute % 60;
        }
    }


    public int getHour() {
        return Hour;
    }

    public int getMinute() {
        return Minute;
    }

    public String displayTime() {
        return String.format("%02d:%02d", Hour, Minute);
    }

    public static void main(String[] args) {
        Hours time = new Hours(1, 125);
        System.out.println(time.displayTime());
    }
}
