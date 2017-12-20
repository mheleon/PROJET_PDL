package fr.istic.pdl.groupe6.msw;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 * PDL MIAGE 1718, Project #3 (MatrixSynthesizerWikipedia), Group 6
 * 
 * @author HERNANDEZ Maykol, ADDA Raoul, MACKONGO Louise-Agnès, ZOHOUN Nellya,
 *         TCHIDIME Hugues, NGOUALEM Alvine
 * @version 1.0
 * @since 2017-10-31
 * 
 * 
 * 
 */

public class ConfigFile {
	String pageName;
	List<String> listeAComparer = new ArrayList<String>();

	/**
	 * TODO
	 */
	public ConfigFile(String pageName) {
		this.pageName = pageName;
	}

	/**
	 * TODO
	 */
	public String getTitles() {
		System.out.print("Loading configuration file...");
		System.out.println("    File loaded successfully.");
		return this.pageName;
	}
}
