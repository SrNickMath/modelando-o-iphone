package equipamentos.iphone;

import equipamentos.navegador.NavegadorInternet;
import equipamentos.reprodutor.ReprodutorMusical;
import equipamentos.telefone.AparelhoTelefonico;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {

    //Funções como aparelho telefônico

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para o número: " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
    }

    //Funções como navegador

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo a página de URL: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página");
    }

    //Funções como reprodutor musical

    @Override
    public void tocar() {
        System.out.println("Tocando");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando a música: " + musica);
    }

}

