package bank;

public class Tabungan {

    private String idTabungan;
    private String password;
    private int saldo;

    public Tabungan(int saldo) {
        this.saldo = saldo;
    }

    public Tabungan(String idT, String pass, int saldo) {
        this.idTabungan = idT;
        this.password = pass;
        this.saldo = saldo;
    }

    public void simpanUang(int jumlah) {
        saldo += jumlah;
    }

    public boolean ambilUang(int jumlah) {
        if ((saldo - jumlah) < 0) {
            return false;
        } else {
            saldo -= jumlah;
            return true;
        }
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public boolean transfer(Tabungan t, int jumlah)
    { 
        if ( saldo >= jumlah )
        { 
            saldo -= jumlah;
            int saldoSaya = getSaldo();
            int saldoTujuan = t.getSaldo();
            
            t.setSaldo(saldoTujuan += jumlah);
            
            return true;
        }
        else 
        {
            return false;
        }
    }


    @Override
    public String toString() {
        return "Tabungan{" + "idTabungan=" + idTabungan + ", password=" + password + ", saldo=" + saldo + '}';
    }
}