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

package com.aliyuncs.foas.model.v20181111;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.foas.transform.v20181111.ValidateJobResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ValidateJobResponse extends AcsResponse {

	private String requestId;

	private JobInOut jobInOut;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public JobInOut getJobInOut() {
		return this.jobInOut;
	}

	public void setJobInOut(JobInOut jobInOut) {
		this.jobInOut = jobInOut;
	}

	public static class JobInOut {

		private List<Input> inputs;

		private List<Output> outputs;

		public List<Input> getInputs() {
			return this.inputs;
		}

		public void setInputs(List<Input> inputs) {
			this.inputs = inputs;
		}

		public List<Output> getOutputs() {
			return this.outputs;
		}

		public void setOutputs(List<Output> outputs) {
			this.outputs = outputs;
		}

		public static class Input {

			private String type;

			private String workspace;

			private String name;

			private Map<Object,Object> properties;

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public String getWorkspace() {
				return this.workspace;
			}

			public void setWorkspace(String workspace) {
				this.workspace = workspace;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public Map<Object,Object> getProperties() {
				return this.properties;
			}

			public void setProperties(Map<Object,Object> properties) {
				this.properties = properties;
			}
		}

		public static class Output {

			private String type;

			private String workspace;

			private String name;

			private Map<Object,Object> properties;

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public String getWorkspace() {
				return this.workspace;
			}

			public void setWorkspace(String workspace) {
				this.workspace = workspace;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public Map<Object,Object> getProperties() {
				return this.properties;
			}

			public void setProperties(Map<Object,Object> properties) {
				this.properties = properties;
			}
		}
	}

	@Override
	public ValidateJobResponse getInstance(UnmarshallerContext context) {
		return	ValidateJobResponseUnmarshaller.unmarshall(this, context);
	}
}
