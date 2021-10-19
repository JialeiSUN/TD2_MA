package td2_modelisation.version1;

public final class FSFactory {
    public static final FSFactory INSTANCE = new FSFactory();
    private FSFactory(){}
    public static FSFactory getInstance(){
        return INSTANCE;
    }
    public Composant createComposant(ComposantType type, String name, Owner){
        swich(type){
            case REPERTOIRE:
                return new Repertoire(name,owner);
            default: return new Ficher(name,owner);
        }
    }

}
