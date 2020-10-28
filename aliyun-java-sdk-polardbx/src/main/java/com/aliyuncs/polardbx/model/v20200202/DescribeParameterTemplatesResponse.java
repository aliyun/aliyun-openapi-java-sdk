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

package com.aliyuncs.polardbx.model.v20200202;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.polardbx.transform.v20200202.DescribeParameterTemplatesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeParameterTemplatesResponse extends AcsResponse {

	private String requestId;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String engineVersion;

		private String engine;

		private Integer parameterCount;

		private List<TemplateRecord> parameters;

		public String getEngineVersion() {
			return this.engineVersion;
		}

		public void setEngineVersion(String engineVersion) {
			this.engineVersion = engineVersion;
		}

		public String getEngine() {
			return this.engine;
		}

		public void setEngine(String engine) {
			this.engine = engine;
		}

		public Integer getParameterCount() {
			return this.parameterCount;
		}

		public void setParameterCount(Integer parameterCount) {
			this.parameterCount = parameterCount;
		}

		public List<TemplateRecord> getParameters() {
			return this.parameters;
		}

		public void setParameters(List<TemplateRecord> parameters) {
			this.parameters = parameters;
		}

		public static class TemplateRecord {

			private String parameterName;

			private String parameterValue;

			private String parameterDescription;

			private String checkingCode;

			private Integer revisable;

			private Integer dynamic;

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

			public String getParameterDescription() {
				return this.parameterDescription;
			}

			public void setParameterDescription(String parameterDescription) {
				this.parameterDescription = parameterDescription;
			}

			public String getCheckingCode() {
				return this.checkingCode;
			}

			public void setCheckingCode(String checkingCode) {
				this.checkingCode = checkingCode;
			}

			public Integer getRevisable() {
				return this.revisable;
			}

			public void setRevisable(Integer revisable) {
				this.revisable = revisable;
			}

			public Integer getDynamic() {
				return this.dynamic;
			}

			public void setDynamic(Integer dynamic) {
				this.dynamic = dynamic;
			}
		}
	}

	@Override
	public DescribeParameterTemplatesResponse getInstance(UnmarshallerContext context) {
		return	DescribeParameterTemplatesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
