package polymorphism;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.Component;

@Component("tv")
public class LgTV implements TV {
	//@Autowired
	//@Qualifier("apple")
	@Resource(name="apple")
	private Speaker speaker;
	
	public LgTV() {
		System.out.println("===> LgTV 객체 생성");
	}
	
	
	public void powerOn() {
		System.out.println("lgtv---전원킨다");
	}
	public void powerOff() {
		System.out.println("lgtv---전원끈다");
	}
	public void volumeUp() {
		speaker.volumeUp();
	}
	public void volumeDown() {
		speaker.volumeDown();
	}
}
