public class verkefni5{
	
	//N og M eru viðfangsbreytur, þar sem N er fjöldi lesna talna
	//og M er fjöldi talna valin af handahófi af þessum N tölum
	static int N;
	static int M;
	
	//Notkun: lesaTolur();
	//Fyrir: ekkert
	//Eftir: Lesið hefur verið inn N tolur úr staðalinntakinu og settar í fylkið
	//		lesnarTolur. Fallið skilar fylkinu lesnarTolur.
	public static int[] lesaTolur(){
		int[] lesnarTolur = new int[N];
		int i=0;
		while(!StdIn.isEmpty() && i<lesnarTolur.length){
			lesnarTolur[i]=StdIn.readInt();
			i++;
		}
		return lesnarTolur;
	}
	
	//Notkun: randomTolur(y)breytingar ggggg
	public static int[] randomTolur(int[] lesnarTolur){
		
					
		int[] randomTolur = new int[M];
		int[] adur = new int[M];
		
		for(int i=0;i<adur.length;i++){
			adur[i]=-1;
		}
		
		for(int i=0;i!=M;i++){
			//gildi frá 0-1
			double random1 = Math.random();
			//gildi frá 0-lengdRunnunar-1
			random1 = random1*N;
			//gildi frá 0-lengdRunnunar
			int b = (int)random1+1;
						
			int j=0;
			while(j<adur.length){
				if(b==adur[j]){
					random1 = Math.random();
					j=0;
				}
				else {j++;}
			}
			
			adur[i]=b;					
			randomTolur[i] = lesnarTolur[b];
			random1 = Math.random();
		}
		
		return randomTolur;	
	}
	
	//Notkun: prentaFylki(y);
	//Fyrir: y er fylki heila talna
	//Eftir: öll gildin í fylkinu y hafa verið prentuð á skjá, þar sem hvert gildi
	//		fær nýja línu
	public static void prentaFylki(int[] gefidFylki){
		
		for(int i=0;i<gefidFylki.length;i++){
			System.out.println(gefidFylki[i]);
		}
	}
			
	public static void main(String[]args){
		N = Integer.parseInt(args[0]);
		M = Integer.parseInt(args[1]);
		
		int[] x = new int[N];
		int[] y = new int[M];
		x = lesaTolur();
		y = randomTolur(x);
		prentaFylki(y);
	}
}