public class Match {

    Fighter hamilton;
    Fighter rosberg;
    int minWeight;  //dövüşçülerin kiloları birbirine uyuyor mu diye control edecek olan değişken
    int maxWeight;


    Match(Fighter hamilton, Fighter rosberg, int minWeight, int maxWeight){
        this.hamilton = hamilton;
        this.rosberg = rosberg;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    public void run(){
        if(isCheck()){
            while (this.hamilton.healty > 0 && this.rosberg.healty > 0){
                System.out.println("===YENİ ROUND===");
                this.rosberg.healty = this.hamilton.hit(this.rosberg);
                if(isWin()){
                    break;
                }
                this.hamilton.healty = this.rosberg.hit(this.hamilton);
                if(isWin()){
                    break;
                }
                System.out.println(this.hamilton.name + " Sağlık : " + this.hamilton.healty);
                System.out.println(this.rosberg.name + " Sağlık : " + this.rosberg.healty);

            }
        }
        else{
            System.out.println("Sporcuların sikletleri uymuyor.");
        }
    }

    boolean isCheck(){
        return (this.hamilton.weight >= minWeight && this.hamilton.weight <= maxWeight) && (this.rosberg.weight >= minWeight && this.rosberg.weight <= maxWeight);
    }

    boolean isWin(){
        if(this.hamilton.healty == 0){
            System.out.println(this.rosberg.name + " kazandı");
            return true;
        }

        if(this.rosberg.healty == 0){
            System.out.println(this.hamilton.name + " kazandı");
            return true;
        }
        return false;
    }

}
