package basfuncion;

import java.util.*;

public class Functions {
	
	final static String[] teams = {"FC Barcelona","Real Madrid","Sevilla FC","Espanyol","Betis","Osasuna","Zaragoza","Rayo Vallecano","Nastic TGN","SPerez FC"};
	final static double[] quTeams = {1.75,1.75,1.6,1.2,1.1,1.1,0.9,0.7,0.6,0.5};
	
	public static void main(String[] args){
	String[][] matches = new String[5][2];
	int[] positions = {0,1,2,3,4,5,6,7,8,9};
		

		for (int t=0;t<matches.length;t++){
			for (int x=0;x<matches[t].length;x++){
				int var = 0;
				do{
					var = (int) Math.floor(Math.random()*10);
					if (!(positions[var]==10)){
						matches[t][x]=teams[var];
						positions[var]=10;
					}
					}while(matches[t][x]==null);
		
			}
		}
	
			
			
		for (int l=0;l<matches.length;l++){
			for (int n=0;n<matches[l].length;n++){
				System.out.println(matches[l][n]);
			}
		}
			
	
}
	
	public static boolean comprobacion(){
		
		return false;
	}
}

//public void 
