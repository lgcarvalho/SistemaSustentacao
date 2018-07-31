/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import model.Data;
import model.Produtividade;
import dao.ProdutividadeDAO;
import java.util.Date;

/**
 *
 * @author carvalui
 */
public class TesteData {
    public static void main(String[] args) throws Exception {
        Data data = new Data();
        
        String dataPega = "27/09/2017";
        
        Date dataFormatada = data.formataDataParaDate(dataPega);
        
        System.out.println(dataFormatada);
        
        Produtividade p = new Produtividade();
        p.setDataProdutividade(dataFormatada);
        p.setIdAnalista(7L);
        
        System.out.println(data.formataDataParaString(dataFormatada));
    }
}
