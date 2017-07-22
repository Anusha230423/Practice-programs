
public class SearchExample {
	public static void main(String[] args) {
		int[][] array = {{1,13,2},{2,5,3},{4,7,8}};
		int searchValue=2;
		int positionX=-1;
		int positionY=-1;
		PARENT_LOOP:for(int i=0;i<array.length;i++){
			for( int j=0;j<array[i].length;j++){
				if(array[i][j]==searchValue){
					positionX=i;
					positionY=j;
					break PARENT_LOOP;
				}
			}
		}
		if(positionX==-1||positionY==-1){
			System.out.println("Value"+searchValue+"not found");
		}else{
			System.out.println("Value"+searchValue+"is found at"+"("+positionX+","+positionY+")");
		}
	}

}
