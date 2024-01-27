class LightBulb {
    public void turnOn() {
        // Code for turning on the light
    }

    public void turnOff() {
        // Code for turning off the light
    }
}

class Switch {
    private LightBulb bulb;

    public Switch() {
        this.bulb = new LightBulb(); // Direct dependency
    }

    public void operate() {
        if (bulb.isOn()) {
            bulb.turnOff();
        } else {
            bulb.turnOn();
        }
    }
}
