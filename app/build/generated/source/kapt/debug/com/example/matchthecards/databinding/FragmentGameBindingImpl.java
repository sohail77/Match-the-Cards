package com.example.matchthecards.databinding;
import com.example.matchthecards.R;
import com.example.matchthecards.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentGameBindingImpl extends FragmentGameBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.player1_layout, 6);
        sViewsWithIds.put(R.id.player1_txt, 7);
        sViewsWithIds.put(R.id.player2_layout, 8);
        sViewsWithIds.put(R.id.player2_txt, 9);
        sViewsWithIds.put(R.id.winnerAnimation, 10);
        sViewsWithIds.put(R.id.winnerTxt, 11);
        sViewsWithIds.put(R.id.goBackBtn, 12);
        sViewsWithIds.put(R.id.info_Img, 13);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentGameBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 14, sIncludes, sViewsWithIds));
    }
    private FragmentGameBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 3
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (com.google.android.material.floatingactionbutton.FloatingActionButton) bindings[12]
            , (android.widget.ImageView) bindings[13]
            , (android.widget.ImageView) bindings[2]
            , (android.widget.LinearLayout) bindings[6]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[7]
            , (android.widget.ImageView) bindings[4]
            , (android.widget.LinearLayout) bindings[8]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[9]
            , (androidx.recyclerview.widget.RecyclerView) bindings[1]
            , (com.airbnb.lottie.LottieAnimationView) bindings[10]
            , (android.widget.TextView) bindings[11]
            );
        this.gameLayout.setTag(null);
        this.player1Img.setTag(null);
        this.player1ScoreTxt.setTag(null);
        this.player2Img.setTag(null);
        this.player2ScoreTxt.setTag(null);
        this.productListView.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x10L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.gameVm == variableId) {
            setGameVm((com.example.matchthecards.gamefragment.GameViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setGameVm(@Nullable com.example.matchthecards.gamefragment.GameViewModel GameVm) {
        this.mGameVm = GameVm;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.gameVm);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeGameVmPlayer2Score((androidx.lifecycle.MutableLiveData<java.lang.Integer>) object, fieldId);
            case 1 :
                return onChangeGameVmPlayer1Score((androidx.lifecycle.MutableLiveData<java.lang.Integer>) object, fieldId);
            case 2 :
                return onChangeGameVmIsPlayer2((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeGameVmPlayer2Score(androidx.lifecycle.MutableLiveData<java.lang.Integer> GameVmPlayer2Score, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeGameVmPlayer1Score(androidx.lifecycle.MutableLiveData<java.lang.Integer> GameVmPlayer1Score, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeGameVmIsPlayer2(androidx.lifecycle.MutableLiveData<java.lang.Boolean> GameVmIsPlayer2, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.Integer gameVmPlayer2ScoreGetValue = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxGameVmIsPlayer2GetValue = false;
        androidx.lifecycle.MutableLiveData<java.lang.Integer> gameVmPlayer2Score = null;
        com.example.matchthecards.gamefragment.GameViewModel gameVm = mGameVm;
        androidx.lifecycle.MutableLiveData<java.lang.Integer> gameVmPlayer1Score = null;
        com.example.matchthecards.adapter.CardRecycleViewAdapter gameVmGetProductsAdapter = null;
        java.lang.Boolean gameVmIsPlayer2GetValue = null;
        java.lang.Integer gameVmPlayer1ScoreGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> gameVmIsPlayer2 = null;
        java.lang.String player1ScoreTxtAndroidStringScoreGameVmPlayer1Score = null;
        int gameVmIsPlayer2ViewGONEViewVISIBLE = 0;
        int gameVmIsPlayer2ViewVISIBLEViewGONE = 0;
        java.lang.String player2ScoreTxtAndroidStringScoreGameVmPlayer2Score = null;

        if ((dirtyFlags & 0x1fL) != 0) {


            if ((dirtyFlags & 0x19L) != 0) {

                    if (gameVm != null) {
                        // read gameVm.player2Score
                        gameVmPlayer2Score = gameVm.getPlayer2Score();
                    }
                    updateLiveDataRegistration(0, gameVmPlayer2Score);


                    if (gameVmPlayer2Score != null) {
                        // read gameVm.player2Score.getValue()
                        gameVmPlayer2ScoreGetValue = gameVmPlayer2Score.getValue();
                    }


                    // read @android:string/score
                    player2ScoreTxtAndroidStringScoreGameVmPlayer2Score = player2ScoreTxt.getResources().getString(R.string.score, gameVmPlayer2ScoreGetValue);
            }
            if ((dirtyFlags & 0x1aL) != 0) {

                    if (gameVm != null) {
                        // read gameVm.player1Score
                        gameVmPlayer1Score = gameVm.getPlayer1Score();
                    }
                    updateLiveDataRegistration(1, gameVmPlayer1Score);


                    if (gameVmPlayer1Score != null) {
                        // read gameVm.player1Score.getValue()
                        gameVmPlayer1ScoreGetValue = gameVmPlayer1Score.getValue();
                    }


                    // read @android:string/score
                    player1ScoreTxtAndroidStringScoreGameVmPlayer1Score = player1ScoreTxt.getResources().getString(R.string.score, gameVmPlayer1ScoreGetValue);
            }
            if ((dirtyFlags & 0x18L) != 0) {

                    if (gameVm != null) {
                        // read gameVm.getProductsAdapter()
                        gameVmGetProductsAdapter = gameVm.getProductsAdapter();
                    }
            }
            if ((dirtyFlags & 0x1cL) != 0) {

                    if (gameVm != null) {
                        // read gameVm.isPlayer2
                        gameVmIsPlayer2 = gameVm.isPlayer2();
                    }
                    updateLiveDataRegistration(2, gameVmIsPlayer2);


                    if (gameVmIsPlayer2 != null) {
                        // read gameVm.isPlayer2.getValue()
                        gameVmIsPlayer2GetValue = gameVmIsPlayer2.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(gameVm.isPlayer2.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxGameVmIsPlayer2GetValue = androidx.databinding.ViewDataBinding.safeUnbox(gameVmIsPlayer2GetValue);
                if((dirtyFlags & 0x1cL) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxGameVmIsPlayer2GetValue) {
                            dirtyFlags |= 0x40L;
                            dirtyFlags |= 0x100L;
                    }
                    else {
                            dirtyFlags |= 0x20L;
                            dirtyFlags |= 0x80L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(gameVm.isPlayer2.getValue()) ? View.GONE : View.VISIBLE
                    gameVmIsPlayer2ViewGONEViewVISIBLE = ((androidxDatabindingViewDataBindingSafeUnboxGameVmIsPlayer2GetValue) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
                    // read androidx.databinding.ViewDataBinding.safeUnbox(gameVm.isPlayer2.getValue()) ? View.VISIBLE : View.GONE
                    gameVmIsPlayer2ViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxGameVmIsPlayer2GetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
        }
        // batch finished
        if ((dirtyFlags & 0x1cL) != 0) {
            // api target 1

            this.player1Img.setVisibility(gameVmIsPlayer2ViewGONEViewVISIBLE);
            this.player2Img.setVisibility(gameVmIsPlayer2ViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x1aL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.player1ScoreTxt, player1ScoreTxtAndroidStringScoreGameVmPlayer1Score);
        }
        if ((dirtyFlags & 0x19L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.player2ScoreTxt, player2ScoreTxtAndroidStringScoreGameVmPlayer2Score);
        }
        if ((dirtyFlags & 0x18L) != 0) {
            // api target 1

            com.example.matchthecards.adapter.ProductsBindingAdapterKt.bindRecyclerViewAdapter(this.productListView, gameVmGetProductsAdapter);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): gameVm.player2Score
        flag 1 (0x2L): gameVm.player1Score
        flag 2 (0x3L): gameVm.isPlayer2
        flag 3 (0x4L): gameVm
        flag 4 (0x5L): null
        flag 5 (0x6L): androidx.databinding.ViewDataBinding.safeUnbox(gameVm.isPlayer2.getValue()) ? View.GONE : View.VISIBLE
        flag 6 (0x7L): androidx.databinding.ViewDataBinding.safeUnbox(gameVm.isPlayer2.getValue()) ? View.GONE : View.VISIBLE
        flag 7 (0x8L): androidx.databinding.ViewDataBinding.safeUnbox(gameVm.isPlayer2.getValue()) ? View.VISIBLE : View.GONE
        flag 8 (0x9L): androidx.databinding.ViewDataBinding.safeUnbox(gameVm.isPlayer2.getValue()) ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}