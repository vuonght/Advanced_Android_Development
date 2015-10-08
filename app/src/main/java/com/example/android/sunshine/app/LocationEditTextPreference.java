package com.example.android.sunshine.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.preference.EditTextPreference;
import android.util.AttributeSet;
import android.util.Log;

/**
 * Created by silare on 10/8/15.
 */
public class LocationEditTextPreference extends EditTextPreference
{
    private int minLength;
    private static final int DEFAULT_MINIMUM_LOCATION_LENGTH = 0;

    private final String LOG_TAG = this.getClass().getSimpleName();

    public LocationEditTextPreference(Context context, AttributeSet attrs)
    {
        super(context, attrs);
        TypedArray typedArray = context.getTheme().obtainStyledAttributes(
                attrs,
                R.styleable.LocationEditTextPreference,
                0,
                0
        );
        try
        {
            minLength = typedArray.getInteger(R.styleable.LocationEditTextPreference_minLength,
                    DEFAULT_MINIMUM_LOCATION_LENGTH);
            Log.d(LOG_TAG, "minLength = " + minLength);
        }
        finally
        {
            typedArray.recycle();
        }
    }
}
