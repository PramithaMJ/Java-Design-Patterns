interface Worker {
    void work();

    void eat();
}

class Robot implements Worker {
    public void work() {
        // Code for working
    }

    public void eat() {
        // Code for eating, but robots don't eat
    }
}
