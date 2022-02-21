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
import com.aliyuncs.mpaas.transform.v20201028.ListMcubeUpgradeTasksResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListMcubeUpgradeTasksResponse extends AcsResponse {

	private String resultMessage;

	private String resultCode;

	private String requestId;

	private ListTaskResult listTaskResult;

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

	public ListTaskResult getListTaskResult() {
		return this.listTaskResult;
	}

	public void setListTaskResult(ListTaskResult listTaskResult) {
		this.listTaskResult = listTaskResult;
	}

	public static class ListTaskResult {

		private String requestId;

		private String errorCode;

		private Boolean success;

		private String resultMsg;

		private List<Data> taskInfo;

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

		public List<Data> getTaskInfo() {
			return this.taskInfo;
		}

		public void setTaskInfo(List<Data> taskInfo) {
			this.taskInfo = taskInfo;
		}

		public static class Data {

			private Integer realGreyUv;

			private Integer publishMode;

			private Integer silentType;

			private String greyEndtime;

			private String gmtModified;

			private String pushContent;

			private Integer isEnterprise;

			private String creator;

			private Integer greyUv;

			private Integer greyPauseType;

			private String modifier;

			private Integer historyForce;

			private Integer isRelease;

			private Integer realGreyEndtype;

			private String platform;

			private String maxVersion;

			private Long packageInfoId;

			private String productId;

			private Integer greyPausePoint;

			private String huobanNoticeId;

			private String realGreyEndtime;

			private String huobanUrl;

			private String gmtCreateStr;

			private Integer devicePercent;

			private Integer upgradeValidTime;

			private String gmtModifiedStr;

			private String appCode;

			private String innerVersion;

			private String memo;

			private Integer greyNum;

			private String greyConfigInfo;

			private String realGreyEndtimeStr;

			private Integer executionOrder;

			private String productVersion;

			private Integer isOfficial;

			private Integer realGreyNum;

			private Integer publishType;

			private Integer taskStatus;

			private String syncResult;

			private Integer greyNotice;

			private String whitelistIds;

			private Integer isPush;

			private String gmtCreate;

			private String upgradeContent;

			private Long id;

			private Integer upgradeType;

			public Integer getRealGreyUv() {
				return this.realGreyUv;
			}

			public void setRealGreyUv(Integer realGreyUv) {
				this.realGreyUv = realGreyUv;
			}

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

			public String getPushContent() {
				return this.pushContent;
			}

			public void setPushContent(String pushContent) {
				this.pushContent = pushContent;
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

			public Integer getGreyUv() {
				return this.greyUv;
			}

			public void setGreyUv(Integer greyUv) {
				this.greyUv = greyUv;
			}

			public Integer getGreyPauseType() {
				return this.greyPauseType;
			}

			public void setGreyPauseType(Integer greyPauseType) {
				this.greyPauseType = greyPauseType;
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

			public Integer getRealGreyEndtype() {
				return this.realGreyEndtype;
			}

			public void setRealGreyEndtype(Integer realGreyEndtype) {
				this.realGreyEndtype = realGreyEndtype;
			}

			public String getPlatform() {
				return this.platform;
			}

			public void setPlatform(String platform) {
				this.platform = platform;
			}

			public String getMaxVersion() {
				return this.maxVersion;
			}

			public void setMaxVersion(String maxVersion) {
				this.maxVersion = maxVersion;
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

			public Integer getGreyPausePoint() {
				return this.greyPausePoint;
			}

			public void setGreyPausePoint(Integer greyPausePoint) {
				this.greyPausePoint = greyPausePoint;
			}

			public String getHuobanNoticeId() {
				return this.huobanNoticeId;
			}

			public void setHuobanNoticeId(String huobanNoticeId) {
				this.huobanNoticeId = huobanNoticeId;
			}

			public String getRealGreyEndtime() {
				return this.realGreyEndtime;
			}

			public void setRealGreyEndtime(String realGreyEndtime) {
				this.realGreyEndtime = realGreyEndtime;
			}

			public String getHuobanUrl() {
				return this.huobanUrl;
			}

			public void setHuobanUrl(String huobanUrl) {
				this.huobanUrl = huobanUrl;
			}

			public String getGmtCreateStr() {
				return this.gmtCreateStr;
			}

			public void setGmtCreateStr(String gmtCreateStr) {
				this.gmtCreateStr = gmtCreateStr;
			}

			public Integer getDevicePercent() {
				return this.devicePercent;
			}

			public void setDevicePercent(Integer devicePercent) {
				this.devicePercent = devicePercent;
			}

			public Integer getUpgradeValidTime() {
				return this.upgradeValidTime;
			}

			public void setUpgradeValidTime(Integer upgradeValidTime) {
				this.upgradeValidTime = upgradeValidTime;
			}

			public String getGmtModifiedStr() {
				return this.gmtModifiedStr;
			}

			public void setGmtModifiedStr(String gmtModifiedStr) {
				this.gmtModifiedStr = gmtModifiedStr;
			}

			public String getAppCode() {
				return this.appCode;
			}

			public void setAppCode(String appCode) {
				this.appCode = appCode;
			}

			public String getInnerVersion() {
				return this.innerVersion;
			}

			public void setInnerVersion(String innerVersion) {
				this.innerVersion = innerVersion;
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

			public String getRealGreyEndtimeStr() {
				return this.realGreyEndtimeStr;
			}

			public void setRealGreyEndtimeStr(String realGreyEndtimeStr) {
				this.realGreyEndtimeStr = realGreyEndtimeStr;
			}

			public Integer getExecutionOrder() {
				return this.executionOrder;
			}

			public void setExecutionOrder(Integer executionOrder) {
				this.executionOrder = executionOrder;
			}

			public String getProductVersion() {
				return this.productVersion;
			}

			public void setProductVersion(String productVersion) {
				this.productVersion = productVersion;
			}

			public Integer getIsOfficial() {
				return this.isOfficial;
			}

			public void setIsOfficial(Integer isOfficial) {
				this.isOfficial = isOfficial;
			}

			public Integer getRealGreyNum() {
				return this.realGreyNum;
			}

			public void setRealGreyNum(Integer realGreyNum) {
				this.realGreyNum = realGreyNum;
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

			public String getSyncResult() {
				return this.syncResult;
			}

			public void setSyncResult(String syncResult) {
				this.syncResult = syncResult;
			}

			public Integer getGreyNotice() {
				return this.greyNotice;
			}

			public void setGreyNotice(Integer greyNotice) {
				this.greyNotice = greyNotice;
			}

			public String getWhitelistIds() {
				return this.whitelistIds;
			}

			public void setWhitelistIds(String whitelistIds) {
				this.whitelistIds = whitelistIds;
			}

			public Integer getIsPush() {
				return this.isPush;
			}

			public void setIsPush(Integer isPush) {
				this.isPush = isPush;
			}

			public String getGmtCreate() {
				return this.gmtCreate;
			}

			public void setGmtCreate(String gmtCreate) {
				this.gmtCreate = gmtCreate;
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
		}
	}

	@Override
	public ListMcubeUpgradeTasksResponse getInstance(UnmarshallerContext context) {
		return	ListMcubeUpgradeTasksResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
