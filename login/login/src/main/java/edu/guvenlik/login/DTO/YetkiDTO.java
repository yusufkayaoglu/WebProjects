package edu.guvenlik.login.DTO;

public class YetkiDTO {
    private Long num;
    private String yetkiAdi;

    public YetkiDTO() {}


    public YetkiDTO(Long num, String yetkiAdi) {
        this.num = num;
        this.yetkiAdi = yetkiAdi;
    }

    public Long getNum() {
        return num;
    }

    public void setNum(Long num) {
        this.num = num;
    }

    public String getYetkiAdi() {
        return yetkiAdi;
    }

    public void setYetkiAdi(String yetkiAdi) {
        this.yetkiAdi = yetkiAdi;
    }
}
