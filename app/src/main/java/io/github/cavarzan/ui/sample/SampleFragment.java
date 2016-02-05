package io.github.cavarzan.ui.sample;


import io.github.cavarzan.di.components.SampleComponent;


import io.github.cavarzan.ui.base.BaseFragment;
import io.github.cavarzan.ui.base.EmptyPresenter;
import io.github.cavarzan.R;


public class SampleFragment extends BaseFragment<EmptyPresenter> {

    @Override
    protected void inject() {
        getComponent(SampleComponent.class).inject(this);
    }

    @Override
    protected int getLayoutResource() {
        return R.layout.fragment_sample;
    }
}
