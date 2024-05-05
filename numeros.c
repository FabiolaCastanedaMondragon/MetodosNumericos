# include <stdio.h>

int main(){
 
    int numeros[10];
    int i = 0;
    while(i < 10){
        numeros[i] = 10;
        i ++;
    }

    printf("Elementos del arreglo:\n");
    i = 0;
    while(i < 10){
        printf("vector %d: %d\n",i ,numeros[i]);
        i++;
    }
 
 return 0;
}
