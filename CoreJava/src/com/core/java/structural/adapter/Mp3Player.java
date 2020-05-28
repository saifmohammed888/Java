package com.core.java.structural.adapter;

public class Mp3Player implements AudioPlayer{

	MediaAdapter mediaAdapter; 
	
	@Override
	public void playMp3(String fileType, String fileName) {
		
		  //inbuilt support to play mp3 music files
	      if(fileType.equalsIgnoreCase("mp3")){
	         System.out.println("Playing mp3 file Name: " + fileName);			
	      } 
	      
	      else if(fileType.equalsIgnoreCase("mp4") || fileType.equalsIgnoreCase("vlc")){
	    	  mediaAdapter = new MediaAdapter(fileType);
	    	  mediaAdapter.playMp3(fileType, fileName);		  
	      }
	      
	      else{
	          System.out.println("Invalid media. " + fileType + " format not supported");
	       }
	}
}
	