#include <stdio.h>

int main(){
    int numero=1;
    while(numero<1000){
        float numero1 = numero%3;
        float numero2 = numero%2;
        float numero3 = numero%7;
        /* if (numero1==0){
            printf("%d", numero);
        }*/
        if (numero2==0 && numero3==0){
            printf("%d", numero);
        }
        /*if (numero<100 && numero%7){
            printf("%d", numero);
        }*/
        numero++;
    }
    return 0;
}