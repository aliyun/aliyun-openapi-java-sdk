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

package com.aliyuncs.ccc.model.v20200701;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ccc.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class AddCasesRequest extends RpcAcsRequest<AddCasesResponse> {
	   

	private String instanceId;

	private String campaignId;

	@SerializedName("caseList")
	private List<CaseList> caseList;
	public AddCasesRequest() {
		super("CCC", "2020-07-01", "AddCases", "CCC");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putQueryParameter("InstanceId", instanceId);
		}
	}

	public String getCampaignId() {
		return this.campaignId;
	}

	public void setCampaignId(String campaignId) {
		this.campaignId = campaignId;
		if(campaignId != null){
			putQueryParameter("CampaignId", campaignId);
		}
	}

	public List<CaseList> getCaseList() {
		return this.caseList;
	}

	public void setCaseList(List<CaseList> caseList) {
		this.caseList = caseList;	
		if (caseList != null) {
			putQueryParameter("CaseList" , new Gson().toJson(caseList));
		}	
	}

	public static class CaseList {

		@SerializedName("CustomVariables")
		private String customVariables;

		@SerializedName("PhoneNumber")
		private String phoneNumber;

		@SerializedName("ReferenceId")
		private String referenceId;

		public String getCustomVariables() {
			return this.customVariables;
		}

		public void setCustomVariables(String customVariables) {
			this.customVariables = customVariables;
		}

		public String getPhoneNumber() {
			return this.phoneNumber;
		}

		public void setPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
		}

		public String getReferenceId() {
			return this.referenceId;
		}

		public void setReferenceId(String referenceId) {
			this.referenceId = referenceId;
		}
	}

	@Override
	public Class<AddCasesResponse> getResponseClass() {
		return AddCasesResponse.class;
	}

}
