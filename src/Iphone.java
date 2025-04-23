public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical{

    
    public static void main(String[] args) {
        String musica = "carry on my wayward son";
        String numero = "55 31 4781-1255";
        String url = "https://www.youtube.com/watch?v=UlZzVuEQvSY";

        var iphone = new Iphone();
        iphone.adicionarNovaGuia();
        iphone.atender();
        iphone.atualizarPagina();
        iphone.exibirPagina(url);
        iphone.iniciarCorreioDeVoz();
        iphone.tocarMusica();
         
    }

    @Override
    public void tocarMusica() {
        System.out.println("tocando musica");
    }

    @Override
    public void pausarMusica() {
        System.out.println("pausando musica");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("selecionando musica"+musica);
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("exibindo pagina"+url);
    }

    @Override
    public void adicionarNovaGuia() {
        System.out.println("adicionando nova guia");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("atualizando pagina");
    }

    @Override
    public void ligar(String numero) {
        System.out.println("ligando para o numero "+numero);
    }

    @Override
    public void atender() {
        System.out.println("atendendo chamada");
    }

    @Override
    public void iniciarCorreioDeVoz() {
        System.out.println("iniciando correio de voz");
    }


}
