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
import com.aliyuncs.r_kvstore.transform.v20150101.DescribeParameterTemplatesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeParameterTemplatesResponse extends AcsResponse {

	private String engine;

	private String engineVersion;

	private String parameterCount;

	private String requestId;

	private List<TemplateRecord> parameters;

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

	public String getParameterCount() {
		return this.parameterCount;
	}

	public void setParameterCount(String parameterCount) {
		this.parameterCount = parameterCount;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<TemplateRecord> getParameters() {
		return this.parameters;
	}

	public void setParameters(List<TemplateRecord> parameters) {
		this.parameters = parameters;
	}

	public static class TemplateRecord {

		private String checkingCode;

		private Boolean forceModify;

		private Boolean forceRestart;

		private String parameterDescription;

		private String parameterName;

		private String parameterValue;

		public String getCheckingCode() {
			return this.checkingCode;
		}

		public void setCheckingCode(String checkingCode) {
			this.checkingCode = checkingCode;
		}

		public Boolean getForceModify() {
			return this.forceModify;
		}

		public void setForceModify(Boolean forceModify) {
			this.forceModify = forceModify;
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

	@Override
	public DescribeParameterTemplatesResponse getInstance(UnmarshallerContext context) {
		return	DescribeParameterTemplatesResponseUnmarshaller.unmarshall(this, context);
	}
}
