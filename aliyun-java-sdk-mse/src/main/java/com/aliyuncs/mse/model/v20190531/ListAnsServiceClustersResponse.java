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

package com.aliyuncs.mse.model.v20190531;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.mse.transform.v20190531.ListAnsServiceClustersResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListAnsServiceClustersResponse extends AcsResponse {

	private String message;

	private String requestId;

	private String errorCode;

	private Boolean success;

	private Data data;

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

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Float protectThreshold;

		private String groupName;

		private String name;

		private String selectorType;

		private Map<Object,Object> metadata;

		private Boolean ephemeral;

		private String source;

		private List<NacosAnsCluster> clusters;

		private AppDetail appDetail;

		public Float getProtectThreshold() {
			return this.protectThreshold;
		}

		public void setProtectThreshold(Float protectThreshold) {
			this.protectThreshold = protectThreshold;
		}

		public String getGroupName() {
			return this.groupName;
		}

		public void setGroupName(String groupName) {
			this.groupName = groupName;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getSelectorType() {
			return this.selectorType;
		}

		public void setSelectorType(String selectorType) {
			this.selectorType = selectorType;
		}

		public Map<Object,Object> getMetadata() {
			return this.metadata;
		}

		public void setMetadata(Map<Object,Object> metadata) {
			this.metadata = metadata;
		}

		public Boolean getEphemeral() {
			return this.ephemeral;
		}

		public void setEphemeral(Boolean ephemeral) {
			this.ephemeral = ephemeral;
		}

		public String getSource() {
			return this.source;
		}

		public void setSource(String source) {
			this.source = source;
		}

		public List<NacosAnsCluster> getClusters() {
			return this.clusters;
		}

		public void setClusters(List<NacosAnsCluster> clusters) {
			this.clusters = clusters;
		}

		public AppDetail getAppDetail() {
			return this.appDetail;
		}

		public void setAppDetail(AppDetail appDetail) {
			this.appDetail = appDetail;
		}

		public static class NacosAnsCluster {

			private Integer defaultCheckPort;

			private String healthCheckerType;

			private Boolean useIPPort4Check;

			private String serviceName;

			private String name;

			private Integer defaultPort;

			private Map<Object,Object> metadata;

			public Integer getDefaultCheckPort() {
				return this.defaultCheckPort;
			}

			public void setDefaultCheckPort(Integer defaultCheckPort) {
				this.defaultCheckPort = defaultCheckPort;
			}

			public String getHealthCheckerType() {
				return this.healthCheckerType;
			}

			public void setHealthCheckerType(String healthCheckerType) {
				this.healthCheckerType = healthCheckerType;
			}

			public Boolean getUseIPPort4Check() {
				return this.useIPPort4Check;
			}

			public void setUseIPPort4Check(Boolean useIPPort4Check) {
				this.useIPPort4Check = useIPPort4Check;
			}

			public String getServiceName() {
				return this.serviceName;
			}

			public void setServiceName(String serviceName) {
				this.serviceName = serviceName;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public Integer getDefaultPort() {
				return this.defaultPort;
			}

			public void setDefaultPort(Integer defaultPort) {
				this.defaultPort = defaultPort;
			}

			public Map<Object,Object> getMetadata() {
				return this.metadata;
			}

			public void setMetadata(Map<Object,Object> metadata) {
				this.metadata = metadata;
			}
		}

		public static class AppDetail {

			private String appId;

			private String appName;

			private Integer port;

			private String checkType;

			private String checkPath;

			private Integer checkTimeout;

			private Integer checkInternal;

			private Integer healthyCheckTimes;

			private Integer unhealthyCheckTimes;

			public String getAppId() {
				return this.appId;
			}

			public void setAppId(String appId) {
				this.appId = appId;
			}

			public String getAppName() {
				return this.appName;
			}

			public void setAppName(String appName) {
				this.appName = appName;
			}

			public Integer getPort() {
				return this.port;
			}

			public void setPort(Integer port) {
				this.port = port;
			}

			public String getCheckType() {
				return this.checkType;
			}

			public void setCheckType(String checkType) {
				this.checkType = checkType;
			}

			public String getCheckPath() {
				return this.checkPath;
			}

			public void setCheckPath(String checkPath) {
				this.checkPath = checkPath;
			}

			public Integer getCheckTimeout() {
				return this.checkTimeout;
			}

			public void setCheckTimeout(Integer checkTimeout) {
				this.checkTimeout = checkTimeout;
			}

			public Integer getCheckInternal() {
				return this.checkInternal;
			}

			public void setCheckInternal(Integer checkInternal) {
				this.checkInternal = checkInternal;
			}

			public Integer getHealthyCheckTimes() {
				return this.healthyCheckTimes;
			}

			public void setHealthyCheckTimes(Integer healthyCheckTimes) {
				this.healthyCheckTimes = healthyCheckTimes;
			}

			public Integer getUnhealthyCheckTimes() {
				return this.unhealthyCheckTimes;
			}

			public void setUnhealthyCheckTimes(Integer unhealthyCheckTimes) {
				this.unhealthyCheckTimes = unhealthyCheckTimes;
			}
		}
	}

	@Override
	public ListAnsServiceClustersResponse getInstance(UnmarshallerContext context) {
		return	ListAnsServiceClustersResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
