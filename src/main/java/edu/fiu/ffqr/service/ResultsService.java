/*
 * Author: Dariana Gonzalez
 */
package edu.fiu.ffqr.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import edu.fiu.ffqr.models.Result;
import edu.fiu.ffqr.repositories.FFQResponsesRepository;

@Service
@Component
public class ResultsService {

	@Autowired
	private FFQResponsesRepository responsesRepository;
	
	public List<Result> getAll() {
		return responsesRepository.findAll();
	}
	
	public Result create(Result results) {		
		return responsesRepository.save(results);
	}
}
