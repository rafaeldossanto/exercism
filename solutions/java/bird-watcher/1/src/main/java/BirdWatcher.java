import java.util.Arrays;

class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return  birdsPerDay.clone();
    }

    public int getToday() {
        BirdWatcher birdWatcher = new BirdWatcher(birdsPerDay);
        return birdWatcher.birdsPerDay[birdsPerDay.length -1];
    }

    public void incrementTodaysCount() {
        birdsPerDay[birdsPerDay.length-1]++;
    }

    public boolean hasDayWithoutBirds() {
        BirdWatcher birdWatcher = new BirdWatcher(birdsPerDay);
        return Arrays.stream(birdWatcher.birdsPerDay).anyMatch(n -> n == 0);
    }

    public int getCountForFirstDays(int numberOfDays) {
        int days = Math.max(0, Math.min(numberOfDays, birdsPerDay.length));
        return Arrays.stream(birdsPerDay, 0, days).sum();
    }

    public int getBusyDays() {
        BirdWatcher birdWatcher = new BirdWatcher(birdsPerDay);
        return Arrays.stream(birdWatcher.birdsPerDay).filter(n -> n >= 5).toArray().length;
    }
}
