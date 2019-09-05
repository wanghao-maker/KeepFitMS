package com.KeepFitMS.serviceImpl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.KeepFitMS.dao.WardrobeDao;
import com.KeepFitMS.entity.Wardrobe;
import com.KeepFitMS.service.WardrobeService;

@Service
public class WardrobeServiceImpl implements WardrobeService{

	@Resource
	private WardrobeDao wardrobeDao;
	
	@Override
	public List<Wardrobe> selectAllW() {
		return wardrobeDao.selectAllW();
	}

}