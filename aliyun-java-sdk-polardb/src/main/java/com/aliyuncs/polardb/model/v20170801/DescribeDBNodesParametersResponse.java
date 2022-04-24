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
import com.aliyuncs.polardb.transform.v20170801.DescribeDBNodesParametersResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDBNodesParametersResponse extends AcsResponse {

	private String dBVersion;

	private String requestId;

	private String dBType;

	private String engine;

	private List<DBNodeParameter> dBNodeIds;

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

	public List<DBNodeParameter> getDBNodeIds() {
		return this.dBNodeIds;
	}

	public void setDBNodeIds(List<DBNodeParameter> dBNodeIds) {
		this.dBNodeIds = dBNodeIds;
	}

	public static class DBNodeParameter {

		private String dBNodeId;

		private List<Parameter> runningParameters;

		public String getDBNodeId() {
			return this.dBNodeId;
		}

		public void setDBNodeId(String dBNodeId) {
			this.dBNodeId = dBNodeId;
		}

		public List<Parameter> getRunningParameters() {
			return this.runningParameters;
		}

		public void setRunningParameters(List<Parameter> runningParameters) {
			this.runningParameters = runningParameters;
		}

		public static class Parameter {

			private String checkingCode;

			private String dataType;

			private String defaultParameterValue;

			private Boolean forceRestart;

			private Boolean isModifiable;

			private String parameterDescription;

			private String parameterName;

			private String parameterStatus;

			private String parameterValue;

			private String isNodeAvailable;

			private String paramRelyRule;

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

			public String getDefaultParameterValue() {
				return this.defaultParameterValue;
			}

			public void setDefaultParameterValue(String defaultParameterValue) {
				this.defaultParameterValue = defaultParameterValue;
			}

			public Boolean getForceRestart() {
				return this.forceRestart;
			}

			public void setForceRestart(Boolean forceRestart) {
				this.forceRestart = forceRestart;
			}

			public Boolean getIsModifiable() {
				return this.isModifiable;
			}

			public void setIsModifiable(Boolean isModifiable) {
				this.isModifiable = isModifiable;
			}

			public String getParameterDescription() {
				return this.parameterDescription;
			}

			public void setParameterDescription(String parameterDescription) {
				this.parameterDescription = parameterDescription;
			}

			public String getParameterName() {
				return this.parameterName;
			}

			public void setParameterName(String parameterName) {
				this.parameterName = parameterName;
			}

			public String getParameterStatus() {
				return this.parameterStatus;
			}

			public void setParameterStatus(String parameterStatus) {
				this.parameterStatus = parameterStatus;
			}

			public String getParameterValue() {
				return this.parameterValue;
			}

			public void setParameterValue(String parameterValue) {
				this.parameterValue = parameterValue;
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
		}
	}

	@Override
	public DescribeDBNodesParametersResponse getInstance(UnmarshallerContext context) {
		return	DescribeDBNodesParametersResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
