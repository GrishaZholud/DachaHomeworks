package zholud.homeworks.TableEditor;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

class TableEditorTest {
    private TableEditor tableEditor = new TableEditor();
    private Line<Column> line = new Line<>();
    private Line<Column> line1 = new Line<>();
    private Column<Integer> column = new Column("Integer",1);
    private Column<String> column1 = new Column<>("String","1");


    @Test
    void addString() {
        tableEditor.addLine(line);
        assertThat(tableEditor.getLines().size()).isEqualTo(1);
        assertThat(tableEditor.getLines().get(0)).isEqualTo(line);
    }

    @Test
    void removeString() {
        assertThatExceptionOfType(IndexOutOfBoundsException.class).
                isThrownBy(() -> tableEditor.removeLine(0));
        tableEditor.addLine(line);
        tableEditor.addLine(line1);
        tableEditor.removeLine(0);
        assertThat(tableEditor.getLines().size()).isEqualTo(1);
        assertThat(tableEditor.getLines().get(0)).isEqualTo(line1);
    }

    @Test
    void addColumn() {
        assertThatExceptionOfType(IndexOutOfBoundsException.class).
                isThrownBy(() -> tableEditor.addColumn(column));
        tableEditor.addLine(line);
        tableEditor.addColumn(column);
        assertThat(tableEditor.getColumns().get(0)).isEqualTo(column);
    }

    @Test
    void editElementInString() {
        assertThatExceptionOfType(IndexOutOfBoundsException.class).
                isThrownBy(() -> tableEditor.editElementInString(0,0,1));
        tableEditor.addLine(line);
        tableEditor.addColumn(column);
        assertThatExceptionOfType(IllegalArgumentException.class).
                isThrownBy(() -> tableEditor.editElementInString(0,0,"S"));
        assertThatExceptionOfType(IllegalArgumentException.class).
                isThrownBy(() -> tableEditor.editElementInString(1,1,1));
    }

    @Test
    void removeColumn() {
        assertThatExceptionOfType(IndexOutOfBoundsException.class).
                isThrownBy(() -> tableEditor.removeColumn(0));
        tableEditor.addLine(line);
        tableEditor.addColumn(column);
        assertThatExceptionOfType(IllegalArgumentException.class).
                isThrownBy(() -> tableEditor.removeColumn(1));
        tableEditor.removeColumn(0);
        assertThat(tableEditor.getColumns().size()).isEqualTo(0);
    }
}