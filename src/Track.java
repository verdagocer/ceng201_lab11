public class Track {
    private String title;
    private String artist;
    private int durationseconds;
    private boolean isexplicit;

    public Track(String title, String artist, int durationseconds, boolean isexplicit) {
        this.title = title;
        this.artist = artist;
        if (durationseconds < 0) {
            System.out.println("warning:invalid duration.setting to 0.");
            this.durationseconds = 0;
        } else {
            this.durationseconds = durationseconds;
        }
        this.isexplicit = isexplicit;
    }

    public Track(String title, String artist) {
        this(title, artist, 0, false);
    }

    public Track(String title) {
        this(title, "unknown artist", 0, false);
    }

    public Track() {
        this("unknown title", "unknown artist", 0, false);
    }

    public String gettitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public int getDurationseconds() {
        return durationseconds;
    }

    public boolean isIsexplicit() {
        return isexplicit;
    }

    public String getDurationFormatted() {
        int minutes = durationseconds / 60;
        int seconds = durationseconds % 60;
        return String.format("%d:%02d", minutes, seconds);
    }

    @Override
    public String toString() {
        String result = "\"" + title + "\"by" + artist + "[" + getDurationFormatted() + "]";
        if (isexplicit) {
            result += "[EXPLICIT]";
        }
        return result;

    }
}
