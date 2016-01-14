package sidespell.tech.viewholderquiz.entity;

/**
 * Created by Martino on 2016-01-14.
 */
public class movie {
    int icon_movie;
    String movieName;
    String movieGenre;

    public movie(int icon_movie, String movieName, String movieGenre) {
        this.icon_movie = icon_movie;
        this.movieName = movieName;
        this.movieGenre = movieGenre;
    }

    public int getIcon_movie() {

        return icon_movie;
    }

    public void setIcon_movie(int icon_movie) {
        this.icon_movie = icon_movie;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getMovieGenre() {
        return movieGenre;
    }

    public void setMovieGenre(String movieGenre) {
        this.movieGenre = movieGenre;
    }
}
