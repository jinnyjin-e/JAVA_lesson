/*適掘什
	-蟹 : eat()五社球 ->倍獄暗研 爽檎精 倍獄暗研 股柔艦陥.
	-倍獄暗
	-焼戚什滴顕
	-桜呪
	-沿剛
*/
//雌紗税 舌繊: 五社球 拙失獣 古惟痕呪研 採乞展績生稽 馬檎 切縦適掘什 梓端澗 乞砧 閤聖 呪 赤陥焼たたた
class eatTest{
	public static void main(String [] args){
		I i = new I();
		Hamberger h = new Hamberger();
		Icecream ice =new Icecream();
		桜呪 桜 = new 桜呪();
		
		
		i.eat(h);//窒径獣 倍獄暗研 股澗陥 窒径
		i.eat(ice);
		i.eat(桜);
		i.eat(new 沿剛());//戚係惟 背亀 吉陥~
		i.eat(new Stone());
		
	}
}
class I{
	void eat(Object o){//戚係惟 背亀 吉汗汽 Food 適掘什 馬蟹 幻級嬢辞 eat(Food f) 馬澗惟 蟹聖 依 旭陥壱 馬宿
	// 宜 照 股惟 馬奄 是背辞 Object稽 閤壱 instanceof研 紫遂背層陥.
		if(o instanceof Food) System.out.printf("蟹澗 %s研 股柔艦陥.\n",o.getClass().getName());
		else System.out.printf("宜聖 嬢胸惟 股劃...");
	}
	
	void eat(Food f){//宜 照股惟 馬澗暗研 皐馨 呪 蒸製...ぬ
		System.out.printf("蟹澗 %s研(聖) 股柔艦陥.\n",f.getClass().getName());
		//Food拭辞 getClass研 梅澗汽 Food亜 焼観 Hamberger去戚 窒径吉 依精 疑旋郊昔漁戚 析嬢概奄 凶庚戚陥. しししし
		
	}
}
class Stone{}
class Food{}
	
class Hamberger extends Food {}//I拭 曽紗 吃 琶推 蒸製
class Icecream extends Food {}
class 桜呪 extends Food {}
class 沿剛 extends Food {}
