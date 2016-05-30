package com.eagle.boilerplate.presentation.presenters.impl;

import com.eagle.boilerplate.domain.executor.Executor;
import com.eagle.boilerplate.domain.executor.MainThread;
import com.eagle.boilerplate.domain.interactors.SampleInteractor;
import com.eagle.boilerplate.presentation.presenters.base.AbstractPresenter;
import com.eagle.boilerplate.presentation.presenters.MainPresenter;

/**
 * Created by dmilicic on 12/13/15.
 */
public class MainPresenterImpl extends AbstractPresenter implements MainPresenter,
        SampleInteractor.Callback {

    private MainPresenter.View mView;

    public MainPresenterImpl(Executor executor,
                             MainThread mainThread,
                             View view) {
        super(executor, mainThread);
        mView = view;
    }

    @Override
    public void resume() {

    }

    @Override
    public void pause() {

    }

    @Override
    public void stop() {

    }

    @Override
    public void destroy() {

    }

    @Override
    public void onError(String message) {

    }
}
