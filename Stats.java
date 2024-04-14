import java.util.*;
public class Stats extends Faction
{
    public Stats()
    {
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