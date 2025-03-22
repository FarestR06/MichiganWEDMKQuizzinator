import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class QsAndAs {
    public static final List<QNA> QNAS = new ArrayList<>();
    private static final String[] POINT_OPTIONS = {
            "2 points",
            "3 points",
            "4 points",
            "6 points"
    };

    private static final QNA SPEEDING_2 = new QNA(
            "How many points are inflicted for driving 6 to 10 mph over the speed limit?",
            0,
            "According to WEDMK, two points are given for \"Six to 10 mph over the legal speed limit.\"",
            POINT_OPTIONS
    );
    private static final QNA SPEEDING_3 = new QNA(
            "How many points are inflicted for driving 11 to 15 mph over the speed limit?",
            1,
            "According to WEDMK, three points are given for \"11 to 15 mph over the legal speed limit.\"",
            POINT_OPTIONS
    );
    private static final QNA SPEEDING_4 = new QNA(
            "How many points are inflicted for driving 16 mph or faster over the speed limit?",
            2,
            "According to WEDMK, four points are given for \"16 mph or more over the legal speed limit.\"",
            POINT_OPTIONS
    );
    private static final QNA OPEN_ALCOHOL = new QNA(
            "How many points are inflicted for having an open container of alcohol in your car?",
            0,
            "According to WEDMK, two points are given for \"Open alcohol container in vehicle.\"",
            POINT_OPTIONS
    );
    private static final QNA BREATHALYZER_REFUSAL = new QNA(
            "How many points are inflicted for refusing a breathalyzer test under the age of 21?",
            0,
            "According to WEDMK, two points are given for \"Refusal of Preliminary Breath Test by anyone younger than 21.\"",
            POINT_OPTIONS
    );
    private static final QNA CARELESS_DRIVING = new QNA(
            "How many points are inflicted for careless driving?",
            1,
            """
                    According to WEDMK, three points are given for "Careless driving."\
                    
                    Careless driving is knowingly disobeying rules without putting others in danger, while reckless\
                    driving involves knowingly disregarding people's safety.\
                    
                    Examples of careless driving include running red lights and forgetting to use turn signals.
                    """,
            POINT_OPTIONS
    );
    private static final QNA RECKLESS_DRIVING = new QNA(
            "How many points are inflicted for reckless driving?",
            3,
            """
                    According to WEDMK, six points are given for "Reckless driving."\
                    
                    Reckless driving is knowingly driving in a way that puts others in danger, while careless driving\
                    is not nearly as unsafe, but is still illegal.\
                    
                    Examples of reckless driving include drag racing and driving under the influence.
                    """,
            POINT_OPTIONS
    );

    private static final QNA PARK_SPEED_LIMIT = new QNA(
            "What is the maximum speed limit in mobile home parks and certain municipal parks?",
            15,
            "From WEDMK:\n15 mph – In mobile home parks and some municipal parks."
    );
    private static final QNA SUBDIVISION_SPEED_LIMIT = new QNA(
            "What is the maximum speed limit in platted subdivisions and condo complexes?",
            25,
            """
                    From WEDMK:\
                    
                    "25 mph – In platted subdivisions (...) and condominium complexes.\
                    Watch for signs when driving through business
                    districts, county, state and federal parks, on roads
                    adjacent to parks and playgrounds, and in school
                    and hospital zones as posted speed limits vary."
                    """
    );
    private static final QNA WORK_ZONE_SPEED_LIMIT = new QNA(
            "What is the maximum speed limit in work zones (if posted)?",
            45,
            "From WEDMK:\n\"45 mph – In a work zone if posted. If a work zone is not posted for 45 mph, then the speed " +
                    "limit is the normal speed limit for that area.\""
    );
    private static final QNA MAIN_ROAD_SPEED_LIMIT = new QNA(
            "What is the maximum speed limit on streets and highways (unless otherwise posted)?",
            55,
            "From WEDMK:\n\"55 mph – Unless otherwise posted, on all streets that are not designated freeways and on all highways.\""
    );
    private static final QNA FREEWAY_SPEED_LIMIT = new QNA(
            "What is the maximum speed limit on freeways (unless otherwise posted)?",
            75,
            """
                    From WEDMK:\
                    
                    "70 mph maximum/55 mph minimum – On all freeways unless posted otherwise.\
                    School buses and trucks are restricted to 65 mph. On freeways with speed limits less than 70 mph, school buses and
                    trucks are restricted to 55 mph.\""""
    );

    public static void init() {
        QNAS.add(SPEEDING_2);
        QNAS.add(SPEEDING_3);
        QNAS.add(SPEEDING_4);
        QNAS.add(OPEN_ALCOHOL);
        QNAS.add(BREATHALYZER_REFUSAL);
        QNAS.add(CARELESS_DRIVING);
        QNAS.add(RECKLESS_DRIVING);
        QNAS.add(PARK_SPEED_LIMIT);
        QNAS.add(SUBDIVISION_SPEED_LIMIT);
        QNAS.add(WORK_ZONE_SPEED_LIMIT);
        QNAS.add(MAIN_ROAD_SPEED_LIMIT);
        QNAS.add(FREEWAY_SPEED_LIMIT);

        Collections.shuffle(QNAS);
    }
}
