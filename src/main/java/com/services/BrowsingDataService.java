package com.services;

import java.text.ParseException;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jpaRepos.JpaRepos;
import com.tp4.entities.BrowsingData;

@Service
public class BrowsingDataService {
	  @Autowired
	  JpaRepos dao;

	  public List<BrowsingData> getAll() {
	        return dao.findAll();
	  }

	  public void newData(String browser, String os)  throws ParseException  {
		  BrowsingData data = new BrowsingData(browser, os);
		  dao.save(data);
	  }

		public String getHighestBrowser(List<BrowsingData> data) {
			HashMap<String, Integer> browserInfo = new HashMap();

			for (BrowsingData bd : data) {
				if (browserInfo.containsKey(bd.getBrowser())) {
					browserInfo.put(bd.getBrowser(), 1);
				} else {
					int amount = browserInfo.get(bd.getBrowser());

					browserInfo.replace(bd.getBrowser(), amount + 1);
				}
			}

			return getMaxString(browserInfo);
		}

		public String getHighestOS(List<BrowsingData> data) {
			HashMap<String, Integer> osInfo = new HashMap();

			for (BrowsingData bd : data) {
				if (osInfo.containsKey(bd.getOs())) {
					osInfo.put(bd.getOs(), 1);
				} else {
					int amount = osInfo.get(bd.getOs());

					osInfo.replace(bd.getOs(), amount + 1);
				}
			}

			return getMaxString(osInfo);
		}
		
		public BrowsingData getHighestCombination(List<BrowsingData> data) {
			HashMap<BrowsingData, Integer> browsingInfo = new HashMap();
			
			for (BrowsingData bd : data) {
				if (findEquality(browsingInfo, bd)) {
					browsingInfo.put(bd, 1);
				} else {
					int amount = browsingInfo.get(getEqual(browsingInfo, bd));

					browsingInfo.replace(getEqual(browsingInfo, bd), amount + 1);
				}
			}
			
			return getMaxBd(browsingInfo);
		}

		private String getMaxString(HashMap<String, Integer> map) {
			String maxValue = null;
			int maxAmount = 0;

			for (Entry<String, Integer> i : map.entrySet()) {
				String iteration = i.getKey();
				Integer quantity = map.get(iteration);
				if (quantity > maxAmount) {
					maxAmount = quantity;
					maxValue = iteration;
				}
			}

			return maxValue;
		}

		private BrowsingData getMaxBd(HashMap<BrowsingData, Integer> map) {
			BrowsingData maxValue = null;
			int maxAmount = 0;

			for (Entry<BrowsingData, Integer> i : map.entrySet()) {
				BrowsingData iteration = i.getKey();
				Integer quantity = map.get(iteration);
				if (quantity > maxAmount) {
					maxAmount = quantity;
					maxValue = iteration;
				}
			}

			return maxValue;
		}
		
		private boolean findEquality(HashMap<BrowsingData, Integer> map, BrowsingData value) {
			for (Entry<BrowsingData, Integer> bd : map.entrySet()) {
				if (bd.getKey().equals(value)) {
					return true;
				}
			}
			
			return false;
		}
		
		private BrowsingData getEqual(HashMap<BrowsingData, Integer> map, BrowsingData value) {
			for (Entry<BrowsingData, Integer> bd : map.entrySet()) {
				if (bd.getKey().equals(value)) {
					return bd.getKey();
				}
			}
			return null;
		}
}
