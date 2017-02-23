package saladovic;

import basfuncion.generatorMatches;

public class Main {
	final static String[] teams = {"FC Barcelona","Real Madrid","Sevilla FC","Espanyol","Betis","Osasuna","Zaragoza","Rayo Vallecano","Nastic TGN","SPerez FC"};
	final static double[] quTeams = {1.75,1.75,1.6,1.2,1.1,1.1,0.9,0.7,0.6,0.5};

	public static void main(String[] args) {
		String[][] matches = new String[5][2];
		int[][] results = new int[5][2];
		
		
		//Llamamos la funcion para coger los nombres de los usuarios
		String[]participantes=User.user();
		
		//Llamamos funcion para generar partidos
		
		generatorMatches.matchesGenerator(matches, results, teams, quTeams);
		/*Funcion que enseña los partidos y resultados
		for (int i=0;i<matches.length;i++){
			System.out.println(matches[i][0]+" "+results[i][0]+"-"+results[i][1]+" "+matches[i][1]);
		}
		*/
	}

}
