import java.util.ArrayList;

public class ContentDemo {
    public static void main(String[] args) {

        ArrayList<ContentItem> items = new ArrayList<>();

        items.add(new VideoLecture("Java OOP Basics", 2024, 60, "HD"));
        items.add(new VideoLecture("Data Structures", 2022, 90, "4K"));

        items.add(new PodcastEpisode("Tech Talks", 2023, 45, "Alice"));
        items.add(new PodcastEpisode("Programming Life", 2021, 30, "Bob"));

        int currentYear = java.time.Year.now().getValue();

        for (ContentItem item : items) {
            System.out.println(item +
                    " | licenseCost=" +
                    item.getLicenseCost(currentYear));

            if (item instanceof Downloadable) {
                Downloadable d = (Downloadable) item;
                d.download();
                System.out.println("Max downloads/day: " +
                        d.getMaxDownloadsPerDay());
            }

            System.out.println("------------------------");
        }
    }
}
