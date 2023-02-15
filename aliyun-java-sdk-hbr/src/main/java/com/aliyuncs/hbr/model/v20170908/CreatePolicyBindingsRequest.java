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

package com.aliyuncs.hbr.model.v20170908;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import java.util.Map;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.hbr.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreatePolicyBindingsRequest extends RpcAcsRequest<CreatePolicyBindingsResponse> {
	   

	private String policyId;

	@SerializedName("policyBindingList")
	private List<PolicyBindingList> policyBindingList;
	public CreatePolicyBindingsRequest() {
		super("hbr", "2017-09-08", "CreatePolicyBindings", "hbr");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getPolicyId() {
		return this.policyId;
	}

	public void setPolicyId(String policyId) {
		this.policyId = policyId;
		if(policyId != null){
			putBodyParameter("PolicyId", policyId);
		}
	}

	public List<PolicyBindingList> getPolicyBindingList() {
		return this.policyBindingList;
	}

	public void setPolicyBindingList(List<PolicyBindingList> policyBindingList) {
		this.policyBindingList = policyBindingList;	
		if (policyBindingList != null) {
			putQueryParameter("PolicyBindingList" , new Gson().toJson(policyBindingList));
		}	
	}

	public static class PolicyBindingList {

		@SerializedName("Include")
		private String include;

		@SerializedName("SpeedLimit")
		private String speedLimit;

		@SerializedName("CrossAccountType")
		private String crossAccountType;

		@SerializedName("DataSourceId")
		private String dataSourceId;

		@SerializedName("PolicyBindingDescription")
		private String policyBindingDescription;

		@SerializedName("Disabled")
		private String disabled;

		@SerializedName("SourceType")
		private String sourceType;

		@SerializedName("Exclude")
		private String exclude;

		@SerializedName("CrossAccountRoleName")
		private String crossAccountRoleName;

		@SerializedName("Source")
		private String source;

		@SerializedName("CrossAccountUserId")
		private Long crossAccountUserId;

		@SerializedName("AdvancedOptions")
		private AdvancedOptions advancedOptions;

		public String getInclude() {
			return this.include;
		}

		public void setInclude(String include) {
			this.include = include;
		}

		public String getSpeedLimit() {
			return this.speedLimit;
		}

		public void setSpeedLimit(String speedLimit) {
			this.speedLimit = speedLimit;
		}

		public String getCrossAccountType() {
			return this.crossAccountType;
		}

		public void setCrossAccountType(String crossAccountType) {
			this.crossAccountType = crossAccountType;
		}

		public String getDataSourceId() {
			return this.dataSourceId;
		}

		public void setDataSourceId(String dataSourceId) {
			this.dataSourceId = dataSourceId;
		}

		public String getPolicyBindingDescription() {
			return this.policyBindingDescription;
		}

		public void setPolicyBindingDescription(String policyBindingDescription) {
			this.policyBindingDescription = policyBindingDescription;
		}

		public String getDisabled() {
			return this.disabled;
		}

		public void setDisabled(String disabled) {
			this.disabled = disabled;
		}

		public String getSourceType() {
			return this.sourceType;
		}

		public void setSourceType(String sourceType) {
			this.sourceType = sourceType;
		}

		public String getExclude() {
			return this.exclude;
		}

		public void setExclude(String exclude) {
			this.exclude = exclude;
		}

		public String getCrossAccountRoleName() {
			return this.crossAccountRoleName;
		}

		public void setCrossAccountRoleName(String crossAccountRoleName) {
			this.crossAccountRoleName = crossAccountRoleName;
		}

		public String getSource() {
			return this.source;
		}

		public void setSource(String source) {
			this.source = source;
		}

		public Long getCrossAccountUserId() {
			return this.crossAccountUserId;
		}

		public void setCrossAccountUserId(Long crossAccountUserId) {
			this.crossAccountUserId = crossAccountUserId;
		}

		public AdvancedOptions getAdvancedOptions() {
			return this.advancedOptions;
		}

		public void setAdvancedOptions(AdvancedOptions advancedOptions) {
			this.advancedOptions = advancedOptions;
		}

		public static class AdvancedOptions {

			@SerializedName("UdmDetail")
			private UdmDetail udmDetail;

			public UdmDetail getUdmDetail() {
				return this.udmDetail;
			}

			public void setUdmDetail(UdmDetail udmDetail) {
				this.udmDetail = udmDetail;
			}

			public static class UdmDetail {

				@SerializedName("SnapshotGroup")
				private Boolean snapshotGroup;

				@SerializedName("ExcludeDiskIdList")
				private List<String> excludeDiskIdList;

				@SerializedName("ExcludeDiskIdMap")
				private Map<String,Object> excludeDiskIdMap;

				@SerializedName("RamRoleName")
				private String ramRoleName;

				@SerializedName("EnableFsFreeze")
				private Boolean enableFsFreeze;

				@SerializedName("GroupName")
				private String groupName;

				@SerializedName("EnableWriters")
				private Boolean enableWriters;

				@SerializedName("DiskIdList")
				private List<String> diskIdList;

				@SerializedName("TimeoutInSeconds")
				private Long timeoutInSeconds;

				@SerializedName("PreScriptPath")
				private String preScriptPath;

				@SerializedName("DiskIdMap")
				private Map<String,Object> diskIdMap;

				@SerializedName("PostScriptPath")
				private String postScriptPath;

				@SerializedName("AppConsistent")
				private Boolean appConsistent;

				public Boolean getSnapshotGroup() {
					return this.snapshotGroup;
				}

				public void setSnapshotGroup(Boolean snapshotGroup) {
					this.snapshotGroup = snapshotGroup;
				}

				public List<String> getExcludeDiskIdList() {
					return this.excludeDiskIdList;
				}

				public void setExcludeDiskIdList(List<String> excludeDiskIdList) {
					this.excludeDiskIdList = excludeDiskIdList;
				}

				public Map<String,Object> getExcludeDiskIdMap() {
					return this.excludeDiskIdMap;
				}

				public void setExcludeDiskIdMap(Map<String,Object> excludeDiskIdMap) {
					this.excludeDiskIdMap = excludeDiskIdMap;
				}

				public String getRamRoleName() {
					return this.ramRoleName;
				}

				public void setRamRoleName(String ramRoleName) {
					this.ramRoleName = ramRoleName;
				}

				public Boolean getEnableFsFreeze() {
					return this.enableFsFreeze;
				}

				public void setEnableFsFreeze(Boolean enableFsFreeze) {
					this.enableFsFreeze = enableFsFreeze;
				}

				public String getGroupName() {
					return this.groupName;
				}

				public void setGroupName(String groupName) {
					this.groupName = groupName;
				}

				public Boolean getEnableWriters() {
					return this.enableWriters;
				}

				public void setEnableWriters(Boolean enableWriters) {
					this.enableWriters = enableWriters;
				}

				public List<String> getDiskIdList() {
					return this.diskIdList;
				}

				public void setDiskIdList(List<String> diskIdList) {
					this.diskIdList = diskIdList;
				}

				public Long getTimeoutInSeconds() {
					return this.timeoutInSeconds;
				}

				public void setTimeoutInSeconds(Long timeoutInSeconds) {
					this.timeoutInSeconds = timeoutInSeconds;
				}

				public String getPreScriptPath() {
					return this.preScriptPath;
				}

				public void setPreScriptPath(String preScriptPath) {
					this.preScriptPath = preScriptPath;
				}

				public Map<String,Object> getDiskIdMap() {
					return this.diskIdMap;
				}

				public void setDiskIdMap(Map<String,Object> diskIdMap) {
					this.diskIdMap = diskIdMap;
				}

				public String getPostScriptPath() {
					return this.postScriptPath;
				}

				public void setPostScriptPath(String postScriptPath) {
					this.postScriptPath = postScriptPath;
				}

				public Boolean getAppConsistent() {
					return this.appConsistent;
				}

				public void setAppConsistent(Boolean appConsistent) {
					this.appConsistent = appConsistent;
				}
			}
		}
	}

	@Override
	public Class<CreatePolicyBindingsResponse> getResponseClass() {
		return CreatePolicyBindingsResponse.class;
	}

}
