public class Printer {

    private int sheets;
    private int toner;

    public Printer(int sheets, int toner){
        this.sheets = sheets;
        this.toner = toner;
    }

    public int getSheets(){
        return sheets;
    }

    public int getToner(){
        return toner;
    }

    public String print(int numPages, int numCopies){
        int printJob = numPages * numCopies;
        if ((printJob < sheets) && (printJob < toner)) {
            sheets -= printJob;
            toner -= printJob;
        }
        return "Not enough paper/ toner.";
    }
}
