package td2_modelisation.version1;

import java.util.ArrayList;
import java.util.List;

public class Repertoire extends Composantlmpl implements Composant,Composite<Composant>{

    private List<Composant> children;
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
    public void appendContent(String name){

    }
    public Composant appendContentToDir(String content) {
        FSFactory fsFactory = FSFactory.getInstance();
        Composant fichier = fsFactory.createComposant(ComposantType.FICHER,String.valueOf("file"),this.getOwner());
        fichier.appendContent(content);
        addChild(fichier);
        return fichier;
    }

    @Override
    public boolean isComposite() {
        return true;
    }
    public List<Composant> getChildren(){
        return new ArrayList<>(this.children);
    }

    @Override
    public void addChild(Composant composant) {
        this.children.add(composant);
    }

    @Override
    public boolean removeChild(Composant composant) {
        return false;
    }


    @Override
    public boolean removeChildren(List t) {
        return false;
    }

}
