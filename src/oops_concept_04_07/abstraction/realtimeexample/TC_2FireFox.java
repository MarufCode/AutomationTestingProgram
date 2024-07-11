package src.oops_concept_04_07.abstraction.realtimeexample;

public class TC_2FireFox extends BaseClass {

    String openBrowser() {
        System.out.println("Starting FIREFOX");
        return null;
    }

    @Override
    String closeBrowser() {
        System.out.println("Closing FF");
        return null;
    }
}
