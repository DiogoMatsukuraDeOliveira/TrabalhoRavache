import java.util.ArrayList;
import java.util.List;

public class CatalogoCDs {
    private List<CD> cds = new ArrayList<>();
    private List<Artista> artistas = new ArrayList<>();

    public void adicionarCD(CD cd) {
        cds.add(cd);
        System.out.println("CD adicionado: " + cd);
    }

    public void removerCD(String titulo) {
        cds.removeIf(cd -> cd.getTitulo().equalsIgnoreCase(titulo));
        System.out.println("CD removido: " + titulo);
    }

    public void listarCDs() {
        if (cds.isEmpty()) {
            System.out.println("Nenhum CD no catálogo.");
        } else {
            cds.forEach(System.out::println);
        }
    }

    public void adicionarArtista(Artista artista) {
        artistas.add(artista);
        System.out.println("Artista adicionado: " + artista);
    }

    public void associarArtistaCD(String tituloCD, String nomeArtista) {
        CD cd = cds.stream().filter(c -> c.getTitulo().equalsIgnoreCase(tituloCD)).findFirst().orElse(null);
        Artista artista = artistas.stream().filter(a -> a.getNome().equalsIgnoreCase(nomeArtista)).findFirst().orElse(null);

        if (cd != null && artista != null) {
            cd.setArtista(artista);
            System.out.println("Artista " + nomeArtista + " associado ao CD " + tituloCD);
        } else {
            System.out.println("CD ou Artista não encontrado.");
        }
    }

    public void editarCD(String titulo, String novoTitulo, int novoAno) {
        CD cd = cds.stream().filter(c -> c.getTitulo().equalsIgnoreCase(titulo)).findFirst().orElse(null);
        if (cd != null) {
            cd.setTitulo(novoTitulo);
            cd.setAno(novoAno);
            System.out.println("CD editado: " + cd);
        } else {
            System.out.println("CD não encontrado.");
        }
    }

    public void editarArtista(String nome, String novoNome, String novoGenero) {
        Artista artista = artistas.stream().filter(a -> a.getNome().equalsIgnoreCase(nome)).findFirst().orElse(null);
        if (artista != null) {
            artista.setNome(novoNome);
            artista.setGenero(novoGenero);
            System.out.println("Artista editado: " + artista);
        } else {
            System.out.println("Artista não encontrado.");
        }
    }

    public void removerArtista(String nome) {
        artistas.removeIf(artista -> artista.getNome().equalsIgnoreCase(nome));
        System.out.println("Artista removido: " + nome);
    }

    public void listarArtistas() {
        if (artistas.isEmpty()) {
            System.out.println("Nenhum artista no catálogo.");
        } else {
            artistas.forEach(System.out::println);
        }
    }
}
