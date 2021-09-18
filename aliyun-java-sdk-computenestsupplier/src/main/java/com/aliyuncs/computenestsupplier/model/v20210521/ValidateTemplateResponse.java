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

package com.aliyuncs.computenestsupplier.model.v20210521;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.computenestsupplier.transform.v20210521.ValidateTemplateResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ValidateTemplateResponse extends AcsResponse {

	private String requestId;

	private String description;

	private List<OutputsItem> outputs;

	private List<Map<Object,Object>> parameters;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<OutputsItem> getOutputs() {
		return this.outputs;
	}

	public void setOutputs(List<OutputsItem> outputs) {
		this.outputs = outputs;
	}

	public List<Map<Object,Object>> getParameters() {
		return this.parameters;
	}

	public void setParameters(List<Map<Object,Object>> parameters) {
		this.parameters = parameters;
	}

	public static class OutputsItem {

		private String outputKey;

		private String description;

		public String getOutputKey() {
			return this.outputKey;
		}

		public void setOutputKey(String outputKey) {
			this.outputKey = outputKey;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}
	}

	@Override
	public ValidateTemplateResponse getInstance(UnmarshallerContext context) {
		return	ValidateTemplateResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
