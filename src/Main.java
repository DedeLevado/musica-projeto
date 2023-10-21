public class Main {
    public static void main(String[] args) {
        ReprodutorMusical reprodutor = new ReprodutorMusical();
        AparelhoTelefonico telefone = new AparelhoTelefonico();
        NavegadorInternet navegador = new NavegadorInternet();

        reprodutor.tocarMusica("Música 1");
        reprodutor.pausarMusica();
        reprodutor.selecionarMusica("Música 2");

        telefone.ligar();
        telefone.atenderChamada();
        telefone.iniciarCorreioVoz();

        navegador.exibirPagina("www.exemplo.com");
        navegador.adicionarNovaAba();
        navegador.atualizarPagina();
    }
}