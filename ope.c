#include <stdio.h>

int main() {
    int w = 9;
    int x = 3;
    int y = 7;
    int z = -2;

    int statement1 = x < y && w > z;
    int statement2 = x >= w != z == y;
    int statement3 = y <= x || x != w;
    int statement4 = w == 9 ^ x == 3;
    int statement5 = y > z && z < x;
    int statement6 = !(w != 9);

    printf("1) x < y AND w > z: %s\n", statement1 ? "Verdadero" : "Falso");
    printf("2) x >= w XOR z == y: %s\n", statement2 ? "Verdadero" : "Falso");
    printf("3) y <= x OR x != w: %s\n", statement3 ? "Verdadero" : "Falso");
    printf("4) w == 9 XOR x == 3: %s\n", statement4 ? "Verdadero" : "Falso");
    printf("5) y > z AND z < x: %s\n", statement5 ? "Verdadero" : "Falso");
    printf("6) NOT w != 9: %s\n", statement6 ? "Verdadero" : "Falso");

    return 0;
}
