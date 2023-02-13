import java.io.*;
import java.util.*;
public class Main {
  	public static void main(String[] args)throws IOException{
  		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
  		
  		String line1[]=bf.readLine().split(" ");
  		int N=Integer.parseInt(line1[0]);
  		int C=Integer.parseInt(line1[1]);
  		
  		int W[]=new int[N+1];
  		int V[]=new int[N+1];
  		for(int i=1;i<=N;i++) {
  			String line=bf.readLine();
  			StringTokenizer st=new StringTokenizer(line," ");
  			W[i]=Integer.parseInt(st.nextToken());
  			V[i]=Integer.parseInt(st.nextToken());
  		}
  		
  		int DP[][]=new int[N+1][C+1];
  		
  		for(int i=1;i<=N;i++) {
  			for(int j=1;j<=C;j++) {
  				if(j<W[i]) {
  					DP[i][j]=DP[i-1][j];
  				}
  				else {
  					DP[i][j]=Math.max(DP[i-1][j], DP[i-1][j-W[i]]+V[i]);
  				}
  			}
  		}
  		System.out.print(DP[N][C]);
  	}
  }
