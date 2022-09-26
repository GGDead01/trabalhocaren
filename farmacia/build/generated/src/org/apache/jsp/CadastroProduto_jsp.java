package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import modelo.DAOProduto;
import modelo.Produto;
import java.util.List;

public final class CadastroProduto_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/ListarProduto.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=Latin1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<script>\n");
      out.write("    function enviar(par) {\n");
      out.write("        if (par == 'cadastrar') {\n");
      out.write("\n");
      out.write("            if (document.cadastro.nomeProduto.value == '') {\n");
      out.write("                document.cadastro.mensagem.value = 'Preencha o campo Nome';\n");
      out.write("            } else if (document.cadastro.quantidadeProduto.value == '') {\n");
      out.write("                document.cadastro.mensagem.value = 'Preencha o campo Quantidade';\n");
      out.write("            } else if (document.cadastro.codigoBarras.value == '') {\n");
      out.write("                document.cadastro.mensagem.value = 'Preencha o campo Codigo de Barras';\n");
      out.write("            } else if (document.cadastro.valor.value == '') {\n");
      out.write("                document.cadastro.mensagem.value = 'Preencha o campo Valor';\n");
      out.write("            } else {\n");
      out.write("                document.cadastro.opcao.value = 'cadastrar';\n");
      out.write("                document.cadastro.action = 'CAEProduto.jsp';\n");
      out.write("                document.cadastro.submit();\n");
      out.write("            }\n");
      out.write("        } else if (par == 'cancelar') {\n");
      out.write("            document.cadastro.opcao.value = 'cadastrar';\n");
      out.write("            document.cadastro.nomeProduto.value = '';\n");
      out.write("            document.cadastro.quantidadeProduto.value = '';\n");
      out.write("            document.cadastro.codigoBarras.value = '';\n");
      out.write("            document.cadastro.valor.value = '';\n");
      out.write("            document.cadastro.action = 'CadastroProduto.jsp';\n");
      out.write("            document.cadastro.submit();\n");
      out.write("            /// }\n");
      out.write("        } else if (par == 'alterar') {\n");
      out.write("\n");
      out.write("            if (document.cadastro.nomeProduto.value == '') {\n");
      out.write("                document.cadastro.mensagem.value = 'Preencha o campo Nome';\n");
      out.write("            } else if (document.cadastro.quantidadeProduto.value == '') {\n");
      out.write("                document.cadastro.mensagem.value = 'Preencha o campo Quantidade';\n");
      out.write("            } else if (document.cadastro.codigoBarras.value == '') {\n");
      out.write("                document.cadastro.mensagem.value = 'Preencha o campo Codigo de Barras';\n");
      out.write("            } else if (document.cadastro.valor.value == '') {\n");
      out.write("                document.cadastro.mensagem.value = 'Preencha o campo Valor';\n");
      out.write("            } else {\n");
      out.write("                document.cadastro.opcao.value = 'alterar';\n");
      out.write("                document.cadastro.action = 'CAEProduto.jsp';\n");
      out.write("                document.cadastro.submit();\n");
      out.write("            }\n");
      out.write("        } else if (par == 'excluir') {\n");
      out.write("            document.cadastro.opcao.value = 'excluir';\n");
      out.write("            document.cadastro.action = 'CAEProduto.jsp';\n");
      out.write("            document.cadastro.submit();\n");
      out.write("        }\n");
      out.write("    }\n");
      out.write("</script>\n");
      out.write("\n");

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

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=Latin1\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Cadastro Produto</h1>\n");
      out.write("        <form name=\"cadastro\" >\n");
      out.write("            <p><label>Nome: </label><input type=\"text\" name=\"nomeProduto\" value=\"");
      out.print( (nomeProduto == null) ? "" : nomeProduto);
      out.write("\" size=\"30\" /> \n");
      out.write("            </p>\n");
      out.write("            <p><label>Quantidade: </label><input type=\"text\" name=\"quantidadeProduto\" value=\"");
      out.print( (quantidadeProduto == null) ? "" : quantidadeProduto);
      out.write("\" size=\"30\" /> \n");
      out.write("            </p>\n");
      out.write("            <p><label>Código de Barras: </label><input type=\"text\" name=\"codigoBarras\" value=\"");
      out.print( (codigoBarras == null) ? "" : codigoBarras);
      out.write("\" size=\"30\" /> \n");
      out.write("            </p>\n");
      out.write("            <p><label>Valor: </label><input type=\"text\" name=\"valor\" value=\"");
      out.print( (valor == null) ? "" : valor);
      out.write("\" size=\"30\" /> \n");
      out.write("            </p>\n");
      out.write("            \n");
