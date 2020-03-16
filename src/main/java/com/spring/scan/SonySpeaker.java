package com.spring.scan;

import org.springframework.stereotype.Component;

@Component				//이름 지정 안하면 앞글자 소문자로 바꾸고 그대로 만들어줌.
public class SonySpeaker implements Speaker {

	@Override
	public void soundUp() {
		System.out.println("SonySpeaker SoundUp");
	}

	@Override
	public void soundDown() {
		System.out.println("SonySpeaker SoundDown");

	}

}
