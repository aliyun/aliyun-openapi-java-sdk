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

import com.aliyuncs.AcsResponse;
import com.aliyuncs.mpaas.transform.v20201028.GetMcubeNebulaResourceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetMcubeNebulaResourceResponse extends AcsResponse {

	private String resultMessage;

	private String resultCode;

	private String requestId;

	private GetNebulaResourceResult getNebulaResourceResult;

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

	public GetNebulaResourceResult getGetNebulaResourceResult() {
		return this.getNebulaResourceResult;
	}

	public void setGetNebulaResourceResult(GetNebulaResourceResult getNebulaResourceResult) {
		this.getNebulaResourceResult = getNebulaResourceResult;
	}

	public static class GetNebulaResourceResult {

		private String requestId;

		private String errorCode;

		private Boolean success;

		private String resultMsg;

		private NebulaResourceInfo nebulaResourceInfo;

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

		public NebulaResourceInfo getNebulaResourceInfo() {
			return this.nebulaResourceInfo;
		}

		public void setNebulaResourceInfo(NebulaResourceInfo nebulaResourceInfo) {
			this.nebulaResourceInfo = nebulaResourceInfo;
		}

		public static class NebulaResourceInfo {

			private Integer status;

			private String h5Version;

			private String gmtModified;

			private Integer packageType;

			private String creator;

			private String fallbackBaseUrl;

			private String modifier;

			private Long metaId;

			private Integer autoInstall;

			private String resourceType;

			private String platform;

			private String h5Name;

			private String clientVersionMin;

			private String vhost;

			private String mainUrl;

			private String fileSize;

			private String downloadUrl;

			private String appCode;

			private String memo;

			private String h5Id;

			private Integer publishPeriod;

			private String extendInfo;

			private Integer installType;

			private String clientVersionMax;

			private String gmtCreate;

			private Long id;

			private String extraData;

			public Integer getStatus() {
				return this.status;
			}

			public void setStatus(Integer status) {
				this.status = status;
			}

			public String getH5Version() {
				return this.h5Version;
			}

			public void setH5Version(String h5Version) {
				this.h5Version = h5Version;
			}

			public String getGmtModified() {
				return this.gmtModified;
			}

			public void setGmtModified(String gmtModified) {
				this.gmtModified = gmtModified;
			}

			public Integer getPackageType() {
				return this.packageType;
			}

			public void setPackageType(Integer packageType) {
				this.packageType = packageType;
			}

			public String getCreator() {
				return this.creator;
			}

			public void setCreator(String creator) {
				this.creator = creator;
			}

			public String getFallbackBaseUrl() {
				return this.fallbackBaseUrl;
			}

			public void setFallbackBaseUrl(String fallbackBaseUrl) {
				this.fallbackBaseUrl = fallbackBaseUrl;
			}

			public String getModifier() {
				return this.modifier;
			}

			public void setModifier(String modifier) {
				this.modifier = modifier;
			}

			public Long getMetaId() {
				return this.metaId;
			}

			public void setMetaId(Long metaId) {
				this.metaId = metaId;
			}

			public Integer getAutoInstall() {
				return this.autoInstall;
			}

			public void setAutoInstall(Integer autoInstall) {
				this.autoInstall = autoInstall;
			}

			public String getResourceType() {
				return this.resourceType;
			}

			public void setResourceType(String resourceType) {
				this.resourceType = resourceType;
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

			public String getClientVersionMin() {
				return this.clientVersionMin;
			}

			public void setClientVersionMin(String clientVersionMin) {
				this.clientVersionMin = clientVersionMin;
			}

			public String getVhost() {
				return this.vhost;
			}

			public void setVhost(String vhost) {
				this.vhost = vhost;
			}

			public String getMainUrl() {
				return this.mainUrl;
			}

			public void setMainUrl(String mainUrl) {
				this.mainUrl = mainUrl;
			}

			public String getFileSize() {
				return this.fileSize;
			}

			public void setFileSize(String fileSize) {
				this.fileSize = fileSize;
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

			public Integer getPublishPeriod() {
				return this.publishPeriod;
			}

			public void setPublishPeriod(Integer publishPeriod) {
				this.publishPeriod = publishPeriod;
			}

			public String getExtendInfo() {
				return this.extendInfo;
			}

			public void setExtendInfo(String extendInfo) {
				this.extendInfo = extendInfo;
			}

			public Integer getInstallType() {
				return this.installType;
			}

			public void setInstallType(Integer installType) {
				this.installType = installType;
			}

			public String getClientVersionMax() {
				return this.clientVersionMax;
			}

			public void setClientVersionMax(String clientVersionMax) {
				this.clientVersionMax = clientVersionMax;
			}

			public String getGmtCreate() {
				return this.gmtCreate;
			}

			public void setGmtCreate(String gmtCreate) {
				this.gmtCreate = gmtCreate;
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
	public GetMcubeNebulaResourceResponse getInstance(UnmarshallerContext context) {
		return	GetMcubeNebulaResourceResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
