package io.github.cavarzan.ui.base;

import io.github.cavarzan.di.HasComponent;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.CallSuper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import nucleus.view.NucleusSupportFragment;
import butterknife.Bind;
import butterknife.ButterKnife; 

public abstract class BaseFragment<P extends BasePresenter> extends NucleusSupportFragment<P> {

    @CallSuper
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(getLayoutResource(), container, false);
        ButterKnife.bind(this, rootView);

        return rootView;
    }

    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        inject();

        setPresenterFactory(getPresenterFactory());
    }

    @CallSuper
    @Override
    public void onDestroyView() {
      ButterKnife.unbind(this); 
          super.onDestroyView();
      }

    public BaseActivity getBaseActivity() {
        return (BaseActivity) getActivity();
    }

    @CallSuper
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    @SuppressWarnings("unchecked")
    protected <C> C getComponent(Class<C> componentType) {
        return componentType.cast(((HasComponent<C>) getActivity()).getComponent());
    }

    protected abstract void inject();

    protected abstract int getLayoutResource();

}
