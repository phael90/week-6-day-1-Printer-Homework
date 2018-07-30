public class Printer {
    private int sheetsNumber;

//constructor
    public Printer(int sheetsNumber){
        this.sheetsNumber = sheetsNumber;
    }

    public int getSheetsNumber(){
        return this.sheetsNumber;
    }

    public void print(int pages, int copies) {
        int printNumber = pages * copies;
        if (printNumber > sheetsNumber) {
            return;
        } else {
            this.sheetsNumber = this.sheetsNumber - printNumber;
        }
    }

    public void setRefill(int numberToRefil){
            this.sheetsNumber = this.sheetsNumber + numberToRefil;
        }
}

//you must specify what type a variable it is only when declaring this value