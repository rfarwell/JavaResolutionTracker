package SaveHandlers;

import Models.Resolution;
import Models.ResolutionCompletionMap;

import java.util.ArrayList;
import java.util.Date;
import java.util.Map;

public class SaveWriter {
    private ResolutionCompletionMap resolutionCompletionMap;
    private String savePath;

    public SaveWriter(ResolutionCompletionMap resolutionCompletionMap, String savePath){
        this.resolutionCompletionMap = resolutionCompletionMap;
        this.savePath = savePath;
    }

    public void saveResolutions(){
        String stringToWrite = "# " + new Date(); //write down the save date. May be useful for future update
        for (Map.Entry<Resolution, ArrayList<Boolean>> resolutionArrayListEntry : resolutionCompletionMap.getMap().entrySet()) {
            stringToWrite += "\n" + resolutionArrayListEntry.getKey().getName() + "\n";
            for (Boolean completedBoolean : resolutionArrayListEntry.getValue()) {
                if (completedBoolean){
                    stringToWrite += 1;
                } else {
                    stringToWrite += 0;
                }
            }
        }
        System.out.println(stringToWrite);
    }

    public static void main(String[] args) {
        Resolution make_bed = new Resolution("Make bed");
        Resolution code = new Resolution("Code");
        ResolutionCompletionMap resMap = new ResolutionCompletionMap();
        resMap.addResolution(make_bed);
        resMap.addResolution(code);
        resMap.completeResolution(make_bed);
        resMap.completeResolution(make_bed);
        resMap.completeResolution(code);
        SaveWriter saveWriter = new SaveWriter(resMap, " ");
        saveWriter.saveResolutions();
    }
}
