package kr.ac.kopo.day15;

public class UserMain {

	public static void main(String[] args) {
		
//		TV tv = new LGTV();
		TV tv = new SamsungTV();
		tv.powerOn();
		tv.volumeDown();
		tv.volumeUp();
		tv.mute();
		tv.channelDown();
		tv.channelUp();
		tv.powerOff();
		SamsungTV sam = (SamsungTV)tv;
		
		System.out.println(sam);
		System.out.println(sam.toString());

	}

}
