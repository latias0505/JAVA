package kr.ac.kopo.day15;

public class SamsungTV implements TV {
	
	public SamsungTV() {
		System.out.println("삼성TV를 구매했습니다.");
	}

	@Override
	public void powerOn() {
		System.out.println("TV 전원을 켭니다.");

	}

	@Override
	public void powerOff() {
		System.out.println("TV 전원을 끕니다.");

	}

	@Override
	public void channelUp() {
		System.out.println("채널 UP을 선택하셨습니다.");

	}

	@Override
	public void channelDown() {
		System.out.println("채널 DOWN을 선택하셨습니다.");

	}

	@Override
	public void volumeUp() {
		System.out.println("볼륨 UP을 선택하셨습니다.");

	}

	@Override
	public void volumeDown() {
		System.out.println("볼륨 DOWN을 선택하셨습니다.");

	}

	@Override
	public void mute() {
		System.out.println("음소거중입니다.");

	}

}
