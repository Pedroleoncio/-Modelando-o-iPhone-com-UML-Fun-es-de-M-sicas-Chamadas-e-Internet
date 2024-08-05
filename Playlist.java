import java.util.ArrayList;
import java.util.List;

public class Playlist {
    private String nome;
    private List<Musica> listaDeMusicas;

    public Playlist(String nome) {
        this.nome = nome;
        this.listaDeMusicas = new ArrayList<>();
    }

    public void criar() {
        System.out.println("Criando playlist: " + nome);
    }

    public void adicionarMusica(Musica musica) {
        listaDeMusicas.add(musica);
        System.out.println("Adicionando música: " + musica.getTitulo() + " à playlist " + nome);
    }

    public void removerMusica(Musica musica) {
        listaDeMusicas.remove(musica);
        System.out.println("Removendo música: " + musica.getTitulo() + " da playlist " + nome);
    }

    public void editar(String novoNome) {
        this.nome = novoNome;
        System.out.println("Editando nome da playlist para: " + novoNome);
    }
}
