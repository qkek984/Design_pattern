package hansung.designpatterns.facade.hometheater;

/**
 * Created by Sea on 2017-10-18.
 */
public class DvdClassAdapter implements DvdPlayer{
    LGDvdPlayer dvdplayer;//객체 선언

    DvdClassAdapter(LGDvdPlayer dvdplayer){//생성자 생성
        this.dvdplayer = dvdplayer;
    }
    @Override
    public void on() {
        dvdplayer.on();
    }

    @Override
    public void off() {
        dvdplayer.off();
    }

    @Override
    public void eject() {
        dvdplayer.eject();
    }

    @Override
    public void play(String movie) {//기존 메소드호출
        dvdplayer.play();
    }

    @Override
    public void play(int track) {//입력받은 트랙번호대로 호출
        for(int i=0; i<track;i++){
            dvdplayer.next();
        }
        dvdplayer.play();
    }

    @Override
    public void stop() {
        dvdplayer.stop();
    }

    @Override
    public void pause() {
        dvdplayer.pause();
    }

    @Override
    public void setTwoChannelAudio() {
        dvdplayer.setTwoChannelAudio();
    }

    @Override
    public void setSurroundAudio() {
        throw new UnsupportedOperationException();//제공하지 않는 기능이므로 예외
    }
}
