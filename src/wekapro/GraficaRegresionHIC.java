/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wekapro;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

/**
 *
 * @author alberto.castroc
 */
class GraficaRegresionHIC {

    private XYDataset dataset;
    
    public GraficaRegresionHIC() {
    }
    
    public ChartPanel generarGrafica(){
        XYDataset dataset = crearDataset();
        JFreeChart chart = ChartFactory.createXYLineChart("Life Expectancy vs Years", "Years" ,"Life Expectancy", dataset, PlotOrientation.VERTICAL, true, false, false);
        XYPlot plot = chart.getXYPlot();
        XYLineAndShapeRenderer andShapeRenderer = new XYLineAndShapeRenderer();
        andShapeRenderer.setSeriesShapesVisible(0, true);
        andShapeRenderer.setSeriesVisible(1, false);
        plot.setRenderer(andShapeRenderer);
        ChartPanel chartPanel = new ChartPanel(chart);
        return chartPanel;
    }

    private XYDataset crearDataset() {
        double x[] = {1,2,3,4,5,6,7,8,9,10};
        double y[] = {0.5,1,1.6,2.1,3.2,3.5,6,6.2,8,10};
        double coef[] = {0.6,0,-1};
        
        XYSeries series1 = new XYSeries("Series 1");
        XYSeries series2 = new XYSeries("Series 2");
        
        for (int i = 0; i < x.length; i++) {
            series1.add(x[i],y[i]);
            double y_mod = x[i]*coef[0]+coef[1];
            series2.add(x[i],y_mod);
        }
        
        XYSeriesCollection dataset = new XYSeriesCollection();
        dataset.addSeries(series1);
        dataset.addSeries(series2);
        return dataset;
    }

    public XYDataset getDataset() {
        return dataset;
    }

    public void setDataset(XYDataset dataset) {
        this.dataset = dataset;
    }
    
    
}
