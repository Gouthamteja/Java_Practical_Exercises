import java.util.Scanner;

public class PE3 {
	public static void main(String[] args) {
		Sequence seq = new Sequence();
		seq.reverseSeq();
	}
}

class Sequence {
	
	public void reverseSeq() {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		ReverseSequenceSelector revSeq = new ReverseSequenceSelector();
		revSeq.current(num);
		sc.close();
	}
	
	class ReverseSequenceSelector implements Selector{
		
		@Override
		public void end() {
			// TODO Auto-generated method stub
			System.out.println();
		}

		@Override
		public int next(int i) {
			// TODO Auto-generated method stub
			return i-1;
		}

		@Override
		public void current(int i) {
			// TODO Auto-generated method stub
			int j = i-1;
			while(j >= 0) {
				System.out.print(j + " ");
				j = this.next(j);
			}
			this.end();
		}
		
	}
}
interface Selector{
	public void end();
	public int next(int i);
	public void current(int i);
}
