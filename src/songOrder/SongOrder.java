package songOrder;

public class SongOrder {
    private final String singer;
    private final String songName;

    private SongOrder(String singer) {
        this.singer = singer;
        this.songName = null;
    }

    private SongOrder(String singer, String songName) {
        this.singer = singer;
        this.songName = songName;
    }

    public static SongOrder of(String singer) {
        return new SongOrder(singer);
    }

    public static SongOrder of(String singer, String songName) {
        return new SongOrder(singer, songName);
    }

    @Override
    public String toString() {
        if (this.singer != null && this.songName != null) {
            return "Play " + singer + " song called \"" + songName + "\"";
        } else if (this.singer != null) {
            return "Play any " + singer + " song";
        } else {
            return "You haven't chosen a singer. Please make your choice)";
        }
    }
}
