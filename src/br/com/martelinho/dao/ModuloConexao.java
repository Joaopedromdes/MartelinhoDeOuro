
package br.com.martelinho.dao;

import java.sql.Connection;
import java.sql.DriverManager;


public class ModuloConexao {
     public static Connection conector() {
        java.sql.Connection conexao = null;
        //A linha abaixo chama o Driver que eue importei para bibliotecas
        String driver = "com.mysql.jdbc.Driver";
        //Armazenando informações referente ao banco
        String url = "jdbc:mysql://localhost:3306/matelinhoouro";
        String user = "root";
        String password = "873891@Jp";
        //Estabelecendo a conexão com o banco
        try {
            Class.forName(driver); //Executar o arquivo do driver 
            conexao = DriverManager.getConnection(url, user, password);
            return conexao;
        } catch (Exception e) { //Caso ocorra algum erro
            //A linha abaixo serve de apoio para esclarecer o erro
            //System.out.println(e);
            return null;
        }
    }
}
