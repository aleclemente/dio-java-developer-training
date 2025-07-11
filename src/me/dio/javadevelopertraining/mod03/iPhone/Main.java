package me.dio.javadevelopertraining.mod03.iPhone;

public class Main {
    public static void main(String[] args) {
        iPhone meuIPhone = new iPhone();

        // Testando funcionalidades de ReprodutorMusical
        meuIPhone.tocar();
        meuIPhone.pausar();
        meuIPhone.selecionarMusica("Imagine - John Lennon");

        // Testando funcionalidades de AparelhoTelefonico
        meuIPhone.ligar("+551199999999");
        meuIPhone.atender();
        meuIPhone.iniciarCorreioVoz();

        // Testando funcionalidades de NavegadorInternet
        meuIPhone.exibirPagina("https://www.apple.com");
        meuIPhone.adicionarNovaAba();
        meuIPhone.atualizarPagina();
    }
}
