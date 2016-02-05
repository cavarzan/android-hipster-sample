package io.github.cavarzan.ui.base;

import android.os.Bundle;
import android.content.Context;
import android.support.annotation.CallSuper;
import nucleus.view.NucleusAppCompatActivity;
import butterknife.Bind;
import butterknife.ButterKnife; 
import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

public abstract class BaseActivity<P extends BasePresenter> extends NucleusAppCompatActivity<P> {

    @CallSuper
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutResource());
        injectModule();
        ButterKnife.bind(this); 
        setPresenterFactory(getPresenterFactory()); 
    }

    protected abstract void injectModule();

    protected abstract int getLayoutResource();

    @CallSuper
    @Override
    public void onDestroy() {
        ButterKnife.unbind(this); 
        super.onDestroy();
    }

    
    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase));
    }
    
}
