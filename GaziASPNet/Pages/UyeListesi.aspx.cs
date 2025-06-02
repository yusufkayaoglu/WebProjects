using System;
using System.Data;
using System.Data.SqlClient;

namespace GaziASPNet
{
    public partial class UyeListesi : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {
            if (!IsPostBack)
            {
                SqlConnection baglanti = new SqlConnection(
                    System.Web.Configuration.WebConfigurationManager.ConnectionStrings["con"].ConnectionString);

                SqlDataAdapter da = new SqlDataAdapter("SELECT * FROM Uyeler", baglanti);
                DataTable tablo = new DataTable();
                da.Fill(tablo);

                rp.DataSource = tablo;
                rp.DataBind();
            }
        }
    }
}
