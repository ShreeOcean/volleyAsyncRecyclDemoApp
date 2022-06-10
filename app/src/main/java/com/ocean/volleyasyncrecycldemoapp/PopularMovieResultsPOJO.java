package com.ocean.volleyasyncrecycldemoapp;

public class PopularMovieResultsPOJO {

    private String BackDropPath;  //BackgroundPoster
    private String OriginalLanguage;
    private String OriginalTitle;
    private String OverView;
    private double Popularity;
    private String PosterPath;         //PosterImage
    private String ReleaseDate;
    private double VoteAverage;   //Rating
    private int VoteCount;

    public PopularMovieResultsPOJO(String backDropPath, String originalLanguage, String originalTitle, String overView, double popularity, String posterPath, String releaseDate, double voteAverage, int voteCount) {
        BackDropPath = backDropPath;
        OriginalLanguage = originalLanguage;
        OriginalTitle = originalTitle;
        OverView = overView;
        Popularity = popularity;
        PosterPath = posterPath;
        ReleaseDate = releaseDate;
        VoteAverage = voteAverage;
        VoteCount = voteCount;
    }

    public String getBackDropPath() {
        return BackDropPath;
    }

    public String getOriginalLanguage() {
        return OriginalLanguage;
    }

    public String getOriginalTitle() {
        return OriginalTitle;
    }

    public String getOverView() {
        return OverView;
    }

    public double getPopularity() {
        return Popularity;
    }

    public String getPosterPath() {
        return PosterPath;
    }

    public String getReleaseDate() {
        return ReleaseDate;
    }

    public double getVoteAverage() {
        return VoteAverage;
    }

    public int getVoteCount() {
        return VoteCount;
    }
}
