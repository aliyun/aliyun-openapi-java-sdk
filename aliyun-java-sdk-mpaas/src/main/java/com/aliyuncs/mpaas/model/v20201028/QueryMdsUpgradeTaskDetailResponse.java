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
import com.aliyuncs.mpaas.transform.v20201028.QueryMdsUpgradeTaskDetailResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryMdsUpgradeTaskDetailResponse extends AcsResponse {

	private String resultMessage;

	private String resultCode;

	private String requestId;

	private ResultContent resultContent;

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

	public ResultContent getResultContent() {
		return this.resultContent;
	}

	public void setResultContent(ResultContent resultContent) {
		this.resultContent = resultContent;
	}

	public static class ResultContent {

		private String requestId;

		private Data data;

		public String getRequestId() {
			return this.requestId;
		}

		public void setRequestId(String requestId) {
			this.requestId = requestId;
		}

		public Data getData() {
			return this.data;
		}

		public void setData(Data data) {
			this.data = data;
		}

		public static class Data {

			private String requestId;

			private Boolean success;

			private String errorCode;

			private String resultMsg;

			private Content content;

			public String getRequestId() {
				return this.requestId;
			}

			public void setRequestId(String requestId) {
				this.requestId = requestId;
			}

			public Boolean getSuccess() {
				return this.success;
			}

			public void setSuccess(Boolean success) {
				this.success = success;
			}

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

			public Content getContent() {
				return this.content;
			}

			public void setContent(Content content) {
				this.content = content;
			}

			public static class Content {

				private String pushContent;

				private Long isEnterprise;

				private String packageType;

				private Long greyUv;

				private String platform;

				private String gmtCreateStr;

				private String syncMode;

				private String channelContains;

				private Long devicePercent;

				private Long upgradeValidTime;

				private String downloadUrl;

				private String greyConfigInfo;

				private Long greyNum;

				private Long executionOrder;

				private String productVersion;

				private String greyEndtimeData;

				private Long publishType;

				private Long taskStatus;

				private String syncResult;

				private Long deviceGreyNum;

				private String netType;

				private String qrcodeUrl;

				private String upgradeContent;

				private String cityExcludes;

				private Long upgradeType;

				private Long publishMode;

				private Long silentType;

				private String creator;

				private String appstoreurl;

				private String modifier;

				private String appId;

				private Long isRelease;

				private Long isRc;

				private Long packageInfoId;

				private String osVersion;

				private String productId;

				private String cityContains;

				private String releaseType;

				private String channelExcludes;

				private String mobileModelExcludes;

				private String appCode;

				private String innerVersion;

				private String memo;

				private Long isOfficial;

				private String mobileModelContains;

				private String whitelistIds;

				private Long greyNotice;

				private Long isPush;

				private Long id;

				private List<RuleJsonListItem> ruleJsonList;

				private List<WhitelistItem> whitelist;

				public String getPushContent() {
					return this.pushContent;
				}

				public void setPushContent(String pushContent) {
					this.pushContent = pushContent;
				}

				public Long getIsEnterprise() {
					return this.isEnterprise;
				}

				public void setIsEnterprise(Long isEnterprise) {
					this.isEnterprise = isEnterprise;
				}

				public String getPackageType() {
					return this.packageType;
				}

				public void setPackageType(String packageType) {
					this.packageType = packageType;
				}

				public Long getGreyUv() {
					return this.greyUv;
				}

				public void setGreyUv(Long greyUv) {
					this.greyUv = greyUv;
				}

				public String getPlatform() {
					return this.platform;
				}

				public void setPlatform(String platform) {
					this.platform = platform;
				}

				public String getGmtCreateStr() {
					return this.gmtCreateStr;
				}

				public void setGmtCreateStr(String gmtCreateStr) {
					this.gmtCreateStr = gmtCreateStr;
				}

				public String getSyncMode() {
					return this.syncMode;
				}

				public void setSyncMode(String syncMode) {
					this.syncMode = syncMode;
				}

				public String getChannelContains() {
					return this.channelContains;
				}

				public void setChannelContains(String channelContains) {
					this.channelContains = channelContains;
				}

				public Long getDevicePercent() {
					return this.devicePercent;
				}

				public void setDevicePercent(Long devicePercent) {
					this.devicePercent = devicePercent;
				}

				public Long getUpgradeValidTime() {
					return this.upgradeValidTime;
				}

				public void setUpgradeValidTime(Long upgradeValidTime) {
					this.upgradeValidTime = upgradeValidTime;
				}

				public String getDownloadUrl() {
					return this.downloadUrl;
				}

				public void setDownloadUrl(String downloadUrl) {
					this.downloadUrl = downloadUrl;
				}

				public String getGreyConfigInfo() {
					return this.greyConfigInfo;
				}

				public void setGreyConfigInfo(String greyConfigInfo) {
					this.greyConfigInfo = greyConfigInfo;
				}

				public Long getGreyNum() {
					return this.greyNum;
				}

				public void setGreyNum(Long greyNum) {
					this.greyNum = greyNum;
				}

				public Long getExecutionOrder() {
					return this.executionOrder;
				}

				public void setExecutionOrder(Long executionOrder) {
					this.executionOrder = executionOrder;
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

				public Long getPublishType() {
					return this.publishType;
				}

				public void setPublishType(Long publishType) {
					this.publishType = publishType;
				}

				public Long getTaskStatus() {
					return this.taskStatus;
				}

				public void setTaskStatus(Long taskStatus) {
					this.taskStatus = taskStatus;
				}

				public String getSyncResult() {
					return this.syncResult;
				}

				public void setSyncResult(String syncResult) {
					this.syncResult = syncResult;
				}

				public Long getDeviceGreyNum() {
					return this.deviceGreyNum;
				}

				public void setDeviceGreyNum(Long deviceGreyNum) {
					this.deviceGreyNum = deviceGreyNum;
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

				public String getCityExcludes() {
					return this.cityExcludes;
				}

				public void setCityExcludes(String cityExcludes) {
					this.cityExcludes = cityExcludes;
				}

				public Long getUpgradeType() {
					return this.upgradeType;
				}

				public void setUpgradeType(Long upgradeType) {
					this.upgradeType = upgradeType;
				}

				public Long getPublishMode() {
					return this.publishMode;
				}

				public void setPublishMode(Long publishMode) {
					this.publishMode = publishMode;
				}

				public Long getSilentType() {
					return this.silentType;
				}

				public void setSilentType(Long silentType) {
					this.silentType = silentType;
				}

				public String getCreator() {
					return this.creator;
				}

				public void setCreator(String creator) {
					this.creator = creator;
				}

				public String getAppstoreurl() {
					return this.appstoreurl;
				}

				public void setAppstoreurl(String appstoreurl) {
					this.appstoreurl = appstoreurl;
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

				public Long getIsRelease() {
					return this.isRelease;
				}

				public void setIsRelease(Long isRelease) {
					this.isRelease = isRelease;
				}

				public Long getIsRc() {
					return this.isRc;
				}

				public void setIsRc(Long isRc) {
					this.isRc = isRc;
				}

				public Long getPackageInfoId() {
					return this.packageInfoId;
				}

				public void setPackageInfoId(Long packageInfoId) {
					this.packageInfoId = packageInfoId;
				}

				public String getOsVersion() {
					return this.osVersion;
				}

				public void setOsVersion(String osVersion) {
					this.osVersion = osVersion;
				}

				public String getProductId() {
					return this.productId;
				}

				public void setProductId(String productId) {
					this.productId = productId;
				}

				public String getCityContains() {
					return this.cityContains;
				}

				public void setCityContains(String cityContains) {
					this.cityContains = cityContains;
				}

				public String getReleaseType() {
					return this.releaseType;
				}

				public void setReleaseType(String releaseType) {
					this.releaseType = releaseType;
				}

				public String getChannelExcludes() {
					return this.channelExcludes;
				}

				public void setChannelExcludes(String channelExcludes) {
					this.channelExcludes = channelExcludes;
				}

				public String getMobileModelExcludes() {
					return this.mobileModelExcludes;
				}

				public void setMobileModelExcludes(String mobileModelExcludes) {
					this.mobileModelExcludes = mobileModelExcludes;
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

				public Long getIsOfficial() {
					return this.isOfficial;
				}

				public void setIsOfficial(Long isOfficial) {
					this.isOfficial = isOfficial;
				}

				public String getMobileModelContains() {
					return this.mobileModelContains;
				}

				public void setMobileModelContains(String mobileModelContains) {
					this.mobileModelContains = mobileModelContains;
				}

				public String getWhitelistIds() {
					return this.whitelistIds;
				}

				public void setWhitelistIds(String whitelistIds) {
					this.whitelistIds = whitelistIds;
				}

				public Long getGreyNotice() {
					return this.greyNotice;
				}

				public void setGreyNotice(Long greyNotice) {
					this.greyNotice = greyNotice;
				}

				public Long getIsPush() {
					return this.isPush;
				}

				public void setIsPush(Long isPush) {
					this.isPush = isPush;
				}

				public Long getId() {
					return this.id;
				}

				public void setId(Long id) {
					this.id = id;
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

					private Long status;

					private Long whiteListCount;

					private String appCode;

					private String idType;

					private String platform;

					private String business;

					private String gmtModified;

					private Long id;

					private String whiteListName;

					public Long getStatus() {
						return this.status;
					}

					public void setStatus(Long status) {
						this.status = status;
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

					public String getBusiness() {
						return this.business;
					}

					public void setBusiness(String business) {
						this.business = business;
					}

					public String getGmtModified() {
						return this.gmtModified;
					}

					public void setGmtModified(String gmtModified) {
						this.gmtModified = gmtModified;
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
	}

	@Override
	public QueryMdsUpgradeTaskDetailResponse getInstance(UnmarshallerContext context) {
		return	QueryMdsUpgradeTaskDetailResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
