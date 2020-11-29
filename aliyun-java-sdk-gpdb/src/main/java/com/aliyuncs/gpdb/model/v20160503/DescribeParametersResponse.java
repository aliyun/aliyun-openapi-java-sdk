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

package com.aliyuncs.gpdb.model.v20160503;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.gpdb.transform.v20160503.DescribeParametersResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeParametersResponse extends AcsResponse {

	private String requestId;

	private List<ParametersItem> parameters;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<ParametersItem> getParameters() {
		return this.parameters;
	}

	public void setParameters(List<ParametersItem> parameters) {
		this.parameters = parameters;
	}

	public static class ParametersItem {

		private String parameterName;

		private String parameterValue;

		private String currentValue;

		private String parameterDescription;

		private String forceRestartInstance;

		private String isChangeableConfig;

		private String optionalRange;

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

		public String getCurrentValue() {
			return this.currentValue;
		}

		public void setCurrentValue(String currentValue) {
			this.currentValue = currentValue;
		}

		public String getParameterDescription() {
			return this.parameterDescription;
		}

		public void setParameterDescription(String parameterDescription) {
			this.parameterDescription = parameterDescription;
		}

		public String getForceRestartInstance() {
			return this.forceRestartInstance;
		}

		public void setForceRestartInstance(String forceRestartInstance) {
			this.forceRestartInstance = forceRestartInstance;
		}

		public String getIsChangeableConfig() {
			return this.isChangeableConfig;
		}

		public void setIsChangeableConfig(String isChangeableConfig) {
			this.isChangeableConfig = isChangeableConfig;
		}

		public String getOptionalRange() {
			return this.optionalRange;
		}

		public void setOptionalRange(String optionalRange) {
			this.optionalRange = optionalRange;
		}
	}

	@Override
	public DescribeParametersResponse getInstance(UnmarshallerContext context) {
		return	DescribeParametersResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
