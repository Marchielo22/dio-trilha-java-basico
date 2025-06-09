public class ContaTerminal {
    public static void main(String[] args) {
        // Primeiro caso: saldo = 25, valorSolicitado = 18
        double saldo = 25;
        double valorSolicitado = 18;

        if (saldo > valorSolicitado) {
            saldo = saldo - valorSolicitado;
        } else {
            System.out.println("Saldo insuficiente");
        }

        System.out.println("Saldo atual: " + saldo);

        // Segundo caso: saldo = 15, valorSolicitado = 22
        saldo = 15;
        valorSolicitado = 22;

        if (saldo > valorSolicitado) {
            saldo = saldo - valorSolicitado;
        } else {
            System.out.println("Saldo insuficiente");
        }

        System.out.println("Saldo atual: " + saldo);
    }
}
