import java.util.*;
public class Army {
    public int Soldier,choice,size,enemyVal;
    public String Enemy;

    public int EnemyAtt;
    public int EnemyDef;
    public int UserAtt;
    public int UserDef;

    int UserHealth;
    int EnemyHealth;

    int EnemySize;

    Army TMM;
    Army ZS5Z;
    Army MGang;
    Army Ramphashats;

    public Army()
    {
        Soldier=0;
        EnemyAtt=0;
        EnemyDef=0;
        UserAtt=0;
        UserDef=0;

    }
    public void delay() 
    {
        try 
        {
            Thread.sleep(650);
        } 
        catch (InterruptedException e) 
        {
            e.printStackTrace();
        }
    }

    public void defineArmies()
    {
        TMM=new Army();
        ZS5Z=new Army();
        Ramphashats=new Army();
        MGang=new Army();
    }





    public void play()
    {
        Scanner sc=new Scanner(System.in);
        Random rc=new Random();
        System.out.println("Choose your faction");
        System.out.println("1.TMM        2.ZS5Z        3.Ramphashats        4.M Gang");
        choice=sc.nextInt();
        System.out.println("Enter your army size");
        size=sc.nextInt();
        enemyVal=rc.nextInt(4)+1;
        switch (enemyVal)
        {
            case 1: Enemy="ZS5Z"; break;
            case 2: Enemy="TMM"; break;
            case 3: Enemy="Ramphashats"; break;
            case 4: Enemy="M Gang"; break;
        }
        System.out.println("Your opponent: "+Enemy);
        
        sc.close();
    }





    public void stats()
    {

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

        
        Random rc=new Random();
        int EnemySize = rc.nextInt(1000)+1;
        switch (enemyVal)
        {
            case 1: EnemyAtt=EnemySize*TMM.Soldier;  EnemyDef=EnemySize*TMM.Soldier; break;
            case 2: EnemyAtt=EnemySize*ZS5Z.Soldier;  EnemyDef=EnemySize*ZS5Z.Soldier; break;
            case 3: EnemyAtt=EnemySize*Ramphashats.Soldier;  EnemyDef=EnemySize*Ramphashats.Soldier; break;
            case 4: EnemyAtt=EnemySize*MGang.Soldier;  EnemyDef=EnemySize*MGang.Soldier; break;
        }
        switch (choice)
        {
            case 1: UserAtt=size*TMM.Soldier;  UserDef=size*TMM.Soldier; break;
            case 2: UserAtt=size*ZS5Z.Soldier;  UserDef=size*ZS5Z.Soldier; break;
            case 3: UserAtt=size*Ramphashats.Soldier;  UserDef=size*Ramphashats.Soldier; break;
            case 4: UserAtt=size*MGang.Soldier; UserDef=size*MGang.Soldier; break;
        }
    }
    

}