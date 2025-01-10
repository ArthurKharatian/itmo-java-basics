package lesson6;

public abstract class Transport implements Movable, Interface {
    private Integer weight;
    private Integer seatPlace;
    private Boolean isFlying;

    public Transport(Integer weight, Integer seatPlace, Boolean isFlying) {
        this.weight = weight;
        this.seatPlace = seatPlace;
        this.isFlying = isFlying;
    }

    protected abstract void abstractMethod();


    public void info() {
        //logic
    }

    @Override
    public void method() {

    }
}
