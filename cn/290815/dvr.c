/**
 * dvr.c
 * Distance Vector routing
 * Date : 290815
 * Author : Mani Kumar Reddy K 13B81A0579
 */

#include <stdio.h>
#include <limits.h>

struct node {
  unsigned dist[20];
  unsigned from[20];
} rt[10];

int main(void) {
  int dmat[20][20];
  int n, i, j, k, e, a, b, c, count = 0;
  printf("\nEnter number of nodes : ");
  scanf("%d", &n);
  printf("Enter no. of edges: ");
  scanf("%d", &e);
  for(i = 0; i < n; i ++)
    for(j = 0; j < n; j ++)
      dmat[i][j] = INT_MAX;
  for (i = 0; i < e; i ++) {
    printf("Enter nodes in edge %d: ", i + 1);
    scanf("%d %d", &a, &b);
    printf("Enter its cost: ");
    scanf("%d", &c);
    dmat[a - 1][b - 1] = c;
    dmat[b - 1][a - 1] = c;
  }
  for(i = 0; i < n; i ++)
    for(j = 0; j < n; j ++) {
      rt[i].dist[j] = INT_MAX;
      rt[i].from[j] = INT_MAX;
    }
  for(i = 0; i < n; i ++) {
    dmat[i][i] = 0;
    for(j = 0; j < n; j ++) {
      rt[i].dist[j] = dmat[i][j];
      rt[i].from[j] = j;
    }
  }
  do {
    count = 0;
    for(i = 0; i < n; i ++)
      for(j = 0; j < n; j ++)
        for(k = 0; k < n; k ++)
          if(rt[i].dist[j] > dmat[i][k] + rt[k].dist[j]) {
            rt[i].dist[j] = rt[i].dist[k] + rt[k].dist[j];
            rt[i].from[j] = k;
            count ++;
          }
  } while(count != 0);
  
  for(i = 0; i < n; i ++) {
    printf("\nState value for router %d is:\n", i + 1);
    for(j = 0; j < n; j ++)
      printf("\nnode %d via %d: Distance : %d", j + 1, rt[i].from[j] + 1, rt[i].dist[j]);
  } 
  return 0;
}
