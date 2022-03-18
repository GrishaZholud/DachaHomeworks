package zholud.homeworks.TableEditor;

public class Application {
    public static void main(java.lang.String[] args) {
        Line stringEditor = new Line();
        Line stringEditor2 = new Line();
        Line stringEditor3 = new Line();
        Column<Integer> columns = new Column<>("Integer",1);
        Column<String> columns1 = new Column<>("String","S");
        TableEditor<Line> stringEditorTableEditor = new TableEditor<>();
        stringEditorTableEditor.addLine(stringEditor);
        stringEditorTableEditor.addLine(stringEditor2);
        stringEditorTableEditor.addLine(stringEditor3);
        stringEditorTableEditor.addColumn(columns);
        stringEditorTableEditor.addColumn(columns1);
        stringEditorTableEditor.editElementInString(2,1,"s");
        for (Line s : stringEditorTableEditor.getLines()) {
            for (Object o : s.getElements()) {
                System.out.print(o + " ");
            }
            System.out.println("");
        }
    }
}
