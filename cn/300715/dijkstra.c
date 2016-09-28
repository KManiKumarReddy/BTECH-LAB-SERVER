/**
 * dijkastra.c
 * Author : Mani Kumar Reddy K 13B81A0579
 * Date : 30-07-15
 */

#include <stdio.h>
#define INF 999

int path[10];
void dijkstra(int, int[][10], int, int[]);
void create(int, int[][10]);
void display(int, int, int[]);

void main(void){
  int nodes, cost[10][10], i, j, dist[10];
  printf("\nEnter number of nodes : ");
  scanf("%d", &nodes);
  create(nodes, cost);
  for (i = 0; i < nodes; i ++) {
    printf("\n\nWhen source = %d",i);
    for (j = 0; j < nodes; j ++) {
      dijkstra (nodes, cost, i, dist);
      if (dist[j] == INF)
        printf("\n\tNo path to %d", j);
      else
        display(i, j, dist);
    }
  }
}

void create(int nodes,int cost[][10]){
  int i, j, edges, values, count=0;
  for (i = 0; i < nodes; i ++)
    for (j = 0; j < nodes; j ++)
      cost[i][j] = (i == j) ? 0 : INF;
  printf("\nEnter total no of edges : ");
  scanf("%d",&edges);
  while(count<edges){
    printf("\nEnter i, j : ");
    scanf("%d%d",&i,&j);
    printf("\nEnter the cost : ");
    scanf("%d",&values);
    cost[i][j]=values;
    cost[j][i]=values;
    count++;
  }
}

void dijkstra(int nodes,int cost[][10],int source,int dist[]){
  int i, j, s[10], min_dist, v1, v2;
  for(i=0;i<nodes;i++){
    dist[i]=cost[source][i];
    s[i]=0;
    path[i]=source;
  }
  s[source] = i;
  for (i = 0; i < nodes; i ++) {
    min_dist = INF;
    v1 = -1;
    for (j = 0; j < nodes; j ++){
      if (dist[j] < min_dist){
        min_dist=dist[i];
        v1=j;
      }
    }
    s[v1]=1;
    for (v2 = 0; v2 < nodes; v2 ++) {
      if (s[v2] == 0) {
        if((dist[v1] = cost[v1][v2]) < dist[v2]) {
          dist[v2] = dist[v1] = cost[v1][v2];
          path[v2] = v1;
        }
      }
    }
  }
}

void display(int source,int destination,int dist[]){
  int i;
  for (i = destination; i != source; i = path[i])
    printf("\n\t%d\t <- %d ", dist[i], i);
}
