import java.sql.SQLOutput;

public class PlaylistDemo {
    static void main() {
        Track defaulttrack=new Track();
        System.out.println("default track: ");
        System.out.println(defaulttrack);
        System.out.println();

        Track titleonly=new Track("neon lights");
        System.out.println("title only track: ");
        System.out.println(titleonly);
        System.out.println();

        Track titleandartist=new Track("ocean drive","midnight pulse");
        System.out.println("title+artist track: ");
        System.out.println(titleandartist);
        System.out.println();

        Track full=new Track("raindrop waltz","clara voss",210,false);
        System.out.println("full track (non-explicit): ");
        System.out.println(full);
        System.out.println();

        System.out.println("invalid duration test: ");
        Track invalidTrack=new Track("broken clock","static noise",-50,false);
        System.out.println(invalidTrack);
        System.out.println();

        Track getterTrack=new Track("stardust","stellar echo",242,true);

        System.out.println("getter test: ");
        System.out.println("title: " + getterTrack.gettitle());
        System.out.println("artist: " + getterTrack.getArtist());
        System.out.println("duration: " + getterTrack.getDurationFormatted());
        System.out.println("Explicit: " + getterTrack.isIsexplicit());

    }
}
