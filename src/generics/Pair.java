package generics;

@SuppressWarnings("unchecked")

public class Pair<K, V> {

    K key;
    V value;
    int primeNumber = 13;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pair<K, V> pair = (Pair<K, V>) o;
        if (key != null && value != null) {
            return key.equals(pair.key) && value.equals(pair.value);
        }
        return key == null && value == null && pair.key == null && pair.value == null;
    }

    @Override
    public int hashCode() {
        if (key != null && value != null) {
            return key.hashCode() / primeNumber + value.hashCode() / primeNumber;
        }
        return Integer.MIN_VALUE;
    }

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public void setValue(V value) {
        this.value = value;
    }
}
