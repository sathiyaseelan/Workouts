package org.saftware.collection.test;

import java.util.ArrayList;
import java.util.Collections;

import java.util.List;


import org.saftware.comparator.ArtistComparator;
import org.saftware.detail.Song;

public class SongSortTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Song song1 = new Song("Mariyan", "AR.Rahman", 320, "AR.Rahman");
		Song song2 = new Song("Kadal","AR.Rahman",320,"AR.Rahman");
		Song song3 = new Song("Athavan","Harrish Jayaraj",128,"Harrish jayaraj");
		
		/*Set<Song> songSet =  new HashSet<Song>();
		songSet.add(song1);
		songSet.add(song2);
		songSet.add(song3);*/
		List<Song> songList = new ArrayList<Song>();
		songList.add(song1);
		songList.add(song2);
		songList.add(song3);
		Collections.sort(songList,new ArtistComparator());
		for(Song song : songList){
			System.out.println(song);
		}
	}

}
