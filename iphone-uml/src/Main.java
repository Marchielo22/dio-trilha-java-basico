public class Main {
    public static void main(String[] args) {
        IPhone iphone = new IPhone();

        iphone.tocar();
        iphone.selecionarMusica("Imagine - John Lennon");
        iphone.pausar();

        iphone.ligar("11999999999");
        iphone.atender();
        iphone.iniciarCorreioVoz();

        iphone.exibirPagina("https://apple.com");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
    }
}
