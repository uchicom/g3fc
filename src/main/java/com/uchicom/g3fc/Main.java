// (c) 2017 uchicom
package com.uchicom.g3fc;

import java.io.File;

/**
 * @author uchicom: Shigeki Uchiyama
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		File file = new File("g3fc.txt");
		byte input = '3';
		if (args.length >= 1) {
			file = new File(args[0]);
			if (args.length == 2) {
				input = args[1].getBytes()[0];
			}
		}
		GreatFileCreator gfc = new GreatFileCreator(file, input);
		gfc.execute();

	}

}
