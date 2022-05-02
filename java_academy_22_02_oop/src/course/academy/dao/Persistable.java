package course.academy.dao;

public interface Persistable {

        void load();
        /**
         * Persists data to external storage
         */
        void save();
}
