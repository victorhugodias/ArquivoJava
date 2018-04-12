package dao;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import negocio.Usuario;

public class UsuarioDao {
	
	private static FileWriter file;
	private static BufferedWriter escritor;
	private static String arquivo = "c:\\TUsuario.txt";
	
	public static void incluir(Usuario usuario){
		
		try{
			String linha = 
				String.format("%s ; %s ; %s\r\n",
				usuario.getNome(),
				usuario.getEmail(),
				usuario.getSenha());
			escritor.write(linha);
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	
	public static void incluirEmLote(List<Usuario> lista){
		 
			try {
				file = new FileWriter(arquivo);
				escritor = new BufferedWriter(file);
				for(Usuario u : lista){
					incluir(u);
				}
				escritor.flush();
				escritor.close();
			} 
			catch (IOException e) {
				e.printStackTrace();
			} 
		
	}
	
	
	public static Usuario obterPorEmail(String email){
		return null;
	}
	
	
	public static List<Usuario> obterLista(){
		return null;
	}
		
	

}
