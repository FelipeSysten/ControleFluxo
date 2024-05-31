public class iPhone implements IReprodutorMusical, IAparelhoTelefonico, INavegadorInternet {
    private String modelo;
    private String cor;
    private int capacidade;

    public iPhone(String modelo, String cor, int capacidade) {
        this.modelo = modelo;
        this.cor = cor;
        this.capacidade = capacidade;
    }

    // Métodos da interface IReprodutorMusical
    @Override
    public void play() {
        System.out.println("Reproduzindo música.");
    }

    @Override
    public void pause() {
        System.out.println("Música pausada.");
    }

    @Override
    public void stop() {
        System.out.println("Reprodução de música parada.");
    }

    // Métodos da interface IAparelhoTelefonico
    @Override
    public void ligar() {
        System.out.println("Ligando para um contato.");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo a chamada.");
    }

    @Override
    public void iniciarCorreioDeVoz() {
        System.out.println("Iniciando correio de voz.");
    }

    // Métodos da interface INavegadorInternet
    @Override
    public void exibirPagina() {
        System.out.println("Exibindo página da web.");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página da web atualizada.");
    }
}
