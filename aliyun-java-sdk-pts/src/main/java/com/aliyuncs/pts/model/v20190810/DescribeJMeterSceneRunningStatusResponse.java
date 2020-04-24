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

import com.aliyuncs.AcsResponse;
import com.aliyuncs.pts.transform.v20190810.DescribeJMeterSceneRunningStatusResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeJMeterSceneRunningStatusResponse extends AcsResponse {

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

		private String jmeterVersion;

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

		private String plan;

		private Integer steps;

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

		public String getJmeterVersion() {
			return this.jmeterVersion;
		}

		public void setJmeterVersion(String jmeterVersion) {
			this.jmeterVersion = jmeterVersion;
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

		public String getPlan() {
			return this.plan;
		}

		public void setPlan(String plan) {
			this.plan = plan;
		}

		public Integer getSteps() {
			return this.steps;
		}

		public void setSteps(Integer steps) {
			this.steps = steps;
		}
	}

	@Override
	public DescribeJMeterSceneRunningStatusResponse getInstance(UnmarshallerContext context) {
		return	DescribeJMeterSceneRunningStatusResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
