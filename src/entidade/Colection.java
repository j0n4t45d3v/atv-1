package entidade;

public class Colection {
    private String nomeSite;
    private String linkSite;

    public Colection(String nomeSite, String linkSite) {
        this.nomeSite = nomeSite;
        this.linkSite = linkSite;
    }

    public String getNomeSite() {
        return nomeSite;
    }

    public void setNomeSite(String nomeSite) {
        this.nomeSite = nomeSite;
    }

    public String getLinkSite() {
        return linkSite;
    }

    public void setLinkSite(String linkSite) {
        this.linkSite = linkSite;
    }
}
