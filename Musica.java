public class Musica {
    private String titulo;
    private String artista;
    @SuppressWarnings("unused")
    private String album;
    

    public Musica(String titulo, String artista, int duracao, String album) {
        this.titulo = titulo;
        this.artista = artista;
        this.album = album;
    }

    public void tocar() {
        System.out.println("Tocando: " + titulo + " - " + artista);
    }

    public void pausar() {
        System.out.println("Pausando: " + titulo + " - " + artista);
    }

    public void parar() {
        System.out.println("Parando: " + titulo + " - " + artista);
    }

    public void avancar() {
        System.out.println("Avançando para a próxima música");
    }

    public void retroceder() {
        System.out.println("Retrocedendo para a música anterior");
    }

    public String getTitulo() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getTitulo'");
    }
}
