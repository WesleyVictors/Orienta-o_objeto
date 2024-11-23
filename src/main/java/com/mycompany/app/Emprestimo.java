import java.util.Date;

public class Emprestimo {
    protected Date dataRetirada;
    protected Date dataDevolucao;
    protected Livro livro;
    protected Usuario usuario;

    public Emprestimo(Date dataRetirada, Date dataDevolucao, Livro livro, Usuario usuario) {
        this.dataRetirada = dataRetirada;
        this.dataDevolucao = dataDevolucao;
        this.livro = livro;
        this.usuario = usuario;
    }

    public Date getDataRetirada() {
        return dataRetirada;
    }

    public Date getDataDevolucao() {
        return dataDevolucao;
    }

    public Livro getLivro() {
        return livro;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void imprimeData() {
        System.out.println("Data de retirada: " + dataRetirada);
        System.out.println("Data de devolução: " + dataDevolucao);
    }
}

