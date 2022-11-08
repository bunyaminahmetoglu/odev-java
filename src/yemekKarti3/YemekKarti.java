package yemekKarti3;

public class YemekKarti {
	private int kullaniciNumarasi;
	private int sifre;
	private int bakiye;
	
	public YemekKarti(int kullaniciNumarasi, int sifre, int bakiye) {
		this.kullaniciNumarasi = kullaniciNumarasi;
		this.sifre = sifre;
		this.bakiye = bakiye;
	}

	void yemekAl(int yemek) {
		
		if(yemek == 1) {
			this.bakiye -= 4;
		}else if(yemek == 2) {
			this.bakiye -= 14;
		}else if(yemek == 3) {
			this.bakiye -= 2;
		}else if(yemek == 4) {
			this.bakiye -= 9;
		}else if(yemek == 5) {
			this.bakiye -= 22;
		}
	}
	
	int getUser() {
		return this.kullaniciNumarasi;
	}
	
	int getBakiye() {
		return this.bakiye;
	}
	
	void setMoney(int money) {
		this.bakiye += money;
	}
}

