package smoovie.apps.com.kayatech.smoovie.ui.main.viewmodel;

import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProvider;
import android.support.annotation.NonNull;

import jibin_mdb.apps.com.jibin.jibin_mdb.MoviesRepository;



public final class MainViewModelFactory extends ViewModelProvider.NewInstanceFactory {
    private final MoviesRepository mRepository;

    public MainViewModelFactory(MoviesRepository repository) {
        mRepository = repository;
    }

    @NonNull
    @Override
    @SuppressWarnings("unchecked cast")
    public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
        return (T) new smoovie.apps.com.kayatech.smoovie.ui.main.viewmodel.MainViewModel(mRepository);
    }
}
