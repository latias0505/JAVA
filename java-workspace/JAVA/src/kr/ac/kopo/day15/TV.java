package kr.ac.kopo.day15;

public interface TV {
	
	int MAX_VOLUME_SIZE = 50;
	int MIN_VOLUME_SIZE = 0;
	
	/* public abstract*/ void powerOn();
	void powerOff();
	void channelUp();
	void channelDown();
	void volumeUp();
	void volumeDown();
	void mute();

}
