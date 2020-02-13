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

package com.aliyuncs.cdn.model.v20180510;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cdn.transform.v20180510.DescribeConfigOfVersionResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeConfigOfVersionResponse extends AcsResponse {

	private String requestId;

	private List<VersionConfig> versionConfigs;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<VersionConfig> getVersionConfigs() {
		return this.versionConfigs;
	}

	public void setVersionConfigs(List<VersionConfig> versionConfigs) {
		this.versionConfigs = versionConfigs;
	}

	public static class VersionConfig {

		private String status;

		private String configId;

		private String functionName;

		private List<FunctionArg> functionArgs;

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getConfigId() {
			return this.configId;
		}

		public void setConfigId(String configId) {
			this.configId = configId;
		}

		public String getFunctionName() {
			return this.functionName;
		}

		public void setFunctionName(String functionName) {
			this.functionName = functionName;
		}

		public List<FunctionArg> getFunctionArgs() {
			return this.functionArgs;
		}

		public void setFunctionArgs(List<FunctionArg> functionArgs) {
			this.functionArgs = functionArgs;
		}

		public static class FunctionArg {

			private String argName;

			private String argValue;

			public String getArgName() {
				return this.argName;
			}

			public void setArgName(String argName) {
				this.argName = argName;
			}

			public String getArgValue() {
				return this.argValue;
			}

			public void setArgValue(String argValue) {
				this.argValue = argValue;
			}
		}
	}

	@Override
	public DescribeConfigOfVersionResponse getInstance(UnmarshallerContext context) {
		return	DescribeConfigOfVersionResponseUnmarshaller.unmarshall(this, context);
	}
}
