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
import com.aliyuncs.mpaas.transform.v20200710.ListMcubeNebulaTasksResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListMcubeNebulaTasksResponse extends AcsResponse {

	private String resultMessage;

	private String resultCode;

	private String requestId;

	private ListMcubeNebulaTaskResult listMcubeNebulaTaskResult;

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

	public ListMcubeNebulaTaskResult getListMcubeNebulaTaskResult() {
		return this.listMcubeNebulaTaskResult;
	}

	public void setListMcubeNebulaTaskResult(ListMcubeNebulaTaskResult listMcubeNebulaTaskResult) {
		this.listMcubeNebulaTaskResult = listMcubeNebulaTaskResult;
	}

	public static class ListMcubeNebulaTaskResult {

		private String requestId;

		private String errorCode;

		private Boolean success;

		private String resultMsg;

		private List<NebulaTaskInfoItem> nebulaTaskInfo;

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

		public List<NebulaTaskInfoItem> getNebulaTaskInfo() {
			return this.nebulaTaskInfo;
		}

		public void setNebulaTaskInfo(List<NebulaTaskInfoItem> nebulaTaskInfo) {
			this.nebulaTaskInfo = nebulaTaskInfo;
		}

		public static class NebulaTaskInfoItem {

			private Integer status;

			private Integer percent;

			private Integer publishMode;

			private String taskName;

			private String greyEndtime;

			private String gmtModified;

			private String greyEndtimeStr;

			private String creator;

			private String bizType;

			private Integer taskType;

			private String modifier;

			private String platform;

			private String productId;

			private String releaseVersion;

			private String gmtModifiedStr;

			private Long taskVersion;

			private Long upgradeNoticeNum;

			private String appCode;

			private String memo;

			private String greyConfigInfo;

			private Integer greyNum;

			private String productVersion;

			private String greyEndtimeData;

			private Integer publishType;

			private String greyUrl;

			private Integer taskStatus;

			private String syncResult;

			private String whitelistIds;

			private String gmtCreate;

			private Long packageId;

			private String upgradeProgress;

			private Long id;

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

			public String getGreyEndtime() {
				return this.greyEndtime;
			}

			public void setGreyEndtime(String greyEndtime) {
				this.greyEndtime = greyEndtime;
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

			public String getCreator() {
				return this.creator;
			}

			public void setCreator(String creator) {
				this.creator = creator;
			}

			public String getBizType() {
				return this.bizType;
			}

			public void setBizType(String bizType) {
				this.bizType = bizType;
			}

			public Integer getTaskType() {
				return this.taskType;
			}

			public void setTaskType(Integer taskType) {
				this.taskType = taskType;
			}

			public String getModifier() {
				return this.modifier;
			}

			public void setModifier(String modifier) {
				this.modifier = modifier;
			}

			public String getPlatform() {
				return this.platform;
			}

			public void setPlatform(String platform) {
				this.platform = platform;
			}

			public String getProductId() {
				return this.productId;
			}

			public void setProductId(String productId) {
				this.productId = productId;
			}

			public String getReleaseVersion() {
				return this.releaseVersion;
			}

			public void setReleaseVersion(String releaseVersion) {
				this.releaseVersion = releaseVersion;
			}

			public String getGmtModifiedStr() {
				return this.gmtModifiedStr;
			}

			public void setGmtModifiedStr(String gmtModifiedStr) {
				this.gmtModifiedStr = gmtModifiedStr;
			}

			public Long getTaskVersion() {
				return this.taskVersion;
			}

			public void setTaskVersion(Long taskVersion) {
				this.taskVersion = taskVersion;
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

			public String getGreyConfigInfo() {
				return this.greyConfigInfo;
			}

			public void setGreyConfigInfo(String greyConfigInfo) {
				this.greyConfigInfo = greyConfigInfo;
			}

			public Integer getGreyNum() {
				return this.greyNum;
			}

			public void setGreyNum(Integer greyNum) {
				this.greyNum = greyNum;
			}

			public String getProductVersion() {
				return this.productVersion;
			}

			public void setProductVersion(String productVersion) {
				this.productVersion = productVersion;
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

			public String getGreyUrl() {
				return this.greyUrl;
			}

			public void setGreyUrl(String greyUrl) {
				this.greyUrl = greyUrl;
			}

			public Integer getTaskStatus() {
				return this.taskStatus;
			}

			public void setTaskStatus(Integer taskStatus) {
				this.taskStatus = taskStatus;
			}

			public String getSyncResult() {
				return this.syncResult;
			}

			public void setSyncResult(String syncResult) {
				this.syncResult = syncResult;
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
		}
	}

	@Override
	public ListMcubeNebulaTasksResponse getInstance(UnmarshallerContext context) {
		return	ListMcubeNebulaTasksResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
