package hackerrank.virtualcareerfair20;

public class ObstacleLaneShift {
	static int globMoves=Integer.MAX_VALUE;
	public static void main(String[] args) {
//		int arr[]=  {2, 1, 3, 3, 3, 1};
//		int arr[]=  {1, 3, 1, 1, 2, 3, 2, 2, 2, 2, 3, 2, 2, 3, 3, 2, 3, 2, 2, 3, 1, 1, 3, 2, 3, 1, 1, 1, 2, 1, 2, 3, 2, 1, 2, 1, 3, 2, 3, 3, 3, 1, 2, 2, 1, 1, 2, 1, 3, 2, 1, 3, 3, 2, 3, 3, 1, 3, 1, 2, 3, 1};
//		System.out.println("len:"+arr.length);
		int arr[]=  {3, 2, 2, 1, 2, 1};
		int matrix[][] = new int[3][2*arr.length+1];
		long start = System.currentTimeMillis();
		int k=0;
		for(int j=0; j<matrix[0].length;j++) {
			for(int i=0;i<matrix.length;i++) {
				if(j%2==0) {
					matrix[i][j]=0;
				} else {
					if(arr[k] == 1) {
						matrix[0][j] = 1;
					} else if(arr[k] == 2) {
						matrix[1][j] = 1;
					} else if(arr[k] == 3) {
						matrix[2][j] = 1;
					}
					k++;
					break;
				}
			}
		}
		for(int i=0; i<matrix.length; i++) {
			for(int j=0; j<matrix[0].length;j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
		
		int currj = 0;
		int bestj=0, moves=0;
		int iarr[] = new int[3];
		int q=0;
		for(int i=0; i<matrix.length; i++) {
			int bj=0;
			for(int j=currj; j<matrix[0].length;j++) {
				if(matrix[i][j] == 1 || j == matrix[0].length-1) {
					bj=j; break;
				}
			
			}
			iarr[q++] = bj;
		}
		int mx = -1, ind=-1;
		for(int i=0; i<iarr.length; i++) {
			if(mx<iarr[i]) {
				mx=iarr[i];
				ind = i;
			}
		}
		if(ind != 1) {
			moves++;
		} 
		currj=mx-1;
		System.out.println("ind:"+ind+", mx:"+mx);
		
		 while(currj != matrix[0].length-1) {
	            bestj=0;
	            System.out.println("curj:"+currj);
	            for(int i=0; i<matrix.length; i++) {
	                for(int j=currj; j<matrix[0].length;j++) {
	                    if(matrix[i][j] == 1 || j == matrix[0].length-1) {
	                        bestj = Math.max(bestj, j);
	                        break;
	                    }
	                }
	            }
	            
	            currj=bestj;
	            System.out.println("bestj:"+currj);
	            moves++;
	        }
		
		long end = System.currentTimeMillis();
		System.out.println("moves:"+moves);

	}


}
