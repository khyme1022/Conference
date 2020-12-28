import java.util.*;
import java.io.*;

class Main {
  public static int N;
  public static int[][] arr;
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    N = Integer.parseInt(br.readLine());

    arr = new int[N][2];
    for(int i=0;i<N;i++){
      StringTokenizer st = new StringTokenizer(br.readLine()," ");
      arr[i][0] = Integer.parseInt(st.nextToken());
      arr[i][1] = Integer.parseInt(st.nextToken());
    }
    Arrays.sort(arr, new Comparator<int[]>() {
			@Override
			public int compare(int[] t1, int[] t2) {
				if(t1[1] == t2[1]) {
					return t1[0] - t2[0];
				}				
				return t1[1] - t2[1];
			}
		});

    int cnt =0;
    int bf_time =0;
    for(int i=0;i<N;i++){
      if(bf_time <= arr[i][0]){
        bf_time = arr[i][1];
        cnt++;
      }
    }
    System.out.println(cnt);



  }

}