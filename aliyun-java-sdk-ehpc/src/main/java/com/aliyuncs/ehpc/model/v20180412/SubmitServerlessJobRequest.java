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

package com.aliyuncs.ehpc.model.v20180412;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ehpc.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class SubmitServerlessJobRequest extends RpcAcsRequest<SubmitServerlessJobResponse> {
	   

	@SerializedName("container")
	private Container container;

	private Float memory;

	@SerializedName("dependsOn")
	private List<DependsOn> dependsOn;

	private Float spotPriceLimit;

	private Long timeout;

	@SerializedName("instanceType")
	private List<String> instanceType;

	private String jobName;

	private Long jobPriority;

	private Float cpu;

	private String ramRoleName;

	private String clusterId;

	private String spotStrategy;

	@SerializedName("vSwitchId")
	private List<String> vSwitchId;

	@SerializedName("retryStrategy")
	private RetryStrategy retryStrategy;

	private Integer ephemeralStorage;

	@SerializedName("arrayProperties")
	private ArrayProperties arrayProperties;
	public SubmitServerlessJobRequest() {
		super("EHPC", "2018-04-12", "SubmitServerlessJob", "ehs");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Container getContainer() {
		return this.container;
	}

	public void setContainer(Container container) {
		this.container = container;	
		if (container != null) {
			putQueryParameter("Container" , new Gson().toJson(container));
		}	
	}

	public Float getMemory() {
		return this.memory;
	}

	public void setMemory(Float memory) {
		this.memory = memory;
		if(memory != null){
			putQueryParameter("Memory", memory.toString());
		}
	}

	public List<DependsOn> getDependsOn() {
		return this.dependsOn;
	}

	public void setDependsOn(List<DependsOn> dependsOn) {
		this.dependsOn = dependsOn;	
		if (dependsOn != null) {
			putQueryParameter("DependsOn" , new Gson().toJson(dependsOn));
		}	
	}

	public Float getSpotPriceLimit() {
		return this.spotPriceLimit;
	}

	public void setSpotPriceLimit(Float spotPriceLimit) {
		this.spotPriceLimit = spotPriceLimit;
		if(spotPriceLimit != null){
			putQueryParameter("SpotPriceLimit", spotPriceLimit.toString());
		}
	}

	public Long getTimeout() {
		return this.timeout;
	}

	public void setTimeout(Long timeout) {
		this.timeout = timeout;
		if(timeout != null){
			putQueryParameter("Timeout", timeout.toString());
		}
	}

	public List<String> getInstanceType() {
		return this.instanceType;
	}

	public void setInstanceType(List<String> instanceType) {
		this.instanceType = instanceType;	
		if (instanceType != null) {
			putQueryParameter("InstanceType" , new Gson().toJson(instanceType));
		}	
	}

	public String getJobName() {
		return this.jobName;
	}

	public void setJobName(String jobName) {
		this.jobName = jobName;
		if(jobName != null){
			putQueryParameter("JobName", jobName);
		}
	}

	public Long getJobPriority() {
		return this.jobPriority;
	}

	public void setJobPriority(Long jobPriority) {
		this.jobPriority = jobPriority;
		if(jobPriority != null){
			putQueryParameter("JobPriority", jobPriority.toString());
		}
	}

	public Float getCpu() {
		return this.cpu;
	}

	public void setCpu(Float cpu) {
		this.cpu = cpu;
		if(cpu != null){
			putQueryParameter("Cpu", cpu.toString());
		}
	}

	public String getRamRoleName() {
		return this.ramRoleName;
	}

	public void setRamRoleName(String ramRoleName) {
		this.ramRoleName = ramRoleName;
		if(ramRoleName != null){
			putQueryParameter("RamRoleName", ramRoleName);
		}
	}

	public String getClusterId() {
		return this.clusterId;
	}

	public void setClusterId(String clusterId) {
		this.clusterId = clusterId;
		if(clusterId != null){
			putQueryParameter("ClusterId", clusterId);
		}
	}

	public String getSpotStrategy() {
		return this.spotStrategy;
	}

	public void setSpotStrategy(String spotStrategy) {
		this.spotStrategy = spotStrategy;
		if(spotStrategy != null){
			putQueryParameter("SpotStrategy", spotStrategy);
		}
	}

	public List<String> getVSwitchId() {
		return this.vSwitchId;
	}

	public void setVSwitchId(List<String> vSwitchId) {
		this.vSwitchId = vSwitchId;	
		if (vSwitchId != null) {
			putQueryParameter("VSwitchId" , new Gson().toJson(vSwitchId));
		}	
	}

	public RetryStrategy getRetryStrategy() {
		return this.retryStrategy;
	}

	public void setRetryStrategy(RetryStrategy retryStrategy) {
		this.retryStrategy = retryStrategy;	
		if (retryStrategy != null) {
			putQueryParameter("RetryStrategy" , new Gson().toJson(retryStrategy));
		}	
	}

	public Integer getEphemeralStorage() {
		return this.ephemeralStorage;
	}

	public void setEphemeralStorage(Integer ephemeralStorage) {
		this.ephemeralStorage = ephemeralStorage;
		if(ephemeralStorage != null){
			putQueryParameter("EphemeralStorage", ephemeralStorage.toString());
		}
	}

	public ArrayProperties getArrayProperties() {
		return this.arrayProperties;
	}

	public void setArrayProperties(ArrayProperties arrayProperties) {
		this.arrayProperties = arrayProperties;	
		if (arrayProperties != null) {
			putQueryParameter("ArrayProperties" , new Gson().toJson(arrayProperties));
		}	
	}

	public static class Container {

		@SerializedName("VolumeMount")
		private List<VolumeMountItem> volumeMount;

		@SerializedName("Image")
		private String image;

		@SerializedName("Port")
		private List<PortItem> port;

		@SerializedName("EnvironmentVar")
		private List<EnvironmentVarItem> environmentVar;

		@SerializedName("WorkingDir")
		private String workingDir;

		@SerializedName("Arg")
		private List<String> arg;

		@SerializedName("Name")
		private String name;

		@SerializedName("Gpu")
		private Integer gpu;

		@SerializedName("Command")
		private List<String> command;

		public List<VolumeMountItem> getVolumeMount() {
			return this.volumeMount;
		}

		public void setVolumeMount(List<VolumeMountItem> volumeMount) {
			this.volumeMount = volumeMount;
		}

		public String getImage() {
			return this.image;
		}

		public void setImage(String image) {
			this.image = image;
		}

		public List<PortItem> getPort() {
			return this.port;
		}

		public void setPort(List<PortItem> port) {
			this.port = port;
		}

		public List<EnvironmentVarItem> getEnvironmentVar() {
			return this.environmentVar;
		}

		public void setEnvironmentVar(List<EnvironmentVarItem> environmentVar) {
			this.environmentVar = environmentVar;
		}

		public String getWorkingDir() {
			return this.workingDir;
		}

		public void setWorkingDir(String workingDir) {
			this.workingDir = workingDir;
		}

		public List<String> getArg() {
			return this.arg;
		}

		public void setArg(List<String> arg) {
			this.arg = arg;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Integer getGpu() {
			return this.gpu;
		}

		public void setGpu(Integer gpu) {
			this.gpu = gpu;
		}

		public List<String> getCommand() {
			return this.command;
		}

		public void setCommand(List<String> command) {
			this.command = command;
		}

		public static class VolumeMountItem {

			@SerializedName("FlexVolumeDriver")
			private String flexVolumeDriver;

			@SerializedName("MountPath")
			private String mountPath;

			@SerializedName("ReadOnly")
			private Boolean readOnly;

			@SerializedName("MountPropagation")
			private String mountPropagation;

			@SerializedName("SubPath")
			private String subPath;

			@SerializedName("NFSVolumePath")
			private String nFSVolumePath;

			@SerializedName("Type")
			private String type;

			@SerializedName("FlexVolumeOptions")
			private String flexVolumeOptions;

			@SerializedName("NFSVolumeReadOnly")
			private Boolean nFSVolumeReadOnly;

			@SerializedName("NFSVolumeServer")
			private String nFSVolumeServer;

			public String getFlexVolumeDriver() {
				return this.flexVolumeDriver;
			}

			public void setFlexVolumeDriver(String flexVolumeDriver) {
				this.flexVolumeDriver = flexVolumeDriver;
			}

			public String getMountPath() {
				return this.mountPath;
			}

			public void setMountPath(String mountPath) {
				this.mountPath = mountPath;
			}

			public Boolean getReadOnly() {
				return this.readOnly;
			}

			public void setReadOnly(Boolean readOnly) {
				this.readOnly = readOnly;
			}

			public String getMountPropagation() {
				return this.mountPropagation;
			}

			public void setMountPropagation(String mountPropagation) {
				this.mountPropagation = mountPropagation;
			}

			public String getSubPath() {
				return this.subPath;
			}

			public void setSubPath(String subPath) {
				this.subPath = subPath;
			}

			public String getNFSVolumePath() {
				return this.nFSVolumePath;
			}

			public void setNFSVolumePath(String nFSVolumePath) {
				this.nFSVolumePath = nFSVolumePath;
			}

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public String getFlexVolumeOptions() {
				return this.flexVolumeOptions;
			}

			public void setFlexVolumeOptions(String flexVolumeOptions) {
				this.flexVolumeOptions = flexVolumeOptions;
			}

			public Boolean getNFSVolumeReadOnly() {
				return this.nFSVolumeReadOnly;
			}

			public void setNFSVolumeReadOnly(Boolean nFSVolumeReadOnly) {
				this.nFSVolumeReadOnly = nFSVolumeReadOnly;
			}

			public String getNFSVolumeServer() {
				return this.nFSVolumeServer;
			}

			public void setNFSVolumeServer(String nFSVolumeServer) {
				this.nFSVolumeServer = nFSVolumeServer;
			}
		}

		public static class PortItem {

			@SerializedName("Protocol")
			private String protocol;

			@SerializedName("Port")
			private Integer port;

			public String getBizProtocol() {
				return this.protocol;
			}

			public void setBizProtocol(String protocol) {
				this.protocol = protocol;
			}

			public Integer getPort() {
				return this.port;
			}

			public void setPort(Integer port) {
				this.port = port;
			}
		}

		public static class EnvironmentVarItem {

			@SerializedName("Value")
			private String value;

			@SerializedName("Key")
			private String key;

			public String getValue() {
				return this.value;
			}

			public void setValue(String value) {
				this.value = value;
			}

			public String getKey() {
				return this.key;
			}

			public void setKey(String key) {
				this.key = key;
			}
		}
	}

	public static class DependsOn {

		@SerializedName("JobId")
		private String jobId;

		@SerializedName("Type")
		private String type;

		public String getJobId() {
			return this.jobId;
		}

		public void setJobId(String jobId) {
			this.jobId = jobId;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}
	}

	public static class RetryStrategy {

		@SerializedName("EvaluateOnExit")
		private List<EvaluateOnExitItem> evaluateOnExit;

		@SerializedName("Attempts")
		private Integer attempts;

		public List<EvaluateOnExitItem> getEvaluateOnExit() {
			return this.evaluateOnExit;
		}

		public void setEvaluateOnExit(List<EvaluateOnExitItem> evaluateOnExit) {
			this.evaluateOnExit = evaluateOnExit;
		}

		public Integer getAttempts() {
			return this.attempts;
		}

		public void setAttempts(Integer attempts) {
			this.attempts = attempts;
		}

		public static class EvaluateOnExitItem {

			@SerializedName("Action")
			private String action;

			@SerializedName("OnExitCode")
			private String onExitCode;

			public String getAction() {
				return this.action;
			}

			public void setAction(String action) {
				this.action = action;
			}

			public String getOnExitCode() {
				return this.onExitCode;
			}

			public void setOnExitCode(String onExitCode) {
				this.onExitCode = onExitCode;
			}
		}
	}

	public static class ArrayProperties {

		@SerializedName("IndexStart")
		private Long indexStart;

		@SerializedName("IndexStep")
		private Long indexStep;

		@SerializedName("IndexEnd")
		private Long indexEnd;

		public Long getIndexStart() {
			return this.indexStart;
		}

		public void setIndexStart(Long indexStart) {
			this.indexStart = indexStart;
		}

		public Long getIndexStep() {
			return this.indexStep;
		}

		public void setIndexStep(Long indexStep) {
			this.indexStep = indexStep;
		}

		public Long getIndexEnd() {
			return this.indexEnd;
		}

		public void setIndexEnd(Long indexEnd) {
			this.indexEnd = indexEnd;
		}
	}

	@Override
	public Class<SubmitServerlessJobResponse> getResponseClass() {
		return SubmitServerlessJobResponse.class;
	}

}
