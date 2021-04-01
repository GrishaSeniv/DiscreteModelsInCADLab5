public class Algorithm {
    public static void main(String[] args) {
        int count = 0;
        String fileInFirst = "C:\\Users\\Grisha\\Desktop\\Ну ЛП\\4 курс\\2 семестр\\Дискретна математика\\Lab5\\Izomorphizm\\Data\\l5-3.txt";
        String fileInSecond = "C:\\Users\\Grisha\\Desktop\\Ну ЛП\\4 курс\\2 семестр\\Дискретна математика\\Lab5\\Izomorphizm\\Data\\l5-33.txt";
        FileReaderMatrixSize fileReaderMatrixSize = new FileReaderMatrixSize(fileInFirst, fileInSecond);
        fileReaderMatrixSize.fileReaderFirstFile();
        //fileReaderMatrixSize.fileReaderSecondFile();

        if (fileReaderMatrixSize.getM1() != fileReaderMatrixSize.getM2()) {
            System.out.println("The graph isn't isomorphic");
        } else {
            for (int i = 0; i < fileReaderMatrixSize.getM1(); i++) {
                for (int j = 0; j < fileReaderMatrixSize.getM1(); j++) {
                    if (fileReaderMatrixSize.getArray1(i, j) != fileReaderMatrixSize.getArray2(i, j)) {
                        System.out.println("The graph isn't isomorphic");
                        return;
                    } else {
                        count++;
                    }
                }
            }
        }

        int number_elements = fileReaderMatrixSize.m1 * fileReaderMatrixSize.m1;
        if (count == number_elements) {
            System.out.println("The graph is isomorphic ");
        }
    }
}
