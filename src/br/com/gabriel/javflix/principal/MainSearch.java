package br.com.gabriel.javflix.principal;

import br.com.gabriel.javflix.modelo.Titulo;
import br.com.gabriel.javflix.modelo.TituloOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class MainSearch {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Qual filme deseja pesquisar?");
        var busca = leitura.nextLine().replaceAll(" ","&");

        String endereco = "http://www.omdbapi.com/?t=" + busca + "&apikey=5295ad80";
        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(endereco))
                    .build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            String json = response.body();
            System.out.println("Arquivo JSON: " + json);

            Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).create();
            TituloOmdb newtituloOmdb = gson.fromJson(json, TituloOmdb.class);
            Titulo meuTitulo = new Titulo(newtituloOmdb);
            System.out.println(meuTitulo);
        } catch (IllegalArgumentException e) {
            System.out.println("Ocorreu um erro: "+ e);

        }


    }


}
