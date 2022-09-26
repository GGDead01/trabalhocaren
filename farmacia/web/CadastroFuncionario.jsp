<script>
    function enviar(par) {
        if (par == 'cadastrar') {

            if (document.cadastro.nomeFuncionario.value == '') {
                document.cadastro.mensagem.value = 'Preencha o campo Nome';
            } else if (document.cadastro.enderecoFuncionario.value == '') {
                document.cadastro.mensagem.value = 'Preencha o campo Endereco';
            } else if (document.cadastro.cpfFuncionario.value == '') {
                document.cadastro.mensagem.value = 'Preencha o campo CPF';
            } else if (document.cadastro.rgFuncionario.value == '') {
                document.cadastro.mensagem.value = 'Preencha o campo RG';
            } else if (document.cadastro.telefoneFuncionario.value == '') {
                document.cadastro.mensagem.value = 'Preencha o campo Telefone';
            } else if (document.cadastro.salario.value == '') {
                document.cadastro.mensagem.value = 'Preencha o campo Salario';
            } else if (document.cadastro.cargaHoraria.value == '') {
                document.cadastro.mensagem.value = 'Preencha o campo Carga Horaria';
            } else {
                document.cadastro.opcao.value = 'cadastrar';
                document.cadastro.action = 'CAEFuncionario.jsp';
                document.cadastro.submit();
            }
        } else if (par == 'cancelar') {
            document.cadastro.opcao.value = 'cadastrar';
            document.cadastro.nomeFuncionario.value = '';
            document.cadastro.enderecoFuncionario.value = '';
            document.cadastro.cpfFuncionario.value = '';
            document.cadastro.rgFuncionario.value = '';
            document.cadastro.telefoneFuncionario.value = '';
            document.cadastro.salario.value = '';
            document.cadastro.cargaHoraria.value = '';
            document.cadastro.action = 'CadastroFuncionario.jsp';
            document.cadastro.submit();
            /// }
        } else if (par == 'alterar') {

            if (document.cadastro.nomeFuncionario.value == '') {
                document.cadastro.mensagem.value = 'Preencha o campo Nome';
            } else if (document.cadastro.enderecoFuncionario.value == '') {
                document.cadastro.mensagem.value = 'Preencha o campo Endereco';
            } else if (document.cadastro.cpfFuncionario.value == '') {
                document.cadastro.mensagem.value = 'Preencha o campo CPF';
            } else if (document.cadastro.rgFuncionario.value == '') {
                document.cadastro.mensagem.value = 'Preencha o campo RG';
            } else if (document.cadastro.telefoneFuncionario.value == '') {
                document.cadastro.mensagem.value = 'Preencha o campo Telefone';
            } else if (document.cadastro.salario.value == '') {
                document.cadastro.mensagem.value = 'Preencha o campo Salario';
            } else if (document.cadastro.cargaHoraria.value == '') {
                document.cadastro.mensagem.value = 'Preencha o campo Carga Horaria';
            } else {
                document.cadastro.opcao.value = 'alterar';
                document.cadastro.action = 'CAEFuncionario.jsp';
                document.cadastro.submit();
            }
        } else if (par == 'excluir') {
            document.cadastro.opcao.value = 'excluir';
            document.cadastro.action = 'CAEFuncionario.jsp';
            document.cadastro.submit();
        }
    }
</script>

<%
    String codFuncionario = request.getParameter("codFuncionario");
    if (codFuncionario == null) {
        codFuncionario = "0";
    }

    String mensagem = request.getParameter("mensagem");
    String nomeFuncionario = request.getParameter("nomeFuncionario");
    String enderecoFuncionario = request.getParameter("enderecoFuncionario");
    String cpfFuncionario = request.getParameter("cpfFuncionario");
    String rgFuncionario = request.getParameter("rgFuncionario");
    String telefoneFuncionario = request.getParameter("telefoneFuncionario");
    String salario = request.getParameter("salario");
    String cargaHoraria = request.getParameter("cargaHoraria");
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
        <h1>Cadastro Funcionario</h1>
        <form name="cadastro" >
            <p><label>Nome: </label><input type="text" name="nomeFuncionario" value="<%= (nomeFuncionario == null) ? "" : nomeFuncionario%>" size="30" /> 
            </p>
            <p><label>Endereço: </label><input type="text" name="enderecoFuncionario" value="<%= (enderecoFuncionario == null) ? "" : enderecoFuncionario%>" size="30" /> 
            </p>
            <p><label>CPF: </label><input type="text" name="cpfFuncionario" value="<%= (cpfFuncionario == null) ? "" : cpfFuncionario%>" size="30" /> 
            </p>
            <p><label>RG: </label><input type="text" name="rgFuncionario" value="<%= (rgFuncionario == null) ? "" : rgFuncionario%>" size="30" /> 
            </p>
            <p><label>Telefone: </label><input type="text" name="telefoneFuncionario" value="<%= (telefoneFuncionario == null) ? "" : telefoneFuncionario%>" size="30" /> 
            </p>
            <p><label>Salário: </label><input type="text" name="salario" value="<%= (salario == null) ? "" : salario%>" size="30" /> 
            </p>
            <p><label>Carga Horária: </label><input type="text" name="cargaHoraria" value="<%= (cargaHoraria == null) ? "" : cargaHoraria%>" size="30" /> 
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
<input type="hidden" name="codFuncionario" value="<%=codFuncionario%>" />
<input type="hidden" name="opcao" value="<%=opcao%>" />
<br></br>
<textarea name="mensagem" rows="2" cols="100">
    <%= (mensagem == null) ? "" : mensagem%>
</textarea>
</form>
<br>
<%@include file="ListarFuncionario.jsp"%>
</body>
</html>
