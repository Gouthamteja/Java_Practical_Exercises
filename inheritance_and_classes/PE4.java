package inheritance_and_classes;

public class PE4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix=new int[9][9];
        for (int i=0;i<8;i++) {
            for(int j=0;j<8;j++) {
                if((j+i)%2==0)
                    System.out.print("WW|");
                else
                    System.out.print("BB|");
            }
            System.out.println();
        }
	}

}
