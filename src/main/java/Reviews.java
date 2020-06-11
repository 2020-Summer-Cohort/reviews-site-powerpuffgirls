public class Reviews {
    private String showTitle;
    private Integer showRating;
    private String airDate;
    private String description;

    public Reviews(String showTitle, Integer showRating, String airDate, String description) {
        this.showTitle = showTitle;
        this.showRating = showRating;
        this.airDate = airDate;
        this.description = description;
    }

    public String getShowTitle() {
        return showTitle;
    }

    public Integer getShowRating() {
        return showRating;
    }

    public String getAirDate() {
        return airDate;
    }

    public String getDescription() {
        return description;
    }
}
