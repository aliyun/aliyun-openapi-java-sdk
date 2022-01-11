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
import com.aliyuncs.mpaas.transform.v20200710.GetMcubeNebulaTaskDetailResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetMcubeNebulaTaskDetailResponse extends AcsResponse {

	private String resultMessage;

	private String resultCode;

	private String requestId;

	private GetMcubeNebulaTaskDetailResult getMcubeNebulaTaskDetailResult;

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

	public GetMcubeNebulaTaskDetailResult getGetMcubeNebulaTaskDetailResult() {
		return this.getMcubeNebulaTaskDetailResult;
	}

	public void setGetMcubeNebulaTaskDetailResult(GetMcubeNebulaTaskDetailResult getMcubeNebulaTaskDetailResult) {
		this.getMcubeNebulaTaskDetailResult = getMcubeNebulaTaskDetailResult;
	}

	public static class GetMcubeNebulaTaskDetailResult {

		private String requestId;

		private String errorCode;

		private Boolean success;

		private String resultMsg;

		private NebulaTaskDetail nebulaTaskDetail;

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

		public NebulaTaskDetail getNebulaTaskDetail() {
			return this.nebulaTaskDetail;
		}

		public void setNebulaTaskDetail(NebulaTaskDetail nebulaTaskDetail) {
			this.nebulaTaskDetail = nebulaTaskDetail;
		}

		public static class NebulaTaskDetail {

			private Integer atomic;

			private Integer taskType;

			private String platform;

			private Long baseInfoId;

			private String downloadUrl;

			private Long taskVersion;

			private Integer greyNum;

			private String greyConfigInfo;

			private Integer publishPeriod;

			private Integer syncType;

			private String sourceId;

			private String productVersion;

			private String workspaceId;

			private String greyEndtimeData;

			private Integer publishType;

			private Integer taskStatus;

			private String greyUrl;

			private String syncResult;

			private Integer status;

			private Integer percent;

			private Integer publishMode;

			private String taskName;

			private Integer quickRollback;

			private String sourceType;

			private String greyEndtime;

			private String issueDesc;

			private String gmtModified;

			private String greyEndtimeStr;

			private String bizType;

			private String creator;

			private String modifier;

			private String appId;

			private String productId;

			private Integer fullRepair;

			private String releaseVersion;

			private String fileSize;

			private String gmtModifiedStr;

			private Long upgradeNoticeNum;

			private String appCode;

			private String memo;

			private Integer cronexpress;

			private String sourceName;

			private String whitelistIds;

			private String gmtCreate;

			private Long packageId;

			private String ossPath;

			private String upgradeProgress;

			private Long id;

			private String extraData;

			private List<RuleJsonListItem> ruleJsonList;

			public Integer getAtomic() {
				return this.atomic;
			}

			public void setAtomic(Integer atomic) {
				this.atomic = atomic;
			}

			public Integer getTaskType() {
				return this.taskType;
			}

			public void setTaskType(Integer taskType) {
				this.taskType = taskType;
			}

			public String getPlatform() {
				return this.platform;
			}

			public void setPlatform(String platform) {
				this.platform = platform;
			}

			public Long getBaseInfoId() {
				return this.baseInfoId;
			}

			public void setBaseInfoId(Long baseInfoId) {
				this.baseInfoId = baseInfoId;
			}

			public String getDownloadUrl() {
				return this.downloadUrl;
			}

			public void setDownloadUrl(String downloadUrl) {
				this.downloadUrl = downloadUrl;
			}

			public Long getTaskVersion() {
				return this.taskVersion;
			}

			public void setTaskVersion(Long taskVersion) {
				this.taskVersion = taskVersion;
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

			public Integer getPublishPeriod() {
				return this.publishPeriod;
			}

			public void setPublishPeriod(Integer publishPeriod) {
				this.publishPeriod = publishPeriod;
			}

			public Integer getSyncType() {
				return this.syncType;
			}

			public void setSyncType(Integer syncType) {
				this.syncType = syncType;
			}

			public String getSourceId() {
				return this.sourceId;
			}

			public void setSourceId(String sourceId) {
				this.sourceId = sourceId;
			}

			public String getProductVersion() {
				return this.productVersion;
			}

			public void setProductVersion(String productVersion) {
				this.productVersion = productVersion;
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

			public String getGreyUrl() {
				return this.greyUrl;
			}

			public void setGreyUrl(String greyUrl) {
				this.greyUrl = greyUrl;
			}

			public String getSyncResult() {
				return this.syncResult;
			}

			public void setSyncResult(String syncResult) {
				this.syncResult = syncResult;
			}

			public Integer getStatus() {
				return this.status;
			}

			public void setStatus(Integer status) {
				this.status = status;
			}

			public Integer getPercent() {
				return this.percent;
			}

			public void setPercent(Integer percent) {
				this.percent = percent;
			}

			public Integer getPublishMode() {
				return this.publishMode;
			}

			public void setPublishMode(Integer publishMode) {
				this.publishMode = publishMode;
			}

			public String getTaskName() {
				return this.taskName;
			}

			public void setTaskName(String taskName) {
				this.taskName = taskName;
			}

			public Integer getQuickRollback() {
				return this.quickRollback;
			}

			public void setQuickRollback(Integer quickRollback) {
				this.quickRollback = quickRollback;
			}

			public String getSourceType() {
				return this.sourceType;
			}

			public void setSourceType(String sourceType) {
				this.sourceType = sourceType;
			}

			public String getGreyEndtime() {
				return this.greyEndtime;
			}

			public void setGreyEndtime(String greyEndtime) {
				this.greyEndtime = greyEndtime;
			}

			public String getIssueDesc() {
				return this.issueDesc;
			}

			public void setIssueDesc(String issueDesc) {
				this.issueDesc = issueDesc;
			}

			public String getGmtModified() {
				return this.gmtModified;
			}

			public void setGmtModified(String gmtModified) {
				this.gmtModified = gmtModified;
			}

			public String getGreyEndtimeStr() {
				return this.greyEndtimeStr;
			}

			public void setGreyEndtimeStr(String greyEndtimeStr) {
				this.greyEndtimeStr = greyEndtimeStr;
			}

			public String getBizType() {
				return this.bizType;
			}

			public void setBizType(String bizType) {
				this.bizType = bizType;
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

			public String getAppId() {
				return this.appId;
			}

			public void setAppId(String appId) {
				this.appId = appId;
			}

			public String getProductId() {
				return this.productId;
			}

			public void setProductId(String productId) {
				this.productId = productId;
			}

			public Integer getFullRepair() {
				return this.fullRepair;
			}

			public void setFullRepair(Integer fullRepair) {
				this.fullRepair = fullRepair;
			}

			public String getReleaseVersion() {
				return this.releaseVersion;
			}

			public void setReleaseVersion(String releaseVersion) {
				this.releaseVersion = releaseVersion;
			}

			public String getFileSize() {
				return this.fileSize;
			}

			public void setFileSize(String fileSize) {
				this.fileSize = fileSize;
			}

			public String getGmtModifiedStr() {
				return this.gmtModifiedStr;
			}

			public void setGmtModifiedStr(String gmtModifiedStr) {
				this.gmtModifiedStr = gmtModifiedStr;
			}

			public Long getUpgradeNoticeNum() {
				return this.upgradeNoticeNum;
			}

			public void setUpgradeNoticeNum(Long upgradeNoticeNum) {
				this.upgradeNoticeNum = upgradeNoticeNum;
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

			public Integer getCronexpress() {
				return this.cronexpress;
			}

			public void setCronexpress(Integer cronexpress) {
				this.cronexpress = cronexpress;
			}

			public String getSourceName() {
				return this.sourceName;
			}

			public void setSourceName(String sourceName) {
				this.sourceName = sourceName;
			}

			public String getWhitelistIds() {
				return this.whitelistIds;
			}

			public void setWhitelistIds(String whitelistIds) {
				this.whitelistIds = whitelistIds;
			}

			public String getGmtCreate() {
				return this.gmtCreate;
			}

			public void setGmtCreate(String gmtCreate) {
				this.gmtCreate = gmtCreate;
			}

			public Long getPackageId() {
				return this.packageId;
			}

			public void setPackageId(Long packageId) {
				this.packageId = packageId;
			}

			public String getOssPath() {
				return this.ossPath;
			}

			public void setOssPath(String ossPath) {
				this.ossPath = ossPath;
			}

			public String getUpgradeProgress() {
				return this.upgradeProgress;
			}

			public void setUpgradeProgress(String upgradeProgress) {
				this.upgradeProgress = upgradeProgress;
			}

			public Long getId() {
				return this.id;
			}

			public void setId(Long id) {
				this.id = id;
			}

			public String getExtraData() {
				return this.extraData;
			}

			public void setExtraData(String extraData) {
				this.extraData = extraData;
			}

			public List<RuleJsonListItem> getRuleJsonList() {
				return this.ruleJsonList;
			}

			public void setRuleJsonList(List<RuleJsonListItem> ruleJsonList) {
				this.ruleJsonList = ruleJsonList;
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
		}
	}

	@Override
	public GetMcubeNebulaTaskDetailResponse getInstance(UnmarshallerContext context) {
		return	GetMcubeNebulaTaskDetailResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
