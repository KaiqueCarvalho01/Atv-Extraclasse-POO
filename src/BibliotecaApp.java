import Modelo.Administrador;
import Modelo.Bibliotecario;
import Modelo.Leitor;
import Modelo.Usuario;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe principal para testar a hierarquia de Herança e o Polimorfismo
 * Demonstra como um método comum (exibirAcoesDisponiveis) se comporta
 * de maneira diferente para cada subclasse.
 */
public class BibliotecaApp {
    public static void main(String[] args) {
        //Declarar e inicializar uma lista de referências do tipo Usuario
        // ArrayList para armazenar diferentes tipos de usuários
        List<Usuario> listaDeUsuarios = getUsuarios();
        
        //Polimorfismo
        System.out.println("--- Testando Polimorfismo no Sistema da Biblioteca ---");

        // Percorrer a lista de usuários usando um laço de repetição for-each
        for (Usuario usuario : listaDeUsuarios) {

            System.out.println("\n------------------------------------------------");

            // a) Chamada do método da superclasse
            System.out.println("Dados do Usuário:");
            System.out.println(usuario.exibirDados()); // Método da superclasse

            // b) Chamada do método SOBRESCRITO (comportamento polimórfico)
            System.out.println("\nAções Disponíveis para o Perfil:");
            // O Java decide em tempo de execução qual versão do método chamar (da classe real do objeto)
            System.out.println(usuario.exibirAcoesDisponiveis());

            if (usuario instanceof Leitor) {
                ((Leitor) usuario).consultarLivro();
            }
            if (usuario instanceof Bibliotecario) {
                ((Bibliotecario) usuario).cadastrarLivro();
            }
            if (usuario instanceof Administrador) {
                ((Administrador) usuario).gerenciarUsuario();
            }
        }
        System.out.println("------------------------------------------------\n");

    }

    private static List<Usuario> getUsuarios() {
        List<Usuario> listaDeUsuarios = new ArrayList<>();

        // Criar instâncias de cada subclasse.
        Leitor leitor1 = new Leitor("Ana Silva", "ana.silva@email.com", "15/10/2025");
        Bibliotecario biblio1 = new Bibliotecario("Carlos Souza", "carlos.souza@email.com", "10/08/2024");
        Administrador admin1 = new Administrador("Marcos Roberto", "marcos.roberto@email.com", "01/01/2023");

        // Adição à Lista: Adicionar os objetos à ArrayList de Usuario.
        //Objetos de subclasses são referenciados pelo tipo da superclasse.
        listaDeUsuarios.add(leitor1);
        listaDeUsuarios.add(biblio1);
        listaDeUsuarios.add(admin1);
        return listaDeUsuarios;
    }
}
