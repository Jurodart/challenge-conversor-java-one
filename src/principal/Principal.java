package principal;

import service.Service;

import java.io.IOException;

public class Principal {
    public static void main(String[] args) throws IOException, InterruptedException {
        Service service = new Service();
        service.comecaAPP();
    }
}
