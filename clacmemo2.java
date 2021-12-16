// 順列の書き出し
// n-1個の仕切りの有無の順列 0仕切りなし、1仕切りあり
  int pattern = 1; // 組み合わせパターン 
  for(int i = 0;i<n-1;i++){
      pattern *= 2;
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