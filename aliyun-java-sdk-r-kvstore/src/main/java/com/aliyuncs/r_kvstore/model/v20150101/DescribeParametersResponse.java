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

package com.aliyuncs.r_kvstore.model.v20150101;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.r_kvstore.transform.v20150101.DescribeParametersResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeParametersResponse extends AcsResponse {

	private String requestId;

	private String engine;

	private String engineVersion;

	private List<Parameter> configParameters;

	private List<Parameter> runningParameters;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getEngine() {
		return this.engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	public String getEngineVersion() {
		return this.engineVersion;
	}

	public void setEngineVersion(String engineVersion) {
		this.engineVersion = engineVersion;
	}

	public List<Parameter> getConfigParameters() {
		return this.configParameters;
	}

	public void setConfigParameters(List<Parameter> configParameters) {
		this.configParameters = configParameters;
	}

	public List<Parameter> getRunningParameters() {
		return this.runningParameters;
	}

	public void setRunningParameters(List<Parameter> runningParameters) {
		this.runningParameters = runningParameters;
	}

	public static class Parameter {

		private String parameterName;

		private String parameterValue;

		private Boolean modifiableStatus;

		private Boolean forceRestart;

		private String checkingCode;

		private String parameterDescription;

		public String getParameterName() {
			return this.parameterName;
		}

		public void setParameterName(String parameterName) {
			this.parameterName = parameterName;
		}

		public String getParameterValue() {
			return this.parameterValue;
		}

		public void setParameterValue(String parameterValue) {
			this.parameterValue = parameterValue;
		}

		public Boolean getModifiableStatus() {
			return this.modifiableStatus;
		}

		public void setModifiableStatus(Boolean modifiableStatus) {
			this.modifiableStatus = modifiableStatus;
		}

		public Boolean getForceRestart() {
			return this.forceRestart;
		}

		public void setForceRestart(Boolean forceRestart) {
			this.forceRestart = forceRestart;
		}

		public String getCheckingCode() {
			return this.checkingCode;
		}

		public void setCheckingCode(String checkingCode) {
			this.checkingCode = checkingCode;
		}

		public String getParameterDescription() {
			return this.parameterDescription;
		}

		public void setParameterDescription(String parameterDescription) {
			this.parameterDescription = parameterDescription;
		}
	}

	@Override
	public DescribeParametersResponse getInstance(UnmarshallerContext context) {
		return	DescribeParametersResponseUnmarshaller.unmarshall(this, context);
	}
}
