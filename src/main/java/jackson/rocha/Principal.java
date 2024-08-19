package jackson.rocha;

public class Principal {
    public static void main(String[] args) {

        int numero1 = 12;
        int numero2 = 25;
        int numero3 = 18;
        double numero4 = 6.58;
        double numero5 = 6.99;
        double numero6 = 6.89;

        NumeroUtil.descobrirMaiorNumeroEntreDoisNumero(numero1, numero2);
        NumeroUtil.descobrirMaiorNumeroEntreTresNumero(numero1, numero2, numero3);

        NumeroUtil.descobrirMaiorNumeroEntreDoisNumero(numero4, numero5);
        NumeroUtil.descobrirMaiorNumeroEntreTresNumero(numero4, numero5, numero6);
    }
}
