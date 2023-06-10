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

package com.aliyuncs.sas.model.v20181203;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sas.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class IgnoreCheckItemsRequest extends RpcAcsRequest<IgnoreCheckItemsResponse> {
	   

	private String reason;

	private Integer type;

	private List<String> uuidLists;

	private String lang;

	private List<CheckAndRiskTypeList> checkAndRiskTypeLists;
	public IgnoreCheckItemsRequest() {
		super("Sas", "2018-12-03", "IgnoreCheckItems", "sas");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getReason() {
		return this.reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
		if(reason != null){
			putQueryParameter("Reason", reason);
		}
	}

	public Integer getType() {
		return this.type;
	}

	public void setType(Integer type) {
		this.type = type;
		if(type != null){
			putQueryParameter("Type", type.toString());
		}
	}

	public List<String> getUuidLists() {
		return this.uuidLists;
	}

	public void setUuidLists(List<String> uuidLists) {
		this.uuidLists = uuidLists;	
		if (uuidLists != null) {
			for (int i = 0; i < uuidLists.size(); i++) {
				putQueryParameter("UuidList." + (i + 1) , uuidLists.get(i));
			}
		}	
	}

	public String getLang() {
		return this.lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
		if(lang != null){
			putQueryParameter("Lang", lang);
		}
	}

	public List<CheckAndRiskTypeList> getCheckAndRiskTypeLists() {
		return this.checkAndRiskTypeLists;
	}

	public void setCheckAndRiskTypeLists(List<CheckAndRiskTypeList> checkAndRiskTypeLists) {
		this.checkAndRiskTypeLists = checkAndRiskTypeLists;	
		if (checkAndRiskTypeLists != null) {
			for (int depth1 = 0; depth1 < checkAndRiskTypeLists.size(); depth1++) {
				putQueryParameter("CheckAndRiskTypeList." + (depth1 + 1) + ".RiskType" , checkAndRiskTypeLists.get(depth1).getRiskType());
				putQueryParameter("CheckAndRiskTypeList." + (depth1 + 1) + ".CheckId" , checkAndRiskTypeLists.get(depth1).getCheckId());
			}
		}	
	}

	public static class CheckAndRiskTypeList {

		private String riskType;

		private Long checkId;

		public String getRiskType() {
			return this.riskType;
		}

		public void setRiskType(String riskType) {
			this.riskType = riskType;
		}

		public Long getCheckId() {
			return this.checkId;
		}

		public void setCheckId(Long checkId) {
			this.checkId = checkId;
		}
	}

	@Override
	public Class<IgnoreCheckItemsResponse> getResponseClass() {
		return IgnoreCheckItemsResponse.class;
	}

}
