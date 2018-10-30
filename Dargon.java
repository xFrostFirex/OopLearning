public class Dargon extends Monster {

    private int flightSpeed;

    public Dargon() {
        super(2000, 100, 20, 900);
        this.setFlightSpeed(200);
    }

    public Dargon(int health, int defense, int movement, int attack, int flightSpeed) {
        super(health, defense, movement, attack);
        this.setFlightSpeed(flightSpeed);
    }

    public int getFlightSpeed() {
        return flightSpeed;
    }

    public void setFlightSpeed(int flightSpeed) {
        if (flightSpeed > 0) {
            this.flightSpeed = flightSpeed;
        } else {
            this.flightSpeed = 1;
        }
    }

}