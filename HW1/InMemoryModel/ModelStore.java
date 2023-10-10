package HW.HW1.InMemoryModel;

import HW.HW1.ModelElements.Camera;
import HW.HW1.ModelElements.Flash;
import HW.HW1.ModelElements.PoligonalModel;
import HW.HW1.ModelElements.Scene;

import java.util.ArrayList;
import java.util.List;

public class ModelStore implements IModelChanger {
    public List<PoligonalModel> Models;
    public List<Scene> Scenes;
    public List<Flash> Flashes;
    public List<Camera> Cameras;
    public ModelStore(List<IModelChangedObserver> changedObserver) throws  Exception{
        this.Models = new ArrayList<>();
        this.Scenes = new ArrayList<>();
        this.Flashes = new ArrayList<>();
        this.Cameras = new ArrayList<>();

        Models.add(new PoligonalModel(null));
        Flashes.add(new Flash());
        Cameras.add(new Camera());
        Scenes.add(new Scene(0, Models, Flashes, Cameras));
    }

    public Scene GetScenes(int id) {
        for (int i = 0; i < Scenes.size(); i++) {
            if (Scenes.get(i).id == id) {
                return Scenes.get(i);
            }
        }
        return null;
    }

    @Override
    public void NotifyChange(IModelChanger sender) {

    }
}
