public class Printer {

    private int sheets;
    private int toner;

    public Printer(int sheets, int toner){
        this.sheets = sheets;
        this.toner = toner;
    }

    public int getSheets(){
        return this.sheets;
    }

    public int getToner(){
        return this.toner;
    }

    public void print(int numPages, int numCopies){
        int printJob = numPages * numCopies;
        if ((printJob <= this.sheets) && (printJob <= this.toner)) {
            this.sheets -= printJob;
            this.toner -= printJob;
        }
    }
}
