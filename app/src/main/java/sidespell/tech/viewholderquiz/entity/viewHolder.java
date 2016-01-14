package sidespell.tech.viewholderquiz.entity;

import android.graphics.Movie;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Martino on 2016-01-14.
 */
public class viewHolder {
    public ImageView icon_movie;
    public TextView tvMoviename;
    public TextView tvMoviegenre;

    public void setDataIntoViewHolder(Movie movie){
        icon_movie.setImageResource(movie.getClass());
        tvMoviename.setText(movie.);
        tvMoviegenre.setText(movie.getClass());
    }
}
