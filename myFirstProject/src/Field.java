
public class Field {

    private static final char DEFAULT_CELL = ' ';

    private int fieldSize = 3;

    private char[][] field = new char[fieldSize][fieldSize];

    public void setFieldSize(int newFieldSize){
        if (newFieldSize > 0){
        fieldSize = newFieldSize;
        }
    }
    public int getFieldSize(){
        return fieldSize;
    }

        public void eraseField() {
        for (int i = 0; i < fieldSize; i++)
            for (int i2 = 0; i2 < fieldSize; i2++)
                field[i][i2] = DEFAULT_CELL;
                            }
    public void showField() {
        eraseField();
        for (int i = 0; i < fieldSize; i++){
                for (int i2 = 0; i2 < fieldSize; i2++){
                    System.out.print("[ " + field[i][i2] + " ]");
                 }
            System.out.println();
                                             }
                            }
    private void showCell(int i, int i2){
        System.out.print("[ " + field[i][i2] + " ]");
    }

                  }