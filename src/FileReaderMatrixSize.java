import java.io.*;

public class FileReaderMatrixSize {
    int m1, m2;
    int[][] array1, array2;
    String[] words;
    String fileInFirst, fileInSecond;

    public int getM1() {
        return m1;
    }

    public int getM2() {
        return m2;
    }

    public int getArray1(int i, int j) {
        return array1[i][j];
    }

    public int getArray2(int i, int j) {
        return array2[i][j];
    }

    public FileReaderMatrixSize(String fileInFirst, String fileInSecond) {
        this.fileInFirst = fileInFirst;
        this.fileInSecond = fileInSecond;
    }

    public void fileReaderFirstFile() {
        int lineCount = 0;
        try {
            File file = new File(fileInFirst);
            //Create Object FileReader for Object File
            FileReader fr = new FileReader(file);
            //создаем BufferedReader с существующего FileReader для построчного считывания
            BufferedReader reader = new BufferedReader(fr);
            // считаем сначала первую строку
            String line = reader.readLine();
            m1 = Integer.parseInt(line); //Розмірність матриці- кількість вершин
            array1 = new int[m1][m1];

            line = reader.readLine(); //Зчитуємо саму матрицю

            while (line != null) {
                words = line.split(" ");
                for (int i = 0; i < m1; i++) {
                    array1[lineCount][i] = Integer.parseInt(words[i]);
                }
                lineCount++;
                // считываем остальные строки в цикле
                line = reader.readLine();
            }

        } catch (
                FileNotFoundException e) {
            e.printStackTrace();
        } catch (
                IOException e) {
            e.printStackTrace();
        }
    }

    public void fileReaderSecondFile() {
        int lineCount = 0;
        try {
            File file = new File(fileInSecond);
            //Create Object FileReader for Object File
            FileReader fr = new FileReader(file);
            //создаем BufferedReader с существующего FileReader для построчного считывания
            BufferedReader reader = new BufferedReader(fr);
            // считаем сначала первую строку
            String line = reader.readLine();
            m2 = Integer.parseInt(line); //Розмірність матриці- кількість вершин
            array2 = new int[m2][m2];

            line = reader.readLine(); //Зчитуємо саму матрицю

            while (line != null) {
                words = line.split(" ");
                for (int i = 0; i < m2; i++) {
                    array2[lineCount][i] = Integer.parseInt(words[i]);
                }
                lineCount++;
                // считываем остальные строки в цикле
                line = reader.readLine();
            }

        } catch (
                FileNotFoundException e) {
            e.printStackTrace();
        } catch (
                IOException e) {
            e.printStackTrace();
        }
    }
}
