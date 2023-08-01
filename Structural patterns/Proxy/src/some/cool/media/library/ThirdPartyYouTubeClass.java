package some.cool.media.library;

import java.util.HashMap;

public class ThirdPartyYouTubeClass implements ThirdPartyYouTubeLib{
    @Override
    public HashMap<String, Video> popularVideos() {
        connectToServer("http://www.youtube.com");
        return getRandomVideos();
    }

    @Override
    public Video getVideo(String videoId) {
        connectToServer("http://www.youtube.com/" + videoId);
        return getSomeVideo(videoId);
    }

    //-----------------------------------------------------------------------
    //Fake methods to simulate network activity. They as slow as a real life.

    private int random(int min, int max){
        return min + (int) (Math.random() * ((max - min) + 1));
    }

    private void experienceNetworkLatency(){
        int randomLatency = random(5, 10);
        for(int i = 0; i < randomLatency; i++){
            try{
                Thread.sleep(100);
            }catch (InterruptedException ex){
                ex.printStackTrace();
            }
        }
    }


    private void connectToServer(String server){
        System.out.println("Connecting to " + server + "... ");
        experienceNetworkLatency();
        System.out.println("Connect!" + "\n");
    }

    private HashMap<String, Video> getRandomVideos(){
        System.out.println("Downloading populars... ");

        experienceNetworkLatency();
        HashMap<String, Video> hmap = new HashMap<String, Video>();
        hmap.put("catzzzzzzzzzz", new Video("sadjhsgwfwwfs", "Catzzzz.avi"));
        hmap.put("mkafjffhwjwjd", new Video("cqscsffcqsfwf", "Dog plays with ball.mp4"));
        hmap.put("dancesvvideoo", new Video("sjfhwfuwehfew", "Dancing video.mpq"));
        hmap.put("vwegfewfgewfe", new Video("ccascscqcqccq", "Barcelona vs RealM.mov"));
        hmap.put("mkafjffhwjwjd", new Video("3sdfgsd1j3333", "Programing lessson#1.avi"));

        System.out.println("Done " + "\n");
        return hmap;
    }

    private Video getSomeVideo(String videoId){
        System.out.println("Downloading video... ");

        experienceNetworkLatency();
        Video video = new Video(videoId, "Some video title");

        System.out.println("Done!" + "\n");
        return video;
    }
}
