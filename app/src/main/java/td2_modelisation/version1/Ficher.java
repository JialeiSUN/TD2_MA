package td2_modelisation.version1;

public class Ficher extends Composantlmpl implements Composant{
    private StringBuilder content;
    private String name;
    public Ficher(String name, Owner owner) {
        super(name, owner);
        content  = new StringBuilder();
    }


    @Override//erreur
    public String getname() {
        return this.name;
    }

    public int getSize(){
        return content.length();
    }

    @Override
    public String getContent() {
        return content.toString();
    }

    @Override
    public void appendContent(String name) {
            content.append(name);
    }

    @Override
    public boolean isComposite() {
        return false;
    }
    public String toString(){
        return getContent();
    }
}
