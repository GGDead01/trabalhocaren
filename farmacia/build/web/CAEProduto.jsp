<%-- 
    Document   : CAEProduto
    Created on : 23/08/2022, 09:53:52
    Author     : 15091673660
--%>

<%@page import="modelo.DAOProduto"%>
<%@page import="modelo.Produto"%>

<%
    String mensagem = "";
    String opcao = request.getParameter("opcao");
    Produto objProduto = new Produto();
    objProduto.setCodProduto(Integer.parseInt(request.getParameter("codProduto")));
    objProduto.setNomeProduto(request.getParameter("nomeProduto"));
    objProduto.setQuantidadeProduto(Integer.parseInt(request.getParameter("quantidadeProduto")));
    objProduto.setCodigoBarras(request.getParameter("codigoBarras"));
    objProduto.setValor(Double.parseDouble(request.getParameter("valor")));
    
    DAOProduto objDAOProduto = new DAOProduto();
    if(opcao.equals("cadastrar")){
        mensagem = objDAOProduto.inserir(objProduto);  
        response.sendRedirect("CadastroProduto.jsp?mensagem="+mensagem);
    }
     if(opcao.equals("alterar")){
        mensagem = objDAOProduto.alterar(objProduto);  
        response.sendRedirect("CadastroProduto.jsp?mensagem="+mensagem); 
    }
     if(opcao.equals("excluir")){
        mensagem = objDAOProduto.excluir(objProduto);  
        response.sendRedirect("CadastroProduto.jsp?mensagem="+mensagem);
    }   
%>