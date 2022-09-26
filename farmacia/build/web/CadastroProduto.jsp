<script>
    function enviar(par) {
        if (par == 'cadastrar') {

            if (document.cadastro.nomeProduto.value == '') {
                document.cadastro.mensagem.value = 'Preencha o campo Nome';
            } else if (document.cadastro.quantidadeProduto.value == '') {
                document.cadastro.mensagem.value = 'Preencha o campo Quantidade';
            } else if (document.cadastro.codigoBarras.value == '') {
                document.cadastro.mensagem.value = 'Preencha o campo Codigo de Barras';
            } else if (document.cadastro.valor.value == '') {
                document.cadastro.mensagem.value = 'Preencha o campo Valor';
            } else {
                document.cadastro.opcao.value = 'cadastrar';
                document.cadastro.action = 'CAEProduto.jsp';
                document.cadastro.submit();
            }
        } else if (par == 'cancelar') {
            document.cadastro.opcao.value = 'cadastrar';
            document.cadastro.nomeProduto.value = '';
            document.cadastro.quantidadeProduto.value = '';
            document.cadastro.codigoBarras.value = '';
            document.cadastro.valor.value = '';
            document.cadastro.action = 'CadastroProduto.jsp';
            document.cadastro.submit();
            /// }
        } else if (par == 'alterar') {

            if (document.cadastro.nomeProduto.value == '') {
                document.cadastro.mensagem.value = 'Preencha o campo Nome';
            } else if (document.cadastro.quantidadeProduto.value == '') {
                document.cadastro.mensagem.value = 'Preencha o campo Quantidade';
            } else if (document.cadastro.codigoBarras.value == '') {
                document.cadastro.mensagem.value = 'Preencha o campo Codigo de Barras';
            } else if (document.cadastro.valor.value == '') {
                document.cadastro.mensagem.value = 'Preencha o campo Valor';
            } else {
                document.cadastro.opcao.value = 'alterar';
                document.cadastro.action = 'CAEProduto.jsp';
                document.cadastro.submit();
            }
        } else if (par == 'excluir') {
            document.cadastro.opcao.value = 'excluir';
            document.cadastro.action = 'CAEProduto.jsp';
            document.cadastro.submit();
        }
    }
</script>

<%
    String codProduto = request.getParameter("codProduto");
    if (codProduto == null) {
        codProduto = "0";
    }

    String mensagem = request.getParameter("mensagem");
    String nomeProduto = request.getParameter("nomeProduto");
    String quantidadeProduto = request.getParameter("quantidadeProduto");
    String codigoBarras = request.getParameter("codigoBarras");
    String valor = request.getParameter("valor");
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
        <h1>Cadastro Produto</h1>
        <form name="cadastro" >
            <p><label>Nome: </label><input type="text" name="nomeProduto" value="<%= (nomeProduto == null) ? "" : nomeProduto%>" size="30" /> 
            </p>
            <p><label>Quantidade: </label><input type="text" name="quantidadeProduto" value="<%= (quantidadeProduto == null) ? "" : quantidadeProduto%>" size="30" /> 
            </p>
            <p><label>Código de Barras: </label><input type="text" name="codigoBarras" value="<%= (codigoBarras == null) ? "" : codigoBarras%>" size="30" /> 
            </p>
            <p><label>Valor: </label><input type="text" name="valor" value="<%= (valor == null) ? "" : valor%>" size="30" /> 
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
<input type="hidden" name="codProduto" value="<%=codProduto%>" />
<input type="hidden" name="opcao" value="<%=opcao%>" />
<br></br>
<textarea name="mensagem" rows="2" cols="100">
    <%= (mensagem == null) ? "" : mensagem%>
</textarea>
</form>
<br>
<%@include file="ListarProduto.jsp"%>
</body>
</html>
