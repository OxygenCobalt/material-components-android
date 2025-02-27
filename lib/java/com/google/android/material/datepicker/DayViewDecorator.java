/*
 * Copyright 2022 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/**
 * A decorator which allows customizing the day of month views within a {@link MaterialDatePicker}.
 */
public abstract class DayViewDecorator implements Parcelable {

  /**
   * Override this method to return a left compound drawable for the day view corresponding to the
   * provided date.
   *
   * @param context The context of the day view
   * @param year The year number corresponding to the day view (see {@link java.util.Calendar.YEAR})
   * @param month The month number (0-11) corresponding to the day view (see {@link
   *     java.util.Calendar.MONTH})
   * @param day The day of month number corresponding to the day view (see {@link
   *     java.util.Calendar.DAY_OF_MONTH})
   * @param valid Boolean for whether the day view is in a valid state (if not valid, the day view
   *     will likely look and behave disabled)
   * @param selected Boolean for whether the day view is in a selected state (if selected, the day
   *     view will likely have a filled color background)
   * @return The left compound drawable or null
   */
  @Nullable
  public Drawable getCompoundDrawableLeft(
      @NonNull Context context, int year, int month, int day, boolean valid, boolean selected) {
    return null;
  }

  /**
   * Override this method to return a top compound drawable for the day view corresponding to the
   * provided date.
   *
   * @param context The context of the day view
   * @param year The year number corresponding to the day view (see {@link java.util.Calendar.YEAR})
   * @param month The month number (0-11) corresponding to the day view (see {@link
   *     java.util.Calendar.MONTH})
   * @param day The day of month number corresponding to the day view (see {@link
   *     java.util.Calendar.DAY_OF_MONTH})
   * @param valid Boolean for whether the day view is in a valid state (if not valid, the day view
   *     will likely look and behave disabled)
   * @param selected Boolean for whether the day view is in a selected state (if selected, the day
   *     view will likely have a filled color background)
   * @return The top compound drawable or null
   */
  @Nullable
  public Drawable getCompoundDrawableTop(
      @NonNull Context context, int year, int month, int day, boolean valid, boolean selected) {
    return null;
  }

  /**
   * Override this method to return a right compound drawable for the day view corresponding to the
   * provided date.
   *
   * @param context The context of the day view
   * @param year The year number corresponding to the day view (see {@link java.util.Calendar.YEAR})
   * @param month The month number (0-11) corresponding to the day view (see {@link
   *     java.util.Calendar.MONTH})
   * @param day The day of month number corresponding to the day view (see {@link
   *     java.util.Calendar.DAY_OF_MONTH})
   * @param valid Boolean for whether the day view is in a valid state (if not valid, the day view
   *     will likely look and behave disabled)
   * @param selected Boolean for whether the day view is in a selected state (if selected, the day
   *     view will likely have a filled color background)
   * @return The right compound drawable or null
   */
  @Nullable
  public Drawable getCompoundDrawableRight(
      @NonNull Context context, int year, int month, int day, boolean valid, boolean selected) {
    return null;
  }

  /**
   * Override this method to return a bottom compound drawable for the day view corresponding to the
   * provided date.
   *
   * @param context The context of the day view
   * @param year The year number corresponding to the day view (see {@link java.util.Calendar.YEAR})
   * @param month The month number (0-11) corresponding to the day view (see {@link
   *     java.util.Calendar.MONTH})
   * @param day The day of month number corresponding to the day view (see {@link
   *     java.util.Calendar.DAY_OF_MONTH})
   * @param valid Boolean for whether the day view is in a valid state (if not valid, the day view
   *     will likely look and behave disabled)
   * @param selected Boolean for whether the day view is in a selected state (if selected, the day
   *     view will likely have a filled color background)
   * @return The bottom compound drawable or null
   */
  @Nullable
  public Drawable getCompoundDrawableBottom(
      @NonNull Context context, int year, int month, int day, boolean valid, boolean selected) {
    return null;
  }
}
