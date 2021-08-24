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

package com.aliyuncs.mpaas.model.v20200710;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.mpaas.transform.v20200710.GetMcubeUpgradeTaskInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetMcubeUpgradeTaskInfoResponse extends AcsResponse {

	private String requestId;

	private String resultCode;

	private String resultMessage;

	private GetTaskResult getTaskResult;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getResultCode() {
		return this.resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public String getResultMessage() {
		return this.resultMessage;
	}

	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}

	public GetTaskResult getGetTaskResult() {
		return this.getTaskResult;
	}

	public void setGetTaskResult(GetTaskResult getTaskResult) {
		this.getTaskResult = getTaskResult;
	}

	public static class GetTaskResult {

		private String errorCode;

		private String resultMsg;

		private Boolean success;

		private String requestId;

		private TaskInfo taskInfo;

		public String getErrorCode() {
			return this.errorCode;
		}

		public void setErrorCode(String errorCode) {
			this.errorCode = errorCode;
		}

		public String getResultMsg() {
			return this.resultMsg;
		}

		public void setResultMsg(String resultMsg) {
			this.resultMsg = resultMsg;
		}

		public Boolean getSuccess() {
			return this.success;
		}

		public void setSuccess(Boolean success) {
			this.success = success;
		}

		public String getRequestId() {
			return this.requestId;
		}

		public void setRequestId(String requestId) {
			this.requestId = requestId;
		}

		public TaskInfo getTaskInfo() {
			return this.taskInfo;
		}

		public void setTaskInfo(TaskInfo taskInfo) {
			this.taskInfo = taskInfo;
		}

		public static class TaskInfo {

			private String greyConfigInfo;

			private String platform;

			private Integer greyNum;

			private String appstoreUrl;

			private String workspaceId;

			private String creator;

			private String greyConfigInfo1;

			private String upgradeContent;

			private String greyEndtimeData;

			private Integer upgradeType;

			private String modifier;

			private String appCode;

			private String memo;

			private Integer publishMode;

			private String appId;

			private Integer isEnterprise;

			private Integer taskStatus;

			private Long id;

			private String downloadUrl;

			private String productId;

			private String packageType;

			private Integer silentType;

			private Integer upgradeValidTime;

			private Integer publishType;

			private Integer historyForce;

			private Long packageInfoId;

			private String whitelistIds;

			private List<RuleJsonListItem> ruleJsonList;

			private List<WhitelistItem> whitelist;

			public String getGreyConfigInfo() {
				return this.greyConfigInfo;
			}

			public void setGreyConfigInfo(String greyConfigInfo) {
				this.greyConfigInfo = greyConfigInfo;
			}

			public String getPlatform() {
				return this.platform;
			}

			public void setPlatform(String platform) {
				this.platform = platform;
			}

			public Integer getGreyNum() {
				return this.greyNum;
			}

			public void setGreyNum(Integer greyNum) {
				this.greyNum = greyNum;
			}

			public String getAppstoreUrl() {
				return this.appstoreUrl;
			}

			public void setAppstoreUrl(String appstoreUrl) {
				this.appstoreUrl = appstoreUrl;
			}

			public String getWorkspaceId() {
				return this.workspaceId;
			}

			public void setWorkspaceId(String workspaceId) {
				this.workspaceId = workspaceId;
			}

			public String getCreator() {
				return this.creator;
			}

			public void setCreator(String creator) {
				this.creator = creator;
			}

			public String getGreyConfigInfo1() {
				return this.greyConfigInfo1;
			}

			public void setGreyConfigInfo1(String greyConfigInfo1) {
				this.greyConfigInfo1 = greyConfigInfo1;
			}

			public String getUpgradeContent() {
				return this.upgradeContent;
			}

			public void setUpgradeContent(String upgradeContent) {
				this.upgradeContent = upgradeContent;
			}

			public String getGreyEndtimeData() {
				return this.greyEndtimeData;
			}

			public void setGreyEndtimeData(String greyEndtimeData) {
				this.greyEndtimeData = greyEndtimeData;
			}

			public Integer getUpgradeType() {
				return this.upgradeType;
			}

			public void setUpgradeType(Integer upgradeType) {
				this.upgradeType = upgradeType;
			}

			public String getModifier() {
				return this.modifier;
			}

			public void setModifier(String modifier) {
				this.modifier = modifier;
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

			public Integer getPublishMode() {
				return this.publishMode;
			}

			public void setPublishMode(Integer publishMode) {
				this.publishMode = publishMode;
			}

			public String getAppId() {
				return this.appId;
			}

			public void setAppId(String appId) {
				this.appId = appId;
			}

			public Integer getIsEnterprise() {
				return this.isEnterprise;
			}

			public void setIsEnterprise(Integer isEnterprise) {
				this.isEnterprise = isEnterprise;
			}

			public Integer getTaskStatus() {
				return this.taskStatus;
			}

			public void setTaskStatus(Integer taskStatus) {
				this.taskStatus = taskStatus;
			}

			public Long getId() {
				return this.id;
			}

			public void setId(Long id) {
				this.id = id;
			}

			public String getDownloadUrl() {
				return this.downloadUrl;
			}

			public void setDownloadUrl(String downloadUrl) {
				this.downloadUrl = downloadUrl;
			}

			public String getProductId() {
				return this.productId;
			}

			public void setProductId(String productId) {
				this.productId = productId;
			}

			public String getPackageType() {
				return this.packageType;
			}

			public void setPackageType(String packageType) {
				this.packageType = packageType;
			}

			public Integer getSilentType() {
				return this.silentType;
			}

			public void setSilentType(Integer silentType) {
				this.silentType = silentType;
			}

			public Integer getUpgradeValidTime() {
				return this.upgradeValidTime;
			}

			public void setUpgradeValidTime(Integer upgradeValidTime) {
				this.upgradeValidTime = upgradeValidTime;
			}

			public Integer getPublishType() {
				return this.publishType;
			}

			public void setPublishType(Integer publishType) {
				this.publishType = publishType;
			}

			public Integer getHistoryForce() {
				return this.historyForce;
			}

			public void setHistoryForce(Integer historyForce) {
				this.historyForce = historyForce;
			}

			public Long getPackageInfoId() {
				return this.packageInfoId;
			}

			public void setPackageInfoId(Long packageInfoId) {
				this.packageInfoId = packageInfoId;
			}

			public String getWhitelistIds() {
				return this.whitelistIds;
			}

			public void setWhitelistIds(String whitelistIds) {
				this.whitelistIds = whitelistIds;
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

				private String ruleType;

				private String ruleElement;

				private String operation;

				private String value;

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
			}

			public static class WhitelistItem {

				private String whiteListName;

				private String idType;

				private String platform;

				private String appCode;

				private Long whiteListCount;

				private Integer status;

				private String whitelistType;

				private Long id;

				private String userType;

				public String getWhiteListName() {
					return this.whiteListName;
				}

				public void setWhiteListName(String whiteListName) {
					this.whiteListName = whiteListName;
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

				public String getAppCode() {
					return this.appCode;
				}

				public void setAppCode(String appCode) {
					this.appCode = appCode;
				}

				public Long getWhiteListCount() {
					return this.whiteListCount;
				}

				public void setWhiteListCount(Long whiteListCount) {
					this.whiteListCount = whiteListCount;
				}

				public Integer getStatus() {
					return this.status;
				}

				public void setStatus(Integer status) {
					this.status = status;
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

				public String getUserType() {
					return this.userType;
				}

				public void setUserType(String userType) {
					this.userType = userType;
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
