#include <stdio.h>

int main() {
    printf("Números divisibles entre 3 mayores que 0 y menores que mil:\n");
    for (int i = 1; i < 1000; i++) {
        if (i % 3 == 0) {
            printf("%d\n", i);
        }
    }
    return 0;
}