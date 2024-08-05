import java.util.ArrayList;
import java.util.List;

public class Navegador {
    private String urlAtual;
    private List<String> historico;
    private List<String> favoritos;

    public Navegador() {
        this.historico = new ArrayList<>();
        this.favoritos = new ArrayList<>();
    }

    public void abrir() {
        System.out.println("Abrindo navegador");
    }

    public void digitarUrl(String url) {
        this.urlAtual = url;
        System.out.println("Digitando URL: " + url);
        navegar();
    }

    public void navegar() {
        System.out.println("Navegando para: " + urlAtual);
        historico.add(urlAtual);
    }

    public void favoritar(String url) {
        favoritos.add(url);
        System.out.println("Adicionando aos favoritos: " + url);
    }

    public void gerenciarHistorico() {
        System.out.println("Gerenciando histórico de navegação");
        for (String url : historico) {
            System.out.println("Histórico: " + url);
        }
    }
}
