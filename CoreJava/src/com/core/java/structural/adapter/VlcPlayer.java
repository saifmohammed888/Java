package com.core.java.structural.adapter;

public class VlcPlayer implements MediaPlayer{

	@Override
	public void playMp4(String fileName) {
		
	}

	@Override
	public void playVlc(String fileName) {
		System.out.println("Playing Vlc file Name "+fileName);
	}
}
