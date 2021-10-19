package td2_modelisation.version1;

import java.util.List;

public class Repertoire extends Composantlmpl implements Composite{
    protected Repertoire(String name, Owner owner) {
        super(name, owner);
    }

    @Override
    public String getname() {
        return null;
    }

    @Override
    public int getSize() {
        return 0;
    }

    @Override
    public String getContent() {
        return null;
    }

    @Override
    public void appendContent(String name) {

    }

    @Override
    public boolean isComposite() {
        return false;
    }
    public List<Composant> getChildren(){
        return null;
    }

    @Override
    public void addChild(Object o) {

    }

    @Override
    public boolean removeChild(Object o) {
        return false;
    }

    @Override
    public boolean removeChildren(List t) {
        return false;
    }

}
