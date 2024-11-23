import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Autor autor = new Autor("Jessica Felix", "Brasil", null); 
        Livro livro = new Livro("Java for Beginners", autor, "Tecnologia", true);
        
        Emprestimo emprestimo = new Emprestimo(new Date(), new Date(), livro, null);
        Usuario usuario = new Usuario("Wesley", 24, emprestimo);
        
        livro.setValidarD();
        usuario.imprimirInformacoes();
        emprestimo.imprimeData();
    }
}

