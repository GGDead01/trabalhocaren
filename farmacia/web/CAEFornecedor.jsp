<%@page import="modelo.Fornecedor"%>
<%@page import="modelo.DAOFornecedor"%>
<%@page import="modelo.Fornecedor"%>

<% 
 String mensagem = "";
 String opcao = request.getParameter("opcao");
 Fornecedor objFornecedor = new Fornecedor();
 objFornecedor.setCodFornecedor(Integer.parseInt(request.getParameter("codFornecedor")));
 objFornecedor.setNomeFornecedor(request.getParameter("nomeFornecedor"));
 objFornecedor.setCnpj(request.getParameter("cnpj"));
 objFornecedor.setEndereco(request.getParameter("endereco"));
 objFornecedor.setEmail(request.getParameter("email"));
 objFornecedor.setTelefone(request.getParameter("telefone"));
 DAOFornecedor objDAOFornecedor = new DAOFornecedor();

if(opcao.equals("cadastrar")){
mensagem = objDAOFornecedor.inserir(objFornecedor);

 response.sendRedirect("CadastroFornecedor.jsp?mensagem="+mensagem);
}
if(opcao.equals("alterar")){
    mensagem = objDAOFornecedor.alterar(objFornecedor);
    response.sendRedirect("CadastroFornecedor.jsp?mensagem="+mensagem);
    
}
if(opcao.equals("excluir")){
    mensagem = objDAOFornecedor.excluir(objFornecedor);
    response.sendRedirect("CadastroFornecedor.jsp?mensagem="+mensagem);
    
}

%>