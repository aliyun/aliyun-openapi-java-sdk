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

package com.aliyuncs.arms.model.v20190808;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.arms.transform.v20190808.DescribeEnvironmentFeatureResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeEnvironmentFeatureResponse extends AcsResponse {

	private String requestId;

	private Integer code;

	private String message;

	private Boolean success;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

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

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Feature feature;

		private FeatureStatus featureStatus;

		public Feature getFeature() {
			return this.feature;
		}

		public void setFeature(Feature feature) {
			this.feature = feature;
		}

		public FeatureStatus getFeatureStatus() {
			return this.featureStatus;
		}

		public void setFeatureStatus(FeatureStatus featureStatus) {
			this.featureStatus = featureStatus;
		}

		public static class Feature {

			private String alias;

			private Map<Object,Object> config;

			private String description;

			private String environmentId;

			private String icon;

			private String language;

			private String latestVersion;

			private String name;

			private String status;

			private String version;

			private Boolean managed;

			public String getAlias() {
				return this.alias;
			}

			public void setAlias(String alias) {
				this.alias = alias;
			}

			public Map<Object,Object> getConfig() {
				return this.config;
			}

			public void setConfig(Map<Object,Object> config) {
				this.config = config;
			}

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

			public String getEnvironmentId() {
				return this.environmentId;
			}

			public void setEnvironmentId(String environmentId) {
				this.environmentId = environmentId;
			}

			public String getIcon() {
				return this.icon;
			}

			public void setIcon(String icon) {
				this.icon = icon;
			}

			public String getLanguage() {
				return this.language;
			}

			public void setLanguage(String language) {
				this.language = language;
			}

			public String getLatestVersion() {
				return this.latestVersion;
			}

			public void setLatestVersion(String latestVersion) {
				this.latestVersion = latestVersion;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public String getVersion() {
				return this.version;
			}

			public void setVersion(String version) {
				this.version = version;
			}

			public Boolean getManaged() {
				return this.managed;
			}

			public void setManaged(Boolean managed) {
				this.managed = managed;
			}
		}

		public static class FeatureStatus {

			private String name;

			private String namespace;

			private String status;

			private String securityGroupId;

			private String vSwitchId;

			private String bindResourceId;

			private List<FeatureContainersItem> featureContainers;

			private List<String> ips;

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getNamespace() {
				return this.namespace;
			}

			public void setNamespace(String namespace) {
				this.namespace = namespace;
			}

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public String getSecurityGroupId() {
				return this.securityGroupId;
			}

			public void setSecurityGroupId(String securityGroupId) {
				this.securityGroupId = securityGroupId;
			}

			public String getVSwitchId() {
				return this.vSwitchId;
			}

			public void setVSwitchId(String vSwitchId) {
				this.vSwitchId = vSwitchId;
			}

			public String getBindResourceId() {
				return this.bindResourceId;
			}

			public void setBindResourceId(String bindResourceId) {
				this.bindResourceId = bindResourceId;
			}

			public List<FeatureContainersItem> getFeatureContainers() {
				return this.featureContainers;
			}

			public void setFeatureContainers(List<FeatureContainersItem> featureContainers) {
				this.featureContainers = featureContainers;
			}

			public List<String> getIps() {
				return this.ips;
			}

			public void setIps(List<String> ips) {
				this.ips = ips;
			}

			public static class FeatureContainersItem {

				private String image;

				private String name;

				private List<String> args;

				public String getImage() {
					return this.image;
				}

				public void setImage(String image) {
					this.image = image;
				}

				public String getName() {
					return this.name;
				}

				public void setName(String name) {
					this.name = name;
				}

				public List<String> getArgs() {
					return this.args;
				}

				public void setArgs(List<String> args) {
					this.args = args;
				}
			}
		}
	}

	@Override
	public DescribeEnvironmentFeatureResponse getInstance(UnmarshallerContext context) {
		return	DescribeEnvironmentFeatureResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
