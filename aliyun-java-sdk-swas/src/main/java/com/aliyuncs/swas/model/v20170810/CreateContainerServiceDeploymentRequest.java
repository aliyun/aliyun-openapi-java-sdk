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

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class CreateContainerServiceDeploymentRequest extends RpcAcsRequest<CreateContainerServiceDeploymentResponse> {
	   

	private String containerServiceId;

	private String site;

	private String registryCacheName;

	@SerializedName("containers")
	private List<Containers> containers;

	@SerializedName("publicEndpoint")
	private PublicEndpoint publicEndpoint;
	public CreateContainerServiceDeploymentRequest() {
		super("SWAS", "2017-08-10", "CreateContainerServiceDeployment", "SWAS");
		setMethod(MethodType.POST);
	}

	public String getContainerServiceId() {
		return this.containerServiceId;
	}

	public void setContainerServiceId(String containerServiceId) {
		this.containerServiceId = containerServiceId;
		if(containerServiceId != null){
			putQueryParameter("ContainerServiceId", containerServiceId);
		}
	}

	public String getSite() {
		return this.site;
	}

	public void setSite(String site) {
		this.site = site;
		if(site != null){
			putQueryParameter("Site", site);
		}
	}

	public String getRegistryCacheName() {
		return this.registryCacheName;
	}

	public void setRegistryCacheName(String registryCacheName) {
		this.registryCacheName = registryCacheName;
		if(registryCacheName != null){
			putQueryParameter("RegistryCacheName", registryCacheName);
		}
	}

	public List<Containers> getContainers() {
		return this.containers;
	}

	public void setContainers(List<Containers> containers) {
		this.containers = containers;	
		if (containers != null) {
			putQueryParameter("Containers" , new Gson().toJson(containers));
		}	
	}

	public PublicEndpoint getPublicEndpoint() {
		return this.publicEndpoint;
	}

	public void setPublicEndpoint(PublicEndpoint publicEndpoint) {
		this.publicEndpoint = publicEndpoint;	
		if (publicEndpoint != null) {
			putQueryParameter("PublicEndpoint" , new Gson().toJson(publicEndpoint));
		}	
	}

	public static class Containers {

		@SerializedName("Image")
		private String image;

		@SerializedName("Environment")
		private String environment;

		@SerializedName("ContainerName")
		private String containerName;

		@SerializedName("Ports")
		private String ports;

		@SerializedName("Command")
		private String command;

		public String getImage() {
			return this.image;
		}

		public void setImage(String image) {
			this.image = image;
		}

		public String getEnvironment() {
			return this.environment;
		}

		public void setEnvironment(String environment) {
			this.environment = environment;
		}

		public String getContainerName() {
			return this.containerName;
		}

		public void setContainerName(String containerName) {
			this.containerName = containerName;
		}

		public String getPorts() {
			return this.ports;
		}

		public void setPorts(String ports) {
			this.ports = ports;
		}

		public String getCommand() {
			return this.command;
		}

		public void setCommand(String command) {
			this.command = command;
		}
	}

	public static class PublicEndpoint {

		@SerializedName("HealthCheck")
		private HealthCheck healthCheck;

		@SerializedName("ContainerName")
		private String containerName;

		@SerializedName("ContainerPort")
		private String containerPort;

		public HealthCheck getHealthCheck() {
			return this.healthCheck;
		}

		public void setHealthCheck(HealthCheck healthCheck) {
			this.healthCheck = healthCheck;
		}

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

		public static class HealthCheck {

			@SerializedName("Path")
			private String path;

			@SerializedName("RiseCount")
			private Integer riseCount;

			@SerializedName("Interval")
			private Integer interval;

			@SerializedName("SuccessCodes")
			private String successCodes;

			@SerializedName("FallCount")
			private Integer fallCount;

			@SerializedName("Timeout")
			private Integer timeout;

			public String getPath() {
				return this.path;
			}

			public void setPath(String path) {
				this.path = path;
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

			public String getSuccessCodes() {
				return this.successCodes;
			}

			public void setSuccessCodes(String successCodes) {
				this.successCodes = successCodes;
			}

			public Integer getFallCount() {
				return this.fallCount;
			}

			public void setFallCount(Integer fallCount) {
				this.fallCount = fallCount;
			}

			public Integer getTimeout() {
				return this.timeout;
			}

			public void setTimeout(Integer timeout) {
				this.timeout = timeout;
			}
		}
	}

	@Override
	public Class<CreateContainerServiceDeploymentResponse> getResponseClass() {
		return CreateContainerServiceDeploymentResponse.class;
	}

}
