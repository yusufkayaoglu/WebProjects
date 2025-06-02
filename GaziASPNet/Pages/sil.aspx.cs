using System;
using System.Data.SqlClient;

namespace GaziASPNet
{
    public partial class sil : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {
            if (!IsPostBack && Request.QueryString["id"] != null)
            {
                int id = Convert.ToInt32(Request.QueryString["id"]);

                SqlConnection baglanti = new SqlConnection(
                    System.Web.Configuration.WebConfigurationManager.ConnectionStrings["con"].ConnectionString);

                SqlCommand komut = new SqlCommand("DELETE FROM Uyeler WHERE ID = @id", baglanti);
                komut.Parameters.AddWithValue("@id", id);

                try
                {
                    baglanti.Open();
                    komut.ExecuteNonQuery();
                    baglanti.Close();

                    Response.Redirect("UyeListesi.aspx");
                }
                catch (Exception ex)
                {
                    Response.Write("<script>alert('HATA: " + ex.Message + "');</script>");
                }
            }
        }
    }
}
