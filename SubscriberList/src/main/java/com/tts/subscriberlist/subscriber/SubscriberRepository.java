package com.tts.subscriberlist.subscriber;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.GetMapping;


public interface SubscriberRepository<Subscriber, Long> extends CrudRepository<Subscriber, Long> 
{

	//	Create macro for SQL find function
//	List<Subscriber> findByLastName(String lastName);
	
	
	//	SQL query that fulfils the requirements of our search function
//	@Query
//	(value = "SELECT * FROM Subscriber t WHERE t.lastName = 'Johnson'",
//    nativeQuery=true
//	)
	
//	 @Query("SELECT t FROM Subscriber t WHERE t.last_name = 'Johnson'")
//    public List<Subscriber> findById();

//	 @Query(value = "SELECT * FROM Subscriber t WHERE " +
        //"LOWER(t.last_name) LIKE LOWER(CONCAT('%','Johnson', '%')))", [testing search value]
//        "LOWER(t.last_name) LIKE LOWER(CONCAT('%',:searchTerm, '%'))",
//        nativeQuery = true)
//List<Subscriber> findBySearchTermNative(@Param("searchTerm") String searchTerm);
	
}
