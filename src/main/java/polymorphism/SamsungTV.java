package polymorphism;

public class SamsungTV implements TV {
	private Speaker speaker;
	private int price;
	
	public SamsungTV() {
		System.out.println("==> SamsungTV(1) ��ü ����");
	}
	
	public SamsungTV(Speaker speaker) {
		System.out.println("==> SamsungTV(2) ��ü ����");
		this.speaker = speaker;
	}
	
	public SamsungTV(Speaker speaker, int price) {
		System.out.println("==> SamsungTV(3) ��ü ����");
		this.speaker = speaker;
		this.price = price;
	}
	
	public void setSpeaker(Speaker speaker) {
		System.out.println("==> setspeaker() ȣ��");
		this.speaker = speaker;
	}

	public void setPrice(int price) {
		System.out.println("==> setprice() ȣ��");
		this.price = price;
	}

	public void initMethod() {
		//System.out.println("��ü �ʱ�ȭ");
	}
	public void destroyMethod() {
		//System.out.println("��ü ����");
	}
	
	public void powerOn() {
		System.out.println("samsungtv ����Ų�� (����:" + price +")");
	}
	public void powerOff() {
		System.out.println("samsungtv ��������");
	}
	public void volumeUp() {
		speaker.volumeUp();
	}
	public void volumeDown() {
		speaker.volumeDown();
	}
}
