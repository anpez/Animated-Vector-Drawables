package com.antonionicolaspina.animatedvectordrawables;

import android.databinding.BindingAdapter;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;

public class Bindings {
  @BindingAdapter("animateOnClick")
  public static void setAnimateOnClick(final ImageView view, boolean animate) {
    if (animate) {
      view.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
          Drawable d = view.getDrawable();
          if (d instanceof Animatable) {
            ((Animatable) d).start();
          }
        }
      });
    } else {
      view.setOnClickListener(null);
    }
  }
}
