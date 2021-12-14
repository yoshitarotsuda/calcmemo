// 順列の書き出し
// n-1個の敷居の有無の組み合わせ 0仕切りなし、1仕切りあり
  int pt = 1;
  for(int i = 0;i<n-1;i++){
      pt *= 2;
  }
  
  int[][] ptb = new int[pt][n-1];
  for(int i = 0;i<pt;i++){
      int check = i;
      for(int j=0;j<n-1;j++){
          if(check % 2 == 0){
              ptb[i][j] = 0;
          }else{
              ptb[i][j] = 1; 
          }
          check = check / 2;
          // System.out.print(ptb[i][j]);
      }
      // System.out.println();
  }