public class Fighter {

    String name;
    int damage;  //hasar
    int healty;  //sağlık
    int weight;  //ağırlık
    int dodge;   //kaçınma, korunma
    int probabilityOfStarting;

    Fighter(String name, int damage, int healty, int weight, int dodge, int probabilityOfStarting){
        this.name = name;
        this.damage = damage;
        this.healty = healty;
        this.weight = weight;
        if(dodge >= 0 && dodge <= 100){
            this.dodge = dodge;
        }
        else{
            this.dodge = 0;
        }
        if(probabilityOfStarting >= 0 && probabilityOfStarting <= 100){
            this.probabilityOfStarting = probabilityOfStarting;
        }
        else {
            this.probabilityOfStarting = 0;
        }
    }

    int hit(Fighter foe){
        System.out.println(this.name + " => " + foe.name + " " + this.damage + " hasar vurdu");
        if(foe.isDodge()){
            System.out.println(foe.name + " gelen hasarı blokladı");
            System.out.println("-------------");
            return foe.healty;
        }
        if(foe.healty - this.damage < 0) {
            return 0;
        }
        return foe.healty - this.damage;
    }

    boolean isDodge(){
        double randomNumber = Math.random() * 100;
        return randomNumber <= this.dodge;
    }

}
