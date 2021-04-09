import java.util.ArrayList;

public class Artist {
  private String artistName;
  private ArrayList<Song> songs;

	public Artist(String name) {
    artistName = name;

	}

	public ArrayList<Song> getSongs() {
    return songs;
	}

	public String getName() {
    return artistName;
	}

	public boolean equals(Artist other) {
    return artistName.equals(other.getName());
	}

	public void addSong(String song) {
		Song s = new Song(this, song);
    songs.add(s);

	}

	public void removeSong(String song) {
      for(int i = 0; i < songs.size(); i++);
      {
        if(songs.get(i).getName().equals(song))
        {
          songs.remove(i);
          i--;
        }
      }

	}

	public String toString() {
    return "Artist: "+ artistName + " Songs: " + songs;
	}
}
