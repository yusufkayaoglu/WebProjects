<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="duzenle.aspx.cs" Inherits="GaziASPNet.duzenle" %>

<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title>Üyelik Düzenleme</title>
    <link href="../css/style.css" rel="stylesheet" />
</head>
<body>
    <form id="form1" runat="server">
        <div>
            <h2 style="text-align:center;">Üye Düzenleme</h2>
            <table id="tbl">
                <tr><td>Ad:</td>
                    <td><asp:TextBox ID="txtAd" runat="server" CssClass="textBox"></asp:TextBox></td></tr>

                <tr><td>Soyad:</td>
                    <td><asp:TextBox ID="txtSoyad" runat="server" CssClass="textBox"></asp:TextBox></td></tr>

                <tr><td>Email:</td>
                    <td>
                        <asp:TextBox ID="txtEmail" runat="server" CssClass="textBox" ReadOnly="true" Enabled="false"></asp:TextBox>
                    </td></tr>

                <tr><td>Telefon:</td>
                    <td><asp:TextBox ID="txtCepTel" runat="server" CssClass="textBox"></asp:TextBox></td></tr>

                <tr><td>Açıklama:</td>
                    <td><asp:TextBox ID="txtAciklama" runat="server" CssClass="textBox" TextMode="MultiLine" Height="60px"></asp:TextBox></td></tr>

                <tr><td>Şifre:</td>
                    <td><asp:TextBox ID="txtSifre" runat="server" CssClass="textBox" TextMode="Password"></asp:TextBox></td></tr>

                <tr><td colspan="2" style="text-align:center;">
                    <asp:Button ID="btnGuncelle" runat="server" Text="Güncelle" OnClick="btnGuncelle_Click" />
                </td></tr>
            </table>
        </div>
    </form>
</body>
</html>
