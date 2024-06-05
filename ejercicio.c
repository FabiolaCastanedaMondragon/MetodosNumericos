#include <stdio.h>

int main () {
    int min=60;
    int hora=60*min;
    int dia=24*hora;
    int año=365*dia;
    int segundos=años*365*24*60*60;
    printf("%f",segundos);

    printf("\n");
    return 0;
}