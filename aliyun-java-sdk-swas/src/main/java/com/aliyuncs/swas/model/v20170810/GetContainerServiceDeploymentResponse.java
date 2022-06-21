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

package com.aliyuncs.swas.model.v20170810;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.swas.transform.v20170810.GetContainerServiceDeploymentResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetContainerServiceDeploymentResponse extends AcsResponse {

	private Boolean isSuccess;

	private String requestId;

	private String code;

	private String message;

	private String deploymentStatus;

	private String deploymentName;

	private String registryCacheName;

	private List<Container> containers;

	private List<Pod> pods;

	private PublicEndpoint publicEndpoint;

	public Boolean getIsSuccess() {
		return this.isSuccess;
	}

	public void setIsSuccess(Boolean isSuccess) {
		this.isSuccess = isSuccess;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getDeploymentStatus() {
		return this.deploymentStatus;
	}

	public void setDeploymentStatus(String deploymentStatus) {
		this.deploymentStatus = deploymentStatus;
	}

	public String getDeploymentName() {
		return this.deploymentName;
	}

	public void setDeploymentName(String deploymentName) {
		this.deploymentName = deploymentName;
	}

	public String getRegistryCacheName() {
		return this.registryCacheName;
	}

	public void setRegistryCacheName(String registryCacheName) {
		this.registryCacheName = registryCacheName;
	}

	public List<Container> getContainers() {
		return this.containers;
	}

	public void setContainers(List<Container> containers) {
		this.containers = containers;
	}

	public List<Pod> getPods() {
		return this.pods;
	}

	public void setPods(List<Pod> pods) {
		this.pods = pods;
	}

	public PublicEndpoint getPublicEndpoint() {
		return this.publicEndpoint;
	}

	public void setPublicEndpoint(PublicEndpoint publicEndpoint) {
		this.publicEndpoint = publicEndpoint;
	}

	public static class Container {

		private String containerName;

		private String command;

		private String environment;

		private String image;

		private String ports;

		public String getContainerName() {
			return this.containerName;
		}

		public void setContainerName(String containerName) {
			this.containerName = containerName;
		}

		public String getCommand() {
			return this.command;
		}

		public void setCommand(String command) {
			this.command = command;
		}

		public String getEnvironment() {
			return this.environment;
		}

		public void setEnvironment(String environment) {
			this.environment = environment;
		}

		public String getImage() {
			return this.image;
		}

		public void setImage(String image) {
			this.image = image;
		}

		public String getPorts() {
			return this.ports;
		}

		public void setPorts(String ports) {
			this.ports = ports;
		}
	}

	public static class Pod {

		private String podName;

		private String podStatus;

		private List<ContainerState> containerStates;

		public String getPodName() {
			return this.podName;
		}

		public void setPodName(String podName) {
			this.podName = podName;
		}

		public String getPodStatus() {
			return this.podStatus;
		}

		public void setPodStatus(String podStatus) {
			this.podStatus = podStatus;
		}

		public List<ContainerState> getContainerStates() {
			return this.containerStates;
		}

		public void setContainerStates(List<ContainerState> containerStates) {
			this.containerStates = containerStates;
		}

		public static class ContainerState {

			private String containerName;

			private String containerStatus;

			private String message;

			public String getContainerName() {
				return this.containerName;
			}

			public void setContainerName(String containerName) {
				this.containerName = containerName;
			}

			public String getContainerStatus() {
				return this.containerStatus;
			}

			public void setContainerStatus(String containerStatus) {
				this.containerStatus = containerStatus;
			}

			public String getMessage() {
				return this.message;
			}

			public void setMessage(String message) {
				this.message = message;
			}
		}
	}

	public static class PublicEndpoint {

		private String containerName;

		private String containerPort;

		private HealthCheck healthCheck;

		public String getContainerName() {
			return this.containerName;
		}

		public void setContainerName(String containerName) {
			this.containerName = containerName;
		}

		public String getContainerPort() {
			return this.containerPort;
		}

		public void setContainerPort(String containerPort) {
			this.containerPort = containerPort;
		}

		public HealthCheck getHealthCheck() {
			return this.healthCheck;
		}

		public void setHealthCheck(HealthCheck healthCheck) {
			this.healthCheck = healthCheck;
		}

		public static class HealthCheck {

			private Integer fallCount;

			private Integer riseCount;

			private Integer interval;

			private String path;

			private Integer timeout;

			private String successCodes;

			public Integer getFallCount() {
				return this.fallCount;
			}

			public void setFallCount(Integer fallCount) {
				this.fallCount = fallCount;
			}

			public Integer getRiseCount() {
				return this.riseCount;
			}

			public void setRiseCount(Integer riseCount) {
				this.riseCount = riseCount;
			}

			public Integer getInterval() {
				return this.interval;
			}

			public void setInterval(Integer interval) {
				this.interval = interval;
			}

			public String getPath() {
				return this.path;
			}

			public void setPath(String path) {
				this.path = path;
			}

			public Integer getTimeout() {
				return this.timeout;
			}

			public void setTimeout(Integer timeout) {
				this.timeout = timeout;
			}

			public String getSuccessCodes() {
				return this.successCodes;
			}

			public void setSuccessCodes(String successCodes) {
				this.successCodes = successCodes;
			}
		}
	}

	@Override
	public GetContainerServiceDeploymentResponse getInstance(UnmarshallerContext context) {
		return	GetContainerServiceDeploymentResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
