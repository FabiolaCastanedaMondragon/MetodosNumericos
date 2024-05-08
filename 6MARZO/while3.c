#include <stdio.h>
int main(){
    int i =1;
    printf("numeros (7) entre 1-100:\n");
    while(i<100){
        if(i%7 !=0){
            printf("%d\n",i);

        }
        i++;
    }
    return 0;

 }