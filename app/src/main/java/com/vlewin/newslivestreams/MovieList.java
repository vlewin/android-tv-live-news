package com.vlewin.newslivestreams;

import java.util.ArrayList;
import java.util.List;

public final class MovieList {
    public static final String MOVIE_CATEGORY[] = {
            "Live streams"
    };

    public static List<Movie> list;

    public static List<Movie> setupMovies() {
        list = new ArrayList<Movie>();
        String title[] = {
                "NTV Live",
                "N24 Live"
        };

//        String description = "German news streams";
        String description [] = {
                "n-tv is a German television news channel owned by the Bertelsmann Media's RTL Group. n-tv broadcasts news and weather every hour and half-hour in the morning. At other times it broadcasts magazine shows and documentaries.",
                "N24 is a television news channel and website based in Germany and owned by WeltN24 GmbH. It also provides regular news updates to ProSiebenSat.1 Media properties like ProSieben and kabel eins."
        };

        String videoUrl[] = {
                "http://p.live.akamai.n-tv.de/playlists/ntvlive-ipadakamai.m3u8",
                "https://live2weltcms-lh.akamaihd.net/i/Live2WeltCMS_1@444563/master.m3u8"
        };

        String bgImageUrl[] = {
                "http://bilder1.n-tv.de/img/incoming/crop18408116/4974198907-cImg_16_9-w996/Webpictos-16zu9-Live-1.jpg",
                "https://www.welt.de/img/videos/mobile158329265/1071350957-ci16x9-w570/Grid-N24-Livestream-jpg.jpg"
        };
        String cardImageUrl[] = {
                "http://bilder1.n-tv.de/img/incoming/crop18408116/4974198907-cImg_16_9-w996/Webpictos-16zu9-Live-1.jpg",
                "https://www.welt.de/img/videos/mobile158329265/1071350957-ci16x9-w1280/Grid-N24-Livestream-jpg.jpg"
        };

        list.add(buildMovieInfo("category", title[0],
                description[0], "Live stream", videoUrl[0], cardImageUrl[0], bgImageUrl[0]));
        list.add(buildMovieInfo("category", title[1],
                description[1], "Live stream", videoUrl[1], cardImageUrl[1], bgImageUrl[1]));
        return list;
    }


    private static Movie buildMovieInfo(String category, String title,
                                        String description, String studio, String videoUrl, String cardImageUrl,
                                        String bgImageUrl) {
        Movie movie = new Movie();
        movie.setId(Movie.getCount());
        Movie.incCount();
        movie.setTitle(title);
        movie.setDescription(description);
        movie.setStudio(studio);
        movie.setCategory(category);
        movie.setCardImageUrl(cardImageUrl);
        movie.setBackgroundImageUrl(bgImageUrl);
        movie.setVideoUrl(videoUrl);
        return movie;
    }
}
