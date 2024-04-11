# include <stdio.h>

int main(){
 
  int i=1;
  printf("NUmeros(2-7 entre 1-100:\n");
  while(i <=1000){
    if(i%2 == 0 && i%7== 0){
        printf ("%d\n", i);
    }
    i++;
  }
 
 return 0;
}
