/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QUIZ.IF10K.NIM10119907.TDONI;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author aris
 */
public class Customer extends ServicePrice implements CustomerInvoice{

    private String name;
    private String email;
    private boolean member;
    
    
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the member
     */
    public boolean isMember() {
        return member;
    }

    /**
     * @param member the member to set
     */
    public void setMember(boolean member) {
        this.member = member;
    } 

    @Override
    public String currentTime() {
        int hari, detik, menit, jam, tanggal, bulan, tahun;

        GregorianCalendar date = new GregorianCalendar();

        String namaBulan[] = {"Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus", "September", "Oktober", "November", "Desember"};
        String namaHari[] = {"Minggu", "Senin", "Selasa", "Rabu", "Kamis", "Jumat", "Sabtu"};

        detik = date.get(Calendar.SECOND);
        menit = date.get(Calendar.MINUTE);
        jam = date.get(Calendar.HOUR_OF_DAY);
        hari = date.get(Calendar.DAY_OF_WEEK);
        tanggal = date.get(Calendar.DAY_OF_MONTH);
        bulan = date.get(Calendar.MONTH);
        tahun = date.get(Calendar.YEAR);

        return namaHari[hari - 1] + ", " + tanggal + " " + namaBulan[bulan] + " " + tahun + " " + jam + ":" + menit + ":" + detik;
    }
}
