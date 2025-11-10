public class Door {
    private String sound;

    public Door() {
        this.sound = "Who's there?";
    }

    public Door(String sound) {
        this.sound = sound;
    }

    public void knock() {
        System.out.println(this.sound);
    }
}
