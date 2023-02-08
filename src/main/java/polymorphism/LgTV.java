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
		System.out.println("===> LgTV ��ü ����");
	}
	
	
	public void powerOn() {
		System.out.println("lgtv---����Ų��");
	}
	public void powerOff() {
		System.out.println("lgtv---��������");
	}
	public void volumeUp() {
		speaker.volumeUp();
	}
	public void volumeDown() {
		speaker.volumeDown();
	}
}
