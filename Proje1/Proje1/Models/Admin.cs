using System.ComponentModel.DataAnnotations;
using System.ComponentModel.DataAnnotations.Schema;

namespace Proje1.Models
{
    public class Admin
    {
        [Key]
        public int ID { get; set; }

        [Column(TypeName = "VARCHAR(50)")]
        [StringLength(50)]
        public string KullaniciAdi { get; set; }

        [Column(TypeName = "VARCHAR(50)")]
        [StringLength(50)]
        public string Sifre { get; set; }
    }
}
