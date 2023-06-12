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

package com.aliyuncs.polardb.model.v20170801;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.polardb.transform.v20170801.DescribeDBClusterParametersResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDBClusterParametersResponse extends AcsResponse {

	private String dBVersion;

	private String requestId;

	private String dBType;

	private String engine;

	private String dBClusterId;

	private String parameterNumbers;

	private List<Parameter> runningParameters;

	private List<ParametersItem> parameters;

	public String getDBVersion() {
		return this.dBVersion;
	}

	public void setDBVersion(String dBVersion) {
		this.dBVersion = dBVersion;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getDBType() {
		return this.dBType;
	}

	public void setDBType(String dBType) {
		this.dBType = dBType;
	}

	public String getEngine() {
		return this.engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	public String getDBClusterId() {
		return this.dBClusterId;
	}

	public void setDBClusterId(String dBClusterId) {
		this.dBClusterId = dBClusterId;
	}

	public String getParameterNumbers() {
		return this.parameterNumbers;
	}

	public void setParameterNumbers(String parameterNumbers) {
		this.parameterNumbers = parameterNumbers;
	}

	public List<Parameter> getRunningParameters() {
		return this.runningParameters;
	}

	public void setRunningParameters(List<Parameter> runningParameters) {
		this.runningParameters = runningParameters;
	}

	public List<ParametersItem> getParameters() {
		return this.parameters;
	}

	public void setParameters(List<ParametersItem> parameters) {
		this.parameters = parameters;
	}

	public static class Parameter {

		private String checkingCode;

		private String dataType;

		private String parameterName;

		private String parameterValue;

		private Boolean forceRestart;

		private String parameterDescription;

		private String parameterStatus;

		private String defaultParameterValue;

		private Boolean isModifiable;

		private String isNodeAvailable;

		private String paramRelyRule;

		private String factor;

		public String getCheckingCode() {
			return this.checkingCode;
		}

		public void setCheckingCode(String checkingCode) {
			this.checkingCode = checkingCode;
		}

		public String getDataType() {
			return this.dataType;
		}

		public void setDataType(String dataType) {
			this.dataType = dataType;
		}

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

		public Boolean getForceRestart() {
			return this.forceRestart;
		}

		public void setForceRestart(Boolean forceRestart) {
			this.forceRestart = forceRestart;
		}

		public String getParameterDescription() {
			return this.parameterDescription;
		}

		public void setParameterDescription(String parameterDescription) {
			this.parameterDescription = parameterDescription;
		}

		public String getParameterStatus() {
			return this.parameterStatus;
		}

		public void setParameterStatus(String parameterStatus) {
			this.parameterStatus = parameterStatus;
		}

		public String getDefaultParameterValue() {
			return this.defaultParameterValue;
		}

		public void setDefaultParameterValue(String defaultParameterValue) {
			this.defaultParameterValue = defaultParameterValue;
		}

		public Boolean getIsModifiable() {
			return this.isModifiable;
		}

		public void setIsModifiable(Boolean isModifiable) {
			this.isModifiable = isModifiable;
		}

		public String getIsNodeAvailable() {
			return this.isNodeAvailable;
		}

		public void setIsNodeAvailable(String isNodeAvailable) {
			this.isNodeAvailable = isNodeAvailable;
		}

		public String getParamRelyRule() {
			return this.paramRelyRule;
		}

		public void setParamRelyRule(String paramRelyRule) {
			this.paramRelyRule = paramRelyRule;
		}

		public String getFactor() {
			return this.factor;
		}

		public void setFactor(String factor) {
			this.factor = factor;
		}
	}

	public static class ParametersItem {

		private String rdsParameterName;

		private String rdsParameterValue;

		private String rdsParameterOptional;

		private String distParameterName;

		private String distParameterValue;

		private String distParameterOptional;

		private String isEqual;

		private String distParameterDescription;

		private String rdsParameterDescription;

		public String getRdsParameterName() {
			return this.rdsParameterName;
		}

		public void setRdsParameterName(String rdsParameterName) {
			this.rdsParameterName = rdsParameterName;
		}

		public String getRdsParameterValue() {
			return this.rdsParameterValue;
		}

		public void setRdsParameterValue(String rdsParameterValue) {
			this.rdsParameterValue = rdsParameterValue;
		}

		public String getRdsParameterOptional() {
			return this.rdsParameterOptional;
		}

		public void setRdsParameterOptional(String rdsParameterOptional) {
			this.rdsParameterOptional = rdsParameterOptional;
		}

		public String getDistParameterName() {
			return this.distParameterName;
		}

		public void setDistParameterName(String distParameterName) {
			this.distParameterName = distParameterName;
		}

		public String getDistParameterValue() {
			return this.distParameterValue;
		}

		public void setDistParameterValue(String distParameterValue) {
			this.distParameterValue = distParameterValue;
		}

		public String getDistParameterOptional() {
			return this.distParameterOptional;
		}

		public void setDistParameterOptional(String distParameterOptional) {
			this.distParameterOptional = distParameterOptional;
		}

		public String getIsEqual() {
			return this.isEqual;
		}

		public void setIsEqual(String isEqual) {
			this.isEqual = isEqual;
		}

		public String getDistParameterDescription() {
			return this.distParameterDescription;
		}

		public void setDistParameterDescription(String distParameterDescription) {
			this.distParameterDescription = distParameterDescription;
		}

		public String getRdsParameterDescription() {
			return this.rdsParameterDescription;
		}

		public void setRdsParameterDescription(String rdsParameterDescription) {
			this.rdsParameterDescription = rdsParameterDescription;
		}
	}

	@Override
	public DescribeDBClusterParametersResponse getInstance(UnmarshallerContext context) {
		return	DescribeDBClusterParametersResponseUnmarshaller.unmarshall(this, context);
	}
}
