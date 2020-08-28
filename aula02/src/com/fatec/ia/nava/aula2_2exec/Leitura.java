package com.fatec.ia.nava.aula2_2exec;

import weka.core.Instances;
import weka.core.converters.ConverterUtils.DataSource;
import weka.filters.Filter;
import weka.filters.unsupervised.attribute.Remove;

public class Leitura {
    public static void main(String[] args) throws Exception {
        String path = "<REPLACE>/ia-aula-fatec/aula02/";
        DataSource arquivo = new DataSource(path + "data/zoo.arff");
        Instances dados = arquivo.getDataSet();
        System.out.println("Instancias lidas: "  + dados.numInstances());

        String[] parametros = new String[] {"-R", "1"};
        Remove filtro = new Remove();
        filtro.setOptions(parametros);
        filtro.setInputFormat(dados);
        dados = Filter.useFilter(dados, filtro);
    }
}
