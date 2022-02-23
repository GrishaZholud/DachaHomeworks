package zholud.homeworks.HashTables;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;


class HashTableTest {
    private final HashTable<String> hashTable = new HashTable<>(3);
    @Test
    private void insetThreeElements() {
        hashTable.insert(10, "First");
        hashTable.insert(20, "Second");
        hashTable.insert(30, "Third");
    }

    @Test
    void operationsOnNonExistentElementTest() {
           insetThreeElements();
        assertThatExceptionOfType(IllegalArgumentException.class).isThrownBy(()-> hashTable.insert(40,"Fourth"));
        assertThatExceptionOfType(IllegalArgumentException.class).isThrownBy(()-> hashTable.find(40));
        assertThatExceptionOfType(IllegalArgumentException.class).isThrownBy(()-> hashTable.delete(40));
    }

    @Test
    void emptyTreeOperationsTest() {
        assertThatExceptionOfType(IndexOutOfBoundsException.class).isThrownBy(()-> hashTable.delete(10));
        assertThatExceptionOfType(IndexOutOfBoundsException.class).isThrownBy(()-> hashTable.find(10));
    }

    @Test
    void findTest() {
        insetThreeElements();
        assertThat(hashTable.find(10).getData()).isEqualTo("First");
        assertThat(hashTable.find(20).getData()).isEqualTo("Second");
        assertThat(hashTable.find(30).getData()).isEqualTo("Third");
    }

    @Test
    void insertTest() {
        assertThat(hashTable.isEmpty()).isEqualTo(true);
        insetThreeElements();
        assertThat(hashTable.isEmpty()).isEqualTo(false);
        assertThat(hashTable.size()).isEqualTo(3);
        assertThatExceptionOfType(IllegalArgumentException.class).isThrownBy(() -> hashTable.insert(10,"First"));
    }

    @Test
    void deleteTest() {
        insetThreeElements();
        assertThat("First").isEqualTo(hashTable.delete(10).getData());
        assertThat("Second").isEqualTo(hashTable.delete(20).getData());
        assertThat("Third").isEqualTo(hashTable.delete(30).getData());
        assertThat(hashTable.isEmpty()).isEqualTo(true);
    }
}