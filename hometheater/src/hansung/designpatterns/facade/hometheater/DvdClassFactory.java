package hansung.designpatterns.facade.hometheater;

/**
 * Created by Sea on 2017-10-18.
 */
public class DvdClassFactory {
    private static DvdClassFactory instance;
    private DvdClassFactory() {}
    public static DvdClassFactory getInstance() {
        if (instance == null)
            instance = new DvdClassFactory();
        return instance;
    }
    public DvdPlayer createVenderClass(String description, Amplifier amplifier) {
        //return new DvdClassAdapter( new LGDvdPlayer(description, amplifier));
        return new DvdClassAdapter( new LGPlusDvdPlay(description, amplifier));
        //return new DvdClassCAdapter(description, amplifier);
// return new VenderClass();
    }
}

