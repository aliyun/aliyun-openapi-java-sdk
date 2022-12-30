/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.resellertrade.model.v20191227;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import java.util.Map;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.resellertrade.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class SaveActivityRequest extends RpcAcsRequest<SaveActivityResponse> {
	   

	private String publishTag;

	private String endTime;

	private String description;

	private String startTime;

	private List<Long> whiteUidLists;

	private List<Long> testAccountUidLists;

	private String token;

	private List<Long> blackUidLists;

	private List<FusionPromotionParamList> fusionPromotionParamLists;

	@SerializedName("extendMap")
	private Map<String,Object> extendMap;

	private String bizId;

	private String activityName;
	public SaveActivityRequest() {
		super("ResellerTrade", "2019-12-27", "SaveActivity");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getPublishTag() {
		return this.publishTag;
	}

	public void setPublishTag(String publishTag) {
		this.publishTag = publishTag;
		if(publishTag != null){
			putBodyParameter("PublishTag", publishTag);
		}
	}

	public String getEndTime() {
		return this.endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
		if(endTime != null){
			putBodyParameter("EndTime", endTime);
		}
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putBodyParameter("Description", description);
		}
	}

	public String getStartTime() {
		return this.startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
		if(startTime != null){
			putBodyParameter("StartTime", startTime);
		}
	}

	public List<Long> getWhiteUidLists() {
		return this.whiteUidLists;
	}

	public void setWhiteUidLists(List<Long> whiteUidLists) {
		this.whiteUidLists = whiteUidLists;	
		if (whiteUidLists != null) {
			for (int i = 0; i < whiteUidLists.size(); i++) {
				putBodyParameter("WhiteUidList." + (i + 1) , whiteUidLists.get(i));
			}
		}	
	}

	public List<Long> getTestAccountUidLists() {
		return this.testAccountUidLists;
	}

	public void setTestAccountUidLists(List<Long> testAccountUidLists) {
		this.testAccountUidLists = testAccountUidLists;	
		if (testAccountUidLists != null) {
			for (int i = 0; i < testAccountUidLists.size(); i++) {
				putBodyParameter("TestAccountUidList." + (i + 1) , testAccountUidLists.get(i));
			}
		}	
	}

	public String getToken() {
		return this.token;
	}

	public void setToken(String token) {
		this.token = token;
		if(token != null){
			putBodyParameter("Token", token);
		}
	}

	public List<Long> getBlackUidLists() {
		return this.blackUidLists;
	}

	public void setBlackUidLists(List<Long> blackUidLists) {
		this.blackUidLists = blackUidLists;	
		if (blackUidLists != null) {
			for (int i = 0; i < blackUidLists.size(); i++) {
				putBodyParameter("BlackUidList." + (i + 1) , blackUidLists.get(i));
			}
		}	
	}

	public List<FusionPromotionParamList> getFusionPromotionParamLists() {
		return this.fusionPromotionParamLists;
	}

	public void setFusionPromotionParamLists(List<FusionPromotionParamList> fusionPromotionParamLists) {
		this.fusionPromotionParamLists = fusionPromotionParamLists;	
		if (fusionPromotionParamLists != null) {
			for (int depth1 = 0; depth1 < fusionPromotionParamLists.size(); depth1++) {
				if (fusionPromotionParamLists.get(depth1).getCommodityCodeLists() != null) {
					for (int i = 0; i < fusionPromotionParamLists.get(depth1).getCommodityCodeLists().size(); i++) {
						putBodyParameter("FusionPromotionParamList." + (depth1 + 1) + ".CommodityCodeList." + (i + 1) , fusionPromotionParamLists.get(depth1).getCommodityCodeLists().get(i));
					}
				}
				if (fusionPromotionParamLists.get(depth1).getRestrictedRegionLists() != null) {
					for (int i = 0; i < fusionPromotionParamLists.get(depth1).getRestrictedRegionLists().size(); i++) {
						putBodyParameter("FusionPromotionParamList." + (depth1 + 1) + ".RestrictedRegionList." + (i + 1) , fusionPromotionParamLists.get(depth1).getRestrictedRegionLists().get(i));
					}
				}
				putBodyParameter("FusionPromotionParamList." + (depth1 + 1) + ".PromotionValue" , fusionPromotionParamLists.get(depth1).getPromotionValue());
			}
		}	
	}

	public Map<String,Object> getExtendMap() {
		return this.extendMap;
	}

	public void setExtendMap(Map<String,Object> extendMap) {
		this.extendMap = extendMap;	
		if (extendMap != null) {
			putBodyParameter("ExtendMap" , new Gson().toJson(extendMap));
		}	
	}

	public String getBizId() {
		return this.bizId;
	}

	public void setBizId(String bizId) {
		this.bizId = bizId;
		if(bizId != null){
			putBodyParameter("BizId", bizId);
		}
	}

	public String getActivityName() {
		return this.activityName;
	}

	public void setActivityName(String activityName) {
		this.activityName = activityName;
		if(activityName != null){
			putBodyParameter("ActivityName", activityName);
		}
	}

	public static class FusionPromotionParamList {

		private List<String> commodityCodeLists;

		private List<String> restrictedRegionLists;

		private Double promotionValue;

		public List<String> getCommodityCodeLists() {
			return this.commodityCodeLists;
		}

		public void setCommodityCodeLists(List<String> commodityCodeLists) {
			this.commodityCodeLists = commodityCodeLists;
		}

		public List<String> getRestrictedRegionLists() {
			return this.restrictedRegionLists;
		}

		public void setRestrictedRegionLists(List<String> restrictedRegionLists) {
			this.restrictedRegionLists = restrictedRegionLists;
		}

		public Double getPromotionValue() {
			return this.promotionValue;
		}

		public void setPromotionValue(Double promotionValue) {
			this.promotionValue = promotionValue;
		}
	}

	@Override
	public Class<SaveActivityResponse> getResponseClass() {
		return SaveActivityResponse.class;
	}

}
