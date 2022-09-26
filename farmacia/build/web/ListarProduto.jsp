
<%@page import="modelo.DAOProduto"%>
<%@page import="modelo.Produto"%>
<%@page import="java.util.List"%>

<%
    DAOProduto daoProduto = new DAOProduto();
    List<Produto> listaProduto = daoProduto.listarProduto();
%>

<table border ="l">
    <thead>
        <tr>
            <th>CÓDIGO</th>
            <th>PRODUTO</th>
            <th>QUANTIDADE</th>
            <th>CÓDIGO DE BARRAS</th>
            <th>VALOR</th>
            <th>ALTERAR</th>
            <th>EXCLUIR</th>
        </tr>
    </thead>
    <tbody>
        <% for (Produto produto : listaProduto) {%>
        <tr>
            <td><%= produto.getCodProduto()%></td>
            <td><%= produto.getNomeProduto()%></td>
            <td><%= produto.getQuantidadeProduto()%></td>
            <td><%= produto.getCodigoBarras()%></td>
            <td><%= produto.getValor()%></td>
            <td> 
                <a href="CadastroProduto.jsp?opcao=alterar&codProduto=<%= produto.getCodProduto()%>&nomeProduto=<%= produto.getNomeProduto()%>&quantidadeProduto=<%= produto.getQuantidadeProduto()%>&codigoBarras=<%= produto.getCodigoBarras()%>&valor=<%= produto.getValor()%>">alterar</a> 
            </td> 
            <td> 
                <a href="CadastroProduto.jsp?opcao=excluir&codProduto=<%= produto.getCodProduto()%>&nomeProduto=<%= produto.getNomeProduto()%>&quantidadeProduto=<%= produto.getQuantidadeProduto()%>&codigoBarras=<%= produto.getCodigoBarras()%>&valor=<%= produto.getValor()%>">excluir</a>
            </td
        </tr>
        <%}%>
    </tbody>
</table>     
