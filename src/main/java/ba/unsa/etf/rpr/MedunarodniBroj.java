package ba.unsa.etf.rpr;

public class MedunarodniBroj extends TelefonskiBroj{
    private String drzava;
    private String broj;

    public MedunarodniBroj(String drzava, String broj) {
        this.drzava = drzava;
        this.broj = broj;
    }

    @Override
    public String ispisi() {
        return null;
    }

    @Override
    public int hashCode() {
        return 0;
    }
}
