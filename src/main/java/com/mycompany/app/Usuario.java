public class Usuario {
    private String nome;
    private int idade;
    private Emprestimo historicoEmprestimo;

    public Usuario(String nome, int idade, Emprestimo emprestimo) {
        this.nome = nome;
        this.idade = idade;
        this.historicoEmprestimo = emprestimo;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public Emprestimo getEmprestimo() {
        return historicoEmprestimo;
    }

    public void imprimirInformacoes() {
        System.out.println("Usuario: " + nome);
        System.out.println("Idade: " + idade);
    }
}

