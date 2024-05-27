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

package com.aliyuncs.mpaas.model.v20201028;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.mpaas.transform.v20201028.GetMcubeUpgradeTaskInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetMcubeUpgradeTaskInfoResponse extends AcsResponse {

	private String resultMessage;

	private String resultCode;

	private String requestId;

	private GetTaskResult getTaskResult;

	public String getResultMessage() {
		return this.resultMessage;
	}

	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}

	public String getResultCode() {
		return this.resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public GetTaskResult getGetTaskResult() {
		return this.getTaskResult;
	}

	public void setGetTaskResult(GetTaskResult getTaskResult) {
		this.getTaskResult = getTaskResult;
	}

	public static class GetTaskResult {

		private String requestId;

		private String errorCode;

		private Boolean success;

		private String resultMsg;

		private TaskInfo taskInfo;

		public String getRequestId() {
			return this.requestId;
		}

		public void setRequestId(String requestId) {
			this.requestId = requestId;
		}

		public String getErrorCode() {
			return this.errorCode;
		}

		public void setErrorCode(String errorCode) {
			this.errorCode = errorCode;
		}

		public Boolean getSuccess() {
			return this.success;
		}

		public void setSuccess(Boolean success) {
			this.success = success;
		}

		public String getResultMsg() {
			return this.resultMsg;
		}

		public void setResultMsg(String resultMsg) {
			this.resultMsg = resultMsg;
		}

		public TaskInfo getTaskInfo() {
			return this.taskInfo;
		}

		public void setTaskInfo(TaskInfo taskInfo) {
			this.taskInfo = taskInfo;
		}

		public static class TaskInfo {

			private Integer publishMode;

			private Integer silentType;

			private String pushContent;

			private String packageType;

			private Integer isEnterprise;

			private String creator;

			private String modifier;

			private Integer historyForce;

			private Integer isRelease;

			private String appId;

			private String creater;

			private Integer isRc;

			private String appstoreUrl;

			private String platform;

			private Long packageInfoId;

			private String productId;

			private String osVersion;

			private Integer upgradeValidTime;

			private String downloadUrl;

			private String appCode;

			private String memo;

			private Integer greyNum;

			private String greyConfigInfo;

			private Integer isOfficial;

			private String workspaceId;

			private String greyEndtimeData;

			private Integer publishType;

			private Integer taskStatus;

			private String whitelistIds;

			private String netType;

			private String qrcodeUrl;

			private String upgradeContent;

			private Long id;

			private Integer upgradeType;

			private List<RuleJsonListItem> ruleJsonList;

			private List<WhitelistItem> whitelist;

			public Integer getPublishMode() {
				return this.publishMode;
			}

			public void setPublishMode(Integer publishMode) {
				this.publishMode = publishMode;
			}

			public Integer getSilentType() {
				return this.silentType;
			}

			public void setSilentType(Integer silentType) {
				this.silentType = silentType;
			}

			public String getPushContent() {
				return this.pushContent;
			}

			public void setPushContent(String pushContent) {
				this.pushContent = pushContent;
			}

			public String getPackageType() {
				return this.packageType;
			}

			public void setPackageType(String packageType) {
				this.packageType = packageType;
			}

			public Integer getIsEnterprise() {
				return this.isEnterprise;
			}

			public void setIsEnterprise(Integer isEnterprise) {
				this.isEnterprise = isEnterprise;
			}

			public String getCreator() {
				return this.creator;
			}

			public void setCreator(String creator) {
				this.creator = creator;
			}

			public String getModifier() {
				return this.modifier;
			}

			public void setModifier(String modifier) {
				this.modifier = modifier;
			}

			public Integer getHistoryForce() {
				return this.historyForce;
			}

			public void setHistoryForce(Integer historyForce) {
				this.historyForce = historyForce;
			}

			public Integer getIsRelease() {
				return this.isRelease;
			}

			public void setIsRelease(Integer isRelease) {
				this.isRelease = isRelease;
			}

			public String getAppId() {
				return this.appId;
			}

			public void setAppId(String appId) {
				this.appId = appId;
			}

			public String getCreater() {
				return this.creater;
			}

			public void setCreater(String creater) {
				this.creater = creater;
			}

			public Integer getIsRc() {
				return this.isRc;
			}

			public void setIsRc(Integer isRc) {
				this.isRc = isRc;
			}

			public String getAppstoreUrl() {
				return this.appstoreUrl;
			}

			public void setAppstoreUrl(String appstoreUrl) {
				this.appstoreUrl = appstoreUrl;
			}

			public String getPlatform() {
				return this.platform;
			}

			public void setPlatform(String platform) {
				this.platform = platform;
			}

			public Long getPackageInfoId() {
				return this.packageInfoId;
			}

			public void setPackageInfoId(Long packageInfoId) {
				this.packageInfoId = packageInfoId;
			}

			public String getProductId() {
				return this.productId;
			}

			public void setProductId(String productId) {
				this.productId = productId;
			}

			public String getOsVersion() {
				return this.osVersion;
			}

			public void setOsVersion(String osVersion) {
				this.osVersion = osVersion;
			}

			public Integer getUpgradeValidTime() {
				return this.upgradeValidTime;
			}

			public void setUpgradeValidTime(Integer upgradeValidTime) {
				this.upgradeValidTime = upgradeValidTime;
			}

			public String getDownloadUrl() {
				return this.downloadUrl;
			}

			public void setDownloadUrl(String downloadUrl) {
				this.downloadUrl = downloadUrl;
			}

			public String getAppCode() {
				return this.appCode;
			}

			public void setAppCode(String appCode) {
				this.appCode = appCode;
			}

			public String getMemo() {
				return this.memo;
			}

			public void setMemo(String memo) {
				this.memo = memo;
			}

			public Integer getGreyNum() {
				return this.greyNum;
			}

			public void setGreyNum(Integer greyNum) {
				this.greyNum = greyNum;
			}

			public String getGreyConfigInfo() {
				return this.greyConfigInfo;
			}

			public void setGreyConfigInfo(String greyConfigInfo) {
				this.greyConfigInfo = greyConfigInfo;
			}

			public Integer getIsOfficial() {
				return this.isOfficial;
			}

			public void setIsOfficial(Integer isOfficial) {
				this.isOfficial = isOfficial;
			}

			public String getWorkspaceId() {
				return this.workspaceId;
			}

			public void setWorkspaceId(String workspaceId) {
				this.workspaceId = workspaceId;
			}

			public String getGreyEndtimeData() {
				return this.greyEndtimeData;
			}

			public void setGreyEndtimeData(String greyEndtimeData) {
				this.greyEndtimeData = greyEndtimeData;
			}

			public Integer getPublishType() {
				return this.publishType;
			}

			public void setPublishType(Integer publishType) {
				this.publishType = publishType;
			}

			public Integer getTaskStatus() {
				return this.taskStatus;
			}

			public void setTaskStatus(Integer taskStatus) {
				this.taskStatus = taskStatus;
			}

			public String getWhitelistIds() {
				return this.whitelistIds;
			}

			public void setWhitelistIds(String whitelistIds) {
				this.whitelistIds = whitelistIds;
			}

			public String getNetType() {
				return this.netType;
			}

			public void setNetType(String netType) {
				this.netType = netType;
			}

			public String getQrcodeUrl() {
				return this.qrcodeUrl;
			}

			public void setQrcodeUrl(String qrcodeUrl) {
				this.qrcodeUrl = qrcodeUrl;
			}

			public String getUpgradeContent() {
				return this.upgradeContent;
			}

			public void setUpgradeContent(String upgradeContent) {
				this.upgradeContent = upgradeContent;
			}

			public Long getId() {
				return this.id;
			}

			public void setId(Long id) {
				this.id = id;
			}

			public Integer getUpgradeType() {
				return this.upgradeType;
			}

			public void setUpgradeType(Integer upgradeType) {
				this.upgradeType = upgradeType;
			}

			public List<RuleJsonListItem> getRuleJsonList() {
				return this.ruleJsonList;
			}

			public void setRuleJsonList(List<RuleJsonListItem> ruleJsonList) {
				this.ruleJsonList = ruleJsonList;
			}

			public List<WhitelistItem> getWhitelist() {
				return this.whitelist;
			}

			public void setWhitelist(List<WhitelistItem> whitelist) {
				this.whitelist = whitelist;
			}

			public static class RuleJsonListItem {

				private String operation;

				private String value;

				private String ruleType;

				private String ruleElement;

				public String getOperation() {
					return this.operation;
				}

				public void setOperation(String operation) {
					this.operation = operation;
				}

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}

				public String getRuleType() {
					return this.ruleType;
				}

				public void setRuleType(String ruleType) {
					this.ruleType = ruleType;
				}

				public String getRuleElement() {
					return this.ruleElement;
				}

				public void setRuleElement(String ruleElement) {
					this.ruleElement = ruleElement;
				}
			}

			public static class WhitelistItem {

				private Integer status;

				private String userType;

				private Long whiteListCount;

				private String appCode;

				private String idType;

				private String platform;

				private String whitelistType;

				private Long id;

				private String whiteListName;

				public Integer getStatus() {
					return this.status;
				}

				public void setStatus(Integer status) {
					this.status = status;
				}

				public String getUserType() {
					return this.userType;
				}

				public void setUserType(String userType) {
					this.userType = userType;
				}

				public Long getWhiteListCount() {
					return this.whiteListCount;
				}

				public void setWhiteListCount(Long whiteListCount) {
					this.whiteListCount = whiteListCount;
				}

				public String getAppCode() {
					return this.appCode;
				}

				public void setAppCode(String appCode) {
					this.appCode = appCode;
				}

				public String getIdType() {
					return this.idType;
				}

				public void setIdType(String idType) {
					this.idType = idType;
				}

				public String getPlatform() {
					return this.platform;
				}

				public void setPlatform(String platform) {
					this.platform = platform;
				}

				public String getWhitelistType() {
					return this.whitelistType;
				}

				public void setWhitelistType(String whitelistType) {
					this.whitelistType = whitelistType;
				}

				public Long getId() {
					return this.id;
				}

				public void setId(Long id) {
					this.id = id;
				}

				public String getWhiteListName() {
					return this.whiteListName;
				}

				public void setWhiteListName(String whiteListName) {
					this.whiteListName = whiteListName;
				}
			}
		}
	}

	@Override
	public GetMcubeUpgradeTaskInfoResponse getInstance(UnmarshallerContext context) {
		return	GetMcubeUpgradeTaskInfoResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
