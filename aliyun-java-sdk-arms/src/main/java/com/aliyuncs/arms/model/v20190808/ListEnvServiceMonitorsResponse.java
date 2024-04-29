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
import com.aliyuncs.AcsResponse;
import com.aliyuncs.arms.transform.v20190808.ListEnvServiceMonitorsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListEnvServiceMonitorsResponse extends AcsResponse {

	private String requestId;

	private Integer code;

	private String message;

	private List<Monitoring> data;

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

	public List<Monitoring> getData() {
		return this.data;
	}

	public void setData(List<Monitoring> data) {
		this.data = data;
	}

	public static class Monitoring {

		private String regionId;

		private String environmentId;

		private String namespace;

		private String serviceMonitorName;

		private String configYaml;

		private String status;

		private String creationTimestamp;

		private String addonName;

		private String addonReleaseName;

		private String addonVersion;

		private Integer matchedServiceCount;

		private List<Endpoint> endpoints;

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getEnvironmentId() {
			return this.environmentId;
		}

		public void setEnvironmentId(String environmentId) {
			this.environmentId = environmentId;
		}

		public String getNamespace() {
			return this.namespace;
		}

		public void setNamespace(String namespace) {
			this.namespace = namespace;
		}

		public String getServiceMonitorName() {
			return this.serviceMonitorName;
		}

		public void setServiceMonitorName(String serviceMonitorName) {
			this.serviceMonitorName = serviceMonitorName;
		}

		public String getConfigYaml() {
			return this.configYaml;
		}

		public void setConfigYaml(String configYaml) {
			this.configYaml = configYaml;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getCreationTimestamp() {
			return this.creationTimestamp;
		}

		public void setCreationTimestamp(String creationTimestamp) {
			this.creationTimestamp = creationTimestamp;
		}

		public String getAddonName() {
			return this.addonName;
		}

		public void setAddonName(String addonName) {
			this.addonName = addonName;
		}

		public String getAddonReleaseName() {
			return this.addonReleaseName;
		}

		public void setAddonReleaseName(String addonReleaseName) {
			this.addonReleaseName = addonReleaseName;
		}

		public String getAddonVersion() {
			return this.addonVersion;
		}

		public void setAddonVersion(String addonVersion) {
			this.addonVersion = addonVersion;
		}

		public Integer getMatchedServiceCount() {
			return this.matchedServiceCount;
		}

		public void setMatchedServiceCount(Integer matchedServiceCount) {
			this.matchedServiceCount = matchedServiceCount;
		}

		public List<Endpoint> getEndpoints() {
			return this.endpoints;
		}

		public void setEndpoints(List<Endpoint> endpoints) {
			this.endpoints = endpoints;
		}

		public static class Endpoint {

			private String port;

			private Integer targetPort;

			private String path;

			private String interval;

			private Integer matchedTargetCount;

			public String getPort() {
				return this.port;
			}

			public void setPort(String port) {
				this.port = port;
			}

			public Integer getTargetPort() {
				return this.targetPort;
			}

			public void setTargetPort(Integer targetPort) {
				this.targetPort = targetPort;
			}

			public String getPath() {
				return this.path;
			}

			public void setPath(String path) {
				this.path = path;
			}

			public String getInterval() {
				return this.interval;
			}

			public void setInterval(String interval) {
				this.interval = interval;
			}

			public Integer getMatchedTargetCount() {
				return this.matchedTargetCount;
			}

			public void setMatchedTargetCount(Integer matchedTargetCount) {
				this.matchedTargetCount = matchedTargetCount;
			}
		}
	}

	@Override
	public ListEnvServiceMonitorsResponse getInstance(UnmarshallerContext context) {
		return	ListEnvServiceMonitorsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
