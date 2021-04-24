import java.util.Scanner;

class music1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        music[] m = new music[4];
        for (int i = 0; i < m.length; i++) {
            m[i] = new music(sc.nextLine(), Integer.parseInt(sc.nextLine()), sc.nextLine(), sc.nextLine(),
                    Double.parseDouble(sc.nextLine()));
        }
        String lang = sc.nextLine();
        String art = sc.nextLine();

        music[] res = findsonglanguage(m, lang);
        if (res == null) {
            System.out.println("There is no song with the given language");
        } else {
            for (int i = 0; i < res.length; i++) {
                System.out.println(res[i].getname());
            }
        }
        music[] res1 = findsongbasedonartist(m, art);
        if (res1 == null) {
            System.out.println("no song found with give artist");
        } else {
            for (int i = 0; i < res1.length; i++) {
                System.out.println(res[i].getname());
                System.out.println(res[i].getrating());

            }
        }

    }

    public static music[] findsonglanguage(music[] m, String lang) {
        music[] ans;
        int j = 0;
        for (int i = 0; i < m.length; i++) {
            if (m[i].getlanguage().equalsIgnoreCase(lang)) {
                j++;
            }
        }
        ans = new music[j];
        j = 0;
        for (int i = 0; i < ans.length; i++) {

            if (m[i].getlanguage().equalsIgnoreCase(lang)) {
                ans[j] = m[i];
                j++;
            }

        }
        if (j == 0)
            return null;
        else
            return ans;
    }

    public static music[] findsongbasedonartist(music[] m, String art) {
        int j = 0;
        music[] ans2;
        for (int i = 0; i < m.length; i++) {
            if (m[i].getartist().equalsIgnoreCase(art)) {
                j++;
            }
        }
        ans2 = new music[j];
        j = 0;
        for (int i = 0; i < m.length; i++) {
            if (m[i].getartist().equalsIgnoreCase(art)) {
                ans2[j] = m[i];
                j++;

            }
        }
        for (int i = 0; i < j; i++) {
            for (int k = i + 1; k < j; k++) {
                if (ans2[k].getrating() < ans2[i].getrating()) {
                    music temp = ans2[k];
                    ans2[k] = ans2[i];
                    ans2[i] = temp;
                }

            }
        }
        if (j == 0)
            return null;
        else
            return ans2;

    }

}

class music {
    private String name;
    private int duration;
    private String artist;
    private String language;
    private double rating;

    music(String name, int duration, String artist, String language, double rating) {
        this.name = name;
        this.duration = duration;
        this.artist = artist;
        this.language = language;
        this.rating = rating;
    }

    public String getname() {
        return name;
    }

    public int getduration() {
        return duration;

    }

    public String getartist() {
        return artist;
    }

    public String getlanguage() {
        return language;
    }

    public double getrating() {
        return rating;
    }

}
