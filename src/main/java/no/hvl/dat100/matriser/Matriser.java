package no.hvl.dat100.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {
		
		for(int[] rad : matrise) {
            for(int tall : rad){
                System.out.println(tall + " ");
            }
            System.out.println();
        }
		throw new UnsupportedOperationException("Metoden skrivUt ikke implementert");
	}

	// b)
	public static String tilStreng(int[][] matrise) {

        // TODO

		throw new UnsupportedOperationException("Metoden tilStreng ikke implementert");
		
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {

        int[][] ny = new int[matrise.length][matrise[0].length];
        for(int i = 0; i < matrise.length; i++) {
            for(int j = 0; j < matrise[i].length; j++) {
                ny[i][j] = matrise[i][j] * tall;
            }
            return ny;
        }
		throw new UnsupportedOperationException("Metoden skaler ikke implementert");
	
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {

		// TODO
		throw new UnsupportedOperationException("Metoden erLik ikke implementert");
		
	}
	
	// e)
	public static int[][] speile(int[][] matrise) {

		// TODO

		throw new UnsupportedOperationException("Metoden speile ikke implementert");
	
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		// TODO
		throw new UnsupportedOperationException("Metoden multipliser ikke implementert");
	
	}
}
