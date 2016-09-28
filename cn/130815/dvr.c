/**
 * dvr.c
 *
 * Direct Vector Routing
 *
 * Date : 13-08-2015
 * Author : Mani Kumar Reddy K 13B81A0579
 */

#include <stdio.h>

void print(int tables[10][10][10], int n) {
  int i, j, k;
  for(i = 0; i < n; i ++) {
    printf("\nFrom %d to :\n", i + 1);
    for(j = 0; j < n; j ++)
      printf("\t%2d", j + 1);
    for(j = 0; j < n; j ++) {
      printf("\n%d", j + 1);
      for(k = 0; k < n; k ++)
        printf("\t%2d", tables[i][j][k]);
    }
  }
}
   

int main(void) {
  int n, e, i, j, k, a, b, c, graph[10][10], tables[10][10][10];
  printf("Enter no. of nodes: ");
  scanf("%d", &n);
  for (i = 0; i < n; i ++) {
    for(j = 0; j < n; j ++) {
      graph[i][j] = -1;
    }
  }
  for (i = 0; i < n; i ++) {
    for(j = 0; j < n; j ++) {
      for(k = 0; k < n; k ++) {
        tables[i][j][k] = -1;
      }
    }
  }
  printf("Enter no. of edges: ");
  scanf("%d", &e);
  for (i = 0; i < e; i ++) {
    printf("Enter nodes in edge %d: ", i + 1);
    scanf("%d %d", &a, &b);
    printf("Enter its cost: ");
    scanf("%d", &c);
    graph[a - 1][b - 1] = c;
    graph[b - 1][a - 1] = c;
  }
  printf("\nstep 1:");
  for (i = 0; i < n; i ++) {
    for (j = 0; j < n; j ++) {
      if (graph[i][j] >= 0)
        tables[i][j][j] = graph[i][j];
    }
  }
  print(tables, n);
  return 0;
}
