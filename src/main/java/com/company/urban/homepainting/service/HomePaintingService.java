package com.company.urban.homepainting.service;

import java.util.List;

import com.company.urban.homepainting.entity.HomePainting;

public interface HomePaintingService {

	HomePainting saveHomePainting(HomePainting homePainting);
	
	HomePainting updateHomePainting (HomePainting homePainting);
	
	void deleteHomePainting(HomePainting homePainting);
	
	HomePainting getHomePaintingById(int id);
	
	List<HomePainting> getAllHomePaintings();
}
