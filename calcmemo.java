// 組み合わせ(nCr)、順列(nPr)、階乗(n!)の計算

// int max を超えそうな場合は long 型 さらに超えそうな場合は BigIntegerを使用する
// int max 2,147,483,647 21億51千万

// nCr を計算する r == 0 のときは1通りとして返す
int calcCombination(int n,int r){
  if (n < 0 || r < 0) {
            throw new IllegalArgumentException("Arguments must be 0 and over.");
        }
        else if (n == r || r == 0) {
            return 1;
        }
        else if (n < r) {
            return 0;
        }
        else {
            int result = 1;
            for (int i = 1; i <= r; i++) {
                result = result * (n - i + 1) / i;
            }
            return result;
        }
    }
  }

// nPr を計算する。
  int calcPermutation(int n, int r) {
      if (n < 0 || r < 0) {
          throw new IllegalArgumentException("Arguments must be 0 and over.");
      }
      else if (r == 0) {
          return 1;
      }
      else if (n < r) {
          return 0;
      }
      else {
          int result = 1;
          for (int i = 1; i <= r; i++) {
              result = result * (n - i + 1);
          }
          return result;
      }
  }

// n! を計算する。
  int calcFactorial(int n) {
      if (n < 0) {
          throw new IllegalArgumentException("Argument must be 0 and over.");
      }
      else {
          int result = 1;
          for (int i = n; i >= 1; i--) {
              result = result * i;
          }
          return result;
      }
  }