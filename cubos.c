#include <stdio.h>

int main(){
    int x=1;
    while(x<=500){
        printf ("%d,%d,%d" ,x,x*x,x*x*x);
        printf("\n");
        x++;
    }
    return 0;
}