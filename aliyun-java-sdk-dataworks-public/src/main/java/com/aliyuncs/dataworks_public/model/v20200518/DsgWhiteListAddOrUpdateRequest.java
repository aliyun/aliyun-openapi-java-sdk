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

package com.aliyuncs.dataworks_public.model.v20200518;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.dataworks_public.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DsgWhiteListAddOrUpdateRequest extends RpcAcsRequest<DsgWhiteListAddOrUpdateResponse> {
	   

	@SerializedName("whiteLists")
	private List<WhiteLists> whiteLists;
	public DsgWhiteListAddOrUpdateRequest() {
		super("dataworks-public", "2020-05-18", "DsgWhiteListAddOrUpdate");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<WhiteLists> getWhiteLists() {
		return this.whiteLists;
	}

	public void setWhiteLists(List<WhiteLists> whiteLists) {
		this.whiteLists = whiteLists;	
		if (whiteLists != null) {
			putQueryParameter("WhiteLists" , new Gson().toJson(whiteLists));
		}	
	}

	public static class WhiteLists {

		@SerializedName("EndTime")
		private String endTime;

		@SerializedName("UserGroupIds")
		private List<Integer> userGroupIds;

		@SerializedName("Id")
		private Integer id;

		@SerializedName("StartTime")
		private String startTime;

		@SerializedName("RuleId")
		private Integer ruleId;

		public String getEndTime() {
			return this.endTime;
		}

		public void setEndTime(String endTime) {
			this.endTime = endTime;
		}

		public List<Integer> getUserGroupIds() {
			return this.userGroupIds;
		}

		public void setUserGroupIds(List<Integer> userGroupIds) {
			this.userGroupIds = userGroupIds;
		}

		public Integer getId() {
			return this.id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public String getStartTime() {
			return this.startTime;
		}

		public void setStartTime(String startTime) {
			this.startTime = startTime;
		}

		public Integer getRuleId() {
			return this.ruleId;
		}

		public void setRuleId(Integer ruleId) {
			this.ruleId = ruleId;
		}
	}

	@Override
	public Class<DsgWhiteListAddOrUpdateResponse> getResponseClass() {
		return DsgWhiteListAddOrUpdateResponse.class;
	}

}
