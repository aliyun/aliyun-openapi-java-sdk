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
import com.aliyuncs.mpaas.transform.v20201028.ListMcubeNebulaResourcesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListMcubeNebulaResourcesResponse extends AcsResponse {

	private String requestId;

	private String resultCode;

	private String resultMessage;

	private ListMcubeNebulaResourceResult listMcubeNebulaResourceResult;

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

	public ListMcubeNebulaResourceResult getListMcubeNebulaResourceResult() {
		return this.listMcubeNebulaResourceResult;
	}

	public void setListMcubeNebulaResourceResult(ListMcubeNebulaResourceResult listMcubeNebulaResourceResult) {
		this.listMcubeNebulaResourceResult = listMcubeNebulaResourceResult;
	}

	public static class ListMcubeNebulaResourceResult {

		private String errorCode;

		private String resultMsg;

		private Boolean success;

		private String requestId;

		private List<NebulaResourceInfoItem> nebulaResourceInfo;

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

		public List<NebulaResourceInfoItem> getNebulaResourceInfo() {
			return this.nebulaResourceInfo;
		}

		public void setNebulaResourceInfo(List<NebulaResourceInfoItem> nebulaResourceInfo) {
			this.nebulaResourceInfo = nebulaResourceInfo;
		}

		public static class NebulaResourceInfoItem {

			private String appCode;

			private String memo;

			private String downloadUrl;

			private String platform;

			private Integer lazyLoad;

			private Integer packageType;

			private String gmtModified;

			private String modifier;

			private String extraData;

			private Long metaId;

			private Long id;

			private String h5Version;

			private String fallbackBaseUrl;

			private Integer autoInstall;

			private String gmtCreate;

			private String extendInfo;

			private String creator;

			private String releaseVersion;

			private Integer publishPeriod;

			private String clientVersionMax;

			private String debugUrl;

			private String h5Id;

			private String h5Name;

			private String md5;

			private Integer status;

			private String resourceType;

			private String mainUrl;

			private String vhost;

			private String clientVersionMin;

			private Integer installType;

			private String fileSize;

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

			public String getDownloadUrl() {
				return this.downloadUrl;
			}

			public void setDownloadUrl(String downloadUrl) {
				this.downloadUrl = downloadUrl;
			}

			public String getPlatform() {
				return this.platform;
			}

			public void setPlatform(String platform) {
				this.platform = platform;
			}

			public Integer getLazyLoad() {
				return this.lazyLoad;
			}

			public void setLazyLoad(Integer lazyLoad) {
				this.lazyLoad = lazyLoad;
			}

			public Integer getPackageType() {
				return this.packageType;
			}

			public void setPackageType(Integer packageType) {
				this.packageType = packageType;
			}

			public String getGmtModified() {
				return this.gmtModified;
			}

			public void setGmtModified(String gmtModified) {
				this.gmtModified = gmtModified;
			}

			public String getModifier() {
				return this.modifier;
			}

			public void setModifier(String modifier) {
				this.modifier = modifier;
			}

			public String getExtraData() {
				return this.extraData;
			}

			public void setExtraData(String extraData) {
				this.extraData = extraData;
			}

			public Long getMetaId() {
				return this.metaId;
			}

			public void setMetaId(Long metaId) {
				this.metaId = metaId;
			}

			public Long getId() {
				return this.id;
			}

			public void setId(Long id) {
				this.id = id;
			}

			public String getH5Version() {
				return this.h5Version;
			}

			public void setH5Version(String h5Version) {
				this.h5Version = h5Version;
			}

			public String getFallbackBaseUrl() {
				return this.fallbackBaseUrl;
			}

			public void setFallbackBaseUrl(String fallbackBaseUrl) {
				this.fallbackBaseUrl = fallbackBaseUrl;
			}

			public Integer getAutoInstall() {
				return this.autoInstall;
			}

			public void setAutoInstall(Integer autoInstall) {
				this.autoInstall = autoInstall;
			}

			public String getGmtCreate() {
				return this.gmtCreate;
			}

			public void setGmtCreate(String gmtCreate) {
				this.gmtCreate = gmtCreate;
			}

			public String getExtendInfo() {
				return this.extendInfo;
			}

			public void setExtendInfo(String extendInfo) {
				this.extendInfo = extendInfo;
			}

			public String getCreator() {
				return this.creator;
			}

			public void setCreator(String creator) {
				this.creator = creator;
			}

			public String getReleaseVersion() {
				return this.releaseVersion;
			}

			public void setReleaseVersion(String releaseVersion) {
				this.releaseVersion = releaseVersion;
			}

			public Integer getPublishPeriod() {
				return this.publishPeriod;
			}

			public void setPublishPeriod(Integer publishPeriod) {
				this.publishPeriod = publishPeriod;
			}

			public String getClientVersionMax() {
				return this.clientVersionMax;
			}

			public void setClientVersionMax(String clientVersionMax) {
				this.clientVersionMax = clientVersionMax;
			}

			public String getDebugUrl() {
				return this.debugUrl;
			}

			public void setDebugUrl(String debugUrl) {
				this.debugUrl = debugUrl;
			}

			public String getH5Id() {
				return this.h5Id;
			}

			public void setH5Id(String h5Id) {
				this.h5Id = h5Id;
			}

			public String getH5Name() {
				return this.h5Name;
			}

			public void setH5Name(String h5Name) {
				this.h5Name = h5Name;
			}

			public String getMd5() {
				return this.md5;
			}

			public void setMd5(String md5) {
				this.md5 = md5;
			}

			public Integer getStatus() {
				return this.status;
			}

			public void setStatus(Integer status) {
				this.status = status;
			}

			public String getResourceType() {
				return this.resourceType;
			}

			public void setResourceType(String resourceType) {
				this.resourceType = resourceType;
			}

			public String getMainUrl() {
				return this.mainUrl;
			}

			public void setMainUrl(String mainUrl) {
				this.mainUrl = mainUrl;
			}

			public String getVhost() {
				return this.vhost;
			}

			public void setVhost(String vhost) {
				this.vhost = vhost;
			}

			public String getClientVersionMin() {
				return this.clientVersionMin;
			}

			public void setClientVersionMin(String clientVersionMin) {
				this.clientVersionMin = clientVersionMin;
			}

			public Integer getInstallType() {
				return this.installType;
			}

			public void setInstallType(Integer installType) {
				this.installType = installType;
			}

			public String getFileSize() {
				return this.fileSize;
			}

			public void setFileSize(String fileSize) {
				this.fileSize = fileSize;
			}
		}
	}

	@Override
	public ListMcubeNebulaResourcesResponse getInstance(UnmarshallerContext context) {
		return	ListMcubeNebulaResourcesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
