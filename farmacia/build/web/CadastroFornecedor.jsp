<script>
    function enviar(par) {
        if (par == 'cadastrar') {

            if (document.cadastro.nomeFornecedor.value == '') {
                document.cadastro.mensagem.value = 'Preencha o campo Nome';
            } else if (document.cadastro.cnpj.value == '') {
                document.cadastro.mensagem.value = 'Preencha o campo Cnpj';
            } else if (document.cadastro.endereco.value == '') {
            document.cadastro.mensagem.value = 'Preencha o campo Endereco';
            } else if (document.cadastro.email.value == '') {
            document.cadastro.mensagem.value = 'Preencha o campo Email';
            } else if (document.cadastro.telefone.value == '') {
            document.cadastro.mensagem.value = 'Preencha o campo Telefone';
            } else {
                document.cadastro.opcao.value = 'cadastrar';
                document.cadastro.action = 'CAEFornecedor.jsp';
                document.cadastro.submit();
            }
        } else if (par == 'cancelar') {
            document.cadastro.opcao.value = 'cadastrar';
            document.cadastro.nomeFornecedor.value = '';
            document.cadastro.cnpj.value = '';
            document.cadastro.endereco.value = '';
            document.cadastro.email.value = '';
            document.cadastro.telefone.value = '';
            document.cadastro.action = 'CadastroFornecedor.jsp';
            document.cadastro.submit();
            /// }
        } else if (par == 'alterar') {
            if (document.cadastro.nomeFornecedor.value == '') {
                document.cadastro.mensagem.value = 'Preencha o campo Nome';
            } else if (document.cadastro.cnpj.value == '') {
                document.cadastro.mensagem.value = 'Preencha o campo Cnpj';
            } else if (document.cadastro.endereco.value == '') {
            document.cadastro.mensagem.value = 'Preencha o campo Endereco';
            } else if (document.cadastro.email.value == '') {
            document.cadastro.mensagem.value = 'Preencha o campo Email';
            } else if (document.cadastro.telefone.value == '') {
            document.cadastro.mensagem.value = 'Preencha o campo Telefone';
            } else {
                document.cadastro.opcao.value = 'alterar';
                document.cadastro.action = 'CAEFornecedor.jsp';
                document.cadastro.submit();
            }
        } else if (par == 'excluir') {
            document.cadastro.opcao.value = 'excluir';
            document.cadastro.action = 'CAEFornecedor.jsp';
            document.cadastro.submit();
        }
    }
   </script>

<%
    String codFornecedor = request.getParameter("codFornecedor");
    if (codFornecedor == null) {
        codFornecedor = "0";
    }
    String mensagem = request.getParameter("mensagem");
    String nomeFornecedor = request.getParameter("nomeFornecedor");
    String cnpj = request.getParameter("cnpj");
    String endereco = request.getParameter("endereco");
    String email = request.getParameter("email");
    String telefone = request.getParameter("telefone");
    
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
        <h1>Cadastro Fornecedor</h1>
        <form name="cadastro" >

            <p><label>Nome: </label><input type="text" name="nomeFornecedor" value=" <%= (nomeFornecedor == null) ? "" : nomeFornecedor%>" size="30">
            </p>
            <p><label>CNPJ: </label> 
                <input type="text" name="cnpj" value="<%= (cnpj == null) ? "" : cnpj%>" size= "30">
            </p>
            <p><label>Endereço: </label> 
                <input type="text" name="endereco" value="<%= (endereco == null) ? "" : endereco%>" size= "30">
            </p>
            <p><label>Email: </label> 
                <input type="text" name="email" value="<%= (email == null) ? "" : email%>" size= "30">
            </p>
            <p><label>Telefone: </label> 
                <input type="text" name="telefone" value="<%= (telefone == null) ? "" : telefone%>" size= "30">
            </p>
            <%if (opcao.equals("cadastrar")) {%>
            <input type="button" value="Cadastrar" name="Cadastrar" onclick="enviar('cadastrar')"/>
            <%}%>

            <%if (opcao.equals("alterar")) {%>
            <input type="button" value="Alterar" name="Alterar" onclick="enviar('alterar')"/>
            <input type="button" value="Cancelar" name="Cancelar" onclick="enviar('cancelar')"/>
            <%}%>

            <%if (opcao.equals("excluir")) {%>
            <input type="button" value="Excluir" name="Excluir" onclick="enviar('excluir')"/>
            <input type="button" value="Cancelar" name="Cancelar" onclick="enviar('cancelar')"/>
            <%}%>

            <input type="hidden" name="codFornecedor" value="<%= codFornecedor%>" />
            <input type="hidden" name="opcao" value="<%= opcao%>" />

            <br></br>
            <textarea name="mensagem" rows="2" cols="100">
                <%= (mensagem == null) ? "" : mensagem%>
            </textarea>


        </form>

        <br>
        <%@include file="ListarFornecedor.jsp" %>
    </body>
</html>
