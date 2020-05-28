package com.core.java.structural.adapter;

public class Application {

	public static void main(String[] args) {
		
		Mp3Player player = new Mp3Player();
		player.playMp3("mp3","Humdard");
		player.playMp3("mp4","Humdard");
		player.playMp3("vlc","Humdard");
		player.playMp3("avi","Humdard");		
	}
}
