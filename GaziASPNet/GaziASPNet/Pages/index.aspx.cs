using System;
using System.Web.UI;
using System.Data.SqlClient;
namespace GaziASPNet
{
    public partial class index : Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {

        }

        protected void btnKaydet_Click(object sender, EventArgs e)
        {
            string ad = txtAd.Text;
            string soyad = txtSoyad.Text;
            string email = txtEmail.Text;
            string telefon = txtCepTel.Text;
            string aciklama = txtAciklama.Text;
            string sifre = txtSifre.Text;

            SqlConnection baglanti = new SqlConnection(
                System.Web.Configuration.WebConfigurationManager.ConnectionStrings["con"].ConnectionString);

            SqlCommand komut = new SqlCommand(
                "INSERT INTO Uyeler (Ad, Soyad, Email, Telefon, Aciklama, pass) VALUES (@Ad, @Soyad, @Email, @Telefon, @Aciklama, @Sifre)", baglanti);

            komut.Parameters.AddWithValue("@Ad", ad);
            komut.Parameters.AddWithValue("@Soyad", soyad);
            komut.Parameters.AddWithValue("@Email", email);
            komut.Parameters.AddWithValue("@Telefon", telefon);
            komut.Parameters.AddWithValue("@Aciklama", aciklama);
            komut.Parameters.AddWithValue("@Sifre", sifre);

            try
            {
                baglanti.Open();
                komut.ExecuteNonQuery();
                baglanti.Close();

                // Başarılı mesajı
                Response.Write("<script>alert('Kayıt başarıyla eklendi.');</script>");
            }
            catch (Exception ex)
            {
                Response.Write("<script>alert('HATA: " + ex.Message + "');</script>");
            }
        }
    }
}
