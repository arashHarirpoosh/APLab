package Session3.musicOrganizer;

import java.util.ArrayList;

public class test {
    public static void main(String[] args) {
        ArrayList<MusicCollection> categories = new ArrayList<>();
        String[] cn = new String[]{"pop", "jazz", "rock", "country"};
        for (String aCn : cn) {
            categories.add(new MusicCollection(aCn));
        }
        categories.get(0).addFile(new Music("AA0", "AB", 2020));
        categories.get(0).addFile(new Music("AA1", "ABW", 2019));
        categories.get(0).addFile(new Music("AA2", "ABE", 2021));

        categories.get(1).addFile(new Music("BB0", "ABC", 2020));
        categories.get(1).addFile(new Music("BB1", "ABD", 2019));

        categories.get(2).addFile(new Music("CC0", "CF", 2020));
        categories.get(2).addFile(new Music("CC1", "FQ", 2019));

        MusicPlayer mp = new MusicPlayer();
        mp.setFavoriteMusics(new MusicCollection("Favorite"));
        mp.setCategories(categories);

        mp.getCategories().get(0).listAllFiles();

        System.out.println("--------------------");

        mp.addFavoriteMusic(new Music("AA0", "AB", 2020));
        mp.addFavoriteMusic(new Music("BB1", "ABD", 2019));

        mp.getFavoriteMusics().listAllFiles();
        System.out.println("--------------------");

        mp.removeFavoriteMusic(0);
        mp.getFavoriteMusics().listAllFiles();

        System.out.println("--------------------");

        mp.getCategories().get(1).searchMusic("ABC");
    }
}
