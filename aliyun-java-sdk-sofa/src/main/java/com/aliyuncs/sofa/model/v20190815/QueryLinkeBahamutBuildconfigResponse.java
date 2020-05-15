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

package com.aliyuncs.sofa.model.v20190815;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sofa.transform.v20190815.QueryLinkeBahamutBuildconfigResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryLinkeBahamutBuildconfigResponse extends AcsResponse {

	private String requestId;

	private String resultCode;

	private String resultMessage;

	private String errorMessage;

	private String message;

	private Boolean success;

	private Result result;

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

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Result getResult() {
		return this.result;
	}

	public void setResult(Result result) {
		this.result = result;
	}

	public static class Result {

		private Boolean useCustomProductOss;

		private List<RegistryConfigsItem> registryConfigs;

		private List<SettingsFilesItem> settingsFiles;

		private OssConfig ossConfig;

		public Boolean getUseCustomProductOss() {
			return this.useCustomProductOss;
		}

		public void setUseCustomProductOss(Boolean useCustomProductOss) {
			this.useCustomProductOss = useCustomProductOss;
		}

		public List<RegistryConfigsItem> getRegistryConfigs() {
			return this.registryConfigs;
		}

		public void setRegistryConfigs(List<RegistryConfigsItem> registryConfigs) {
			this.registryConfigs = registryConfigs;
		}

		public List<SettingsFilesItem> getSettingsFiles() {
			return this.settingsFiles;
		}

		public void setSettingsFiles(List<SettingsFilesItem> settingsFiles) {
			this.settingsFiles = settingsFiles;
		}

		public OssConfig getOssConfig() {
			return this.ossConfig;
		}

		public void setOssConfig(OssConfig ossConfig) {
			this.ossConfig = ossConfig;
		}

		public static class RegistryConfigsItem {

			private String host;

			private String token;

			private String user;

			private List<String> secretKeys;

			public String getHost() {
				return this.host;
			}

			public void setHost(String host) {
				this.host = host;
			}

			public String getToken() {
				return this.token;
			}

			public void setToken(String token) {
				this.token = token;
			}

			public String getUser() {
				return this.user;
			}

			public void setUser(String user) {
				this.user = user;
			}

			public List<String> getSecretKeys() {
				return this.secretKeys;
			}

			public void setSecretKeys(List<String> secretKeys) {
				this.secretKeys = secretKeys;
			}
		}

		public static class SettingsFilesItem {

			private String fullUrl;

			private String name;

			private String type;

			private String uid;

			private String url;

			public String getFullUrl() {
				return this.fullUrl;
			}

			public void setFullUrl(String fullUrl) {
				this.fullUrl = fullUrl;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public String getUid() {
				return this.uid;
			}

			public void setUid(String uid) {
				this.uid = uid;
			}

			public String getUrl() {
				return this.url;
			}

			public void setUrl(String url) {
				this.url = url;
			}
		}

		public static class OssConfig {

			private Boolean avaliable;

			private String ossAccessId;

			private String ossAccessKey;

			private String ossBucketName;

			private String ossEndpoint;

			public Boolean getAvaliable() {
				return this.avaliable;
			}

			public void setAvaliable(Boolean avaliable) {
				this.avaliable = avaliable;
			}

			public String getOssAccessId() {
				return this.ossAccessId;
			}

			public void setOssAccessId(String ossAccessId) {
				this.ossAccessId = ossAccessId;
			}

			public String getOssAccessKey() {
				return this.ossAccessKey;
			}

			public void setOssAccessKey(String ossAccessKey) {
				this.ossAccessKey = ossAccessKey;
			}

			public String getOssBucketName() {
				return this.ossBucketName;
			}

			public void setOssBucketName(String ossBucketName) {
				this.ossBucketName = ossBucketName;
			}

			public String getOssEndpoint() {
				return this.ossEndpoint;
			}

			public void setOssEndpoint(String ossEndpoint) {
				this.ossEndpoint = ossEndpoint;
			}
		}
	}

	@Override
	public QueryLinkeBahamutBuildconfigResponse getInstance(UnmarshallerContext context) {
		return	QueryLinkeBahamutBuildconfigResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
