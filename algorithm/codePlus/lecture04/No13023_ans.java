package lecture04;

import java.util.*;
class Edge {
    int from, to;
    Edge(int from, int to) {
        this.from = from;
        this.to = to;
    }
}
public class No13023_ans{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        boolean[][] a = new boolean[n][n];
        ArrayList<Integer>[] g = (ArrayList<Integer>[]) new ArrayList[n];
        ArrayList<Edge> edges = new ArrayList<Edge>();
        for (int i=0; i<n; i++) {
            g[i] = new ArrayList<Integer>();
        }
        for (int i=0; i<m; i++) {
            int from = sc.nextInt();
            int to = sc.nextInt();
            edges.add(new Edge(from, to));
            edges.add(new Edge(to, from));
            a[from][to] = a[to][from] = true;
            g[from].add(to);
            g[to].add(from);
        }
        m *= 2;
        for  (int i=0; i<m; i++) {
        	System.out.format("i = %d\n", i);
            for (int j=0; j<m; j++) {
            	System.out.format("j = %d\n", j);
                int A = edges.get(i).from;
                int B = edges.get(i).to;
                int C = edges.get(j).from;
                int D = edges.get(j).to;
                if (A == B || A == C || A == D || B == C || B == D || C == D) {
                	System.out.format("A = %d, B = %d C = %d D = %d\n", A,B,C,D);
                	System.out.format("==1\n");
                    continue;
                }
                if (!a[B][C]){
                	System.out.println("False");
                	System.out.format("A = %d, B = %d C = %d D = %d\n", A,B,C,D);
                	System.out.format("!a[%d][%d]\n", A, B);
                	continue;
                }
                for (int E : g[D]) {
                    if (A == E || B == E || C == E || D == E) {
                    	System.out.format("A = %d, B = %d C = %d D = %d E = %d\n", A,B,C,D, E);
                    	System.out.format("==2\n");
                        continue;
                    }
                    System.out.format("A = %d, B = %d C = %d D = %d E = %d\n", A,B,C,D, E);
                    System.out.println(1);
                    System.exit(0);
                }
            }
            System.out.println("------------------------");
        }
        System.out.println(0);
    }
}