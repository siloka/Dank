package me.saket.dank.widgets;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

/**
 * Intercepts scrolling if the current image can be panned further.
 */
public class ScrollInterceptibleViewPager extends ViewPager {

  private OnInterceptScrollListener onInterceptScrollListener;

  public interface OnInterceptScrollListener {
    /**
     * Return true if the scroll should be intercepted before it reaches this ViewPager.
     */
    boolean onInterceptScroll(View view, int deltaX, int touchX, int touchY);
  }

  public ScrollInterceptibleViewPager(Context context, AttributeSet attrs) {
    super(context, attrs);
  }

  public void setOnInterceptScrollListener(OnInterceptScrollListener listener) {
    onInterceptScrollListener = listener;
  }

  /**
   * Called by ViewPager for all children Views in a recursive way (top to bottom).
   */
  @Override
  protected boolean canScroll(View view, boolean checkView, int dx, int x, int y) {
    boolean intercepted = onInterceptScrollListener.onInterceptScroll(view, dx, x, y);

    if (intercepted) {
      return true;
    } else {
      return super.canScroll(view, checkView, dx, x, y);
    }
  }

  @Override
  @SuppressLint("ClickableViewAccessibility")
  public boolean onTouchEvent(MotionEvent event) {
    // Only handle one finger touches! otherwise, the user probably does want to scale/pan
    return event.getPointerCount() == 1 && super.onTouchEvent(event);
  }
}
