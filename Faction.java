
public class Faction extends Army{
    Army TMM=new Army();
    Army ZS5Z=new Army();
    Army MGang=new Army();
    Army Ramphashats=new Army();

    public Faction()
    {
        play();
        TMM.Soldier=250;
        ZS5Z.Soldier=250;
        Ramphashats.Soldier=50;
        if(size>=10)
        {
            MGang.Soldier=1000;
        }
        else 
        {
            MGang.Soldier=0;
        }

    }

}