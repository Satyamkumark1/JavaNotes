package in.practise.MultiThreading.Challenge4;

public enum TrafficColor {
    RED(10000),
    YELLOW(1000),
    GREEN(3000);

    private  final int onTimeMills;


    TrafficColor(int onTimeMills) {
        this.onTimeMills = onTimeMills;
    }

    public int getOnTimeMills() {
        return onTimeMills;
    }
}
