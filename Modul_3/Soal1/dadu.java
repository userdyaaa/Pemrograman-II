package Soal1;

import java.util.Random;

public class dadu {
    private int nilai;

    public dadu() {
        acakNilai();
    }

    public void acakNilai() {
        Random random = new Random();
        this.nilai = random.nextInt(6) + 1;
    }

    public int getNilai() {
        return nilai;
    }
}