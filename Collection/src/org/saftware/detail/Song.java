package org.saftware.detail;
public class Song  implements Comparable<Song>{
private String title;
private String artist;
private int bpm;
private String composedBy;
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getArtist() {
	return artist;
}
public void setArtist(String artist) {
	this.artist = artist;
}
public int getBpm() {
	return bpm;
}
public void setBpm(int bpm) {
	this.bpm = bpm;
}
public String getComposedBy() {
	return composedBy;
}
public void setComposedBy(String composedBy) {
	this.composedBy = composedBy;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((artist == null) ? 0 : artist.hashCode());
	result = prime * result + bpm;
	result = prime * result
			+ ((composedBy == null) ? 0 : composedBy.hashCode());
	result = prime * result + ((title == null) ? 0 : title.hashCode());
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Song other = (Song) obj;
	if (artist == null) {
		if (other.artist != null)
			return false;
	} else if (!artist.equals(other.artist))
		return false;
	if (bpm != other.bpm)
		return false;
	if (composedBy == null) {
		if (other.composedBy != null)
			return false;
	} else if (!composedBy.equals(other.composedBy))
		return false;
	if (title == null) {
		if (other.title != null)
			return false;
	} else if (!title.equals(other.title))
		return false;
	return true;
}
@Override
public int compareTo(Song o) {
	return this.getTitle().compareTo(o.getTitle());
}
@Override
public String toString() {
	return "Song [title=" + title + ", artist=" + artist + ", bpm=" + bpm
			+ ", composedBy=" + composedBy + "]";
}
public Song(String title, String artist, int bpm, String composedBy) {
	super();
	this.title = title;
	this.artist = artist;
	this.bpm = bpm;
	this.composedBy = composedBy;
}


}
