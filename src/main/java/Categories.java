public class Categories {
    public class categories{

        private String adultAnimation;
        private String kidsShows;
        private String tags;

        public categories(String adultAnimation, String kidsShows, String tags) {
            this.adultAnimation = adultAnimation;
            this.kidsShows = kidsShows;
            this.tags = tags;
        }
        public String getAdultAnimation() {
            return adultAnimation;
        }

        public String getKidsShows() {
            return kidsShows;
        }

        public String getTags() {
            return tags;
        }
    }
}
