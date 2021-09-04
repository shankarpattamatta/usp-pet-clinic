
public interface CrudService<T,ID> {

	 Set<T> findAll(T);
	 T findById(ID Id);
	 T save(T Object);
	void delete(T Object);
	void deleteById(ID id)
}
