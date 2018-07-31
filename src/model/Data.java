/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author carvalui
 */
public class Data {

    private String[] dia;
    private String[] mes;
    private String[] ano;
    private int diaHoje;
    private int mesHoje;
    private int anoHoje;
    private String dataHoje;

    public String[] getDia() {
        return dia;
    }

    public String[] getMes() {
        return mes;
    }

    public String[] getAno() {
        return ano;
    }

    public int getDiaHoje() {
        return diaHoje;
    }

    public int getMesHoje() {
        return mesHoje;
    }

    public int getAnoHoje() {
        return anoHoje;
    }

    public String getDataHoje() {
        return dataHoje;
    }

    public void setListaDeDatas() {
        this.dia = new String[]{"1",
            "2", "3", "4", "5", "6", "7", "8", "9", "10", "11",
            "12", "13", "14", "15", "16", "17", "18", "19", "20",
            "21", "22", "23", "24", "25", "26", "27", "28", "29",
            "30", "31"};
        this.mes = new String[]{"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho",
            "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
        this.ano = new String[]{"2015",
            "2016", "2017", "2018", "2019", "2020"};
    }

    public void setDiaMesAno() {
        Calendar now = Calendar.getInstance();
        mesHoje = now.get(Calendar.MONTH);
        diaHoje = now.get(Calendar.DAY_OF_MONTH);
        anoHoje = now.get(Calendar.YEAR);
    }

    public void setDataAtual() {
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date();
        dataHoje = df.format(date);
    }

    public Date formataDataParaDate(String data) throws Exception {
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        df.setLenient(false);
        return df.parse(data);
    }

    public String formataDataParaString(Date data) throws Exception {
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        df.setLenient(false);
        return df.format(data);
    }
    
    public Date formaData(int dia, int mes, int ano) throws Exception {
        String diaPego;
        String mesPego;
        String data;
        if (mes < 10) {
            mesPego = "0" + mes;
        } else {
            mesPego = Integer.toString(mes);
        }
        if (dia < 10) {
            diaPego = "0" + dia;
        } else {
            diaPego = Integer.toString(dia);
        }

        data = diaPego + "/" + mesPego + "/" + ano;
        Date dataFormatada = formataDataParaDate(data);

        return dataFormatada;
    }

    public boolean verificaFinalSemana(Date data) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(data);
        
        if(cal.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY || cal.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
            return true;
        }
        
        return false;
    }
        
}
