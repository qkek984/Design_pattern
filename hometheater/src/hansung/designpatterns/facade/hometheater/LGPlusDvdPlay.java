package hansung.designpatterns.facade.hometheater;

/**
 * Created by Sea on 2017-10-18.
 */
public class LGPlusDvdPlay extends LGDvdPlayer {
    public LGPlusDvdPlay(String description, Amplifier amplifier) {
        super(description, amplifier);
        System.out.println("This is advanced LGDvdPlayer");
    }
}
