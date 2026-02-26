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

package com.aliyuncs.pts.model.v20201020;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import java.util.Map;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.pts.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class SaveOpenJMeterSceneRequest extends RpcAcsRequest<SaveOpenJMeterSceneResponse> {
	   

	@SerializedName("openJMeterScene")
	private OpenJMeterScene openJMeterScene;
	public SaveOpenJMeterSceneRequest() {
		super("PTS", "2020-10-20", "SaveOpenJMeterScene");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public OpenJMeterScene getOpenJMeterScene() {
		return this.openJMeterScene;
	}

	public void setOpenJMeterScene(OpenJMeterScene openJMeterScene) {
		this.openJMeterScene = openJMeterScene;	
		if (openJMeterScene != null) {
			putQueryParameter("OpenJMeterScene" , new Gson().toJson(openJMeterScene));
		}	
	}

	public static class OpenJMeterScene {

		@SerializedName("StartConcurrency")
		private Integer startConcurrency;

		@SerializedName("TestFile")
		private String testFile;

		@SerializedName("ConstantThroughputTimerType")
		private String constantThroughputTimerType;

		@SerializedName("SceneName")
		private String sceneName;

		@SerializedName("SecurityGroupId")
		private String securityGroupId;

		@SerializedName("FileList")
		private List<FileListItem> fileList;

		@SerializedName("Steps")
		private Integer steps;

		@SerializedName("StartRps")
		private Integer startRps;

		@SerializedName("Concurrency")
		private Integer concurrency;

		@SerializedName("Duration")
		private Integer duration;

		@SerializedName("AgentCount")
		private Integer agentCount;

		@SerializedName("VSwitchId")
		private String vSwitchId;

		@SerializedName("Mode")
		private String mode;

		@SerializedName("IsVpcTest")
		private Boolean isVpcTest;

		@SerializedName("EnvironmentId")
		private String environmentId;

		@SerializedName("RegionId")
		private String regionId;

		@SerializedName("VpcId")
		private String vpcId;

		@SerializedName("SceneId")
		private String sceneId;

		@SerializedName("JmeterPluginLabel")
		private String jmeterPluginLabel;

		@SerializedName("DnsCacheConfig")
		private DnsCacheConfig dnsCacheConfig;

		@SerializedName("JMeterProperties")
		private List<JMeterPropertiesItem> jMeterProperties;

		@SerializedName("SyncTimerType")
		private String syncTimerType;

		@SerializedName("MaxRps")
		private Integer maxRps;

		@SerializedName("RampUp")
		private Integer rampUp;

		public Integer getStartConcurrency() {
			return this.startConcurrency;
		}

		public void setStartConcurrency(Integer startConcurrency) {
			this.startConcurrency = startConcurrency;
		}

		public String getTestFile() {
			return this.testFile;
		}

		public void setTestFile(String testFile) {
			this.testFile = testFile;
		}

		public String getConstantThroughputTimerType() {
			return this.constantThroughputTimerType;
		}

		public void setConstantThroughputTimerType(String constantThroughputTimerType) {
			this.constantThroughputTimerType = constantThroughputTimerType;
		}

		public String getSceneName() {
			return this.sceneName;
		}

		public void setSceneName(String sceneName) {
			this.sceneName = sceneName;
		}

		public String getSecurityGroupId() {
			return this.securityGroupId;
		}

		public void setSecurityGroupId(String securityGroupId) {
			this.securityGroupId = securityGroupId;
		}

		public List<FileListItem> getFileList() {
			return this.fileList;
		}

		public void setFileList(List<FileListItem> fileList) {
			this.fileList = fileList;
		}

		public Integer getSteps() {
			return this.steps;
		}

		public void setSteps(Integer steps) {
			this.steps = steps;
		}

		public Integer getStartRps() {
			return this.startRps;
		}

		public void setStartRps(Integer startRps) {
			this.startRps = startRps;
		}

		public Integer getConcurrency() {
			return this.concurrency;
		}

		public void setConcurrency(Integer concurrency) {
			this.concurrency = concurrency;
		}

		public Integer getDuration() {
			return this.duration;
		}

		public void setDuration(Integer duration) {
			this.duration = duration;
		}

		public Integer getAgentCount() {
			return this.agentCount;
		}

		public void setAgentCount(Integer agentCount) {
			this.agentCount = agentCount;
		}

		public String getVSwitchId() {
			return this.vSwitchId;
		}

		public void setVSwitchId(String vSwitchId) {
			this.vSwitchId = vSwitchId;
		}

		public String getMode() {
			return this.mode;
		}

		public void setMode(String mode) {
			this.mode = mode;
		}

		public Boolean getIsVpcTest() {
			return this.isVpcTest;
		}

		public void setIsVpcTest(Boolean isVpcTest) {
			this.isVpcTest = isVpcTest;
		}

		public String getEnvironmentId() {
			return this.environmentId;
		}

		public void setEnvironmentId(String environmentId) {
			this.environmentId = environmentId;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getVpcId() {
			return this.vpcId;
		}

		public void setVpcId(String vpcId) {
			this.vpcId = vpcId;
		}

		public String getSceneId() {
			return this.sceneId;
		}

		public void setSceneId(String sceneId) {
			this.sceneId = sceneId;
		}

		public String getJmeterPluginLabel() {
			return this.jmeterPluginLabel;
		}

		public void setJmeterPluginLabel(String jmeterPluginLabel) {
			this.jmeterPluginLabel = jmeterPluginLabel;
		}

		public DnsCacheConfig getDnsCacheConfig() {
			return this.dnsCacheConfig;
		}

		public void setDnsCacheConfig(DnsCacheConfig dnsCacheConfig) {
			this.dnsCacheConfig = dnsCacheConfig;
		}

		public List<JMeterPropertiesItem> getJMeterProperties() {
			return this.jMeterProperties;
		}

		public void setJMeterProperties(List<JMeterPropertiesItem> jMeterProperties) {
			this.jMeterProperties = jMeterProperties;
		}

		public String getSyncTimerType() {
			return this.syncTimerType;
		}

		public void setSyncTimerType(String syncTimerType) {
			this.syncTimerType = syncTimerType;
		}

		public Integer getMaxRps() {
			return this.maxRps;
		}

		public void setMaxRps(Integer maxRps) {
			this.maxRps = maxRps;
		}

		public Integer getRampUp() {
			return this.rampUp;
		}

		public void setRampUp(Integer rampUp) {
			this.rampUp = rampUp;
		}

		public static class FileListItem {

			@SerializedName("FileName")
			private String fileName;

			@SerializedName("SplitCsv")
			private Boolean splitCsv;

			@SerializedName("FileSize")
			private Long fileSize;

			@SerializedName("FileOssAddress")
			private String fileOssAddress;

			@SerializedName("Md5")
			private String md5;

			@SerializedName("FileId")
			private Long fileId;

			@SerializedName("Tags")
			private String tags;

			public String getFileName() {
				return this.fileName;
			}

			public void setFileName(String fileName) {
				this.fileName = fileName;
			}

			public Boolean getSplitCsv() {
				return this.splitCsv;
			}

			public void setSplitCsv(Boolean splitCsv) {
				this.splitCsv = splitCsv;
			}

			public Long getFileSize() {
				return this.fileSize;
			}

			public void setFileSize(Long fileSize) {
				this.fileSize = fileSize;
			}

			public String getFileOssAddress() {
				return this.fileOssAddress;
			}

			public void setFileOssAddress(String fileOssAddress) {
				this.fileOssAddress = fileOssAddress;
			}

			public String getMd5() {
				return this.md5;
			}

			public void setMd5(String md5) {
				this.md5 = md5;
			}

			public Long getFileId() {
				return this.fileId;
			}

			public void setFileId(Long fileId) {
				this.fileId = fileId;
			}

			public String getTags() {
				return this.tags;
			}

			public void setTags(String tags) {
				this.tags = tags;
			}
		}

		public static class DnsCacheConfig {

			@SerializedName("ClearCacheEachIteration")
			private Boolean clearCacheEachIteration;

			@SerializedName("DnsServers")
			private List<String> dnsServers;

			@SerializedName("HostTable")
			private Map<String,String> hostTable;

			public Boolean getClearCacheEachIteration() {
				return this.clearCacheEachIteration;
			}

			public void setClearCacheEachIteration(Boolean clearCacheEachIteration) {
				this.clearCacheEachIteration = clearCacheEachIteration;
			}

			public List<String> getDnsServers() {
				return this.dnsServers;
			}

			public void setDnsServers(List<String> dnsServers) {
				this.dnsServers = dnsServers;
			}

			public Map<String,String> getHostTable() {
				return this.hostTable;
			}

			public void setHostTable(Map<String,String> hostTable) {
				this.hostTable = hostTable;
			}
		}

		public static class JMeterPropertiesItem {

			@SerializedName("Name")
			private String name;

			@SerializedName("Value")
			private String value;

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getValue() {
				return this.value;
			}

			public void setValue(String value) {
				this.value = value;
			}
		}
	}

	@Override
	public Class<SaveOpenJMeterSceneResponse> getResponseClass() {
		return SaveOpenJMeterSceneResponse.class;
	}

}
