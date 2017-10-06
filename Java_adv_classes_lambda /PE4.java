
public class PE4 {
	public static void main(String[] args) {
		OuterClass outer = new OuterClass();
		Hand hand = outer.returnHand();
		hand.facepalm();
	}
}
class OuterClass{
	Hand returnHand() {
		
		class Inner{
			public Hand returnInnerHand() {
				
				return new Hand() { 
		
					@Override
					public void facepalm() {
						// TODO Auto-generated method stub
						System.out.println("*facepalmed*");
					}
					
				};
			}
		} 
		
		Inner inner = new Inner();
		return inner.returnInnerHand();
	}
}
interface Hand{
	public void facepalm();
}
