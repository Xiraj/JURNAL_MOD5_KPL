public class main {
    public static void main(String[] args) {
        SayaTubeVideo vid1 = new SayaTubeVideo("Review Money Heist oleh Akbar");
        SayaTubeVideo vid2 = new SayaTubeVideo("Review Blacklist oleh Akbar");
        SayaTubeVideo vid3 = new SayaTubeVideo("Review Spiderman Home Coming oleh Akbar");
        SayaTubeVideo vid4 = new SayaTubeVideo("Review Avengers Age of ultron oleh Akbar");
        SayaTubeVideo vid5 = new SayaTubeVideo("Review Avengers connect Re:End game oleh Akbar");
        SayaTubeVideo vid6 = new SayaTubeVideo("Review Avengers Infinity oleh Akbar");
        SayaTubeVideo vid7 = new SayaTubeVideo("Review Deadpool oleh Akbar");
        SayaTubeVideo vid8 = new SayaTubeVideo("Review Super30 oleh Akbar");
        SayaTubeVideo vid9 = new SayaTubeVideo("Review Who Am I oleh Akbar");
        SayaTubeVideo vid10 = new SayaTubeVideo("Review Assalamu'aikum Beijing oleh Akbar");
        vid1.increasePlayCount(25000000);
        vid2.increasePlayCount(25000000);
        vid3.increasePlayCount(25000000);
        vid4.increasePlayCount(25000000);
        vid5.increasePlayCount(25000000);
        vid6.increasePlayCount(25000000);
        vid7.increasePlayCount(25000000);
        vid8.increasePlayCount(25000000);
        vid9.increasePlayCount(25000000);
        vid10.increasePlayCount(25000000);


        SayaTubeUser user1 = new SayaTubeUser("Akbar");
        user1.addVideo(vid1);
        user1.addVideo(vid2);
        user1.addVideo(vid3);
        user1.addVideo(vid4);
        user1.addVideo(vid5);
        user1.addVideo(vid6);
        user1.addVideo(vid7);
        user1.addVideo(vid8);
        user1.addVideo(vid9);
        user1.addVideo(vid10);

        user1.printAllVideoPlaycount();
        System.out.println("Total playcount : "+user1.getTotalVideoPlayCount());

        for(int i = 0; i<85;i++){
            vid1.increasePlayCount(25000000);
        }
        System.out.println("Total playcount : "+user1.getTotalVideoPlayCount());
        try {
            SayaTubeVideo vid11 = new SayaTubeVideo("");
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            SayaTubeUser vid11 = new SayaTubeUser("");
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            SayaTubeVideo vid11 = new SayaTubeVideo("a");
            vid11.increasePlayCount(-5);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
