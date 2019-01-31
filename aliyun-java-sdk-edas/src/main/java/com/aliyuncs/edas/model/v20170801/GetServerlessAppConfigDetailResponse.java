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

import com.aliyuncs.AcsResponse;
import com.aliyuncs.edas.transform.v20170801.GetServerlessAppConfigDetailResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetServerlessAppConfigDetailResponse extends AcsResponse {

	private Integer code;

	private String message;

	private Data data;

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

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String appId;

		private String appName;

		private String namespaceId;

		private String appDescription;

		private String vpcId;

		private String vSwitchId;

		private String packageType;

		private String packageVersion;

		private String packageUrl;

		private String imageUrl;

		private String jdk;

		private String webContainer;

		private Integer cpu;

		private Integer memory;

		private Integer replicas;

		private String command;

		private String commandArgs;

		private String envs;

		private String customHostAlias;

		private String jarStartOptions;

		private String jarStartArgs;

		private String liveness;

		private String readiness;

		private Integer minReadyInstances;

		private Integer batchWaitTime;

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

		public String getNamespaceId() {
			return this.namespaceId;
		}

		public void setNamespaceId(String namespaceId) {
			this.namespaceId = namespaceId;
		}

		public String getAppDescription() {
			return this.appDescription;
		}

		public void setAppDescription(String appDescription) {
			this.appDescription = appDescription;
		}

		public String getVpcId() {
			return this.vpcId;
		}

		public void setVpcId(String vpcId) {
			this.vpcId = vpcId;
		}

		public String getVSwitchId() {
			return this.vSwitchId;
		}

		public void setVSwitchId(String vSwitchId) {
			this.vSwitchId = vSwitchId;
		}

		public String getPackageType() {
			return this.packageType;
		}

		public void setPackageType(String packageType) {
			this.packageType = packageType;
		}

		public String getPackageVersion() {
			return this.packageVersion;
		}

		public void setPackageVersion(String packageVersion) {
			this.packageVersion = packageVersion;
		}

		public String getPackageUrl() {
			return this.packageUrl;
		}

		public void setPackageUrl(String packageUrl) {
			this.packageUrl = packageUrl;
		}

		public String getImageUrl() {
			return this.imageUrl;
		}

		public void setImageUrl(String imageUrl) {
			this.imageUrl = imageUrl;
		}

		public String getJdk() {
			return this.jdk;
		}

		public void setJdk(String jdk) {
			this.jdk = jdk;
		}

		public String getWebContainer() {
			return this.webContainer;
		}

		public void setWebContainer(String webContainer) {
			this.webContainer = webContainer;
		}

		public Integer getCpu() {
			return this.cpu;
		}

		public void setCpu(Integer cpu) {
			this.cpu = cpu;
		}

		public Integer getMemory() {
			return this.memory;
		}

		public void setMemory(Integer memory) {
			this.memory = memory;
		}

		public Integer getReplicas() {
			return this.replicas;
		}

		public void setReplicas(Integer replicas) {
			this.replicas = replicas;
		}

		public String getCommand() {
			return this.command;
		}

		public void setCommand(String command) {
			this.command = command;
		}

		public String getCommandArgs() {
			return this.commandArgs;
		}

		public void setCommandArgs(String commandArgs) {
			this.commandArgs = commandArgs;
		}

		public String getEnvs() {
			return this.envs;
		}

		public void setEnvs(String envs) {
			this.envs = envs;
		}

		public String getCustomHostAlias() {
			return this.customHostAlias;
		}

		public void setCustomHostAlias(String customHostAlias) {
			this.customHostAlias = customHostAlias;
		}

		public String getJarStartOptions() {
			return this.jarStartOptions;
		}

		public void setJarStartOptions(String jarStartOptions) {
			this.jarStartOptions = jarStartOptions;
		}

		public String getJarStartArgs() {
			return this.jarStartArgs;
		}

		public void setJarStartArgs(String jarStartArgs) {
			this.jarStartArgs = jarStartArgs;
		}

		public String getLiveness() {
			return this.liveness;
		}

		public void setLiveness(String liveness) {
			this.liveness = liveness;
		}

		public String getReadiness() {
			return this.readiness;
		}

		public void setReadiness(String readiness) {
			this.readiness = readiness;
		}

		public Integer getMinReadyInstances() {
			return this.minReadyInstances;
		}

		public void setMinReadyInstances(Integer minReadyInstances) {
			this.minReadyInstances = minReadyInstances;
		}

		public Integer getBatchWaitTime() {
			return this.batchWaitTime;
		}

		public void setBatchWaitTime(Integer batchWaitTime) {
			this.batchWaitTime = batchWaitTime;
		}
	}

	@Override
	public GetServerlessAppConfigDetailResponse getInstance(UnmarshallerContext context) {
		return	GetServerlessAppConfigDetailResponseUnmarshaller.unmarshall(this, context);
	}
}
