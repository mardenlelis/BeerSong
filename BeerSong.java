public class BeerSong {
    
    private void singTheSong(){

        int beerNum = 99;
        String word = "bottles";

        while(beerNum > 0){

            System.out.println(beerNum + " " + word + " of beer on the wall");
            System.out.println(beerNum + " " + word + " of beer.");
            System.out.println("Take one down.");
            System.out.println("Pass it around.");

            beerNum = beerNum - 1;

            if(beerNum == 1){
                word = "bottle";
            }

            if (beerNum > 0){
                System.out.println(beerNum + " " + word + " of beer on the wall");
            }else{
                System.out.println("No more beer on the wall.");
            }
        }
    }

    public static void main(String[] args){

        BeerSong song = new BeerSong();
        song.singTheSong();
    }

}
