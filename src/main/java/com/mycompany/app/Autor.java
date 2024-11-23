public class Autor extends Pessoa {
    private String nacionalidade;

    public Autor(String nome, String nacionalidade, Livro[] livros) {
        super(nome, livros); 
        this.nacionalidade = nacionalidade;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public Livro[] getObrasPublicadasPorGenero(String genero) {
        return super.getLivros();
    }
}

