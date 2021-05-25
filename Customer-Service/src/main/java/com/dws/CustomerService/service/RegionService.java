package com.dws.CustomerService.service;

import java.util.List;

import com.dws.CustomerService.dto.Region;
import com.dws.CustomerService.dto.RespuestaApi;

public interface RegionService {
	
	public List<Region> getRegions();
	
	public Region getRegion(int id);
	
	public RespuestaApi createRegion(Region region);
	
	public RespuestaApi updateRegion(Region region, int id);
	
	public RespuestaApi deleteRegion(int id);
}









