package smoovie.apps.com.kayatech.smoovie.viewmodel;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.ViewModel;

import smoovie.apps.com.kayatech.smoovie.model.Movie;
import smoovie.apps.com.kayatech.smoovie.room_database.MovieDatabase;

public class DetailViewModel extends ViewModel {
    private LiveData<Movie> movieLiveData;

    public DetailViewModel(MovieDatabase movieDatabase,int movieId){
        movieLiveData = movieDatabase.movieDAO().loadMovieById(movieId);
    }

    public LiveData<Movie> getMovieLiveData() {
        return movieLiveData;
    }
}