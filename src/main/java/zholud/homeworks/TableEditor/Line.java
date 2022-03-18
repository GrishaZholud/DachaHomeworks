package zholud.homeworks.TableEditor;

import java.util.LinkedList;

public class Line<Columns> {
    private LinkedList<Columns> elements;

    public Line() {
        elements = new LinkedList<>();
    }

    public int getSizeElements() {
        return elements.size();
    }

    public LinkedList<Columns> getElements() {
        return elements;
    }
}
