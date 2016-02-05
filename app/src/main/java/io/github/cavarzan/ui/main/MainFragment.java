package io.github.cavarzan.ui.main;

import io.github.cavarzan.di.components.MainComponent;
import io.github.cavarzan.ui.base.BaseFragment;
import io.github.cavarzan.ui.base.EmptyPresenter;
import io.github.cavarzan.R;

public class MainFragment extends BaseFragment<EmptyPresenter> {

    @Override
    protected void inject() {
        getComponent(MainComponent.class).inject(this);
    }

    @Override
    protected int getLayoutResource() {
        return R.layout.fragment_main;
    }

}
