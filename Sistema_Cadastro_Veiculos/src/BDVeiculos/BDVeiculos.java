package BDVeiculos;

import Carga.Carga;
import Exception.VeicExistException;
import Passeio.Passeio;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author daniel
 */
public class BDVeiculos {

    List<Passeio> pass = new ArrayList<>();
    List<Carga> carga = new ArrayList<>();

    public BDVeiculos() {
    }

    public List<Passeio> getPass() {
        return pass;
    }

    public void setPass(List<Passeio> pass) {
        this.pass = pass;

    }

    public List<Carga> getCarga() {
        return carga;
    }

    public void setCarga(List<Carga> carga) {
        this.carga = carga;
    }

    public void addVeiculosPasseio(Passeio aux1) {
        
        pass.add(aux1);

    }

    public void addVeiculosCarga(Carga aux1) {
        carga.add(aux1);

    }

    public void excluirVeiculoPasseio(String placa) {
        if (pass.isEmpty()) {
            throw new VeicExistException("LISTA VAZIA");
        } else {
            for (int i = 0; i < pass.size(); i++) {
                if (pass.get(i).getPlaca().equalsIgnoreCase(placa)) {
                    pass.remove(i);
                    System.out.println(" VEICULO EXCLUIDO ");
                } else {
                    throw new VeicExistException("VEICULO NAO EXISTE");
                }
                {
                }

            }

        }

    }

    public void excluirVeiculoCarga(String placa) {

        if (carga.isEmpty()) {
            throw new VeicExistException("LISTA VAZIA");
        } else {
            for (int i = 0; i < carga.size(); i++) {
                if (carga.get(i).getPlaca().equalsIgnoreCase(placa)) {
                    carga.remove(i);
                    System.out.println(" VEICULO EXCLUIDO ");
                } else {
                    throw new VeicExistException("VEICULO NAO EXISTE");
                }
                {
                }

            }

        }
    }

    public void verificarPlacaPasseio(String placa) {
        for (Passeio p1 : pass) {
            if (p1.getPlaca().equalsIgnoreCase(placa)) {
                throw new VeicExistException("\"==============# ATENCAO #==============\n"
                        + " # VEICULO COM A PLACA CADASTRADO #\n");

            }

        }
    }

    public void verificarPlacaCarga(String placa) {
        for (Carga c1 : carga) {
            if (c1.getPlaca().equalsIgnoreCase(placa)) {
                throw new VeicExistException("\"==============# ATENCAO #==============\n"
                        + " # VEICULO COM A PLACA CADASTRADO #\n");

            }

        }
    }

    public void listarVeiculosPasseio() {
        if (pass.isEmpty()) {
            System.out.println("# LISTA VAZIA #\n");
        } else {
            for (Passeio p1 : pass) {
                System.out.println("###### VEICULO DE PASSEIO ######");
                System.out.println(p1);
                System.out.println("Valor calculado - Interface:" + p1.cacular());
                System.out.println("\n");
            }

        }

    }

    public void listarVeiculosCarga() {

        if (carga.isEmpty()) {
            System.out.println("# LISTA VAZIA #\n");
        } else {

            for (Carga c2 : carga) {
                System.out.println(c2);
                System.out.println("Valor calculado - Interface:" + c2.cacular());
                System.out.println("\n");

            }

        }

    }

    public void listarVeicPlacaPasseio(String placa) {

        if (pass.isEmpty()) {
            throw new VeicExistException("# LISTA VAZIA #");
        }
        for (Passeio p1 : pass) {
            if (p1.getPlaca().equalsIgnoreCase(placa)) {
                System.out.println(p1);
            } else {
                throw new VeicExistException("VEICULO NAO EXISTE");
            }
        }
    }

    public void listarVeicPlacaCarga(String placa) {

        if (carga.isEmpty()) {
            throw new VeicExistException("# LISTA VAZIA #");
        }
        for (Carga p1 : carga) {
            if (p1.getPlaca().equalsIgnoreCase(placa)) {
                System.out.println(p1);
            } else {
                throw new VeicExistException("VEICULO NAO EXISTE");
            }
        }
    }
}
