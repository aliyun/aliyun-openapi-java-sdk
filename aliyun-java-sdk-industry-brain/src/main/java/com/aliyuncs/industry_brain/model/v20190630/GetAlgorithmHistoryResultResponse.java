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

package com.aliyuncs.industry_brain.model.v20190630;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.industry_brain.transform.v20190630.GetAlgorithmHistoryResultResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetAlgorithmHistoryResultResponse extends AcsResponse {

	private String requestId;

	private String code;

	private String message;

	private String traceId;

	private List<Region> data;

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

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getTraceId() {
		return this.traceId;
	}

	public void setTraceId(String traceId) {
		this.traceId = traceId;
	}

	public List<Region> getData() {
		return this.data;
	}

	public void setData(List<Region> data) {
		this.data = data;
	}

	public static class Region {

		private Map<Object,Object> output;

		private Map<Object,Object> input;

		private String invokeTime;

		public Map<Object,Object> getOutput() {
			return this.output;
		}

		public void setOutput(Map<Object,Object> output) {
			this.output = output;
		}

		public Map<Object,Object> getInput() {
			return this.input;
		}

		public void setInput(Map<Object,Object> input) {
			this.input = input;
		}

		public String getInvokeTime() {
			return this.invokeTime;
		}

		public void setInvokeTime(String invokeTime) {
			this.invokeTime = invokeTime;
		}
	}

	@Override
	public GetAlgorithmHistoryResultResponse getInstance(UnmarshallerContext context) {
		return	GetAlgorithmHistoryResultResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
