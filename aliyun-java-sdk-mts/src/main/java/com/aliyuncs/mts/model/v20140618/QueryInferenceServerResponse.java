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

package com.aliyuncs.mts.model.v20140618;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.mts.transform.v20140618.QueryInferenceServerResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryInferenceServerResponse extends AcsResponse {

	private String message;

	private String requestId;

	private String code;

	private List<FunctionsItem> functions;

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public List<FunctionsItem> getFunctions() {
		return this.functions;
	}

	public void setFunctions(List<FunctionsItem> functions) {
		this.functions = functions;
	}

	public static class FunctionsItem {

		private String functionName;

		private Long createTime;

		private Long userId;

		private String modelType;

		private String modelPath;

		private String pipelineId;

		private String testId;

		public String getFunctionName() {
			return this.functionName;
		}

		public void setFunctionName(String functionName) {
			this.functionName = functionName;
		}

		public Long getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(Long createTime) {
			this.createTime = createTime;
		}

		public Long getUserId() {
			return this.userId;
		}

		public void setUserId(Long userId) {
			this.userId = userId;
		}

		public String getModelType() {
			return this.modelType;
		}

		public void setModelType(String modelType) {
			this.modelType = modelType;
		}

		public String getModelPath() {
			return this.modelPath;
		}

		public void setModelPath(String modelPath) {
			this.modelPath = modelPath;
		}

		public String getPipelineId() {
			return this.pipelineId;
		}

		public void setPipelineId(String pipelineId) {
			this.pipelineId = pipelineId;
		}

		public String getTestId() {
			return this.testId;
		}

		public void setTestId(String testId) {
			this.testId = testId;
		}
	}

	@Override
	public QueryInferenceServerResponse getInstance(UnmarshallerContext context) {
		return	QueryInferenceServerResponseUnmarshaller.unmarshall(this, context);
	}
}
