package com.core.java.structural.adapter;

public class Mp4Player implements MediaPlayer {

	@Override
	public void playMp4(String fileName) {
		System.out.println("Playing Mp4 file Name "+fileName);
	}

	@Override
	public void playVlc(String fileName) {
		
	}

}
