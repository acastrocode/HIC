/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wekapro;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.xy.XYDataset;

/**
 *
 * @author alberto.castroc
 */
public class GraficaDispersion {

    public GraficaDispersion() {
    }
    
    public ChartPanel generarGrafica(){
        
        XYDataset dataset = crearDataSet();
        JFreeChart freeChart = ChartFactory.createScatterPlot("X vs Y", "X", "Y", dataset);
        ChartPanel chartPanel = new ChartPanel(freeChart);
        return chartPanel;
    }

    private XYDataset crearDataSet() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
