package mediator.contract;

public abstract class Colleague {
	
	private Mediator mediator;
	
	public boolean join(Mediator mediator) {
		
		if(mediator ==null) return false;
		this.mediator = mediator;
		return mediator.addColleague(this);
	}
	
	public void sendData(String data) {
		if(mediator != null) mediator.mediate(data); 	// mediator���� �����ϴ� ����
	}
	
	abstract public void handle(String data) ; // mediator�� mediate�� ������ ó���ϴ� �κ�
	
}
