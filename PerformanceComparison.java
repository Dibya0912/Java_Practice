public class PerformanceComparison {
    public static void main(String[] args) {
                long startTime = System.nanoTime();
        StringBuffer sb1 = new StringBuffer("A");
        for (int i = 0; i < 100000; i++) {
            sb1.append("B");
        }
        long endTime = System.nanoTime();
        System.out.println("Time with StringBuffer: " + (endTime - startTime) + " ns");

        startTime = System.nanoTime();
        StringBuilder sb2 = new StringBuilder("A");
        for (int i = 0; i < 100000; i++) {
            sb2.append("B");
        }
        endTime = System.nanoTime();
        System.out.println("Time with StringBuilder: " + (endTime - startTime) + " ns");
    }
}
