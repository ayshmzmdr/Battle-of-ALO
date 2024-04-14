public class Battle extends Stats{
    public Battle()
    {
        int UserHealth=UserDef-EnemyAtt;
        int EnemyHealth=EnemyDef-UserAtt;
        if(size>5000)
        {
            System.out.println("ENEMY WON!!!!!!!!!!!!!!!!!!!!!!!!");
            System.out.println("YOUR ARMY LOST DUE TO LACK OF COOPERATION!!!!!!!!!!");
        }
        else if(UserHealth==EnemyHealth)
        {
            System.out.println("DRAW!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
            System.out.println("NO CLEAR WINNER EMERGED!!!!!!!!!!");
        }
        else 
        {
            System.out.println((UserHealth>EnemyHealth?"YOU":"ENEMY")+" WON!!!!!!!!");
        }
    }
}