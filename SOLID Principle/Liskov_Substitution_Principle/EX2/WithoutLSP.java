package EX2;

class Bird {
    public void fly() {
        // Code for flying
    }
}

class Penguin extends Bird {
    // Penguins can't fly, but this violates LSP
}
