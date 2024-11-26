import java.util.ArrayList;
import java.util.List;

public class CD {
    private String titulo;
    private int ano;
    private List<String> faixas;
    private Artista artista;

    public CD(String titulo, int ano) {
        this.titulo = titulo;
        this.ano = ano;
        this.faixas = new ArrayList<>();
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAno() {
        return ano;
    }

    public List<String> getFaixas() {
        return faixas;
    }

    public Artista getArtista() {
        return artista;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void adicionarFaixa(String faixa) {
        faixas.add(faixa);
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }

    @Override
    public String toString() {
        return "CD: Título=" + titulo + ", Ano=" + ano + ", Artista=" + (artista != null ? artista.getNome() : "Não associado") + ", Faixas=" + faixas;
    }
}
