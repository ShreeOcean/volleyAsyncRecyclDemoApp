package com.ocean.volleyasyncrecycldemoapp;

import java.util.List;

public class MovieModel {


    private int PopularMoviesPage;


    private List<PopularMovieResultsPOJO>  PopularMoviesResult;


    private int PopularMoviesTotalPages;

    private int PopularMoviesTotalResults;

    public MovieModel(int popularMoviesPage, List<PopularMovieResultsPOJO> popularMoviesResult, int popularMoviesTotalPages, int popularMoviesTotalResults) {
        PopularMoviesPage = popularMoviesPage;
        PopularMoviesResult = popularMoviesResult;
        PopularMoviesTotalPages = popularMoviesTotalPages;
        PopularMoviesTotalResults = popularMoviesTotalResults;
    }

    public int getPopularMoviesPage() {
        return PopularMoviesPage;
    }

    public List<PopularMovieResultsPOJO> getPopularMoviesResult() {
        return PopularMoviesResult;
    }

    public int getPopularMoviesTotalPages() {
        return PopularMoviesTotalPages;
    }

    public int getPopularMoviesTotalResults() {
        return PopularMoviesTotalResults;
    }
}
