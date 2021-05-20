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
import com.aliyuncs.polardb.transform.v20170801.DescribeParameterTemplatesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeParameterTemplatesResponse extends AcsResponse {

	private String parameterCount;

	private String dBVersion;

	private String requestId;

	private String dBType;

	private String engine;

	private List<TemplateRecord> parameters;

	public String getParameterCount() {
		return this.parameterCount;
	}

	public void setParameterCount(String parameterCount) {
		this.parameterCount = parameterCount;
	}

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

	public List<TemplateRecord> getParameters() {
		return this.parameters;
	}

	public void setParameters(List<TemplateRecord> parameters) {
		this.parameters = parameters;
	}

	public static class TemplateRecord {

		private String forceModify;

		private String checkingCode;

		private String parameterValue;

		private String forceRestart;

		private String parameterName;

		private String parameterDescription;

		public String getForceModify() {
			return this.forceModify;
		}

		public void setForceModify(String forceModify) {
			this.forceModify = forceModify;
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

		public String getForceRestart() {
			return this.forceRestart;
		}

		public void setForceRestart(String forceRestart) {
			this.forceRestart = forceRestart;
		}

		public String getParameterName() {
			return this.parameterName;
		}

		public void setParameterName(String parameterName) {
			this.parameterName = parameterName;
		}

		public String getParameterDescription() {
			return this.parameterDescription;
		}

		public void setParameterDescription(String parameterDescription) {
			this.parameterDescription = parameterDescription;
		}
	}

	@Override
	public DescribeParameterTemplatesResponse getInstance(UnmarshallerContext context) {
		return	DescribeParameterTemplatesResponseUnmarshaller.unmarshall(this, context);
	}
}
