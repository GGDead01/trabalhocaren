<%-- 
    Document   : ListarCliente
    Created on : 23/08/2022, 09:19:10
    Author     : 16612624655
--%>

<%@page import="modelo.DAOCliente"%>
<%@page import="modelo.ConverteData"%>
<%@page import="modelo.Cliente"%>
<%@page import="java.util.List"%>

<%
    DAOCliente daoCliente = new DAOCliente();
    List<Cliente> ListaCliente = daoCliente.listarCliente();
    ConverteData converte = new ConverteData();
%>

<table border ="l">
    <thead>
        <tr>
            <th>CÓDIGO</th>
            <th>NOME</th>
            <th>ENDEREÇO</th>
            <th>CPF</th>
            <th>RG</th>
            <th>NASCIMENTO</th>
            <th>TELEFONE</th>
            <th>ALTERAR</th>
            <th>EXCLUIR</th>
        </tr>
    </thead>
    <tbody>
        <% for (Cliente cliente : ListaCliente) {%>
        <tr> 
            <td> <%= cliente.getCodCliente()%></td>
            <td> <%= cliente.getNomeCliente()%></td>
            <td> <%=cliente.getEnderecoCliente()%></td>
            <td> <%=cliente.getCpfCliente()%></td>
            <td> <%=cliente.getRgCliente()%></td>
            <td> <%= converte.converteTela(cliente.getDataNascimento())%></td>
            <td> <%=cliente.getTelefoneCliente()%></td>
            <td> 
                <a href="CadastroCliente.jsp?opcao=alterar&codCliente=<%= cliente.getCodCliente()%>&nomeCliente=<%= cliente.getNomeCliente()%>&enderecoCliente=<%= cliente.getEnderecoCliente()%>&cpfCliente=<%= cliente.getCpfCliente()%>&rgCliente=<%= cliente.getRgCliente()%>&dataNascimento=<%= converte.converteTela(cliente.getDataNascimento())%>&telefoneCliente=<%= cliente.getTelefoneCliente()%>">alterar</a>
            </td>
            <td>
                <a href="CadastroCliente.jsp?opcao=excluir&codCliente=<%= cliente.getCodCliente()%>&nomeCliente=<%= cliente.getNomeCliente()%>&enderecoCliente=<%= cliente.getEnderecoCliente()%>&cpfCliente=<%= cliente.getCpfCliente()%>&rgCliente=<%= cliente.getRgCliente()%>&dataNascimento=<%= converte.converteTela(cliente.getDataNascimento())%>&telefoneCliente=<%= cliente.getTelefoneCliente()%>">excluir</a>
            </td
        </tr>
        <%}%>
    </tbody>
</table>     

