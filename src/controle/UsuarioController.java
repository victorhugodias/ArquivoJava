package controle;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UsuarioDao;
import negocio.Usuario;


public class UsuarioController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private List<Usuario> usuarios;
       
   
    public UsuarioController() {
        super();
        usuarios = new ArrayList<Usuario>();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		UsuarioDao.incluirEmLote(usuarios);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Usuario usuario = new Usuario();
		usuario.setNome(request.getParameter("nome"));
		usuario.setEmail(request.getParameter("email"));
		usuario.setSenha(request.getParameter("senha"));
		
		usuarios.add(usuario);
		
		usuario.exibir();
		impressaoHTML(usuario, request, response);
	}

private void impressaoHTML(Usuario usuario,HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
			PrintWriter out = response.getWriter();
		
			out.println(
					"<html>"
					+"<head>"
					+"<meta charset='ISO-8859-1'>"
					+"<title>Sistema de Gerenciamento de Biblioteca</title>"
					+"</head>"
					+"<body>"
				
					+"		<form action='usuario.html' method='get'>"
					+"		<input type='submit' value='Voltar'>"
					+"		<hr>"
					+"		<h3>"+usuario.obterRelatorio()+"</h3>"  
					+"		<h2>Usuario cadastrado com sucesso!</h2>"
					+"		<hr>"
					+"		</form>"
					
					
					+"</body>"
					+"</html>"
					);
		
		}
	
	
	
}
