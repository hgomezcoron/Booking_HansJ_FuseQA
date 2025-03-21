package com.certificacion.HansJ.app.questions.booking;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Visibility;

import static com.certificacion.HansJ.app.userinterfaces.HotelDetailsPage.*;

public class HotelDetails {

    public static Question<Boolean> hotelNameIsVisible() {
        return actor -> Visibility.of(HOTEL_NAME).answeredBy(actor);
    }

    public static Question<Boolean> locationIsVisible() {
        return actor -> Visibility.of(HOTEL_LOCATION).answeredBy(actor);
    }

    public static Question<Boolean> starRatingIsVisible() {
        return actor -> Visibility.of(HOTEL_STAR_RATING).answeredBy(actor);
    }

    public static Question<Boolean> photoGalleryIsVisible() {
        return actor -> Visibility.of(PHOTO_GALLERY).answeredBy(actor);
    }

    public static Question<Boolean> amenitiesListIsVisible() {
        return actor -> Visibility.of(AMENITIES_LIST).answeredBy(actor);
    }

    public static Question<Boolean> userReviewsAreVisible() {
        return actor -> Visibility.of(USER_REVIEWS).answeredBy(actor);
    }

    public static Question<Boolean> mapIsVisible() {
        return actor -> Visibility.of(HOTEL_LOCATION).answeredBy(actor);
    }

}
