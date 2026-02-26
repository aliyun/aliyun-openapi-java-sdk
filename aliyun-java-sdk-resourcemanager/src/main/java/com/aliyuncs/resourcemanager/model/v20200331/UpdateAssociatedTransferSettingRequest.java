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

package com.aliyuncs.resourcemanager.model.v20200331;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.resourcemanager.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateAssociatedTransferSettingRequest extends RpcAcsRequest<UpdateAssociatedTransferSettingResponse> {
	   

	private List<RuleSettings> ruleSettings;

	private String enableExistingResourcesTransfer;
	public UpdateAssociatedTransferSettingRequest() {
		super("ResourceManager", "2020-03-31", "UpdateAssociatedTransferSetting", "resourcemanager");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<RuleSettings> getRuleSettings() {
		return this.ruleSettings;
	}

	public void setRuleSettings(List<RuleSettings> ruleSettings) {
		this.ruleSettings = ruleSettings;	
		if (ruleSettings != null) {
			for (int depth1 = 0; depth1 < ruleSettings.size(); depth1++) {
				if (ruleSettings.get(depth1) != null) {
					
						putQueryParameter("RuleSettings." + (depth1 + 1) + ".AssociatedService" , ruleSettings.get(depth1).getAssociatedService());
						putQueryParameter("RuleSettings." + (depth1 + 1) + ".MasterService" , ruleSettings.get(depth1).getMasterService());
						putQueryParameter("RuleSettings." + (depth1 + 1) + ".MasterResourceType" , ruleSettings.get(depth1).getMasterResourceType());
						putQueryParameter("RuleSettings." + (depth1 + 1) + ".AssociatedResourceType" , ruleSettings.get(depth1).getAssociatedResourceType());
						putQueryParameter("RuleSettings." + (depth1 + 1) + ".RuleId" , ruleSettings.get(depth1).getRuleId());
						putQueryParameter("RuleSettings." + (depth1 + 1) + ".Status" , ruleSettings.get(depth1).getStatus());
				}
			}
		}	
	}

	public String getEnableExistingResourcesTransfer() {
		return this.enableExistingResourcesTransfer;
	}

	public void setEnableExistingResourcesTransfer(String enableExistingResourcesTransfer) {
		this.enableExistingResourcesTransfer = enableExistingResourcesTransfer;
		if(enableExistingResourcesTransfer != null){
			putQueryParameter("EnableExistingResourcesTransfer", enableExistingResourcesTransfer);
		}
	}

	public static class RuleSettings {

		private String associatedService;

		private String masterService;

		private String masterResourceType;

		private String associatedResourceType;

		private String ruleId;

		private String status;

		public String getAssociatedService() {
			return this.associatedService;
		}

		public void setAssociatedService(String associatedService) {
			this.associatedService = associatedService;
		}

		public String getMasterService() {
			return this.masterService;
		}

		public void setMasterService(String masterService) {
			this.masterService = masterService;
		}

		public String getMasterResourceType() {
			return this.masterResourceType;
		}

		public void setMasterResourceType(String masterResourceType) {
			this.masterResourceType = masterResourceType;
		}

		public String getAssociatedResourceType() {
			return this.associatedResourceType;
		}

		public void setAssociatedResourceType(String associatedResourceType) {
			this.associatedResourceType = associatedResourceType;
		}

		public String getRuleId() {
			return this.ruleId;
		}

		public void setRuleId(String ruleId) {
			this.ruleId = ruleId;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}
	}

	@Override
	public Class<UpdateAssociatedTransferSettingResponse> getResponseClass() {
		return UpdateAssociatedTransferSettingResponse.class;
	}

}
