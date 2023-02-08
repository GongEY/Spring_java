package polymorphism;

import org.springframework.stereotype.Component;

@Component("sony")
public class SonySpeaker implements Speaker {
	public SonySpeaker() {
		System.out.println("==> sonyspeaker 按眉 积己");
	}
	
	public void volumeUp() {
		System.out.println("sonyspeaker 家府 棵覆");
	}
	
	public void volumeDown() {
		System.out.println("sonyspeaker 家府 郴覆");
	}
}
