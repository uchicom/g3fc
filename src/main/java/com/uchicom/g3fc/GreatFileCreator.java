// (c) 2017 uchicom
package com.uchicom.g3fc;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author uchicom: Shigeki Uchiyama
 *
 */
public class GreatFileCreator {

	private File file;
	private byte input;

	/**
	 * @param file
	 * @param inputChar
	 */
	public GreatFileCreator(File file, byte input) {
		this.file = file;
		this.input = input;
	}

	public void execute() {
		int size = 40 * 1024 * 1024;
		byte[] bytes = new byte[size];
		for (int i = 0; i < size; i++) {
			bytes[i] = input;
		}
		long filesize = 0;
		try (BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(file))) {
			while (true) {
				bos.write(bytes);
				bos.flush();
				filesize += size;
				System.out.println((filesize / 1024 / 1024) + "MB");
			}
		} catch (FileNotFoundException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
	}
}
