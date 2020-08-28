package com.fatec.ia.nava.aula2_1exec;

import weka.core.Instances;
import weka.core.converters.ConverterUtils.DataSource;

public class Main {

    public static void main(String[] args) throws Exception{
        String path = "<REPLACE>/ia-aula-fatec/aula02/";
        DataSource arquivo = new DataSource(path + "data/zoo.arff");
        Instances dados = arquivo.getDataSet();
        System.out.println("Instancia lidas " + dados.numInstances());
    }
}
