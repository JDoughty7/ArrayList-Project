public class Song {

  private Artist artist;
  private String name;
	public Song(Artist _artist, String _name) {
    artist = _artist;
    name = _name;
	}

	public String getName() {
	  return name;
  }

	public Artist getArtist() {
    return artist;
	}

	public boolean equals(Song other) {
    return (name.equals(other.getName()) && artist.equals(other.getArtist()));
    
  }

	public String toString() {
    return "Name:" + name + " " + " Artist" + artist;
	}
}