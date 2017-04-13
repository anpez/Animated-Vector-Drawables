package com.antonionicolaspina.animatedvectordrawables;

import android.databinding.BindingAdapter;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;

public class Bindings {
  @BindingAdapter("animateOnClick")
  public static void setAnimateOnClick(final ImageView view, final Drawable backDrawable) {
    final Animatable front = (Animatable) view.getDrawable();

    view.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        if (null == backDrawable) {
          front.start();
        } else {
          if (null == view.getTag()) {
            view.setImageDrawable((Drawable) front);
            front.start();
            view.setTag(0);
          } else {
            view.setImageDrawable(backDrawable);
            ((Animatable) backDrawable).start();
            view.setTag(null);
          }
        }
      }
    });
  }
}
