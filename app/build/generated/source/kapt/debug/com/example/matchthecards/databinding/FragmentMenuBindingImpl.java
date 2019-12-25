package com.example.matchthecards.databinding;
import com.example.matchthecards.R;
import com.example.matchthecards.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentMenuBindingImpl extends FragmentMenuBinding implements com.example.matchthecards.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.lottieAnimationView, 7);
        sViewsWithIds.put(R.id.title_txt, 8);
        sViewsWithIds.put(R.id.difficulty_layout, 9);
        sViewsWithIds.put(R.id.difficulty_txt, 10);
        sViewsWithIds.put(R.id.col_layout, 11);
        sViewsWithIds.put(R.id.col_size_txt, 12);
        sViewsWithIds.put(R.id.play_btn, 13);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback4;
    @Nullable
    private final android.view.View.OnClickListener mCallback2;
    @Nullable
    private final android.view.View.OnClickListener mCallback3;
    @Nullable
    private final android.view.View.OnClickListener mCallback1;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentMenuBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 14, sIncludes, sViewsWithIds));
    }
    private FragmentMenuBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (android.widget.LinearLayout) bindings[11]
            , (android.widget.TextView) bindings[12]
            , (android.widget.TextView) bindings[5]
            , (android.widget.LinearLayout) bindings[9]
            , (android.widget.TextView) bindings[10]
            , (android.widget.TextView) bindings[2]
            , (com.airbnb.lottie.LottieAnimationView) bindings[7]
            , (android.widget.ImageView) bindings[4]
            , (android.widget.ImageView) bindings[1]
            , (com.google.android.material.floatingactionbutton.FloatingActionButton) bindings[13]
            , (android.widget.ImageView) bindings[6]
            , (android.widget.ImageView) bindings[3]
            , (android.widget.TextView) bindings[8]
            );
        this.colVal.setTag(null);
        this.difficultyVal.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.minusColImg.setTag(null);
        this.minusDiffImg.setTag(null);
        this.plusColImg.setTag(null);
        this.plusDiff.setTag(null);
        setRootTag(root);
        // listeners
        mCallback4 = new com.example.matchthecards.generated.callback.OnClickListener(this, 4);
        mCallback2 = new com.example.matchthecards.generated.callback.OnClickListener(this, 2);
        mCallback3 = new com.example.matchthecards.generated.callback.OnClickListener(this, 3);
        mCallback1 = new com.example.matchthecards.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
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
        if (BR.menuVm == variableId) {
            setMenuVm((com.example.matchthecards.menufragment.MenuViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setMenuVm(@Nullable com.example.matchthecards.menufragment.MenuViewModel MenuVm) {
        this.mMenuVm = MenuVm;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.menuVm);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeMenuVmDifficultyLevel((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeMenuVmColumnSize((androidx.lifecycle.MutableLiveData<java.lang.Integer>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeMenuVmDifficultyLevel(androidx.lifecycle.MutableLiveData<java.lang.String> MenuVmDifficultyLevel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeMenuVmColumnSize(androidx.lifecycle.MutableLiveData<java.lang.Integer> MenuVmColumnSize, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
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
        java.lang.String menuVmDifficultyLevelGetValue = null;
        java.lang.String stringValueOfMenuVmColumnSize = null;
        java.lang.Integer menuVmColumnSizeGetValue = null;
        com.example.matchthecards.menufragment.MenuViewModel menuVm = mMenuVm;
        androidx.lifecycle.MutableLiveData<java.lang.String> menuVmDifficultyLevel = null;
        int androidxDatabindingViewDataBindingSafeUnboxMenuVmColumnSizeGetValue = 0;
        androidx.lifecycle.MutableLiveData<java.lang.Integer> menuVmColumnSize = null;

        if ((dirtyFlags & 0xfL) != 0) {


            if ((dirtyFlags & 0xdL) != 0) {

                    if (menuVm != null) {
                        // read menuVm.difficultyLevel
                        menuVmDifficultyLevel = menuVm.getDifficultyLevel();
                    }
                    updateLiveDataRegistration(0, menuVmDifficultyLevel);


                    if (menuVmDifficultyLevel != null) {
                        // read menuVm.difficultyLevel.getValue()
                        menuVmDifficultyLevelGetValue = menuVmDifficultyLevel.getValue();
                    }
            }
            if ((dirtyFlags & 0xeL) != 0) {

                    if (menuVm != null) {
                        // read menuVm.columnSize
                        menuVmColumnSize = menuVm.getColumnSize();
                    }
                    updateLiveDataRegistration(1, menuVmColumnSize);


                    if (menuVmColumnSize != null) {
                        // read menuVm.columnSize.getValue()
                        menuVmColumnSizeGetValue = menuVmColumnSize.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(menuVm.columnSize.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxMenuVmColumnSizeGetValue = androidx.databinding.ViewDataBinding.safeUnbox(menuVmColumnSizeGetValue);


                    // read String.valueOf(androidx.databinding.ViewDataBinding.safeUnbox(menuVm.columnSize.getValue()))
                    stringValueOfMenuVmColumnSize = java.lang.String.valueOf(androidxDatabindingViewDataBindingSafeUnboxMenuVmColumnSizeGetValue);
            }
        }
        // batch finished
        if ((dirtyFlags & 0xeL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.colVal, stringValueOfMenuVmColumnSize);
        }
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.difficultyVal, menuVmDifficultyLevelGetValue);
        }
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            this.minusColImg.setOnClickListener(mCallback3);
            this.minusDiffImg.setOnClickListener(mCallback1);
            this.plusColImg.setOnClickListener(mCallback4);
            this.plusDiff.setOnClickListener(mCallback2);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 4: {
                // localize variables for thread safety
                // menuVm != null
                boolean menuVmJavaLangObjectNull = false;
                // menuVm
                com.example.matchthecards.menufragment.MenuViewModel menuVm = mMenuVm;



                menuVmJavaLangObjectNull = (menuVm) != (null);
                if (menuVmJavaLangObjectNull) {


                    menuVm.columnSizeIncrementor();
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // menuVm != null
                boolean menuVmJavaLangObjectNull = false;
                // menuVm
                com.example.matchthecards.menufragment.MenuViewModel menuVm = mMenuVm;



                menuVmJavaLangObjectNull = (menuVm) != (null);
                if (menuVmJavaLangObjectNull) {


                    menuVm.diffIncrementor();
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // menuVm != null
                boolean menuVmJavaLangObjectNull = false;
                // menuVm
                com.example.matchthecards.menufragment.MenuViewModel menuVm = mMenuVm;



                menuVmJavaLangObjectNull = (menuVm) != (null);
                if (menuVmJavaLangObjectNull) {


                    menuVm.columnSizeDecrementor();
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // menuVm != null
                boolean menuVmJavaLangObjectNull = false;
                // menuVm
                com.example.matchthecards.menufragment.MenuViewModel menuVm = mMenuVm;



                menuVmJavaLangObjectNull = (menuVm) != (null);
                if (menuVmJavaLangObjectNull) {


                    menuVm.diffDecrementor();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): menuVm.difficultyLevel
        flag 1 (0x2L): menuVm.columnSize
        flag 2 (0x3L): menuVm
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}