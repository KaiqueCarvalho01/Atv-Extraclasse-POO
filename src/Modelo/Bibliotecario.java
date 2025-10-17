package Modelo;

public class Bibliotecario extends Usuario{
    /**
     * Construtor da classe Modelo.Bibliotecario.
     * Chama o construtor da superclasse
     *
     * @param nome O nome completo do bibliotecário.
     * @param email O endereço de email do bibliotecário.
     * @param dataCadastro A data de cadastro do bibliotecário.
     */
    public Bibliotecario(String nome, String email, String dataCadastro) {
        super(nome, email, dataCadastro);
    }

    /**
     * Ação de retirar um livro do sistema
     */
    public void retirarLivro(){
        System.out.println(getNome() + " está retirando um livro do sistema.");
    }

    /**
     * Ação de cadastrar um novo livro no sistema.
     */
    public void cadastrarLivro(){
        System.out.println(getNome() + " está cadastrando um novo livro.");
    }

    /**
     * Sobrescreve o método da superclasse para listar as ações permitidas a um Bibliotecário.
     * As ações incluem as de Modelo.Leitor (consultar/reservar) e as específicas (cadastrar/retirar).
     * @return String com as ações específicas do perfil Bibliotecário.
     */
    @Override
    public String exibirAcoesDisponiveis() {
        return "Ações do Perfil Bibliotecário: Consultar Livro, Reservar Livro," +
                " Cadastrar Livro, Retirar Livro.";
    }
}
