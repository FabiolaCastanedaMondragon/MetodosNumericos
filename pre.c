#include <stdio.h>
int main(){
    int var=1;
    int con=1;

    //Es equivalente a var=var+1;
    printf("%d",++var);
    printf("%d",var);

    //Es equivalente a con=con-1
    printf("%d",--con);
    printf("%d",con);

    return 0;
}