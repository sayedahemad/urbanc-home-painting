package com.company.urban.homepainting.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.urban.homepainting.entity.HomePainting;
import com.company.urban.homepainting.repository.HomePaintingRepository;
@Service
public class HomePaintingServiceImpl implements HomePaintingService {

	
	@Autowired
	private HomePaintingRepository repository;
	
	@Override
	public HomePainting saveHomePainting(HomePainting homePainting) {
		return repository.save(homePainting);
	}

	@Override
	public HomePainting updateHomePainting(HomePainting homePainting) {
		return repository.save(homePainting);
	}

	@Override
	public void deleteHomePainting(HomePainting homePainting) {
		repository.delete(homePainting);
	}

	@Override
	public HomePainting getHomePaintingById(int id) {
		return repository.findById(id).get();
	}

	@Override
	public List<HomePainting> getAllHomePaintings() {
		return repository.findAll();
	}

}
