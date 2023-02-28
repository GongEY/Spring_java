package polymorphism;

import org.springframework.stereotype.Component;

@Component("apple")
public class AppleSpeaker implements Speaker {
	public AppleSpeaker() {
		System.out.println("==> applespeaker 按眉 积己");
	}
	
	public void volumeUp() {
		System.out.println("applespeaker 家府 棵覆");
	}
	
	public void volumeDown() {
		System.out.println("applespeaker 家府 郴覆");
	}
}
