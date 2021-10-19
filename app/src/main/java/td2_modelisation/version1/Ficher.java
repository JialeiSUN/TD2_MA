package td2_modelisation.version1;

public class Ficher extends Composantlmpl{
    StringBuilder content;
    public Ficher(String name, Owner owner) {
        super(name, owner);
    }


    @Override
    public String getname() {
        return null;
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

}
