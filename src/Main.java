import Models.Resolution;
import Models.ResolutionCompletionMap;

public class Main {
    public static void main(String[] args) {
        Resolution makeBed = new Resolution("Make bed in the morning");
        ResolutionCompletionMap storer = new ResolutionCompletionMap();
        storer.addResolution(makeBed);
        storer.addResolution(new Resolution("Gym before work"));
        storer.completeResolution(makeBed);

        System.out.println(storer.getMap());
    }
}