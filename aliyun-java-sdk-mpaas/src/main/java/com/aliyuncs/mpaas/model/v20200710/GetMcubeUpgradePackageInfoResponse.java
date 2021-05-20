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

import com.aliyuncs.AcsResponse;
import com.aliyuncs.mpaas.transform.v20200710.GetMcubeUpgradePackageInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetMcubeUpgradePackageInfoResponse extends AcsResponse {

	private String requestId;

	private String resultCode;

	private String resultMessage;

	private GetPackageResult getPackageResult;

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

	public GetPackageResult getGetPackageResult() {
		return this.getPackageResult;
	}

	public void setGetPackageResult(GetPackageResult getPackageResult) {
		this.getPackageResult = getPackageResult;
	}

	public static class GetPackageResult {

		private String errorCode;

		private String resultMsg;

		private Boolean success;

		private String requestId;

		private PackageInfo packageInfo;

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

		public PackageInfo getPackageInfo() {
			return this.packageInfo;
		}

		public void setPackageInfo(PackageInfo packageInfo) {
			this.packageInfo = packageInfo;
		}

		public static class PackageInfo {

			private UpgradeBaseInfoDO upgradeBaseInfoDO;

			private MobileTestFlightConfigDO mobileTestFlightConfigDO;

			public UpgradeBaseInfoDO getUpgradeBaseInfoDO() {
				return this.upgradeBaseInfoDO;
			}

			public void setUpgradeBaseInfoDO(UpgradeBaseInfoDO upgradeBaseInfoDO) {
				this.upgradeBaseInfoDO = upgradeBaseInfoDO;
			}

			public MobileTestFlightConfigDO getMobileTestFlightConfigDO() {
				return this.mobileTestFlightConfigDO;
			}

			public void setMobileTestFlightConfigDO(MobileTestFlightConfigDO mobileTestFlightConfigDO) {
				this.mobileTestFlightConfigDO = mobileTestFlightConfigDO;
			}

			public static class UpgradeBaseInfoDO {

				private Long id;

				private String productVersion;

				private String platform;

				private String productName;

				private String packageType;

				private String appCode;

				private Integer needCheck;

				private String downloadUrl;

				private String changeLog;

				private String modifier;

				private String gmtModified;

				private String appstoreUrl;

				private Integer isEnterprise;

				private Boolean allowCreateTask;

				private String verificationCode;

				private String gmtCreate;

				private String productId;

				private Integer publishPeriod;

				private String creator;

				public Long getId() {
					return this.id;
				}

				public void setId(Long id) {
					this.id = id;
				}

				public String getProductVersion() {
					return this.productVersion;
				}

				public void setProductVersion(String productVersion) {
					this.productVersion = productVersion;
				}

				public String getPlatform() {
					return this.platform;
				}

				public void setPlatform(String platform) {
					this.platform = platform;
				}

				public String getProductName() {
					return this.productName;
				}

				public void setProductName(String productName) {
					this.productName = productName;
				}

				public String getPackageType() {
					return this.packageType;
				}

				public void setPackageType(String packageType) {
					this.packageType = packageType;
				}

				public String getAppCode() {
					return this.appCode;
				}

				public void setAppCode(String appCode) {
					this.appCode = appCode;
				}

				public Integer getNeedCheck() {
					return this.needCheck;
				}

				public void setNeedCheck(Integer needCheck) {
					this.needCheck = needCheck;
				}

				public String getDownloadUrl() {
					return this.downloadUrl;
				}

				public void setDownloadUrl(String downloadUrl) {
					this.downloadUrl = downloadUrl;
				}

				public String getChangeLog() {
					return this.changeLog;
				}

				public void setChangeLog(String changeLog) {
					this.changeLog = changeLog;
				}

				public String getModifier() {
					return this.modifier;
				}

				public void setModifier(String modifier) {
					this.modifier = modifier;
				}

				public String getGmtModified() {
					return this.gmtModified;
				}

				public void setGmtModified(String gmtModified) {
					this.gmtModified = gmtModified;
				}

				public String getAppstoreUrl() {
					return this.appstoreUrl;
				}

				public void setAppstoreUrl(String appstoreUrl) {
					this.appstoreUrl = appstoreUrl;
				}

				public Integer getIsEnterprise() {
					return this.isEnterprise;
				}

				public void setIsEnterprise(Integer isEnterprise) {
					this.isEnterprise = isEnterprise;
				}

				public Boolean getAllowCreateTask() {
					return this.allowCreateTask;
				}

				public void setAllowCreateTask(Boolean allowCreateTask) {
					this.allowCreateTask = allowCreateTask;
				}

				public String getVerificationCode() {
					return this.verificationCode;
				}

				public void setVerificationCode(String verificationCode) {
					this.verificationCode = verificationCode;
				}

				public String getGmtCreate() {
					return this.gmtCreate;
				}

				public void setGmtCreate(String gmtCreate) {
					this.gmtCreate = gmtCreate;
				}

				public String getProductId() {
					return this.productId;
				}

				public void setProductId(String productId) {
					this.productId = productId;
				}

				public Integer getPublishPeriod() {
					return this.publishPeriod;
				}

				public void setPublishPeriod(Integer publishPeriod) {
					this.publishPeriod = publishPeriod;
				}

				public String getCreator() {
					return this.creator;
				}

				public void setCreator(String creator) {
					this.creator = creator;
				}
			}

			public static class MobileTestFlightConfigDO {

				private Integer installAmount;

				private String gmtModified;

				private Long id;

				private String invalidTime;

				private String gmtCreate;

				private Long upgradeId;

				public Integer getInstallAmount() {
					return this.installAmount;
				}

				public void setInstallAmount(Integer installAmount) {
					this.installAmount = installAmount;
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

				public String getInvalidTime() {
					return this.invalidTime;
				}

				public void setInvalidTime(String invalidTime) {
					this.invalidTime = invalidTime;
				}

				public String getGmtCreate() {
					return this.gmtCreate;
				}

				public void setGmtCreate(String gmtCreate) {
					this.gmtCreate = gmtCreate;
				}

				public Long getUpgradeId() {
					return this.upgradeId;
				}

				public void setUpgradeId(Long upgradeId) {
					this.upgradeId = upgradeId;
				}
			}
		}
	}

	@Override
	public GetMcubeUpgradePackageInfoResponse getInstance(UnmarshallerContext context) {
		return	GetMcubeUpgradePackageInfoResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
