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
import com.aliyuncs.mpaas.transform.v20200710.ListMcubeUpgradePackagesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListMcubeUpgradePackagesResponse extends AcsResponse {

	private String resultMessage;

	private String resultCode;

	private String requestId;

	private ListPackagesResult listPackagesResult;

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

	public ListPackagesResult getListPackagesResult() {
		return this.listPackagesResult;
	}

	public void setListPackagesResult(ListPackagesResult listPackagesResult) {
		this.listPackagesResult = listPackagesResult;
	}

	public static class ListPackagesResult {

		private String requestId;

		private String errorCode;

		private Boolean success;

		private String resultMsg;

		private List<Data> packages;

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

		public List<Data> getPackages() {
			return this.packages;
		}

		public void setPackages(List<Data> packages) {
			this.packages = packages;
		}

		public static class Data {

			private Integer needCheck;

			private String downloadUrl;

			private String appCode;

			private Integer publishPeriod;

			private String gmtModified;

			private Integer isEnterprise;

			private String packageType;

			private String productVersion;

			private String creator;

			private String modifier;

			private Boolean allowCreateTask;

			private String gmtCreate;

			private String verificationCode;

			private String appstoreUrl;

			private String platform;

			private String productId;

			private String md5;

			private String changeLog;

			private Long id;

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

			public String getAppCode() {
				return this.appCode;
			}

			public void setAppCode(String appCode) {
				this.appCode = appCode;
			}

			public Integer getPublishPeriod() {
				return this.publishPeriod;
			}

			public void setPublishPeriod(Integer publishPeriod) {
				this.publishPeriod = publishPeriod;
			}

			public String getGmtModified() {
				return this.gmtModified;
			}

			public void setGmtModified(String gmtModified) {
				this.gmtModified = gmtModified;
			}

			public Integer getIsEnterprise() {
				return this.isEnterprise;
			}

			public void setIsEnterprise(Integer isEnterprise) {
				this.isEnterprise = isEnterprise;
			}

			public String getPackageType() {
				return this.packageType;
			}

			public void setPackageType(String packageType) {
				this.packageType = packageType;
			}

			public String getProductVersion() {
				return this.productVersion;
			}

			public void setProductVersion(String productVersion) {
				this.productVersion = productVersion;
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

			public Boolean getAllowCreateTask() {
				return this.allowCreateTask;
			}

			public void setAllowCreateTask(Boolean allowCreateTask) {
				this.allowCreateTask = allowCreateTask;
			}

			public String getGmtCreate() {
				return this.gmtCreate;
			}

			public void setGmtCreate(String gmtCreate) {
				this.gmtCreate = gmtCreate;
			}

			public String getVerificationCode() {
				return this.verificationCode;
			}

			public void setVerificationCode(String verificationCode) {
				this.verificationCode = verificationCode;
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

			public String getProductId() {
				return this.productId;
			}

			public void setProductId(String productId) {
				this.productId = productId;
			}

			public String getMd5() {
				return this.md5;
			}

			public void setMd5(String md5) {
				this.md5 = md5;
			}

			public String getChangeLog() {
				return this.changeLog;
			}

			public void setChangeLog(String changeLog) {
				this.changeLog = changeLog;
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
	public ListMcubeUpgradePackagesResponse getInstance(UnmarshallerContext context) {
		return	ListMcubeUpgradePackagesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
