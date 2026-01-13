class korobkastrok {

    private String[] stroki;
    private int count;
    private int totalLength;

    korobkastrok(int amount) {
        stroki = new String[amount];
        count = 0;
        totalLength = 0;
    }
    void add(String string) {
        if (count == stroki.length) {
            throw new RuntimeException("Коробка строк заполнена");
        }
        int cor = count;
        for (int i = count - 1; i >= 0; i--) {
            if (stroki[i].length() > string.length()) {
                stroki[i + 1] = stroki[i];
                cor = i;
            } else {
                break;
            }
        }
        stroki[cor] = string;
        count++;
        totalLength += string.length();
    }

    String maxLength() {
        if (count == 0) {
            return null;
        }
        return stroki[count - 1];
    }

    double avgLength() {
        if (count == 0) {
            return 0;
        }
        return (double) totalLength / count;
    }
}



//korobkastrok m = new korobkastrok(5);
//m.add("Яблоко");
//m.add("Банан");
//m.add("Як");
//
//System.out.println(m.maxLength());
//System.out.println(m.avgLength());