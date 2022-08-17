public class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        long megaBytes = kiloBytes / 1024;
        long remainingKiloBytes = kiloBytes % 1024;
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + remainingKiloBytes +
                    " KB");
        }

    }
}
