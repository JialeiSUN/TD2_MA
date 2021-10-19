package td2_modelisation.version1;

import java.util.Objects;

public abstract class Composantlmpl implements Composant {
    private final String name;
    private Owner owner;
    protected Composantlmpl(String name,Owner owner) {
        this.name = name;
        this.owner = owner;
    }


    public String getName() {
        return name;
    }
    public Owner getOwner(){
        return  owner;
    }

    public void setOwner(Owner owner, boolean recursive) {
        this.owner = owner;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Composantlmpl that = (Composantlmpl) o;
        return Objects.equals(name, that.name) && Objects.equals(owner, that.owner);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, owner);
    }
}
