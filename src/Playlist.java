import java.util.ArrayList;

class Playlist {
  
  public static void main(String[] args) {
    ArrayList<String> desertIslandPlaylist = new ArrayList<String>();
    desertIslandPlaylist.add("Chipi Chipi");
    desertIslandPlaylist.add("Vampiro");
    desertIslandPlaylist.add("Pasajera en Trance");
    desertIslandPlaylist.add("De mi");
    desertIslandPlaylist.add("Yendo de la cama al living");
    desertIslandPlaylist.add("Botas locas");
    desertIslandPlaylist.add("Medley");

// System.out.println(desertIslandPlaylist);
// System.out.println(desertIslandPlaylist.size());
desertIslandPlaylist.remove("Botas locas");
desertIslandPlaylist.remove("Medley");
// System.out.println(desertIslandPlaylist.size());
int indexA=
desertIslandPlaylist.indexOf("De mi")
;
int indexB=
desertIslandPlaylist.indexOf("Yendo de la cama al living");
    String tempA = "De mi";

desertIslandPlaylist.set(indexA, "Yendo de la cama al living");
desertIslandPlaylist.set(indexB, tempA);
    System.out.println(desertIslandPlaylist);

  }
  
}