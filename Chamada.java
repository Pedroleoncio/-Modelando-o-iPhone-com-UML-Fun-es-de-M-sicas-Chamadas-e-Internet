public class Chamada {
    
    private String numeroDestino;
    private String contato;
    @SuppressWarnings("unused")
    private int duracao; // duração em segundos

    public Chamada(String numeroDestino, String contato) {
        this.numeroDestino = numeroDestino;
        this.contato = contato;
        this.duracao = 0;
    }

    public void iniciar() {
        System.out.println("Iniciando chamada para: " + contato + " (" + numeroDestino + ")");
    }

    public void encerrar() {
        System.out.println("Encerrando chamada com: " + contato + " (" + numeroDestino + ")");
    }

    public void ativarVivaVoz() {
        System.out.println("Ativando viva-voz para a chamada com: " + contato + " (" + numeroDestino + ")");
    }
}
