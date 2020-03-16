package com.spring.scan;

import javax.annotation.Resource;
import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import jdk.nashorn.internal.ir.annotations.Reference;

@Component("lg")
public class LgTv implements TV {

	//@Autowired    //주입만 해주는 어노테이션 이거 덕분에 config.xml의 컨스트럭터 아규나 프로퍼티가 없이도 돌아간다!
	//@Inject			// 오토와이어드 대신 써도 됨. 얘는 자바가 제공. 오토는 5행 프레임 워크에서 제시하는것. 인젝트는 3행에서 주입하는 것. 기능은 똑같다!!!
	//@Qualifier("apple") // 아 이것 때문에 단독으로 못쓴다고 했구나...! 피피티에서.특정 아이디를 하나 콕 찝어줌.
	@Resource(name="orange")   // 오토와이어랑 퀄리파이를 묶어 놓은 것.
	private Speaker speaker;
	
	@Override
	public void turnOn() {
		System.out.println("LGTV - 전원 On");

	}

	@Override
	public void turnOff() {
		System.out.println("LGTV - 전원 Off");

	}

	@Override
	public void soundUp() {
//		System.out.println("LGTV - 전원 up");
		speaker.soundUp();
	}

	@Override
	public void soundDown() {
//		System.out.println("LGTV - 사운드 down");
		speaker.soundDown();
	}

}
