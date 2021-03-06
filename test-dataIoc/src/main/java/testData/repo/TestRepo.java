package testData.repo;

import data.model.Repository;
import java.util.List;
import testData.model.TestModel;

@ioc.annotation.Repository(name = "testRepo")
public interface TestRepo extends Repository<TestModel, Long> {

	TestModel findByName(String name);

	TestModel findById(Long id);

	List<TestModel> findByNameAndId(String name, Long id);

	TestModel findBySurname(String name);

	void remove(TestModel testModel);

}
