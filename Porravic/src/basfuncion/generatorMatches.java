package basfuncion;

public class generatorMatches {
	final static double localidad=1.3;
	final static double visitante=0.75;
	
	public static void matchesGenerator(String[][]matches, int[][] results,String[] teams, double[] quTeams){
		int[] positions = {0,1,2,3,4,5,6,7,8,9};

		for (int t=0;t<matches.length;t++){
			for (int x=0;x<matches[t].length;x++){
				int var = 0;
				do{
					var = (int) Math.floor(Math.random()*10);
					if (!(positions[var]==10)){
						matches[t][x]=teams[var];
						resultGenerator(results,var,quTeams);
						positions[var]=10;
					}
					}while(matches[t][x]==null);
		
			}
		}
		//return matches;
	}
	//////////////////////////Funci�n para generar resultado
	public static void resultGenerator(int [][] results, int var,  double[] quTeams){
		for (int n=0;n<results.length;n++){
			for (int m=0;m<results[n].length;m++){
				if (m==0){
					results[n][m]=gen(quTeams[var],localidad);
				}else{
					results[n][m]=gen(quTeams[var],visitante);
				}
			}
		}
		//return results;
	}
	////////////////////////Funcion para generar goles
	public static int gen (double quTeams, double localidad){
		double a = Math.random()*0.9;
		double b = Math.round(a*(quTeams*1.9)*localidad);
		return (int) b;
	}

}
