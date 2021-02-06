package smoovie.apps.com.kayatech.smoovie.ui.detail.viewmodel;

import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProvider;
import android.support.annotation.NonNull;

import jibin_mdb.apps.com.jibin.jibin_mdb.MoviesRepository;
import jibin_mdb.apps.com.jibin.jibin_mdb.ui.detail.viewmodel.DetailViewModel;


public final class DetailViewModelFactory extends ViewModelProvider.NewInstanceFactory {
    private final MoviesRepository mRepository;

    public DetailViewModelFactory(MoviesRepository repository) {
        mRepository = repository;
    }

    @NonNull
    @Override
    @SuppressWarnings("unchecked cast")
    public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
        return (T) new DetailViewModel(mRepository);
    }
}
