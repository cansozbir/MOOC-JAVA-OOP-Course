
import nhlstats.NHLStatistics;

import java.nio.file.NotLinkException;

public class Main {

    public static void main(String[] args) {

        NHLStatistics.sortByGoals();
        NHLStatistics.top(10);

        System.out.println("####################################");

        NHLStatistics.sortByPenalties();
        NHLStatistics.top(25);

        System.out.println("####################################");

        NHLStatistics.searchByPlayer("Sidney Crosby");

        System.out.println("####################################");

        NHLStatistics.teamStatistics("PHI");
        NHLStatistics.sortByPoints();

        System.out.println("####################################");

        NHLStatistics.teamStatistics("ANA");
    }
}
