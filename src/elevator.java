public class elevator{
    private int floor;
    private boolean open;
    private boolean goingup;
    private boolean stationary;

    public elevator(){
        floor = 0;
        open = true;
        goingup = true;
        stationary = true;
    }

    public elevator(int flooru, boolean openu, boolean goingupu, boolean stationaryu){
        floor = flooru;
        open = openu;
        goingup = goingupu;
        stationary = stationaryu;
    }

    @Override
    public String toString() {
        return "Floor: " +floor+" Open: "+open+" Going Up: "+goingup+" Stationary: "+stationary;
    }
}