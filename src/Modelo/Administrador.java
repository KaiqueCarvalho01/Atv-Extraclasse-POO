package Modelo;

public class Administrador extends Usuario{
    /**
     * Construtor da classe Modelo.Administrador.
     * Chama o construtor da superclasse
     *
     * @param nome O nome completo do Modelo.Administrador.
     * @param email O endereço de email do Modelo.Administrador.
     * @param dataCadastro A data de cadastro do Modelo.Administrador.
     */
    public Administrador(String nome, String email, String dataCadastro) {
        super(nome, email, dataCadastro);
    }

    /**
     * Ação de gerenciar outros usuários (incluir/remover qualquer tipo de usuário do sistema).
     */
    public void gerenciarUsuario() {
        System.out.println(getNome() + " está gerenciando outros usuários (inclusão/remoção).");
    }

    /**
     * Sobrescreve o método da superclasse para listar as ações permitidas a um Modelo.Administrador.
     * Inclui todas as ações dos perfis anteriores mais a ação específica.
     * @return String com as ações específicas do perfil Modelo.Administrador.
     */
    @Override
    public String exibirAcoesDisponiveis() {
        return "Ações do Perfil Modelo.Administrador: Consultar Livro, Reservar Livro," +
                " Cadastrar Livro, Retirar Livro, Gerenciar Usuário.";
    }

}
