package utils;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * Wrapper around in-progress torrent data files.
 */
public class DataFile {
    public static final String MODE = "rw";
    private final RandomAccessFile file;

    //    public static void main(String[] args) {
    //        try {
    //            RandomAccessFile file = new RandomAccessFile("testfile", "rw");
    //            file.setLength(1000);
    //            file.seek(5);
    //            String s = "hello world!";
    //            file.write(s.getBytes(), 0, s.length());
    //        } catch (FileNotFoundException e) {
    //            e.printStackTrace();
    //        } catch (IOException e) {
    //            e.printStackTrace();
    //        }
    //    }

    public DataFile(String filename, long length) throws IOException {
        file = new RandomAccessFile(filename, MODE);
        file.setLength(length);
    }

    public void writeAt(byte[] data, long pos) throws IOException {
        file.seek(pos);
        file.write(data);
    }

    public void close() throws IOException {
        file.close();
    }
}