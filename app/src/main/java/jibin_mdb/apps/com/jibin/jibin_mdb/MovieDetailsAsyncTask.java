package jibin_mdb.apps.com.jibin.jibin_mdb;
import android.os.AsyncTask;

import java.util.List;

import jibin_mdb.apps.com.jibin.jibin_mdb.ui.detail.viewmodel.DetailViewModel;
import smoovie.apps.com.kayatech.smoovie.model.Movie;
import smoovie.apps.com.kayatech.smoovie.model.Reviews;
import smoovie.apps.com.kayatech.smoovie.model.Trailers;


public final class MovieDetailsAsyncTask extends AsyncTask<Integer, Void, Movie> {

    private DetailViewModel mDetailViewModel;
    private smoovie.apps.com.kayatech.smoovie.ui.detail.async.MovieDetailsCallBack mMovieDetailsCallBack;
    private List<Trailers> trailers;
    private List<Reviews> reviews;

    public MovieDetailsAsyncTask(DetailViewModel detailViewModel, MovieDetailActivity movieDetailsCallBack) {
        mDetailViewModel = detailViewModel;
        mMovieDetailsCallBack = movieDetailsCallBack;
        trailers = null;
        reviews = null;
    }

    @Override
    protected Movie doInBackground(Integer... integers) {
        Movie vMovie = mDetailViewModel.getMovieDetails(integers[0]);
        reviews = mDetailViewModel.getMovieReviewsResponse(integers[0]).getReviews();
        trailers = mDetailViewModel.getMovieTrailersResponse(integers[0]).getTrailers();
        vMovie.setReviews(reviews);
        vMovie.setTrailers(trailers);
        return vMovie;
    }

    @Override
    protected void onPostExecute(Movie movie) {
        super.onPostExecute(movie);
        mMovieDetailsCallBack.complete(movie);
    }
}
