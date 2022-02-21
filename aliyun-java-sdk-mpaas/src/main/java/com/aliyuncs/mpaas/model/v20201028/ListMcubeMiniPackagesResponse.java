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
import com.aliyuncs.mpaas.transform.v20201028.ListMcubeMiniPackagesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListMcubeMiniPackagesResponse extends AcsResponse {

	private String resultMessage;

	private String resultCode;

	private String requestId;

	private ListMiniPackageResult listMiniPackageResult;

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

	public ListMiniPackageResult getListMiniPackageResult() {
		return this.listMiniPackageResult;
	}

	public void setListMiniPackageResult(ListMiniPackageResult listMiniPackageResult) {
		this.listMiniPackageResult = listMiniPackageResult;
	}

	public static class ListMiniPackageResult {

		private Boolean success;

		private String resultMsg;

		private List<MiniPackageListItem> miniPackageList;

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

		public List<MiniPackageListItem> getMiniPackageList() {
			return this.miniPackageList;
		}

		public void setMiniPackageList(List<MiniPackageListItem> miniPackageList) {
			this.miniPackageList = miniPackageList;
		}

		public static class MiniPackageListItem {

			private Long status;

			private String downloadUrl;

			private String appCode;

			private String memo;

			private String h5Id;

			private String h5Version;

			private Long publishPeriod;

			private String gmtModified;

			private Long packageType;

			private String extendInfo;

			private String fallbackBaseUrl;

			private Long resourceType;

			private Long autoInstall;

			private Long installType;

			private String clientVersionMax;

			private String platform;

			private String h5Name;

			private String gmtCreate;

			private String clientVersionMin;

			private String mainUrl;

			private Long id;

			private String extraData;

			public Long getStatus() {
				return this.status;
			}

			public void setStatus(Long status) {
				this.status = status;
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

			public String getH5Id() {
				return this.h5Id;
			}

			public void setH5Id(String h5Id) {
				this.h5Id = h5Id;
			}

			public String getH5Version() {
				return this.h5Version;
			}

			public void setH5Version(String h5Version) {
				this.h5Version = h5Version;
			}

			public Long getPublishPeriod() {
				return this.publishPeriod;
			}

			public void setPublishPeriod(Long publishPeriod) {
				this.publishPeriod = publishPeriod;
			}

			public String getGmtModified() {
				return this.gmtModified;
			}

			public void setGmtModified(String gmtModified) {
				this.gmtModified = gmtModified;
			}

			public Long getPackageType() {
				return this.packageType;
			}

			public void setPackageType(Long packageType) {
				this.packageType = packageType;
			}

			public String getExtendInfo() {
				return this.extendInfo;
			}

			public void setExtendInfo(String extendInfo) {
				this.extendInfo = extendInfo;
			}

			public String getFallbackBaseUrl() {
				return this.fallbackBaseUrl;
			}

			public void setFallbackBaseUrl(String fallbackBaseUrl) {
				this.fallbackBaseUrl = fallbackBaseUrl;
			}

			public Long getResourceType() {
				return this.resourceType;
			}

			public void setResourceType(Long resourceType) {
				this.resourceType = resourceType;
			}

			public Long getAutoInstall() {
				return this.autoInstall;
			}

			public void setAutoInstall(Long autoInstall) {
				this.autoInstall = autoInstall;
			}

			public Long getInstallType() {
				return this.installType;
			}

			public void setInstallType(Long installType) {
				this.installType = installType;
			}

			public String getClientVersionMax() {
				return this.clientVersionMax;
			}

			public void setClientVersionMax(String clientVersionMax) {
				this.clientVersionMax = clientVersionMax;
			}

			public String getPlatform() {
				return this.platform;
			}

			public void setPlatform(String platform) {
				this.platform = platform;
			}

			public String getH5Name() {
				return this.h5Name;
			}

			public void setH5Name(String h5Name) {
				this.h5Name = h5Name;
			}

			public String getGmtCreate() {
				return this.gmtCreate;
			}

			public void setGmtCreate(String gmtCreate) {
				this.gmtCreate = gmtCreate;
			}

			public String getClientVersionMin() {
				return this.clientVersionMin;
			}

			public void setClientVersionMin(String clientVersionMin) {
				this.clientVersionMin = clientVersionMin;
			}

			public String getMainUrl() {
				return this.mainUrl;
			}

			public void setMainUrl(String mainUrl) {
				this.mainUrl = mainUrl;
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
		}
	}

	@Override
	public ListMcubeMiniPackagesResponse getInstance(UnmarshallerContext context) {
		return	ListMcubeMiniPackagesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
