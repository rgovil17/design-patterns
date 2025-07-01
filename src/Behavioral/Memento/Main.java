package Behavioral.Memento;

import Behavioral.Memento.impl.TextEditor;
import Behavioral.Memento.impl.TextEditorUndoManager;

public class Main {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        TextEditorUndoManager undoManager = new TextEditorUndoManager();

        editor.type("Hello");
        undoManager.save(editor);

        editor.type(" World");
        undoManager.save(editor);

        editor.type("!");
        System.out.println("Current content: " + editor.getContent());

        System.out.println("\n==== UNDO 1 ====");
        undoManager.undo(editor);

        System.out.println("\n==== UNDO 2 ====");
        undoManager.undo(editor);

        System.out.println("\n==== UNDO 3 ====");
        undoManager.undo(editor);
    }
}
