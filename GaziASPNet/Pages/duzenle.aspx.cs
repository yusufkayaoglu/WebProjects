using System;
using System.Data.SqlClient;

namespace GaziASPNet
{
    public partial class duzenle : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {
            if (!IsPostBack && Request.QueryString["id"] != null)
            {
                int id = Convert.ToInt32(Request.QueryString["id"]);

                SqlConnection baglanti = new SqlConnection(
                    System.Web.Configuration.WebConfigurationManager.ConnectionStrings["con"].ConnectionString);

                SqlCommand cmd = new SqlCommand("SELECT * FROM Uyeler WHERE ID = @id", baglanti);
                cmd.Parameters.AddWithValue("@id", id);

                baglanti.Open();
                SqlDataReader oku = cmd.ExecuteReader();

                if (oku.Read())
                {
                    txtAd.Text = oku["Ad"].ToString();
                    txtSoyad.Text = oku["Soyad"].ToString();
                    txtEmail.Text = oku["Email"].ToString();
                    txtCepTel.Text = oku["Telefon"].ToString();
                    txtAciklama.Text = oku["Aciklama"].ToString();
                    txtSifre.Text = oku["pass"].ToString();
                }

                oku.Close();
                baglanti.Close();
            }
        }

        protected void btnGuncelle_Click(object sender, EventArgs e)
        {
            int id = Convert.ToInt32(Request.QueryString["id"]);

            SqlConnection baglanti = new SqlConnection(
                System.Web.Configuration.WebConfigurationManager.ConnectionStrings["con"].ConnectionString);

            SqlCommand cmd = new SqlCommand(
                "UPDATE Uyeler SET Ad=@ad, Soyad=@soyad, Telefon=@tel, Aciklama=@aciklama, pass=@sifre WHERE ID=@id", baglanti);

            cmd.Parameters.AddWithValue("@ad", txtAd.Text);
            cmd.Parameters.AddWithValue("@soyad", txtSoyad.Text);
            cmd.Parameters.AddWithValue("@tel", txtCepTel.Text);
            cmd.Parameters.AddWithValue("@aciklama", txtAciklama.Text);
            cmd.Parameters.AddWithValue("@sifre", txtSifre.Text);
            cmd.Parameters.AddWithValue("@id", id);

            baglanti.Open();
            cmd.ExecuteNonQuery();
            baglanti.Close();

            Response.Redirect("UyeListesi.aspx");
        }
    }
}
