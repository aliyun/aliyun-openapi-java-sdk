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

package com.aliyuncs.edas.model.v20170801;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.edas.transform.v20170801.ListBuildPackResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListBuildPackResponse extends AcsResponse {

	private Integer code;

	private String message;

	private String requestId;

	private List<BuildPack> buildPackList;

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<BuildPack> getBuildPackList() {
		return this.buildPackList;
	}

	public void setBuildPackList(List<BuildPack> buildPackList) {
		this.buildPackList = buildPackList;
	}

	public static class BuildPack {

		private Long configId;

		private String packVersion;

		private String tomcatDesc;

		private String tomcatVersion;

		private String tomcatDownloadUrl;

		private String pandoraVersion;

		private String pandoraDownloadUrl;

		private String pandoraDesc;

		private String pluginInfo;

		private String tomcatPath;

		private String imageId;

		private String tengineImageId;

		private Boolean multipleTenant;

		private Boolean withTengine;

		private String tengineDownloadUrl;

		private String scriptName;

		private String scriptVersion;

		private String feature;

		private String supportFeatures;

		private Boolean disabled;

		public Long getConfigId() {
			return this.configId;
		}

		public void setConfigId(Long configId) {
			this.configId = configId;
		}

		public String getPackVersion() {
			return this.packVersion;
		}

		public void setPackVersion(String packVersion) {
			this.packVersion = packVersion;
		}

		public String getTomcatDesc() {
			return this.tomcatDesc;
		}

		public void setTomcatDesc(String tomcatDesc) {
			this.tomcatDesc = tomcatDesc;
		}

		public String getTomcatVersion() {
			return this.tomcatVersion;
		}

		public void setTomcatVersion(String tomcatVersion) {
			this.tomcatVersion = tomcatVersion;
		}

		public String getTomcatDownloadUrl() {
			return this.tomcatDownloadUrl;
		}

		public void setTomcatDownloadUrl(String tomcatDownloadUrl) {
			this.tomcatDownloadUrl = tomcatDownloadUrl;
		}

		public String getPandoraVersion() {
			return this.pandoraVersion;
		}

		public void setPandoraVersion(String pandoraVersion) {
			this.pandoraVersion = pandoraVersion;
		}

		public String getPandoraDownloadUrl() {
			return this.pandoraDownloadUrl;
		}

		public void setPandoraDownloadUrl(String pandoraDownloadUrl) {
			this.pandoraDownloadUrl = pandoraDownloadUrl;
		}

		public String getPandoraDesc() {
			return this.pandoraDesc;
		}

		public void setPandoraDesc(String pandoraDesc) {
			this.pandoraDesc = pandoraDesc;
		}

		public String getPluginInfo() {
			return this.pluginInfo;
		}

		public void setPluginInfo(String pluginInfo) {
			this.pluginInfo = pluginInfo;
		}

		public String getTomcatPath() {
			return this.tomcatPath;
		}

		public void setTomcatPath(String tomcatPath) {
			this.tomcatPath = tomcatPath;
		}

		public String getImageId() {
			return this.imageId;
		}

		public void setImageId(String imageId) {
			this.imageId = imageId;
		}

		public String getTengineImageId() {
			return this.tengineImageId;
		}

		public void setTengineImageId(String tengineImageId) {
			this.tengineImageId = tengineImageId;
		}

		public Boolean getMultipleTenant() {
			return this.multipleTenant;
		}

		public void setMultipleTenant(Boolean multipleTenant) {
			this.multipleTenant = multipleTenant;
		}

		public Boolean getWithTengine() {
			return this.withTengine;
		}

		public void setWithTengine(Boolean withTengine) {
			this.withTengine = withTengine;
		}

		public String getTengineDownloadUrl() {
			return this.tengineDownloadUrl;
		}

		public void setTengineDownloadUrl(String tengineDownloadUrl) {
			this.tengineDownloadUrl = tengineDownloadUrl;
		}

		public String getScriptName() {
			return this.scriptName;
		}

		public void setScriptName(String scriptName) {
			this.scriptName = scriptName;
		}

		public String getScriptVersion() {
			return this.scriptVersion;
		}

		public void setScriptVersion(String scriptVersion) {
			this.scriptVersion = scriptVersion;
		}

		public String getFeature() {
			return this.feature;
		}

		public void setFeature(String feature) {
			this.feature = feature;
		}

		public String getSupportFeatures() {
			return this.supportFeatures;
		}

		public void setSupportFeatures(String supportFeatures) {
			this.supportFeatures = supportFeatures;
		}

		public Boolean getDisabled() {
			return this.disabled;
		}

		public void setDisabled(Boolean disabled) {
			this.disabled = disabled;
		}
	}

	@Override
	public ListBuildPackResponse getInstance(UnmarshallerContext context) {
		return	ListBuildPackResponseUnmarshaller.unmarshall(this, context);
	}
}
