
<<<<<<< HEAD
=======

>>>>>>> 0ccf91eb9230efe2a8bf702228293770df8f45df
public class Song {

    private String artist;
    private String name;
    private int durationInSeconds;

    public Song(String artist, String name, int durationInSeconds) {
        this.artist = artist;
        this.name = name;
        this.durationInSeconds = durationInSeconds;
    }

<<<<<<< HEAD
=======
    public boolean equals(Object compared) {
        if (this == compared) {
            return true;
        }

        if (!(compared instanceof Song)) {
            return false;
        }

        Song comparedSong = (Song) compared;

        if (this.artist == comparedSong.artist
                && this.name == comparedSong.name
                && this.durationInSeconds == comparedSong.durationInSeconds) {
            return true;
        }

        return false;
    }

>>>>>>> 0ccf91eb9230efe2a8bf702228293770df8f45df
    @Override
    public String toString() {
        return this.artist + ": " + this.name + " (" + this.durationInSeconds + " s)";
    }

<<<<<<< HEAD

=======
>>>>>>> 0ccf91eb9230efe2a8bf702228293770df8f45df
}
