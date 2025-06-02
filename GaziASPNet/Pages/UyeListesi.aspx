<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="UyeListesi.aspx.cs" Inherits="GaziASPNet.UyeListesi" %>

<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title>Üye Listesi</title>
    <link href="../css/style.css" rel="stylesheet" />
</head>
<body>
    <form id="form1" runat="server">
        <div style="text-align:center;">
            <h2>Üye Listesi</h2>
            <hr />
            <asp:Repeater ID="rp" runat="server">
                <HeaderTemplate>
                    <table border="1" cellpadding="5" cellspacing="0" style="margin:auto;">
                        <tr style="background-color: #007bff; color: white;">
                            <th>Ad Soyad</th>
                            <th>Telefon</th>
                            <th>Açıklama</th>
                            <th>Email</th>
                            <th>İşlem</th>
                        </tr>
                </HeaderTemplate>
                <ItemTemplate>
                        <tr>
                            <td><%# Eval("Ad") %> <%# Eval("Soyad") %></td>
                            <td><%# Eval("Telefon") %></td>
                            <td><%# Eval("Aciklama") %></td>
                            <td><%# Eval("Email") %></td>
                            <td>
                                <a href='duzenle.aspx?id=<%# Eval("ID") %>'>Düzenle</a> |
                                <a href='sil.aspx?id=<%# Eval("ID") %>' onclick="return confirm('Silmek istediğine emin misin?');">Sil</a>
                            </td>
                        </tr>
                </ItemTemplate>
                <FooterTemplate>
                    </table>
                </FooterTemplate>
            </asp:Repeater>
        </div>
    </form>
</body>
</html>
