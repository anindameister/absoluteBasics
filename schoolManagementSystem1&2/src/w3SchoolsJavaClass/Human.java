package w3SchoolsJavaClass;

class Human {
	private static Ear ear;
	private Nose nose;
	private Eye eye;
	private Lip lip;
	private Leg leg;
	private Hand hand;
	protected static Ear getEar() {
		return ear;
	}
	protected static void setEar(Ear ear) {
		Human.ear = ear;
	}
	protected Nose getNose() {
		return nose;
	}
	protected void setNose(Nose nose) {
		this.nose = nose;
	}
	protected Eye getEye() {
		return eye;
	}
	protected void setEye(Eye eye) {
		this.eye = eye;
	}
	protected Lip getLip() {
		return lip;
	}
	protected void setLip(Lip lip) {
		this.lip = lip;
	}
	protected Leg getLeg() {
		return leg;
	}
	protected void setLeg(Leg leg) {
		this.leg = leg;
	}
	protected Hand getHand() {
		return hand;
	}
	protected void setHand(Hand hand) {
		this.hand = hand;
	}
	
	Human(Ear ear,Nose nose,Eye eye,Lip lip,Leg leg,Hand hand){
		this.ear=ear;
		this.nose=nose;
		this.eye=eye;
		this.lip=lip;
		this.leg=leg;
		this.hand=hand;
		
		
		
	}
	
	

	
	
	

}
