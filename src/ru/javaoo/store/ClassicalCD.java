package ru.javaoo.store;

import java.sql.Date;

public class ClassicalCD extends Item {
private String composer;
private String[] performers = new String[5];
private String recordingLocation;
private Date releaseDate;
private int performerCount = 0;

public void addPerformer(String performer) {
	//System.out.println(performerCount);
	//System.out.println(performers.length);
	if (performerCount>4) {
		System.out.println("WARNING! Out of array's range");
	}
	else {
		performers[performerCount] = performer;
		performerCount++;
	}
	
}
public void showPerformers() {
	for (int i=1; i<performerCount;i++) {
		System.out.print(performers[i-1]+" ");
	}
	System.out.print(performers[performerCount-1]+"\n");
	
}
public String getComposer() {
	return composer;
}
public void setComposer(String composer) {
	this.composer = composer;
}
public String getRecordingLocation() {
	return recordingLocation;
}
public void setRecordingLocation(String recordingLocation) {
	this.recordingLocation = recordingLocation;
}
public Date getReleaseDate() {
	return releaseDate;
}
public void setReleaseDate(Date releaseDate) {
	this.releaseDate = releaseDate;
}


}
