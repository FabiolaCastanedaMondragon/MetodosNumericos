#include <stdio.h>

int main(){
    float operacion1;
    float operacion2;
    operacion1=((1.0/3)+(3.0/5)+(1.0/30)/(23.0/30));
    operacion2=5 + (2.0/ (1.0 / (1.0 + (2.0 / (2.0 - (1.0 / 4.0))))));

    printf("El resuldado de la operacion 1 es: %f \n",operacion1 );
    printf("El resuldado de la operacion 2 es: %f \n",operacion2);


    return 0;

}
