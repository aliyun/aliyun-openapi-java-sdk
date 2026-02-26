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

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.pts.transform.v20201020.GetOpenJMeterSceneResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetOpenJMeterSceneResponse extends AcsResponse {

	private String message;

	private String requestId;

	private Integer httpStatusCode;

	private String code;

	private Boolean success;

	private Scene scene;

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

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Scene getScene() {
		return this.scene;
	}

	public void setScene(Scene scene) {
		this.scene = scene;
	}

	public static class Scene {

		private String sceneName;

		private String sceneId;

		private String environmentId;

		private String testFile;

		private Boolean isVpcTest;

		private Integer duration;

		private Integer concurrency;

		private Integer agentCount;

		private Integer rampUp;

		private Integer steps;

		private String regionId;

		private String vpcId;

		private String securityGroupId;

		private String vSwitchId;

		private String syncTimerType;

		private String constantThroughputTimerType;

		private String pool;

		private String mode;

		private Integer startRps;

		private Integer maxRps;

		private Integer startConcurrency;

		private List<FileListItem> fileList;

		private BaseInfo baseInfo;

		private DnsCacheConfig dnsCacheConfig;

		public String getSceneName() {
			return this.sceneName;
		}

		public void setSceneName(String sceneName) {
			this.sceneName = sceneName;
		}

		public String getSceneId() {
			return this.sceneId;
		}

		public void setSceneId(String sceneId) {
			this.sceneId = sceneId;
		}

		public String getEnvironmentId() {
			return this.environmentId;
		}

		public void setEnvironmentId(String environmentId) {
			this.environmentId = environmentId;
		}

		public String getTestFile() {
			return this.testFile;
		}

		public void setTestFile(String testFile) {
			this.testFile = testFile;
		}

		public Boolean getIsVpcTest() {
			return this.isVpcTest;
		}

		public void setIsVpcTest(Boolean isVpcTest) {
			this.isVpcTest = isVpcTest;
		}

		public Integer getDuration() {
			return this.duration;
		}

		public void setDuration(Integer duration) {
			this.duration = duration;
		}

		public Integer getConcurrency() {
			return this.concurrency;
		}

		public void setConcurrency(Integer concurrency) {
			this.concurrency = concurrency;
		}

		public Integer getAgentCount() {
			return this.agentCount;
		}

		public void setAgentCount(Integer agentCount) {
			this.agentCount = agentCount;
		}

		public Integer getRampUp() {
			return this.rampUp;
		}

		public void setRampUp(Integer rampUp) {
			this.rampUp = rampUp;
		}

		public Integer getSteps() {
			return this.steps;
		}

		public void setSteps(Integer steps) {
			this.steps = steps;
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

		public String getSyncTimerType() {
			return this.syncTimerType;
		}

		public void setSyncTimerType(String syncTimerType) {
			this.syncTimerType = syncTimerType;
		}

		public String getConstantThroughputTimerType() {
			return this.constantThroughputTimerType;
		}

		public void setConstantThroughputTimerType(String constantThroughputTimerType) {
			this.constantThroughputTimerType = constantThroughputTimerType;
		}

		public String getPool() {
			return this.pool;
		}

		public void setPool(String pool) {
			this.pool = pool;
		}

		public String getMode() {
			return this.mode;
		}

		public void setMode(String mode) {
			this.mode = mode;
		}

		public Integer getStartRps() {
			return this.startRps;
		}

		public void setStartRps(Integer startRps) {
			this.startRps = startRps;
		}

		public Integer getMaxRps() {
			return this.maxRps;
		}

		public void setMaxRps(Integer maxRps) {
			this.maxRps = maxRps;
		}

		public Integer getStartConcurrency() {
			return this.startConcurrency;
		}

		public void setStartConcurrency(Integer startConcurrency) {
			this.startConcurrency = startConcurrency;
		}

		public List<FileListItem> getFileList() {
			return this.fileList;
		}

		public void setFileList(List<FileListItem> fileList) {
			this.fileList = fileList;
		}

		public BaseInfo getBaseInfo() {
			return this.baseInfo;
		}

		public void setBaseInfo(BaseInfo baseInfo) {
			this.baseInfo = baseInfo;
		}

		public DnsCacheConfig getDnsCacheConfig() {
			return this.dnsCacheConfig;
		}

		public void setDnsCacheConfig(DnsCacheConfig dnsCacheConfig) {
			this.dnsCacheConfig = dnsCacheConfig;
		}

		public static class FileListItem {

			private Long id;

			private String fileName;

			private String fileOssAddress;

			private Boolean splitCsv;

			private String md5;

			private Long fileSize;

			private String fileType;

			public Long getId() {
				return this.id;
			}

			public void setId(Long id) {
				this.id = id;
			}

			public String getFileName() {
				return this.fileName;
			}

			public void setFileName(String fileName) {
				this.fileName = fileName;
			}

			public String getFileOssAddress() {
				return this.fileOssAddress;
			}

			public void setFileOssAddress(String fileOssAddress) {
				this.fileOssAddress = fileOssAddress;
			}

			public Boolean getSplitCsv() {
				return this.splitCsv;
			}

			public void setSplitCsv(Boolean splitCsv) {
				this.splitCsv = splitCsv;
			}

			public String getMd5() {
				return this.md5;
			}

			public void setMd5(String md5) {
				this.md5 = md5;
			}

			public Long getFileSize() {
				return this.fileSize;
			}

			public void setFileSize(Long fileSize) {
				this.fileSize = fileSize;
			}

			public String getFileType() {
				return this.fileType;
			}

			public void setFileType(String fileType) {
				this.fileType = fileType;
			}
		}

		public static class BaseInfo {

			private String remark;

			private String principal;

			private String resource;

			private String createName;

			private String modifyName;

			private String operateType;

			public String getRemark() {
				return this.remark;
			}

			public void setRemark(String remark) {
				this.remark = remark;
			}

			public String getPrincipal() {
				return this.principal;
			}

			public void setPrincipal(String principal) {
				this.principal = principal;
			}

			public String getResource() {
				return this.resource;
			}

			public void setResource(String resource) {
				this.resource = resource;
			}

			public String getCreateName() {
				return this.createName;
			}

			public void setCreateName(String createName) {
				this.createName = createName;
			}

			public String getModifyName() {
				return this.modifyName;
			}

			public void setModifyName(String modifyName) {
				this.modifyName = modifyName;
			}

			public String getOperateType() {
				return this.operateType;
			}

			public void setOperateType(String operateType) {
				this.operateType = operateType;
			}
		}

		public static class DnsCacheConfig {

			private Boolean clearCacheEachIteration;

			private Map<Object,Object> hostTable;

			private List<String> dnsServers;

			public Boolean getClearCacheEachIteration() {
				return this.clearCacheEachIteration;
			}

			public void setClearCacheEachIteration(Boolean clearCacheEachIteration) {
				this.clearCacheEachIteration = clearCacheEachIteration;
			}

			public Map<Object,Object> getHostTable() {
				return this.hostTable;
			}

			public void setHostTable(Map<Object,Object> hostTable) {
				this.hostTable = hostTable;
			}

			public List<String> getDnsServers() {
				return this.dnsServers;
			}

			public void setDnsServers(List<String> dnsServers) {
				this.dnsServers = dnsServers;
			}
		}
	}

	@Override
	public GetOpenJMeterSceneResponse getInstance(UnmarshallerContext context) {
		return	GetOpenJMeterSceneResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
