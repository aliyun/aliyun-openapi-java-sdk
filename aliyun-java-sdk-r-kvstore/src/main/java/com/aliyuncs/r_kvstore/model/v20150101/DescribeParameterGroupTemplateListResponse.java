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
import com.aliyuncs.AcsResponse;
import com.aliyuncs.r_kvstore.transform.v20150101.DescribeParameterGroupTemplateListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeParameterGroupTemplateListResponse extends AcsResponse {

	private String requestId;

	private String engineVersion;

	private List<ParametersItem> parameters;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getEngineVersion() {
		return this.engineVersion;
	}

	public void setEngineVersion(String engineVersion) {
		this.engineVersion = engineVersion;
	}

	public List<ParametersItem> getParameters() {
		return this.parameters;
	}

	public void setParameters(List<ParametersItem> parameters) {
		this.parameters = parameters;
	}

	public static class ParametersItem {

		private Boolean supportModifyForMinorVersion;

		private String checkingCode;

		private String parameterValue;

		private Long revisable;

		private Long factor;

		private String parameterName;

		private String unit;

		private String parameterDescription;

		private Long effective;

		public Boolean getSupportModifyForMinorVersion() {
			return this.supportModifyForMinorVersion;
		}

		public void setSupportModifyForMinorVersion(Boolean supportModifyForMinorVersion) {
			this.supportModifyForMinorVersion = supportModifyForMinorVersion;
		}

		public String getCheckingCode() {
			return this.checkingCode;
		}

		public void setCheckingCode(String checkingCode) {
			this.checkingCode = checkingCode;
		}

		public String getParameterValue() {
			return this.parameterValue;
		}

		public void setParameterValue(String parameterValue) {
			this.parameterValue = parameterValue;
		}

		public Long getRevisable() {
			return this.revisable;
		}

		public void setRevisable(Long revisable) {
			this.revisable = revisable;
		}

		public Long getFactor() {
			return this.factor;
		}

		public void setFactor(Long factor) {
			this.factor = factor;
		}

		public String getParameterName() {
			return this.parameterName;
		}

		public void setParameterName(String parameterName) {
			this.parameterName = parameterName;
		}

		public String getUnit() {
			return this.unit;
		}

		public void setUnit(String unit) {
			this.unit = unit;
		}

		public String getParameterDescription() {
			return this.parameterDescription;
		}

		public void setParameterDescription(String parameterDescription) {
			this.parameterDescription = parameterDescription;
		}

		public Long getEffective() {
			return this.effective;
		}

		public void setEffective(Long effective) {
			this.effective = effective;
		}
	}

	@Override
	public DescribeParameterGroupTemplateListResponse getInstance(UnmarshallerContext context) {
		return	DescribeParameterGroupTemplateListResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
