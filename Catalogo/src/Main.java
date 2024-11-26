import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CatalogoCDs catalogo = new CatalogoCDs();
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("\nMenu do Catálogo de CDs:");
            System.out.println("1. Adicionar CD");
            System.out.println("2. Remover CD");
            System.out.println("3. Listar CDs");
            System.out.println("4. Adicionar Artista");
            System.out.println("5. Associar Artista a CD");
            System.out.println("6. Editar CD");
            System.out.println("7. Editar Artista");
            System.out.println("8. Remover Artista");
            System.out.println("9. Listar Artistas");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Título: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Ano: ");
                    int ano = scanner.nextInt();
                    scanner.nextLine();
                    CD cd = new CD(titulo, ano);
                    System.out.print("Quantas faixas tem o CD? ");
                    int numFaixas = scanner.nextInt();
                    scanner.nextLine();
                    for (int i = 0; i < numFaixas; i++) {
                        System.out.print("Faixa " + (i + 1) + ": ");
                        String faixa = scanner.nextLine();
                        cd.adicionarFaixa(faixa);
                    }
                    catalogo.adicionarCD(cd);
                    break;

                case 2:
                    System.out.print("Título do CD a remover: ");
                    titulo = scanner.nextLine();
                    catalogo.removerCD(titulo);
                    break;

                case 3:
                    catalogo.listarCDs();
                    break;

                case 4:
                    System.out.print("Nome do Artista: ");
                    String nomeArtista = scanner.nextLine();
                    System.out.print("Gênero Musical: ");
                    String genero = scanner.nextLine();
                    Artista artista = new Artista(nomeArtista, genero);
                    catalogo.adicionarArtista(artista);
                    break;

                case 5:
                    System.out.print("Título do CD: ");
                    String tituloCD = scanner.nextLine();
                    System.out.print("Nome do Artista: ");
                    nomeArtista = scanner.nextLine();
                    catalogo.associarArtistaCD(tituloCD, nomeArtista);
                    break;

                case 6:
                    System.out.print("Título do CD a editar: ");
                    titulo = scanner.nextLine();
                    System.out.print("Novo Título: ");
                    String novoTitulo = scanner.nextLine();
                    System.out.print("Novo Ano: ");
                    int novoAno = scanner.nextInt();
                    scanner.nextLine();
                    catalogo.editarCD(titulo, novoTitulo, novoAno);
                    break;

                case 7:
                    System.out.print("Nome do Artista a editar: ");
                    nomeArtista = scanner.nextLine();
                    System.out.print("Novo Nome: ");
                    String novoNome = scanner.nextLine();
                    System.out.print("Novo Gênero: ");
                    String novoGenero = scanner.nextLine();
                    catalogo.editarArtista(nomeArtista, novoNome, novoGenero);
                    break;

                case 8:
                    System.out.print("Nome do Artista a remover: ");
                    nomeArtista = scanner.nextLine();
                    catalogo.removerArtista(nomeArtista);
                    break;

                case 9:
                    catalogo.listarArtistas();
                    break;

                case 0:
                    continuar = false;
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        }

        scanner.close();
    }
}
