package com.core.java.structural.adapter;

public class MediaAdapter implements AudioPlayer {

	MediaPlayer music;
	
	 public MediaAdapter(String audioType){
		   
	      if(audioType.equalsIgnoreCase("vlc") ){
	    	  music = new VlcPlayer();
	      }
	      else if (audioType.equalsIgnoreCase("mp4")){
	    	  music = new Mp4Player();
	      }	
	   }

	@Override
	public void playMp3(String fileType, String fileName) {
		
		
		if (fileType.equalsIgnoreCase("vlc")) {
			music.playVlc(fileName);
		} 
		
		else if (fileType.equalsIgnoreCase("mp4")) {
			music.playMp4(fileName);
		}

	}

}
