#include <stdio.h>

int main (){
    int diametro = 10;
    double r = diametro / 2;
    double pi = 3.1416;
    double area;
    area = pi * r * r;

    printf("El resultado del area del circulo de 10m de diametro es: %f  ", area);

    printf("\n");
    return 0;
}