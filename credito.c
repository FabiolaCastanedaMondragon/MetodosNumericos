#include <stdio.h>

int main() {
    int antiguedad_trabajo;
    float sueldo_mensual;

    printf("Ingrese la antigüedad en años en el trabajo: ");
    scanf("%d", &antiguedad_trabajo);

    printf("Ingrese el sueldo mensual: ");
    scanf("%f", &sueldo_mensual);


    if (antiguedad_trabajo >= 5 && (0.1 * sueldo_mensual) > 1000) {
        printf("La persona es sujeta a un crédito hipotecario.\n");
    } else {
        printf("La persona no cumple con los requisitos para un crédito hipotecario.\n");
    }

    return 0;
}

