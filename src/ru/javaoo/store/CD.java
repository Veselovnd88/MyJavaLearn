package ru.javaoo.store;

import java.util.Date;

public class CD extends Item {
private String artist;
private Date releaseDate;

public String getArtist() {
	return artist;
}
public void setArtist(String artist) {
	this.artist = artist;
}
public Date getReleaseDate() {
	return releaseDate;
}
public void setReleaseDate(Date releaseDate) {
	this.releaseDate = releaseDate;
}

}
