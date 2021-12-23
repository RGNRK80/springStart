package by.spring.course;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
        TestBean testBean=context.getBean("testBean", TestBean.class);
       //Music music=context.getBean("musicBean", Music.class);
       //System.out.println(testBean.getName());

       // MusicPlayer musicPlayer= new MusicPlayer(music);

        MusicPlayer musicPlayer=context.getBean("musicPlayer",MusicPlayer.class);
        musicPlayer.playMusic();

        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getMusic());
        System.out.println(musicPlayer.getVolume());

        context.close();
    }
}
