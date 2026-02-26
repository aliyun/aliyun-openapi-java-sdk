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

package com.aliyuncs.csas.model.v20230120;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class UpdateApprovalProcessRequest extends RpcAcsRequest<UpdateApprovalProcessResponse> {
	   

	private List<List<String>> processNodes;

	@SerializedName("matchSchemas")
	private MatchSchemas matchSchemas;

	private String description;

	private String processName;

	private String processId;
	public UpdateApprovalProcessRequest() {
		super("csas", "2023-01-20", "UpdateApprovalProcess");
		setMethod(MethodType.POST);
	}

	public List<List<String>> getProcessNodes() {
		return this.processNodes;
	}

	public void setProcessNodes(List<List<String>> processNodes) {
		this.processNodes = processNodes;	
		if (processNodes != null) {
			for (int depth1 = 0; depth1 < processNodes.size(); depth1++) {
				if (processNodes.get(depth1) != null) {
					for (int depth2 = 0; depth2 < processNodes.get(depth1).size(); depth2++) {
						putBodyParameter("ProcessNodes." + (depth1 + 1) + "." + (depth2 + 1) , processNodes.get(depth1).get(depth2));
					}
				}
			}
		}	
	}

	public MatchSchemas getMatchSchemas() {
		return this.matchSchemas;
	}

	public void setMatchSchemas(MatchSchemas matchSchemas) {
		this.matchSchemas = matchSchemas;	
		if (matchSchemas != null) {
			putBodyParameter("MatchSchemas" , new Gson().toJson(matchSchemas));
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

	public String getProcessName() {
		return this.processName;
	}

	public void setProcessName(String processName) {
		this.processName = processName;
		if(processName != null){
			putBodyParameter("ProcessName", processName);
		}
	}

	public String getProcessId() {
		return this.processId;
	}

	public void setProcessId(String processId) {
		this.processId = processId;
		if(processId != null){
			putBodyParameter("ProcessId", processId);
		}
	}

	public static class MatchSchemas {

		@SerializedName("DomainBlacklistSchemaId")
		private String domainBlacklistSchemaId;

		@SerializedName("SoftwareBlockSchemaId")
		private String softwareBlockSchemaId;

		@SerializedName("PeripheralBlockSchemaId")
		private String peripheralBlockSchemaId;

		@SerializedName("DeviceRegistrationSchemaId")
		private String deviceRegistrationSchemaId;

		@SerializedName("DlpSendSchemaId")
		private String dlpSendSchemaId;

		@SerializedName("DomainWhitelistSchemaId")
		private String domainWhitelistSchemaId;

		@SerializedName("AppUninstallSchemaId")
		private String appUninstallSchemaId;

		public String getDomainBlacklistSchemaId() {
			return this.domainBlacklistSchemaId;
		}

		public void setDomainBlacklistSchemaId(String domainBlacklistSchemaId) {
			this.domainBlacklistSchemaId = domainBlacklistSchemaId;
		}

		public String getSoftwareBlockSchemaId() {
			return this.softwareBlockSchemaId;
		}

		public void setSoftwareBlockSchemaId(String softwareBlockSchemaId) {
			this.softwareBlockSchemaId = softwareBlockSchemaId;
		}

		public String getPeripheralBlockSchemaId() {
			return this.peripheralBlockSchemaId;
		}

		public void setPeripheralBlockSchemaId(String peripheralBlockSchemaId) {
			this.peripheralBlockSchemaId = peripheralBlockSchemaId;
		}

		public String getDeviceRegistrationSchemaId() {
			return this.deviceRegistrationSchemaId;
		}

		public void setDeviceRegistrationSchemaId(String deviceRegistrationSchemaId) {
			this.deviceRegistrationSchemaId = deviceRegistrationSchemaId;
		}

		public String getDlpSendSchemaId() {
			return this.dlpSendSchemaId;
		}

		public void setDlpSendSchemaId(String dlpSendSchemaId) {
			this.dlpSendSchemaId = dlpSendSchemaId;
		}

		public String getDomainWhitelistSchemaId() {
			return this.domainWhitelistSchemaId;
		}

		public void setDomainWhitelistSchemaId(String domainWhitelistSchemaId) {
			this.domainWhitelistSchemaId = domainWhitelistSchemaId;
		}

		public String getAppUninstallSchemaId() {
			return this.appUninstallSchemaId;
		}

		public void setAppUninstallSchemaId(String appUninstallSchemaId) {
			this.appUninstallSchemaId = appUninstallSchemaId;
		}
	}

	@Override
	public Class<UpdateApprovalProcessResponse> getResponseClass() {
		return UpdateApprovalProcessResponse.class;
	}

}
