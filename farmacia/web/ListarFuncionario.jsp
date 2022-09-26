
<%@page import="modelo.DAOFuncionario"%>
<%@page import="modelo.Funcionario"%>
<%@page import="java.util.List"%>

<%
    DAOFuncionario daoFuncionario = new DAOFuncionario();
    List<Funcionario> listaFuncionario = daoFuncionario.listarFuncionario();
%>

<table border ="l">
    <thead>
        <tr>
            <th>CÓDIGO</th>
            <th>NOME</th>
            <th>ENDEREÇO</th>
            <th>CPF</th>
            <th>RG</th>
            <th>TELEFONE</th>
            <th>SALÁRIO</th>
            <th>CARGA HORÁRIA</th>
            <th>ALTERAR</th>
            <th>EXCLUIR</th>
        </tr>
    </thead>
    <tbody>
        <% for (Funcionario funcionario : listaFuncionario) {%>
        <tr>
            <td><%= funcionario.getCodFuncionario()%></td>
            <td><%= funcionario.getNomeFuncionario()%></td>
            <td><%= funcionario.getEnderecoFuncionario()%></td>
            <td><%= funcionario.getCpfFuncionario()%></td>
            <td><%= funcionario.getRgFuncionario()%></td>
            <td><%= funcionario.getTelefoneFuncionario()%></td>
            <td><%= funcionario.getSalario()%></td>
            <td><%= funcionario.getCargaHoraria()%></td>
            <td> 
                <a href="CadastroFuncionario.jsp?opcao=alterar&codFuncionario=<%= funcionario.getCodFuncionario()%>&nomeFuncionario=<%= funcionario.getNomeFuncionario()%>&enderecoFuncionario=<%= funcionario.getEnderecoFuncionario()%>&cpfFuncionario=<%= funcionario.getCpfFuncionario()%>&rgFuncionario=<%= funcionario.getRgFuncionario()%>&telefoneFuncionario=<%= funcionario.getTelefoneFuncionario()%>&salario=<%= funcionario.getSalario()%>&cargaHoraria=<%= funcionario.getCargaHoraria()%>">alterar</a> 
            </td> 
            <td> 
                <a href="CadastroFuncionario.jsp?opcao=excluir&codFuncionario=<%= funcionario.getCodFuncionario()%>&nomeFuncionario=<%= funcionario.getNomeFuncionario()%>&enderecoFuncionario=<%= funcionario.getEnderecoFuncionario()%>&cpfFuncionario=<%= funcionario.getCpfFuncionario()%>&rgFuncionario=<%= funcionario.getRgFuncionario()%>&telefoneFuncionario=<%= funcionario.getTelefoneFuncionario()%>&salario=<%= funcionario.getSalario()%>&cargaHoraria=<%= funcionario.getCargaHoraria()%>">excluir</a>
            </td
        </tr>
        <%}%>
    </tbody>
</table>     
