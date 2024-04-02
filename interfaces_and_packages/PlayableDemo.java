import java.util.*;
class PlayableDemo {
    public static void main(String[] args) {
        System.out.println("\n1.MP3 Player\n2.CD Player\n3.Streaming Player\nEnter Your Choice");
        Scanner sc=new Scanner(System.in);
        int choice =sc.nextInt();
        Playable playable;
        PlayableDemo demo=new PlayableDemo();
        switch(choice){
            case 1:
                playable=new MP3Player();
                demo.functionality(playable);
                break;
            case 2:
                playable=new CDPlayer();
                demo.functionality(playable);
                break;
            case 3:
                playable=new StreamingPlayer();
                demo.functionality(playable);
                break;
            default:
                System.out.println("\nInvalid Choice");
        }
    }
    public void functionality(Playable obj){
        System.out.print("\n1.Play\n2.Pause\n3.Stop\n4.Exit\nEnter your choice");
        int choice=new Scanner(System.in).nextInt();
        switch(choice){
            case 1:
                obj.play();
                functionality(obj);
                break;
            case 2:
                obj.pause();
                functionality(obj);
                break;
            case 3:
                obj.stop();
                functionality(obj);
                break;
            case 4:
                return;
            default:
                System.out.println("\nInvalid Choice");
                functionality(obj);
        }
    }
}

interface Playable{
    void play();
    void pause();
    void stop();
}

class MP3Player implements Playable{
    public void play(){
        System.out.println("\nMP3 Player is playing");
    }
    public void pause(){
        System.out.println("\nMP3 Player is paused");
    }
    public void stop(){
        System.out.println("\nMP3 Player is stopped");
    }
}
class CDPlayer implements Playable{
    public void play(){
        System.out.println("\nCD Player is playing");
    }
    public void pause(){
        System.out.println("\nCD Player is paused");
    }
    public void stop(){
        System.out.println("\nCD Player is stopped");
    }
}
class StreamingPlayer implements Playable{
    public void play(){
        System.out.println("\nStreaming Player is playing");
    }
    public void pause(){
        System.out.println("\nStreaming Player is paused");
    }
    public void stop(){
        System.out.println("\nStreaming Player is stopped");
    }
}
