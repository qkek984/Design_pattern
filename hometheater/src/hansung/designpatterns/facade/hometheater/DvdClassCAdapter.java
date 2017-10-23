package hansung.designpatterns.facade.hometheater;

/**
 * Created by Sea on 2017-10-18.
 */
public class DvdClassCAdapter extends LGDvdPlayer implements DvdPlayer{
    public DvdClassCAdapter(String description, Amplifier amplifier) {
        super(description, amplifier);
    }
    @Override
    public void play(String movie) {
        super.play();
    }
    @Override
    public void play(int track) {
        for(int i=0; i<track;i++){
            super.next();
        }
        super.play();
    }
    @Override
    public void setSurroundAudio() {
        throw new UnsupportedOperationException();//제공하지 않는 기능이므로 예외
    }
}
