using Microsoft.AspNetCore.Mvc;
using Proje1.Models;
using System.Linq;
namespace Proje1.Controllers
{
    public class DepartController : Controller
    {
        Context c = new Context();
        public IActionResult Index()
        {
            return View();
        }

        public IActionResult PageDepartman()
        {
            var DepartList = c._GorevDepartmans.ToList();
            return View(DepartList);
        }

        [HttpGet]
        public IActionResult YeniDepartman()
        {
            return View();
        }

        [HttpPost]
        public IActionResult YeniDepartman(departmanlar d)
        {
            c._GorevDepartmans.Add(d);  // DbSet'e ekle
            c.SaveChanges();            // Veritabanına kaydet
            return RedirectToAction("PageDepartman");  // Liste sayfasına geri dön
        }

        public IActionResult SilDepartman(int ID)
        {
            var d = c._GorevDepartmans.Find(ID);     // ID'ye göre departmanı bul
            c._GorevDepartmans.Remove(d);            // Veritabanından sil
            c.SaveChanges();                         // Değişiklikleri kaydet
            return RedirectToAction("PageDepartman"); // Liste sayfasına yönlendir
        }

        public IActionResult GuncelleDepartman(int ID)
        {
            return View();
        }

        public IActionResult DepartmanGuncelle(departmanlar d)
        {
            var dep = c._GorevDepartmans.Find(d.ID);     // Eski veriyi ID'ye göre bul
            dep.DepartmanAd = d.DepartmanAd;             // Yeni ad ile güncelle
            dep.Detay = d.Detay;                         // Yeni detay ile güncelle
            c.SaveChanges();                             // Değişiklikleri veritabanına kaydet
            return RedirectToAction("PageDepartman");    // Liste sayfasına yönlendir
        }


    }
}
