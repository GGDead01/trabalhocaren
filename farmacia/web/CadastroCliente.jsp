<%-- 
    Document   : CadastroCliente
    Created on : 23/08/2022, 09:17:23
    Author     : 16612624655
--%>

<%@page import="java.util.List"%>
<%@page import="modelo.Cliente"%>
<%@page import="modelo.DAOCliente"%>
<script>
    function enviar(par) {
        if (par == 'cadastrar') {

            if (document.cadastro.nomeCliente.value == '') {
                document.cadastro.mensagem.value = 'Preencha o campo Nome';
            } else if (document.cadastro.enderecoCliente.value == '') {
                document.cadastro.mensagem.value = 'Preencha o campo Endereço';
            } else if (document.cadastro.cpfCliente.value == '') {
                document.cadastro.mensagem.value = 'Preencha o campo Cpf';
            } else if (document.cadastro.rgCliente.value == '') {
                document.cadastro.mensagem.value = 'Preencha o campo Rg';
            } else if (document.cadastro.dataNascimento.value == '') {
                document.cadastro.mensagem.value = 'Preencha o campo Nascimento';
            } else if (document.cadastro.telefoneCliente.value == '') {
                document.cadastro.mensagem.value = 'Preencha o campo Telefone';
            } else {
                document.cadastro.opcao.value = 'cadastrar';
                document.cadastro.action = 'CAECliente.jsp';
                document.cadastro.submit();
            }
        } else if (par == 'cancelar') {
            document.cadastro.opcao.value = 'cadastrar';
            document.cadastro.nomeCliente.value = '';
            document.cadastro.enderecoCliente.value = '';
            document.cadastro.cpfCliente.value = '';
            document.cadastro.rgCliente.value = '';
            document.cadastro.dataNascimento.value = '';
            document.cadastro.telefoneCliente.value = '';
            document.cadastro.action = 'CadastroCliente.jsp';
            document.cadastro.submit();
            /// }
        } else if (par == 'alterar') {

            if (document.cadastro.nomeCliente.value == '') {
                document.cadastro.mensagem.value = 'Preencha o campo Nome';
            } else if (document.cadastro.enderecoCliente.value == '') {
                document.cadastro.mensagem.value = 'Preencha o campo Endereço';
            } else if (document.cadastro.cpfCliente.value == '') {
                document.cadastro.mensagem.value = 'Preencha o campo Cpf';
            } else if (document.cadastro.rgCliente.value == '') {
                document.cadastro.mensagem.value = 'Preencha o campo Rg';
            } else if (document.cadastro.dataNascimento.value == '') {
                document.cadastro.mensagem.value = 'Preencha o campo Nascimento';
            } else if (document.cadastro.telefoneCliente.value == '') {
                document.cadastro.mensagem.value = 'Preencha o campo Telefone';
            } else {
                document.cadastro.opcao.value = 'alterar';
                document.cadastro.action = 'CAECliente.jsp';
                document.cadastro.submit();
            }
        } else if (par == 'excluir') {
            document.cadastro.opcao.value = 'excluir';
            document.cadastro.action = 'CAECliente.jsp';
            document.cadastro.submit();
        }
    }
</script>
<%
    String codCliente = request.getParameter("codCliente");
    if (codCliente == null) {
        codCliente = "0";
    }
    String mensagem = request.getParameter("mensagem");
    String nomeCliente = request.getParameter("nomeCliente");
    String enderecoCliente = request.getParameter("enderecoCliente");
    String cpfCliente = request.getParameter("cpfCliente");
    String rgCliente = request.getParameter("rgCliente");
    String dataNascimento = request.getParameter("dataNascimento");
    String telefoneCliente = request.getParameter("telefoneCliente");

    String opcao = request.getParameter("opcao");
    if (opcao == null) {
        opcao = "cadastrar";
    }
%>


<%@page contentType="text/html" pageEncoding="Latin1"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=Latin1">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Cadastro Cliente</h1>
        <form name="cadastro" >

            <p><label>Nome: </label><input type="text" name="nomeCliente" value=" <%= (nomeCliente == null) ? "" : nomeCliente%>" size="30">
            </p>
            <p><label>Endereço: </label><input type="text" name="enderecoCliente" value="<%= (enderecoCliente == null) ? "" : enderecoCliente%>" size= "30">
            </p>
            <p><label>CPF: </label><input type="text" name="cpfCliente" value="<%= (cpfCliente == null) ? "" : cpfCliente%>" size= "30">
            </p>
            <p><label>RG: </label><input type="text" name="rgCliente" value="<%= (rgCliente == null) ? "" : rgCliente%>" size= "30">
            </p>
            <p><label>Nascimento: </label><input type="text" name="dataNascimento" value="<%= (dataNascimento == null) ? "" : dataNascimento%>" size= "30">
            </p>
            <p><label>Telefone: </label><input type="text" name="telefoneCliente" value="<%= (telefoneCliente == null) ? "" : telefoneCliente%>" size= "30">
            </p>

        </p>
        <%if (opcao.equals("cadastrar")) {%>
        <input type="button" value="Cadastrar" name="Cadastrar" onclick="enviar('cadastrar')" />
        <%}%>
        <%if (opcao.equals("alterar")) {%>
        <input type="button" value="Alterar" name="Alterar" onclick="enviar('alterar')" />
        <input type="button" value="Cancelar" name="Cancelar" onclick="enviar('cancelar')" />
        <%}%>
        <%if (opcao.equals("excluir")) {%>  
        <input type="button" value="Excluir" name="Excluir" onclick="enviar('excluir')" />
        <input type="button" value="Cancelar" name="Cancelar" onclick="enviar('cancelar')" />
        <%}%>
        <input type="hidden" name="codCliente" value="<%=codCliente%>" />
        <input type="hidden" name="opcao" value="<%=opcao%>" />
        <br></br>
        <textarea name="mensagem" rows="2" cols="100">
            <%= (mensagem == null) ? "" : mensagem%>
        </textarea>
    </form>
    <br>
    <%@include file="ListarCliente.jsp"%>
</body>
</html>


