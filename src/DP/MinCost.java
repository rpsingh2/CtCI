// This function returns the smallest possible cost to
// reach station N-1 from station 0.
package DP;

/**
 *
 * @author sbhawsin
 */
public class MinCost {
    
    public static int mincost(int d[][], int n){
        int[] dist = new int[n];
        for(int i=0; i<n;i++){
            dist[i]=9999;
        }
        dist[0]=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(dist[j] > dist[i] + d[i][j])
                    dist[j] = dist[i] + d[i][j];
            }
        }    
        return dist[n-1];
    }
    public static void main(String args[]){
        int n = 4;
        int[][] d = {{0,15,80,90},{9999,0,40,50},{9999,9999,0,70},{9999,9999,9999,0} };
        int distance = mincost(d, n);
        System.out.println("Shortest distance between routes is: " + distance);
    }
}
