package src.oops_concept_04_07.abstraction.realtimeexample;

public class TC_1Chrome extends BaseClass{

    String openBrowser() {
        System.out.println("Starting CHROME");
        return null;
    }

    @Override
    String closeBrowser() {
        System.out.println("Closing CHROME");
        return null;
    }
}
