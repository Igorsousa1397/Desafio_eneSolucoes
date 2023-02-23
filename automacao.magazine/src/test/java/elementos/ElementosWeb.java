package elementos;

import org.openqa.selenium.By;

public class ElementosWeb {

	//Elementos universais 
	public By cookie = By.xpath("//*[@id=\"__next\"]/div/main/div[1]/div[2]/button");
	public By busque= By.id("input-search");
	public By adicionar = By.cssSelector("#__next > div > main > section:nth-child(7) > div.sc-jrcTuL.kQzMUn > div:nth-child(2) > button");
	public By sacola = By.cssSelector("#__next > div > main > section:nth-child(3) > div.sc-eDvSVe.fldrdv > div > div.sc-hLBbgP.kkqpoF > div > div.sc-hLBbgP.gcxrmT.sc-bCfvAP.dMuOAr.sc-dGJyNR.isGRxK > div.sc-hLBbgP.gcxrmT.sc-bCfvAP.dHhozk > button");
	public By validaCarrinho = By.cssSelector("#root > div > div.App.clearfix > div > div:nth-child(2) > div > div.BasketTable > div.BasketTable-items > div > div.BasketItem-productContainer > div.BasketItemProduct > div > a > p:nth-child(1)");
	
	//Elementos por teste (iamgem)
	public By imagem = By.xpath("//*[@id=\"__next\"]/div/main/section[4]/div[3]/div/ul/li[1]/a/div[2]/img");
	
	//Elementos por teste (descricao)
	public By descricao = By.xpath("//*[@id=\"__next\"]/div/main/section[4]/div[3]/div/ul/li[1]/a/div[3]/h2");
	public By modelo = By.xpath("//*[@id=\"__next\"]/div/main/section[4]/div[2]/div/div[1]/div[2]/div[3]/label");
		
	//Elementos por teste (cep)
	public By cep = By.cssSelector("#__next > div > main > section:nth-child(7) > div.sc-hLBbgP.nhXxM > div.sc-jrcTuL.dHeVLr.sc-bATJPV.kNcLMZ");
	public By digiteCep = By.xpath("//*[@id=\"zipcode\"]");
	public By adicionarcep = By.xpath("//*[@id=\"__next\"]/div/main/section[4]/div[6]/div[2]/button");
	
	//Elementos por teste (seguro)
	public By checkbox = By.name("roubo-e-furto-qualificado-com-quebra-acidental");
	public By seguro = By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/div/div[2]/div[2]/div/div[3]/div[1]/div");
		
	//Elementos por teste (retira)
	public By retirar = By.cssSelector("#__next > div > main > section:nth-child(7) > div.sc-jrcTuL.kQzMUn > button");
	public By identificacao = By.cssSelector("#root > div > div.App.clearfix > div > div.LoginPage-title");
}
