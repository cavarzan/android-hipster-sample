package  io.github.cavarzan.di.modules;

import dagger.Module;
import dagger.Provides;
import  io.github.cavarzan.di.ActivityScope;
import  io.github.cavarzan.ui.base.BaseActivity;

@ActivityScope
@Module
public class ActivityModule {

    protected BaseActivity activity;

    public ActivityModule(BaseActivity activity) {
        this.activity = activity;
    }

    @Provides
    protected BaseActivity activity() {
        return activity;
    }
}
