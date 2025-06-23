package CompositePattern.interfaces;

public interface FileSystemItem {
    public int getSize();
    public void printStructure(String indent);
    public void delete();
}
