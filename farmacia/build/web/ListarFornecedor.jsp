<%-- 
    Document   : ListarFornecedor
    Created on : 23/08/2022, 09:19:22
    Author     : 16612624655
--%>

<%@page import="java.util.List"%>
<%@page import="modelo.Fornecedor"%>
<%@page import="modelo.DAOFornecedor"%>
<%
DAOFornecedor daoFornecedor = new DAOFornecedor();
List<Fornecedor> ListaFornecedor = daoFornecedor.listarFornecedor();
    

%>
<table border ="1">
    <thead>
        
    <tr>
        <th> CÓDIGO</th>
        <th>NOME</th>
        <th>CNPJ</th>
        <th>ENDEREÇO</th>
        <th>EMAIL</th>
        <th>TELEFONE</th>
        <th>ALTERAR</th>
        <th>EXCLUIR</th>
     </tr>
    </thead>
    <tbody>
        <% for(Fornecedor fornecedor: ListaFornecedor){ %>
        <tr> 
            <td> <%= fornecedor.getCodFornecedor()%></td>
            <td> <%= fornecedor.getNomeFornecedor()%></td>
            <td> <%= fornecedor.getCnpj()%></td>
            <td> <%= fornecedor.getEndereco()%></td>
            <td> <%= fornecedor.getEmail()%></td>
            <td> <%= fornecedor.getTelefone()%></td>
            <td> 
                <a href="CadastroFornecedor.jsp?opcao=alterar&codFornecedor=<%= fornecedor.getCodFornecedor()%>&nomeFornecedor=<%= fornecedor.getNomeFornecedor()%>&cnpj=<%= fornecedor.getCnpj()%>&endereco=<%= fornecedor.getEndereco()%>&email=<%= fornecedor.getEmail()%>&telefone=<%= fornecedor.getTelefone()%>">alterar</a>
            </td>
            <td> 
                <a href="CadastroFornecedor.jsp?opcao=excluir&codFornecedor=<%= fornecedor.getCodFornecedor()%>&nomeFornecedor=<%= fornecedor.getNomeFornecedor()%>&cnpj=<%= fornecedor.getCnpj()%>&endereco=<%= fornecedor.getEndereco()%>&email=<%= fornecedor.getEmail()%>&telefone=<%= fornecedor.getTelefone()%>">excluir</a>
            </td>
            <td> 
            
        
        <% } %>
        
    </tbody>
    
</table>
    


