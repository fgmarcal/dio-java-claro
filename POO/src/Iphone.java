import interfaces.AparelhoTelefonico;
import interfaces.InternetBrowser;
import interfaces.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, InternetBrowser {
    @Override
    public void ligar(String numero) {
        System.out.println("Ligando " + numero);
    }

    @Override
    public void desligar() {
        System.out.println("Desligando");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo ligação");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando Correio Voz");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Pagina: " + url);
    }

    @Override
    public void adicionarNovaPagina() {
        System.out.println("Adicionando novo pagina");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando pagina");
    }

    @Override
    public void tocar(String musica) {
        System.out.println("Tocando música");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando musica");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando " + musica);
    }
}
