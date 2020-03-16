package com.spring.scan;

public class SamsungTv implements TV {

	private Speaker speaker;
	
//	public SamsungTv(Speaker speaker) {
//		super();
//		this.speaker = speaker;
//	}   // A짝꿍

	public void setSpeaker(Speaker speaker) {
		this.speaker = speaker;
	}
	// B짝꿍
	
	@Override
	public void turnOn() {
		System.out.println("SamsungTv - 전원 On");

	}

	@Override
	public void turnOff() {
		System.out.println("SamsungTv - 전원 Off");

	}

	@Override
	public void soundUp() {
//		System.out.println("SamsungTv - 전원 up");
		speaker.soundUp();

		
	}

	@Override
	public void soundDown() {
//		System.out.println("SamsungTv - 사운드 down");
		speaker.soundDown();

	}

}
