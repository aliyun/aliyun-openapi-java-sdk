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

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.hbr.transform.v20170908.DescribePolicyBindingsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribePolicyBindingsResponse extends AcsResponse {

	private String nextToken;

	private Integer maxResults;

	private Long totalCount;

	private Boolean success;

	private String code;

	private String message;

	private String requestId;

	private List<Data> policyBindings;

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public Integer getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(Integer maxResults) {
		this.maxResults = maxResults;
	}

	public Long getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Data> getPolicyBindings() {
		return this.policyBindings;
	}

	public void setPolicyBindings(List<Data> policyBindings) {
		this.policyBindings = policyBindings;
	}

	public static class Data {

		private Long createdTime;

		private Long updatedTime;

		private String policyBindingId;

		private String policyBindingDescription;

		private String policyId;

		private String dataSourceId;

		private Boolean disabled;

		private String source;

		private String include;

		private String exclude;

		private String speedLimit;

		private String sourceType;

		private String crossAccountType;

		private Long crossAccountUserId;

		private String crossAccountRoleName;

		private AdvancedOptions advancedOptions;

		public Long getCreatedTime() {
			return this.createdTime;
		}

		public void setCreatedTime(Long createdTime) {
			this.createdTime = createdTime;
		}

		public Long getUpdatedTime() {
			return this.updatedTime;
		}

		public void setUpdatedTime(Long updatedTime) {
			this.updatedTime = updatedTime;
		}

		public String getPolicyBindingId() {
			return this.policyBindingId;
		}

		public void setPolicyBindingId(String policyBindingId) {
			this.policyBindingId = policyBindingId;
		}

		public String getPolicyBindingDescription() {
			return this.policyBindingDescription;
		}

		public void setPolicyBindingDescription(String policyBindingDescription) {
			this.policyBindingDescription = policyBindingDescription;
		}

		public String getPolicyId() {
			return this.policyId;
		}

		public void setPolicyId(String policyId) {
			this.policyId = policyId;
		}

		public String getDataSourceId() {
			return this.dataSourceId;
		}

		public void setDataSourceId(String dataSourceId) {
			this.dataSourceId = dataSourceId;
		}

		public Boolean getDisabled() {
			return this.disabled;
		}

		public void setDisabled(Boolean disabled) {
			this.disabled = disabled;
		}

		public String getSource() {
			return this.source;
		}

		public void setSource(String source) {
			this.source = source;
		}

		public String getInclude() {
			return this.include;
		}

		public void setInclude(String include) {
			this.include = include;
		}

		public String getExclude() {
			return this.exclude;
		}

		public void setExclude(String exclude) {
			this.exclude = exclude;
		}

		public String getSpeedLimit() {
			return this.speedLimit;
		}

		public void setSpeedLimit(String speedLimit) {
			this.speedLimit = speedLimit;
		}

		public String getSourceType() {
			return this.sourceType;
		}

		public void setSourceType(String sourceType) {
			this.sourceType = sourceType;
		}

		public String getCrossAccountType() {
			return this.crossAccountType;
		}

		public void setCrossAccountType(String crossAccountType) {
			this.crossAccountType = crossAccountType;
		}

		public Long getCrossAccountUserId() {
			return this.crossAccountUserId;
		}

		public void setCrossAccountUserId(Long crossAccountUserId) {
			this.crossAccountUserId = crossAccountUserId;
		}

		public String getCrossAccountRoleName() {
			return this.crossAccountRoleName;
		}

		public void setCrossAccountRoleName(String crossAccountRoleName) {
			this.crossAccountRoleName = crossAccountRoleName;
		}

		public AdvancedOptions getAdvancedOptions() {
			return this.advancedOptions;
		}

		public void setAdvancedOptions(AdvancedOptions advancedOptions) {
			this.advancedOptions = advancedOptions;
		}

		public static class AdvancedOptions {

			private UdmDetail udmDetail;

			private OssDetail ossDetail;

			private FileDetail fileDetail;

			private CommonNasDetail commonNasDetail;

			public UdmDetail getUdmDetail() {
				return this.udmDetail;
			}

			public void setUdmDetail(UdmDetail udmDetail) {
				this.udmDetail = udmDetail;
			}

			public OssDetail getOssDetail() {
				return this.ossDetail;
			}

			public void setOssDetail(OssDetail ossDetail) {
				this.ossDetail = ossDetail;
			}

			public FileDetail getFileDetail() {
				return this.fileDetail;
			}

			public void setFileDetail(FileDetail fileDetail) {
				this.fileDetail = fileDetail;
			}

			public CommonNasDetail getCommonNasDetail() {
				return this.commonNasDetail;
			}

			public void setCommonNasDetail(CommonNasDetail commonNasDetail) {
				this.commonNasDetail = commonNasDetail;
			}

			public static class UdmDetail {

				private Boolean snapshotGroup;

				private Boolean appConsistent;

				private String ramRoleName;

				private String preScriptPath;

				private String postScriptPath;

				private Boolean enableFsFreeze;

				private Long timeoutInSeconds;

				private Boolean enableWriters;

				private Boolean doBackup;

				private Long backupRetention;

				private String backupVaultId;

				private Map<Object,Object> diskIdMap;

				private Map<Object,Object> excludeDiskIdMap;

				private String groupName;

				private String destinationKmsKeyId;

				private List<String> excludeDiskIdList;

				private List<String> diskIdList;

				public Boolean getSnapshotGroup() {
					return this.snapshotGroup;
				}

				public void setSnapshotGroup(Boolean snapshotGroup) {
					this.snapshotGroup = snapshotGroup;
				}

				public Boolean getAppConsistent() {
					return this.appConsistent;
				}

				public void setAppConsistent(Boolean appConsistent) {
					this.appConsistent = appConsistent;
				}

				public String getRamRoleName() {
					return this.ramRoleName;
				}

				public void setRamRoleName(String ramRoleName) {
					this.ramRoleName = ramRoleName;
				}

				public String getPreScriptPath() {
					return this.preScriptPath;
				}

				public void setPreScriptPath(String preScriptPath) {
					this.preScriptPath = preScriptPath;
				}

				public String getPostScriptPath() {
					return this.postScriptPath;
				}

				public void setPostScriptPath(String postScriptPath) {
					this.postScriptPath = postScriptPath;
				}

				public Boolean getEnableFsFreeze() {
					return this.enableFsFreeze;
				}

				public void setEnableFsFreeze(Boolean enableFsFreeze) {
					this.enableFsFreeze = enableFsFreeze;
				}

				public Long getTimeoutInSeconds() {
					return this.timeoutInSeconds;
				}

				public void setTimeoutInSeconds(Long timeoutInSeconds) {
					this.timeoutInSeconds = timeoutInSeconds;
				}

				public Boolean getEnableWriters() {
					return this.enableWriters;
				}

				public void setEnableWriters(Boolean enableWriters) {
					this.enableWriters = enableWriters;
				}

				public Boolean getDoBackup() {
					return this.doBackup;
				}

				public void setDoBackup(Boolean doBackup) {
					this.doBackup = doBackup;
				}

				public Long getBackupRetention() {
					return this.backupRetention;
				}

				public void setBackupRetention(Long backupRetention) {
					this.backupRetention = backupRetention;
				}

				public String getBackupVaultId() {
					return this.backupVaultId;
				}

				public void setBackupVaultId(String backupVaultId) {
					this.backupVaultId = backupVaultId;
				}

				public Map<Object,Object> getDiskIdMap() {
					return this.diskIdMap;
				}

				public void setDiskIdMap(Map<Object,Object> diskIdMap) {
					this.diskIdMap = diskIdMap;
				}

				public Map<Object,Object> getExcludeDiskIdMap() {
					return this.excludeDiskIdMap;
				}

				public void setExcludeDiskIdMap(Map<Object,Object> excludeDiskIdMap) {
					this.excludeDiskIdMap = excludeDiskIdMap;
				}

				public String getGroupName() {
					return this.groupName;
				}

				public void setGroupName(String groupName) {
					this.groupName = groupName;
				}

				public String getDestinationKmsKeyId() {
					return this.destinationKmsKeyId;
				}

				public void setDestinationKmsKeyId(String destinationKmsKeyId) {
					this.destinationKmsKeyId = destinationKmsKeyId;
				}

				public List<String> getExcludeDiskIdList() {
					return this.excludeDiskIdList;
				}

				public void setExcludeDiskIdList(List<String> excludeDiskIdList) {
					this.excludeDiskIdList = excludeDiskIdList;
				}

				public List<String> getDiskIdList() {
					return this.diskIdList;
				}

				public void setDiskIdList(List<String> diskIdList) {
					this.diskIdList = diskIdList;
				}
			}

			public static class OssDetail {

				private String inventoryId;

				private String inventoryCleanupPolicy;

				public String getInventoryId() {
					return this.inventoryId;
				}

				public void setInventoryId(String inventoryId) {
					this.inventoryId = inventoryId;
				}

				public String getInventoryCleanupPolicy() {
					return this.inventoryCleanupPolicy;
				}

				public void setInventoryCleanupPolicy(String inventoryCleanupPolicy) {
					this.inventoryCleanupPolicy = inventoryCleanupPolicy;
				}
			}

			public static class FileDetail {

				private Boolean useVSS;

				private Boolean advPolicy;

				public Boolean getUseVSS() {
					return this.useVSS;
				}

				public void setUseVSS(Boolean useVSS) {
					this.useVSS = useVSS;
				}

				public Boolean getAdvPolicy() {
					return this.advPolicy;
				}

				public void setAdvPolicy(Boolean advPolicy) {
					this.advPolicy = advPolicy;
				}
			}

			public static class CommonNasDetail {

				private Boolean fullOnIncrementFail;

				private Long fetchSliceSize;

				private String clientId;

				public Boolean getFullOnIncrementFail() {
					return this.fullOnIncrementFail;
				}

				public void setFullOnIncrementFail(Boolean fullOnIncrementFail) {
					this.fullOnIncrementFail = fullOnIncrementFail;
				}

				public Long getFetchSliceSize() {
					return this.fetchSliceSize;
				}

				public void setFetchSliceSize(Long fetchSliceSize) {
					this.fetchSliceSize = fetchSliceSize;
				}

				public String getClientId() {
					return this.clientId;
				}

				public void setClientId(String clientId) {
					this.clientId = clientId;
				}
			}
		}
	}

	@Override
	public DescribePolicyBindingsResponse getInstance(UnmarshallerContext context) {
		return	DescribePolicyBindingsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
