<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="index.aspx.cs" Inherits="GaziASPNet.index" UnobtrusiveValidationMode="None" %>

<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title>Web Programlama</title>
    <link href="css/style.css" rel="stylesheet" />
    <script src="js/js.js"></script>
</head>
<body onload="Mg()">
    <form id="form1" runat="server">
        <div>
            <b>Hoş Geldiniz :)</b>
            <br /><br /><br />

            <table id="tbl">
                <tr>
                    <td colspan="2" style="text-align: center">Üyelik Formu</td>
                </tr>

                <tr>
                    <td>Ad: </td>
                    <td>
                        <asp:TextBox ID="txtAd" runat="server" CssClass="textBox"></asp:TextBox>
                        <asp:RequiredFieldValidator ID="rfvAd" runat="server" ControlToValidate="txtAd"
                            ErrorMessage="Ad boş olamaz" ForeColor="Red" Display="Dynamic" />
                    </td>
                </tr>

                <tr>
                    <td>Soyad: </td>
                    <td>
                        <asp:TextBox ID="txtSoyad" runat="server" CssClass="textBox"></asp:TextBox>
                        <asp:RequiredFieldValidator ID="rfvSoyad" runat="server" ControlToValidate="txtSoyad"
                            ErrorMessage="Soyad boş olamaz" ForeColor="Red" Display="Dynamic" />
                    </td>
                </tr>

                <tr>
                    <td>Email: </td>
                    <td>
                        <asp:TextBox ID="txtEmail" runat="server" CssClass="textBox"></asp:TextBox>
                        <asp:RequiredFieldValidator ID="rfvEmail" runat="server" ControlToValidate="txtEmail"
                            ErrorMessage="Email boş olamaz" ForeColor="Red" Display="Dynamic" />
                        <asp:RegularExpressionValidator ID="revEmail" runat="server" ControlToValidate="txtEmail"
                            ErrorMessage="Geçerli bir e-posta girin"
                            ValidationExpression="\w+([-+.']\w+)*@\w+([-.]\w+)*\.\w+([-.]\w+)*"
                            ForeColor="Red" Display="Dynamic" />
                    </td>
                </tr>

                <tr>
                    <td>Cep Tel: </td>
                    <td>
                        <asp:TextBox ID="txtCepTel" runat="server" CssClass="textBox"></asp:TextBox>
                    </td>
                </tr>

                <tr>
                    <td>Açıklama: </td>
                    <td>
                        <asp:TextBox ID="txtAciklama" runat="server" TextMode="MultiLine" CssClass="textBox" Height="60px"></asp:TextBox>
                    </td>
                </tr>

                <tr>
                    <td>Şifre: </td>
                    <td>
                        <asp:TextBox ID="txtSifre" runat="server" TextMode="Password" CssClass="textBox"></asp:TextBox>
                        <asp:RequiredFieldValidator ID="rfvSifre" runat="server" ControlToValidate="txtSifre"
                            ErrorMessage="Şifre boş olamaz" ForeColor="Red" Display="Dynamic" />
                    </td>
                </tr>

                <tr>
                    <td>Tekrar Şifre: </td>
                    <td>
                        <asp:TextBox ID="txtSifreTekrar" runat="server" TextMode="Password" CssClass="textBox"></asp:TextBox>
                        <asp:CompareValidator ID="CompareValidator1" runat="server"
                            ControlToCompare="txtSifre"
                            ControlToValidate="txtSifreTekrar"
                            ErrorMessage="Şifreler aynı olmalı"
                            ForeColor="Red" Display="Dynamic" />
                    </td>
                </tr>

                <tr>
                    <td colspan="2" style="text-align: center;">
                        <asp:Button ID="btnKaydet" runat="server" Text="Kaydet" OnClick="btnKaydet_Click" />
                    </td>
                </tr>
            </table>
        </div>
    </form>
</body>
</html>
