#include <stdio.h>

int main() {
    int HST;
    int PH;
    int Salario;
    printf("Ingrese las horas semanales trabajadas ");
    scanf("%d", &HST);

    printf("Ingrese el Precio por Hora: ");
    scanf("%d", &PH);


    if (HST<= 40  ){
        Salario=HST * 40;
        printf("Salario semanal.\n");
    } else  if(HST>40){
    Salario=(40*PH+(PH*1.5*(HST-40)));
    
     printf("Salario semanal: %d .\n" ,Salario);
        
    }

    return 0;
}



