import java.util.Scanner;
//壕伸 : 旭精 切戟莫税 切戟研 食君鯵 煽舌 拝 呪 赤澗 切戟莫
class Arrray{
	public static void main(String [] args){
		Scanner ms= new Scanner(System.in);
	//	int a;		//int税 a拭澗 舛呪 1鯵 煽舌亜管
	//	int a[100] 	//"C拭辞" 100鯵税 int研 煽舌 拝 呪 赤澗 壕伸績
		int [] a = new int[100];
		//int莫税 壕伸, 図楕税 []照拭 収切 いい績
		//'int [] ' 切端亜 馬蟹税 切戟莫 汗界
		
		//叔呪 5鯵研 煽舌 拝 呪 赤澗 壕伸 b
		double [] b = new double[5];
		
		//庚切伸 10鯵研 煽舌 拝 呪 赤澗 壕伸 c;
		String [] c = new String[10];
		
		//叔呪 5鯵研 隔聖 呪 赤澗 因娃聖 走舛馬澗 爽社 5鯵 溌左
		//庚切伸 10鯵研 隔聖 呪 赤澗 因娃聖 走舛馬澗 爽社 10鯵 溌左
		//==> 壕伸精 凧繕切戟莫!
		
		int [] d ={1,3,5,4,2,9};
		//因娃戚 焼艦虞 葵級聖 郊稽 隔聖呪亀 赤製 しししし
		//	d[0]精 葵戚 1 // d[1]精 葵戚 3 // d[5]澗 葵戚 9戚陥
		
		System.out.println("壕伸 a税 据社姐呪 : "+a.length);
		System.out.println("壕伸 a税 据社姐呪 : "+d.length);
		//壕伸誤.length 税 敗呪 紫遂 獣 壕伸税 掩戚 蟹身 -> 剰澗 胤硲 照掌!
		
		/*壕伸 d税 乞窮 据社級 窒径
		for(int i = 0; i<=d.length;i++)
			System.out.printf("%d ",d[i]);
		*/
		
		
	//for-each庚
		/*for((壕伸税)切戟莫 痕呪誤 : 壕伸誤){
			
			 
		}
				税 莫殿研 亜像*/
		
		
		//d税 乞窮 失歳聖 x拭 託景企稽 企脊獣鉄
	/*	for(int x : d){//d=1 3 5 4 2 9
			x*=10;
			System.out.print(x+", ");
		}
		/ 舌舛 : 骨是研 照 旋嬢辞 畷馬陥
		/ 舘繊 : 壕伸 失歳 痕井精 災亜馬陥(x葵 源壱 d亜 痕井鞠澗暗 X)
		/		 for-each 鎧拭辞 x*10 人 旭精 縦生稽 痕井馬檎 x亜 郊餓澗暗
		/		 for each 鉱拭辞澗 d澗 益企稽績 しししし
		*/
		
		for(int i=0;i<d.length;i++){//d=1 3 5 4 2 9
			System.out.print(10*d[i]+", ");
		}
		// 是税 print 窒径衣引拭 ,亜 害焼赤製 : \b研 搭背 薦暗亜管
		System.out.print("\b\b \n");
		
		/* 	\b澗 朕辞研 戚疑 獣徹澗依 \b\b澗 朕辞 図楕生稽 2牒 戚疑
			\b及税 庚切稽 背雁 朕辞 是帖研 気嬢掌
			"\b "稽 妊薄馬檎 背雁 是帖研 " "(朔牒)生稽 気嬢彰陥澗 倶  */
			
		//神硯託授 舛慶
		int tmp; 		
		for(int i=0;i<(d.length-1);i++){
			for(int j=i+1;j<d.length;j++){//j 識情 拝 凶 1採斗亜 焼艦虞 i+1採斗 !!!!!
				if(d[i]>d[j]){				//採去硲研 <稽 背爽檎 鎧顕託授!!!!
					tmp=d[i];
					d[i]=d[j];
					d[j]=tmp;
				}
			}
		}
		for(int i=0;i<d.length;i++){//d=1 2 3 4 5 9 //神硯舛慶 吉 雌殿
			System.out.print(d[i]+", ");
		}
		System.out.print("\b\b \n");
		
	}
}






