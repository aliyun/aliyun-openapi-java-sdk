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

package com.aliyuncs.opensearch.model.v20171225;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.opensearch.transform.v20171225.ListFunctionTasksResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListFunctionTasksResponse extends AcsResponse {

	private String status;

	private Long httpCode;

	private Long totalCount;

	private String requestId;

	private String message;

	private String code;

	private Long latency;

	private List<ResultItem> result;

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Long getHttpCode() {
		return this.httpCode;
	}

	public void setHttpCode(Long httpCode) {
		this.httpCode = httpCode;
	}

	public Long getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Long getLatency() {
		return this.latency;
	}

	public void setLatency(Long latency) {
		this.latency = latency;
	}

	public List<ResultItem> getResult() {
		return this.result;
	}

	public void setResult(List<ResultItem> result) {
		this.result = result;
	}

	public static class ResultItem {

		private Long endTime;

		private String extendInfo;

		private String functionName;

		private Long progress;

		private String runId;

		private Long startTime;

		private String status;

		private String generation;

		public Long getEndTime() {
			return this.endTime;
		}

		public void setEndTime(Long endTime) {
			this.endTime = endTime;
		}

		public String getExtendInfo() {
			return this.extendInfo;
		}

		public void setExtendInfo(String extendInfo) {
			this.extendInfo = extendInfo;
		}

		public String getFunctionName() {
			return this.functionName;
		}

		public void setFunctionName(String functionName) {
			this.functionName = functionName;
		}

		public Long getProgress() {
			return this.progress;
		}

		public void setProgress(Long progress) {
			this.progress = progress;
		}

		public String getRunId() {
			return this.runId;
		}

		public void setRunId(String runId) {
			this.runId = runId;
		}

		public Long getStartTime() {
			return this.startTime;
		}

		public void setStartTime(Long startTime) {
			this.startTime = startTime;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getGeneration() {
			return this.generation;
		}

		public void setGeneration(String generation) {
			this.generation = generation;
		}
	}

	@Override
	public ListFunctionTasksResponse getInstance(UnmarshallerContext context) {
		return	ListFunctionTasksResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
