package musicsimulation;

import java.util.LinkedList;
import java.util.ListIterator;

public class MusicSimulation {
    private LinkedList<Song> songs;
    private ListIterator<Song> iterator;
    private Song currentSong;

    public MusicSimulation() {
        songs = new LinkedList<>();
        iterator = songs.listIterator();
        currentSong = null;
    }

    public void addSong(String title) {
        songs.add(new Song(title));
        resetIterator();
    }

    private void resetIterator() {
        iterator = songs.listIterator();
        if (iterator.hasNext()) {
            currentSong = iterator.next();
            iterator.previous();
        } else {
            currentSong = null;
        }
    }

    public void removeSong(String title) {
        songs.removeIf(song -> song.getName().equals(title));
        resetIterator();
    }

    public void printPlaylist() {
        for (Song song : songs) {
            System.out.print(song.getName() + " -> ");
        }
        System.out.println("END");
    }


    public static void main(String[] args) {
        MusicSimulation simulation = new MusicSimulation();
        simulation.addSong("Song 1");
        simulation.addSong("Song 2");
        simulation.addSong("Song 3");
        simulation.printPlaylist();

        simulation.removeSong("Song 2");

        simulation.printPlaylist();
    }

}
