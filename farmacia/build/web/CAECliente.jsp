<%@page import="modelo.Cliente"%>
<%@page import="modelo.ConverteData"%>
<%@page import="modelo.DAOCliente"%>
<%@page import="modelo.Cliente"%>

<% 
 String mensagem = "";
 String opcao = request.getParameter("opcao");
 ConverteData converte = new ConverteData();
 Cliente objCliente = new Cliente();
 objCliente.setCodCliente(Integer.parseInt(request.getParameter("codCliente")));
 objCliente.setNomeCliente(request.getParameter("nomeCliente"));
 objCliente.setEnderecoCliente(request.getParameter("enderecoCliente"));
 objCliente.setCpfCliente(request.getParameter("cpfCliente"));
 objCliente.setRgCliente(request.getParameter("rgCliente"));
 objCliente.setTelefoneCliente(request.getParameter("telefoneCliente"));
 objCliente.setDataNascimento(converte.converteCalendario(request.getParameter("dataNascimento")));
DAOCliente objDAOCliente = new DAOCliente();

if(opcao.equals("cadastrar")){
mensagem = objDAOCliente.inserir(objCliente);

 response.sendRedirect("CadastroCliente.jsp?mensagem="+mensagem);
}
if(opcao.equals("alterar")){
    mensagem = objDAOCliente.alterar(objCliente);
    response.sendRedirect("CadastroCliente.jsp?mensagem="+mensagem);
    
}
if(opcao.equals("excluir")){
    mensagem = objDAOCliente.excluir(objCliente);
    response.sendRedirect("CadastroCliente.jsp?mensagem="+mensagem);
    
}

%> 