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

package com.aliyuncs.rds.model.v20140815;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.rds.transform.v20140815.DescribeParametersResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeParametersResponse extends AcsResponse {

	private String engine;

	private String engineVersion;

	private String requestId;

	private List<DBInstanceParameter> configParameters;

	private List<DBInstanceParameter1> runningParameters;

	private ParamGroupInfo paramGroupInfo;

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

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<DBInstanceParameter> getConfigParameters() {
		return this.configParameters;
	}

	public void setConfigParameters(List<DBInstanceParameter> configParameters) {
		this.configParameters = configParameters;
	}

	public List<DBInstanceParameter1> getRunningParameters() {
		return this.runningParameters;
	}

	public void setRunningParameters(List<DBInstanceParameter1> runningParameters) {
		this.runningParameters = runningParameters;
	}

	public ParamGroupInfo getParamGroupInfo() {
		return this.paramGroupInfo;
	}

	public void setParamGroupInfo(ParamGroupInfo paramGroupInfo) {
		this.paramGroupInfo = paramGroupInfo;
	}

	public static class DBInstanceParameter {

		private String parameterDescription;

		private String parameterName;

		private String parameterValue;

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

		public String getParameterValue() {
			return this.parameterValue;
		}

		public void setParameterValue(String parameterValue) {
			this.parameterValue = parameterValue;
		}
	}

	public static class DBInstanceParameter1 {

		private String parameterDefaultValue;

		private String parameterDescription;

		private String parameterName;

		private String parameterValue;

		private String parameterValueRange;

		public String getParameterDefaultValue() {
			return this.parameterDefaultValue;
		}

		public void setParameterDefaultValue(String parameterDefaultValue) {
			this.parameterDefaultValue = parameterDefaultValue;
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

		public String getParameterValue() {
			return this.parameterValue;
		}

		public void setParameterValue(String parameterValue) {
			this.parameterValue = parameterValue;
		}

		public String getParameterValueRange() {
			return this.parameterValueRange;
		}

		public void setParameterValueRange(String parameterValueRange) {
			this.parameterValueRange = parameterValueRange;
		}
	}

	public static class ParamGroupInfo {

		private String paramGroupId;

		private String parameterGroupDesc;

		private String parameterGroupName;

		private String parameterGroupType;

		public String getParamGroupId() {
			return this.paramGroupId;
		}

		public void setParamGroupId(String paramGroupId) {
			this.paramGroupId = paramGroupId;
		}

		public String getParameterGroupDesc() {
			return this.parameterGroupDesc;
		}

		public void setParameterGroupDesc(String parameterGroupDesc) {
			this.parameterGroupDesc = parameterGroupDesc;
		}

		public String getParameterGroupName() {
			return this.parameterGroupName;
		}

		public void setParameterGroupName(String parameterGroupName) {
			this.parameterGroupName = parameterGroupName;
		}

		public String getParameterGroupType() {
			return this.parameterGroupType;
		}

		public void setParameterGroupType(String parameterGroupType) {
			this.parameterGroupType = parameterGroupType;
		}
	}

	@Override
	public DescribeParametersResponse getInstance(UnmarshallerContext context) {
		return	DescribeParametersResponseUnmarshaller.unmarshall(this, context);
	}
}
