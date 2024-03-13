#include <stdio.h>

int main() {
    printf("Números divisibles entre 2 y entre 7:\n");
    for(int i = 1; i < 1000; i++) {
        if(i % 2 == 0 && i % 7 == 0) {
            printf("%d\n", i);
        }
    }
    return 0;
}