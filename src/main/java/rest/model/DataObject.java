package rest.model;


public class DataObject {
    private int check_id;
    private int nds;
    private String drug;
    private String fabr;
    private String form;
    private String srokGodn;
    private int quanity;
    private double sumRozn;

    public DataObject() {
    }

    public DataObject(int check_id, int nds, String drug, String fabr, String form, String srokGodn, int quanity, double sumRozn) {
        this.check_id = check_id;
        this.nds = nds;
        this.drug = drug;
        this.fabr = fabr;
        this.form = form;
        this.srokGodn = srokGodn;
        this.quanity = quanity;
        this.sumRozn = sumRozn;
    }

    public int getCheck_id() {
        return check_id;
    }

    public void setCheck_id(int check_id) {
        this.check_id = check_id;
    }

    public int getNds() {
        return nds;
    }

    public void setNds(int nds) {
        this.nds = nds;
    }

    public String getDrug() {
        return drug;
    }

    public void setDrug(String drug) {
        this.drug = drug;
    }

    public String getFabr() {
        return fabr;
    }

    public void setFabr(String fabr) {
        this.fabr = fabr;
    }

    public String getForm() {
        return form;
    }

    public void setForm(String form) {
        this.form = form;
    }

    public String getSrokGodn() {
        return srokGodn;
    }

    public void setSrokGodn(String srokGodn) {
        this.srokGodn = srokGodn;
    }

    public int getQuanity() {
        return quanity;
    }

    public void setQuanity(int quanity) {
        this.quanity = quanity;
    }

    public double getSumRozn() {
        return sumRozn;
    }

    public void setSumRozn(double sumRozn) {
        this.sumRozn = sumRozn;
    }

    @Override
    public String toString() {
        return "DataObject{" +
                "check_id=" + check_id +
                ", nds=" + nds +
                ", drug='" + drug + '\'' +
                ", fabr='" + fabr + '\'' +
                ", form='" + form + '\'' +
                ", srokGodn='" + srokGodn + '\'' +
                ", quanity=" + quanity +
                ", sumRozn=" + sumRozn +
                '}';
    }
}
