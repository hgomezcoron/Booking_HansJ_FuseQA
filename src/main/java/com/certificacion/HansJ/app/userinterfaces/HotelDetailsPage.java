package com.certificacion.HansJ.app.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class HotelDetailsPage {

    public static final Target HOTEL_NAME = Target.the("Hotel name")
            .locatedBy(".d2fee87262.pp-header__title");

    public static final Target HOTEL_LOCATION = Target.the("Hotel location")
            .locatedBy(".eec927a9a4");

    public static final Target HOTEL_STAR_RATING = Target.the("Hotel star rating")
            .locatedBy("//div[@id='reviewFloater']");

    public static final Target PHOTO_GALLERY = Target.the("Photo gallery")
            .locatedBy("(//picture[contains(@class, 'e5a3812a75 ee5449dbd9')])[1]");

    public static final Target AMENITIES_LIST = Target.the("Amenities list")
            .locatedBy("//div[contains(@class, 'hp--popular_facilities js-k2-hp--block')]");

    public static final Target USER_REVIEWS = Target.the("User reviews")
            .locatedBy("(//div[contains(@class, 'c624d7469d f034cf5568 a937b09340 a3214e5942')])[7]");

    public static final Target HOTEL_MAP = Target.the("Hotel location map")
            .locatedBy("//div[contains(@class, 'map-container')]");
}
