class StringArray {
    private String[] array;
    private int count; // сколько элементов уже есть

    StringArray(int size) {
        array = new String[size];
        count = 0;
    }

    void add(String str) {
        if (count >= array.length) {
            String[] newArray = new String[array.length * 2];
            for (int i = 0; i < array.length; i++) {
                newArray[i] = array[i];
            }
            array = newArray;
        }

        int pos = 0;
        while (pos < count && array[pos].length() < str.length()) {
            pos++;
        }

        for (int i = count; i > pos; i--) {
            array[i] = array[i - 1];
        }

        array[pos] = str;
        count++;
    }

    String getMax() {
        if (count == 0) return null;
        return array[count - 1]; // последняя самая длинная
    }

    double getAverageLength() {
        if (count == 0) return 0;

        int totalLength = 0;
        for (int i = 0; i < count; i++) {
            totalLength += array[i].length();
        }

        return (double) totalLength / count;
    }

    void printAll() {
        System.out.println("Все строки:");
        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + ". \"" + array[i] + "\" (длина: " + array[i].length() + ")");
        }
    }
}
