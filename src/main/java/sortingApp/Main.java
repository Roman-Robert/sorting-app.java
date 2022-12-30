package sortingApp;


import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class Main {

    public  static Logger logger = Logger.getLogger(Main.class);

    public static void main(String[] args) {
        BasicConfigurator.configure();
        logger.info("Starting application");
        System.out.println(Sorting.sortingArray(Input.inputArray()));
        logger.info("Finishing application");
    }
}
