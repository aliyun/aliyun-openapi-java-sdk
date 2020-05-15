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

package com.aliyuncs.pts.model.v20190810;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.pts.transform.v20190810.DescribeJMeterSceneResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeJMeterSceneResponse extends AcsResponse {

	private String requestId;

	private String message;

	private String code;

	private Boolean success;

	private Integer httpStatusCode;

	private Scene scene;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
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

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public Scene getScene() {
		return this.scene;
	}

	public void setScene(Scene scene) {
		this.scene = scene;
	}

	public static class Scene {

		private String name;

		private String pool;

		private String jMeterVersion;

		private Integer concurrency;

		private Integer rampUp;

		private Integer holdFor;

		private Boolean useIterations;

		private Integer iterations;

		private Integer maxConcurrencyPerAgent;

		private Boolean specifyAgentCount;

		private Integer agentCount;

		private Boolean splitCsv;

		private String testFile;

		private String fileList;

		private String regionId;

		private String vpcId;

		private String securityGroupId;

		private String vSwitchId;

		private String sceneId;

		private Boolean conditionSatisfiedExactly;

		private String syncTimerType;

		private Integer steps;

		private String constantThroughputTimerType;

		private List<ConditionItem> condition;

		private Plan plan;

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getPool() {
			return this.pool;
		}

		public void setPool(String pool) {
			this.pool = pool;
		}

		public String getJMeterVersion() {
			return this.jMeterVersion;
		}

		public void setJMeterVersion(String jMeterVersion) {
			this.jMeterVersion = jMeterVersion;
		}

		public Integer getConcurrency() {
			return this.concurrency;
		}

		public void setConcurrency(Integer concurrency) {
			this.concurrency = concurrency;
		}

		public Integer getRampUp() {
			return this.rampUp;
		}

		public void setRampUp(Integer rampUp) {
			this.rampUp = rampUp;
		}

		public Integer getHoldFor() {
			return this.holdFor;
		}

		public void setHoldFor(Integer holdFor) {
			this.holdFor = holdFor;
		}

		public Boolean getUseIterations() {
			return this.useIterations;
		}

		public void setUseIterations(Boolean useIterations) {
			this.useIterations = useIterations;
		}

		public Integer getIterations() {
			return this.iterations;
		}

		public void setIterations(Integer iterations) {
			this.iterations = iterations;
		}

		public Integer getMaxConcurrencyPerAgent() {
			return this.maxConcurrencyPerAgent;
		}

		public void setMaxConcurrencyPerAgent(Integer maxConcurrencyPerAgent) {
			this.maxConcurrencyPerAgent = maxConcurrencyPerAgent;
		}

		public Boolean getSpecifyAgentCount() {
			return this.specifyAgentCount;
		}

		public void setSpecifyAgentCount(Boolean specifyAgentCount) {
			this.specifyAgentCount = specifyAgentCount;
		}

		public Integer getAgentCount() {
			return this.agentCount;
		}

		public void setAgentCount(Integer agentCount) {
			this.agentCount = agentCount;
		}

		public Boolean getSplitCsv() {
			return this.splitCsv;
		}

		public void setSplitCsv(Boolean splitCsv) {
			this.splitCsv = splitCsv;
		}

		public String getTestFile() {
			return this.testFile;
		}

		public void setTestFile(String testFile) {
			this.testFile = testFile;
		}

		public String getFileList() {
			return this.fileList;
		}

		public void setFileList(String fileList) {
			this.fileList = fileList;
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

		public String getSceneId() {
			return this.sceneId;
		}

		public void setSceneId(String sceneId) {
			this.sceneId = sceneId;
		}

		public Boolean getConditionSatisfiedExactly() {
			return this.conditionSatisfiedExactly;
		}

		public void setConditionSatisfiedExactly(Boolean conditionSatisfiedExactly) {
			this.conditionSatisfiedExactly = conditionSatisfiedExactly;
		}

		public String getSyncTimerType() {
			return this.syncTimerType;
		}

		public void setSyncTimerType(String syncTimerType) {
			this.syncTimerType = syncTimerType;
		}

		public Integer getSteps() {
			return this.steps;
		}

		public void setSteps(Integer steps) {
			this.steps = steps;
		}

		public String getConstantThroughputTimerType() {
			return this.constantThroughputTimerType;
		}

		public void setConstantThroughputTimerType(String constantThroughputTimerType) {
			this.constantThroughputTimerType = constantThroughputTimerType;
		}

		public List<ConditionItem> getCondition() {
			return this.condition;
		}

		public void setCondition(List<ConditionItem> condition) {
			this.condition = condition;
		}

		public Plan getPlan() {
			return this.plan;
		}

		public void setPlan(Plan plan) {
			this.plan = plan;
		}

		public static class ConditionItem {

			private String region;

			private String isp;

			private Integer amount;

			public String getRegion() {
				return this.region;
			}

			public void setRegion(String region) {
				this.region = region;
			}

			public String getIsp() {
				return this.isp;
			}

			public void setIsp(String isp) {
				this.isp = isp;
			}

			public Integer getAmount() {
				return this.amount;
			}

			public void setAmount(Integer amount) {
				this.amount = amount;
			}
		}

		public static class Plan {

			private Long modifiedTime;

			private Long lastActive;

			private Long vum;

			private Boolean hasReport;

			private Long vumWeight;

			private Long beginTime;

			public Long getModifiedTime() {
				return this.modifiedTime;
			}

			public void setModifiedTime(Long modifiedTime) {
				this.modifiedTime = modifiedTime;
			}

			public Long getLastActive() {
				return this.lastActive;
			}

			public void setLastActive(Long lastActive) {
				this.lastActive = lastActive;
			}

			public Long getVum() {
				return this.vum;
			}

			public void setVum(Long vum) {
				this.vum = vum;
			}

			public Boolean getHasReport() {
				return this.hasReport;
			}

			public void setHasReport(Boolean hasReport) {
				this.hasReport = hasReport;
			}

			public Long getVumWeight() {
				return this.vumWeight;
			}

			public void setVumWeight(Long vumWeight) {
				this.vumWeight = vumWeight;
			}

			public Long getBeginTime() {
				return this.beginTime;
			}

			public void setBeginTime(Long beginTime) {
				this.beginTime = beginTime;
			}
		}
	}

	@Override
	public DescribeJMeterSceneResponse getInstance(UnmarshallerContext context) {
		return	DescribeJMeterSceneResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
