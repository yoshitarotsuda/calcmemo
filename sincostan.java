// sin cos の求め方、計算で問題が起きる場合の例外処理

double cos = 0;
if(rad == 90 || rad == 270){
    cos = 0;
}else{
    cos = Math.cos(Math.toRadians(rad));
}
double sin = 0;
if(rad == 180 || rad == 360){
    sin = 0;
}else{
    sin = Math.sin(Math.toRadians(rad));
}