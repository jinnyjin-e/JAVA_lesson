class DogTest{
	public static void main(String [] args){
		//悪焼走 持失
		Dog happy = new Dog();
		Dog sleepy = new Dog();//剰櫛 背杷櫛 陥献蕉陥!<-10爽託 2腰属 繊伊庚薦 2腰!
		//唖唖税 背杷人 十軒杷(?琶球?)澗 紺鯵 馬走幻 五社球拭 税廃 楳疑精 業旭戚背醤廃陥
			
		//happy : 悪焼走 梓端, 昔什渡什
		//適掘什澗 竺域亀戚壱 梓端澗 叔薦稽 幻級嬢遭 依績
		
		//雁尻馬惟亀 happy澗 凧繕痕呪戚陥 ししし;
		//叔薦稽 悪焼走澗 heap拭 煽舌鞠壱 happy澗 爽借葵戚陥.
		//heap照拭 赤澗 happy葵 照拭 full name 去去戚 乞砧 糎仙
		
		sleepy = happy;// 推係惟鞠檎 十軒杷税 爽借葵戚 背杷人 旭焼像 ししし
		//奄糎税 十軒杷 識情 獣 (琵拭)持失鞠醸揮 舛左級精 蟹掻拭 garbage collector亜 社瑚獣鉄ししし
		sleepy = null;
		//戚係惟 背獄軒檎 十軒杷 社瑚吉陥...
		
		
		//悪焼走税 匂幻姶 窒径
	/*	据掘澗 焼掘坦軍 亜管梅走幻 private細食操辞 戚薦 公掌... 益掘辞 購拭 企端号照 旋製
		System.out.println(happy.full);
		
		System.out.println(happy.name);
		
		happy.full = 100; //据掘澗 戚訓縦生稽 匂幻姶 繕舛亜管馬陥!
	*/	
		//益掘辞 及税 適掘什拭 private細食操辞 戚薦 繕舛(呪舛) 災亜管
		//神嫌 吟襖績 戚薦 せ
		//悦汽 呪舛戚 焼艦虞 羨悦 切端亜 災亜管敗;; ばば
		//葵 溌昔亀 肖器 ばば -> dog適掘什拭 gettet 潤捜..
		
		System.out.println(happy.getFull());
		
		happy.setName("背杷");
		System.out.println(happy.getName());

		happy.setName("背蕉だ蕉蕉蕉蕉だだだだだ止222222!!!~~~");
		System.out.println(happy.getName());

		
		if(happy.getFull()<5) happy.eat(0);
		else happy.play();
		
		if(happy.getFull()<5) happy.eat(6);
		else happy.play();
	}
	
	
}
