package Modelo;

public class Leitor extends Usuario {
    /**
     * Construtor da classe Modelo.Leitor.
     * Chama o construtor da superclasse Modelo.Usuario usando super().
     *
     * @param nome O nome completo do leitor.
     * @param email O endereço de email do leitor.
     * @param dataCadastro A data de cadastro do leitor.
     */
    public Leitor(String nome, String email, String dataCadastro) {
        super(nome, email, dataCadastro);
    }

    /**
     * Ação de consultar um livro
     * Exibe uma mensagem no console
     */
    public void consultarLivro(){
        System.out.println(getNome() + " Está consultando um livro");
    }

    /**
     * Ação de reservar um livro
     * Exibe uma mensagem no console
     */
    public void reservarLivro(){
        System.out.println(getNome() + " Reservou um livro");
    }

    /**
     * Sobrescreve o método da superclasse para listar as ações permitidas a um Modelo.Leitor.
     * @return String com as ações específicas do perfil Modelo.Leitor.
     */
    @Override
    public String exibirAcoesDisponiveis() {
        return "Ações do Perfil Leitor: Consultar Livro, Reservar Livro.";
    }
}
