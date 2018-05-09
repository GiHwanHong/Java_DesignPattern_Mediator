package mediator.contract;

public abstract class Colleague {
	
	private Mediator mediator;
	
	public boolean join(Mediator mediator) {
		
		if(mediator ==null) return false;
		this.mediator = mediator;
		return mediator.addColleague(this);
	}
	
	public void sendData(String data) {
		if(mediator != null) mediator.mediate(data); 	// mediator에서 중재하는 역할
	}
	
	abstract public void handle(String data) ; // mediator가 mediate를 했을때 처리하는 부분
	
}
