package videoclub;

/**
 *  @author Ahmad El-Ariss 1008651s
 * @author Jean Emmanuel Charles 1065027
 * @author CHAHID NEZHA p1060244
 * @version 1.0
 * @since 31 Mars 2014
 */
import java.io.*;

public class LectureEcriture {

	/**
	 * 
	 * @param nomfichier
	 * @param nom
	 * @throws Exception
	 */
	public static void Recherche1(String nomfichier, String nom)
			throws Exception {

		// Create a new instance of a LineNumberReader object
		// that is reading from a FileReader object.
		File myFile = new File(nomfichier);
		FileReader fileReader = new FileReader(myFile);
		LineNumberReader reader = new LineNumberReader(fileReader);

		// Read from the FileReader.
		String lineRead = "";
		int i = 0;
		while ((lineRead = reader.readLine()) != null) {
			if (lineRead.contains(nom)) {
				//System.out.println("LIGNE : " + i + " " + lineRead);
				i++;
			}

		}

		// Determine the number of lines that were read.
		///System.out.println("Total lignes lus: " + reader.getLineNumber());

		// Close the LineNumberReader and FileReader.
		fileReader.close();
		reader.close();
	}

	/**
	 * 
	 * @param nomfichier
	 * @param nom
	 * @throws Exception
	 */
	public static void Recherche(String nomfichier, String nom)
			throws Exception {

		// Create a new instance of a LineNumberReader object
		// that is reading from a FileReader object.
		File myFile = new File(nomfichier);
		FileReader fileReader = new FileReader(myFile);
		LineNumberReader reader = new LineNumberReader(fileReader);

		// Read from the FileReader.
		String lineRead = "";
		int i = 0;
		while ((lineRead = reader.readLine()) != null) {
			if (lineRead.contains(nom)) {
				//System.out.println("LIGNE : " + i + " " + lineRead);
				;
			}

			i++;
		}

		// Determine the number of lines that were read.
		// System.out.println("Total lignes lus: " +
		// reader.getLineNumber());

		// Close the LineNumberReader and FileReader.
		fileReader.close();
		reader.close();
	}

	/**
	 * 
	 * @param derniernum
	 * @param fichier1
	 * @throws Exception
	 */
	public static void lect1(String derniernum, String fichier1)
			throws Exception {
		String destination = fichier1;
		new File(destination);

		try {
			BufferedWriter fichier = new BufferedWriter(new FileWriter(
					destination, false));
			// fichier.newLine();
			fichier.write(derniernum);
			fichier.newLine();

			fichier.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 
	 * @param NomdeFichier
	 * @return
	 * @throws IOException
	 */
	@SuppressWarnings("resource")
	public static int Getderniernum(String NomdeFichier) throws IOException {

		BufferedReader r = new BufferedReader(new FileReader(NomdeFichier));
		String val = r.readLine();
		int numberToRetrieve = Integer.valueOf(val);

		return (numberToRetrieve);

	}

	/**
	 * 
	 * @param nomfichier
	 * @throws Exception
	 */
	public static void Getline(String nomfichier) throws Exception {

		// Create a new instance of a LineNumberReader object
		// that is reading from a FileReader object.
		File myFile = new File(nomfichier);
		FileReader fileReader = new FileReader(myFile);
		LineNumberReader reader = new LineNumberReader(fileReader);

		// Read from the FileReader.
		String lineRead = "";
		int i = 0;
		while ((lineRead = reader.readLine()) != null) {
			//System.out.println("LIGNE : " + i + " " + lineRead);
			i++;
		}

		// Determine the number of lines that were read.
		//System.out.println("Total lines read: " + reader.getLineNumber());

		// Close the LineNumberReader and FileReader.
		fileReader.close();
		reader.close();
	}

	/**
	 * 
	 * @param fileName
	 * @param lineNumber
	 * @return
	 */
	public static boolean deleteLine(String fileName, int lineNumber) {
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(
					new FileInputStream(fileName)));

			StringBuffer sb = new StringBuffer();
			String line;
			int nbLinesRead = 0;
			while ((line = reader.readLine()) != null) {
				if (nbLinesRead != lineNumber) {

					sb.append(line + "  \n");
				}
				nbLinesRead++;
			}
			reader.close();

			BufferedWriter out = new BufferedWriter(new FileWriter(fileName));

			out.write(sb.toString());

			out.close();

		} catch (Exception e) {
			return false;
		}
		return true;
	}

	/**
	 * 
	 * @param fileName
	 * @param oldPattern
	 * @param replPattern
	 * @param lineNumber
	 * @return
	 */
	public static boolean readReplace(String fileName, String oldPattern,
			String replPattern, int lineNumber) {
		String line;
		StringBuffer sb = new StringBuffer();
		int nbLinesRead = 0;
		try {
			FileInputStream fis = new FileInputStream(fileName);
			BufferedReader reader = new BufferedReader(new InputStreamReader(
					fis));
			while ((line = reader.readLine()) != null) {
				nbLinesRead++;
				line = line.toLowerCase();

				if (nbLinesRead == lineNumber) {
					line = line.replaceFirst(oldPattern.toLowerCase(),
							replPattern);
				}
				sb.append(line + "\n");
			}
			reader.close();
			BufferedWriter out = new BufferedWriter(new FileWriter(fileName));
			out.write(sb.toString());
			out.close();

		} catch (Exception e) {
			return false;
		}
		return true;
	}

	/**
	 * 
	 */
	public static void lect0() {
		String destination = "database.txt";
		File file = new File(destination);
		FileReader fr;
		try {

			String str = "";

			fr = new FileReader(file);

			int i = 0;
			// Lecture des données
			while ((i = fr.read()) != -1)
				str += (char) i;
			// Affichage
			//System.out.println(str);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 
	 * @param NomdeFichier
	 * @param fichier1
	 * @throws Exception
	 */
	public static void lect(String NomdeFichier, String fichier1)
			throws Exception {
		String destination = fichier1;
		new File(destination);

		try {
			BufferedWriter fichier = new BufferedWriter(new FileWriter(
					destination, true));
			// fichier.newLine();
			fichier.write(NomdeFichier);
			fichier.newLine();

			fichier.close();

			LectureEcriture.Getline(fichier1);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
