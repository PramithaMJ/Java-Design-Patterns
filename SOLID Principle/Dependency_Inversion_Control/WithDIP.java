package Dependency_Inversion_Control;

interface Switchable {
    void turnOn();

    void turnOff();
}

class LightBulb implements Switchable {
    public void turnOn() {
        // Code for turning on the light
    }

    public void turnOff() {
        // Code for turning off the light
    }
}

class Fan implements Switchable {
    public void turnOn() {
        // Code for turning on the fan
    }

    public void turnOff() {
        // Code for turning off the fan
    }
}

class Switch {
    private Switchable device;

    public Switch(Switchable device) {
        this.device = device; // Dependency injection
    }

    public void operate() {
        if (device.isOn()) {
            device.turnOff();
        } else {
            device.turnOn();
        }
    }
}
