/*Passos
 * 1-Criar uma classe ou metodo onde sera armazenado o perfil do cliente
 * 2-Criar os getters e setters para manusear as informaçoes
 * 3-Importar o Scanner 
 * 4-
 * 5-
 */

public class ContaTerminal  {
    public static void main(String[] args) throws Exception {
        PerfilCliente perfilCliente = new PerfilCliente();
        String nome = perfilCliente.getNome();
        
        System.out.println(nome);
    }
}
