import java.util.*;
public class Army {
    public int Soldier,choice,size,enemyVal;
    public String Enemy;

    public int EnemyAtt;
    public int EnemyDef;
    public int UserAtt;
    public int UserDef;

    public Army()
    {
        Soldier=0;
        EnemyAtt=0;
        EnemyDef=0;
        UserAtt=0;
        UserDef=0;

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
        System.out.print("TAKING POSITION");
        for(int i=0;i<5;i++)
        {
            for(int J=0;J<900000000;J++);
            System.out.print(".");
        }
        System.out.println();
        System.out.print("DESTROYING ENEMY FLANKS");
        for(int i=0;i<5;i++)
        {
            for(int J=0;J<1000000;J++);
            System.out.print(".");
        }
        System.out.println();
        System.out.print("DESTROYING ENEMY SUPPORT VEHICLES");
        for(int i=0;i<5;i++)
        {
            for(int J=0;J<1000000;J++);
            System.out.print(".");
        }
        System.out.println();
        System.out.print("DESTROYING THE FINAL WAVE");
        for(int i=0;i<5;i++)
        {
            for(int J=0;J<1000000;J++);
            System.out.print(".");
        }
        System.out.println();
        sc.close();


    }

}