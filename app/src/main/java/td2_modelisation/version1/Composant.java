package td2_modelisation.version1;

public interface Composant
{
   public String getname();
   public Owner getOwner();
   void setOwner(Owner owner,boolean recursive);
   int getSize();
   String getContent();
   void appendContent(String name);
   boolean isComposite();
}
