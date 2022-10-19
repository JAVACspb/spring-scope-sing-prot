package course;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        ClassicMusic classicMusic = context.getBean("musicBean",ClassicMusic.class);
        System.out.println(classicMusic.getSong());



//        MusicPlayer musicPlayer = new MusicPlayer(musicBean);
//        MusicPlayer firstMusicPlayer = context.getBean("musicPlayer",MusicPlayer.class);
//        MusicPlayer secondMusicPlayer = context.getBean("musicPlayer",MusicPlayer.class);
//
//        boolean comparison = firstMusicPlayer == secondMusicPlayer;
//        System.out.println(comparison);
//        System.out.println(firstMusicPlayer);
//        System.out.println(secondMusicPlayer);
//
//        firstMusicPlayer.setVolume(10000);
//        secondMusicPlayer.setVolume(5);
//
//        System.out.println(firstMusicPlayer.getVolume());
//        System.out.println(secondMusicPlayer.getVolume());

//        System.out.println(musicPlayer.getName() + " \n"  +  musicPlayer.getVolume());
        context.close();
    }
}
