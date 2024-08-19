package jackson.rocha;

public class NumeroUtil {

    static void descobrirMaiorNumeroEntreDoisNumero(int numero1, int numero2) {
        if (numero1 > numero2) {
            System.out.printf("O numero mais é: %d %n ", numero1);
        } else if (numero2 > numero1) {
            System.out.printf("O numero mais é: %d %n ", numero2);
        }
    }

    static void descobrirMaiorNumeroEntreDoisNumero(double numero4, double numero5) {
        if (numero4 > numero5) {
            System.out.printf("O numero mais é: %.2f %n ", numero4);
        } else if (numero5 > numero4) {
            System.out.printf("O numero mais é: %.2f %n ", numero5);
        }
    }

    static void descobrirMaiorNumeroEntreTresNumero(int numero1, int numero2, int numero3) {
        if (numero1 > numero2 && numero1 > numero3) {
            System.out.printf("O numero mais é: %d %n ", numero1);
        } else if (numero2 > numero1 && numero2 > numero3) {
            System.out.printf("O numero mais é: %d %n ", numero2);
        } else {
            System.out.printf("O numero mais é: %d %n ", numero3);
        }
    }

    static void descobrirMaiorNumeroEntreTresNumero(double numero4, double numero5, double numero6) {
        if (numero4 > numero5 && numero4 > numero6) {
            System.out.printf("O numero maior é: %.2f %n ", numero4);
        } else if (numero5 > numero4 && numero5 > numero6) {
            System.out.printf("O numero mais é: %.2f %n ", numero5);
        } else {
            System.out.printf("O numero mais é: %.2f %n ", numero6);
        }
    }

    /*
    Usando lambda
    static int descobrirMaior(int a, int b) {
        return a > b ? a : b;
    }

    static int descobrirMaior(int a, int b, int c) {
        return descobrirMaior(descobrirMaior(a, b), c);
    }

    static double descobrirMaior(double a, double b) {
        return a > b ? a : b;
    }

    static double descobrirMaior(double a, double b, double c) {
        return descobrirMaior(descobrirMaior(a, b), c);
    }
     */
}

