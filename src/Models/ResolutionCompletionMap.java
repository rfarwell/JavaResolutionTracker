package Models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ResolutionCompletionMap {
    private Map<Resolution, ArrayList<Boolean>> map = new HashMap<>();

    public ResolutionCompletionMap(){}
    public void addResolution(Resolution resolution){
        this.map.put(resolution, new ArrayList<>());
    }

    public Map<Resolution, ArrayList<Boolean>> getMap() {return this.map;}

    public void completeResolution(Resolution resolution){
        if (this.map.containsKey(resolution)){
            this.map.get(resolution).add(true);
        } else {
            throw new Error("This resolution ("+resolution+") does not exist");
        }

        for (Map.Entry<Resolution, ArrayList<Boolean>> resolutionArrayListEntry : this.map.entrySet()) {
            if (this.map.get(resolution).size() > resolutionArrayListEntry.getValue().size()){
                int sizeDifference = this.map.get(resolution).size() - resolutionArrayListEntry.getValue().size();
                for (int i = 0; i < sizeDifference; i++){
                    resolutionArrayListEntry.getValue().add(false);
                }
            }
        }
    }

}
