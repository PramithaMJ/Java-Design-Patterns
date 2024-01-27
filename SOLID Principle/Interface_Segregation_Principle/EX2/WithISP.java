interface Workable {
    void work();
}

interface Eatable {
    void eat();
}

class Human implements Workable, Eatable {
    public void work() {
        // Code for working
    }

    public void eat() {
        // Code for eating
    }
}

class Robot implements Workable {
    public void work() {
        // Code for working
    }
}
