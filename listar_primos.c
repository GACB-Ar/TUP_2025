#include <stdio.h>

int main() {
    int limite;

    // Solicitar al usuario el número límite
    printf("Ingrese un número: \n");
    scanf("%d", &limite);

    // Mostrar los números primos desde 1 hasta el número ingresado
    printf("Los números primos del 1 al %d son:\n", limite);

    // Recorrer todos los números del 1 al límite
    for (int num = 2; num <= limite; num++) {
        int esPrimo = 1;  // Asumimos que el número es primo inicialmente
        
        // Verificar si el número tiene algún divisor distinto de 1 y él mismo
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                esPrimo = 0;  // Si encontramos un divisor, no es primo
                break;
            }
        }

        // Si el número es primo, lo imprimimos
        if (esPrimo) {
            printf("%d ", num);
        }
    }

    printf("\n");

    return 0;
}