if (opcao.equals("cadastrar")) {
      out.write("\n");
      out.write("<input type=\"button\" value=\"Cadastrar\" name=\"Cadastrar\" onclick=\"enviar('cadastrar')\" />\n");
}
      out.write('\n');
if (opcao.equals("alterar")) {
      out.write("\n");
      out.write("<input type=\"button\" value=\"Alterar\" name=\"Alterar\" onclick=\"enviar('alterar')\" />\n");
      out.write("<input type=\"button\" value=\"Cancelar\" name=\"Cancelar\" onclick=\"enviar('cancelar')\" />\n");
}
      out.write('\n');
if (opcao.equals("excluir")) {
      out.write("  \n");
      out.write("<input type=\"button\" value=\"Excluir\" name=\"Excluir\" onclick=\"enviar('excluir')\" />\n");
      out.write("<input type=\"button\" value=\"Cancelar\" name=\"Cancelar\" onclick=\"enviar('cancelar')\" />\n");
}
      out.write("\n");
      out.write("<input type=\"hidden\" name=\"codProduto\" value=\"");
      out.print(codProduto);
      out.write("\" />\n");
      out.write("<input type=\"hidden\" name=\"opcao\" value=\"");
      out.print(opcao);
      out.write("\" />\n");
      out.write("<br></br>\n");
      out.write("<textarea name=\"mensagem\" rows=\"2\" cols=\"100\">\n");
      out.write("    ");
      out.print( (mensagem == null) ? "" : mensagem);
      out.write("\n");
      out.write("</textarea>\n");
      out.write("</form>\n");
      out.write("<br>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

    DAOProduto daoProduto = new DAOProduto();
    List<Produto> listaProduto = daoProduto.listarProduto();

      out.write("\n");
      out.write("\n");
      out.write("<table border =\"l\">\n");
      out.write("    <thead>\n");
      out.write("        <tr>\n");
      out.write("            <th>CÓDIGO</th>\n");
      out.write("            <th>PRODUTO</th>\n");
      out.write("            <th>QUANTIDADE</th>\n");
      out.write("            <th>CÓDIGO DE BARRAS</th>\n");
      out.write("            <th>VALOR</th>\n");
      out.write("            <th>ALTERAR</th>\n");
      out.write("            <th>EXCLUIR</th>\n");
      out.write("        </tr>\n");
      out.write("    </thead>\n");
      out.write("    <tbody>\n");
      out.write("        ");
 for (Produto produto : listaProduto) {
      out.write("\n");
      out.write("        <tr>\n");
      out.write("            <td>");
      out.print( produto.getCodProduto());
      out.write("</td>\n");
      out.write("            <td>");
      out.print( produto.getNomeProduto());
      out.write("</td>\n");
      out.write("            <td>");
      out.print( produto.getQuantidadeProduto());
      out.write("</td>\n");
      out.write("            <td>");
      out.print( produto.getCodigoBarras());
      out.write("</td>\n");
      out.write("            <td>");
      out.print( produto.getValor());
      out.write("</td>\n");
      out.write("            <td> \n");
      out.write("                <a href=\"CadastroProduto.jsp?opcao=alterar&codProduto=");
      out.print( produto.getCodProduto());
      out.write("&nomeProduto=");
      out.print( produto.getNomeProduto());
      out.write("&quantidadeProduto=");
      out.print( produto.getQuantidadeProduto());
      out.write("&codigoBarras=");
      out.print( produto.getCodigoBarras());
      out.write("&valor=");
      out.print( produto.getValor());
      out.write("\">alterar</a> \n");
      out.write("            </td> \n");
      out.write("            <td> \n");
      out.write("                <a href=\"CadastroProduto.jsp?opcao=excluir&codProduto=");
      out.print( produto.getCodProduto());
      out.write("&nomeProduto=");
      out.print( produto.getNomeProduto());
      out.write("&quantidadeProduto=");
      out.print( produto.getQuantidadeProduto());
      out.write("&codigoBarras=");
      out.print( produto.getCodigoBarras());
      out.write("&valor=");
      out.print( produto.getValor());
      out.write("\">excluir</a>\n");
      out.write("            </td\n");
      out.write("        </tr>\n");
      out.write("        ");
}
      out.write("\n");
      out.write("    </tbody>\n");
      out.write("</table>     \n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
