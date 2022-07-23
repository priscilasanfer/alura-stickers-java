package br.com.priscilasanfer.alurastickers;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public class GeradorDeFigurinha {

    public void cria(InputStream inputStream, String nomeArquivo) throws IOException {

        // leitura de imagens
        // InputStream inputStream = new FileInputStream(new File("src/main/resource/entrada/TopMovies_1.jpeg"));
        // InputStream inputStream = new URL("https://imersao-java-apis.s3.amazonaws.com/TopMovies_1.jpg").openStream();
        BufferedImage imagemOriginal = ImageIO.read(inputStream);

        // cria nova imagem em memoria com transparencia e com tamanho novo
        int largura = imagemOriginal.getWidth();
        int altura = imagemOriginal.getHeight();
        int novaAltura = altura + 200;
        BufferedImage novaImagem = new BufferedImage(largura, novaAltura, BufferedImage.TRANSLUCENT);

        // copiar a imagem original para novo imagem (em memoria)
        Graphics2D graphics = (Graphics2D) novaImagem.getGraphics();
        graphics.drawImage(imagemOriginal, 0, 0, null);

        // configurar a fonte
        var font = new Font(Font.SANS_SERIF, Font.BOLD, 64);
        graphics.setColor(Color.YELLOW);
        graphics.setFont(font);
        // escrever uma frase na nova imagem
        graphics.drawString("Teste", 100, novaAltura - 100);


        // escrever a nova imagem em um serviço
        ImageIO.write(novaImagem, "png", new File("src/main/resource/saida/" + nomeArquivo));

    }
}
