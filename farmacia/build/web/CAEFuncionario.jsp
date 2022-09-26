<%-- 
    Document   : CAEFuncionario
    Created on : 23/08/2022, 09:46:44
    Author     : 15091673660
--%>

<%@page import="modelo.DAOFuncionario"%>
<%@page import="modelo.Funcionario"%>

<%
    String mensagem = "";
    String opcao = request.getParameter("opcao");
    Funcionario objFuncionario = new Funcionario();
    objFuncionario.setCodFuncionario(Integer.parseInt(request.getParameter("codFuncionario")));
    objFuncionario.setNomeFuncionario(request.getParameter("nomeFuncionario"));
    objFuncionario.setEnderecoFuncionario(request.getParameter("enderecoFuncionario"));
    objFuncionario.setCpfFuncionario(request.getParameter("cpfFuncionario"));
    objFuncionario.setRgFuncionario(request.getParameter("rgFuncionario"));
    objFuncionario.setSalario(Double.parseDouble(request.getParameter("salario")));
    objFuncionario.setTelefoneFuncionario(request.getParameter("telefoneFuncionario"));
    objFuncionario.setCargaHoraria(Integer.parseInt(request.getParameter("cargaHoraria")));
    
    DAOFuncionario objDAOFuncionario = new DAOFuncionario();
    if(opcao.equals("cadastrar")){
        mensagem = objDAOFuncionario.inserir(objFuncionario);  
        response.sendRedirect("CadastroFuncionario.jsp?mensagem="+mensagem);
    }
     if(opcao.equals("alterar")){
        mensagem = objDAOFuncionario.alterar(objFuncionario);  
        response.sendRedirect("CadastroFuncionario.jsp?mensagem="+mensagem); 
    }
     if(opcao.equals("excluir")){
        mensagem = objDAOFuncionario.excluir(objFuncionario);  
        response.sendRedirect("CadastroFuncionario.jsp?mensagem="+mensagem);
    }   
%>
