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

package com.aliyuncs.xrengine.model.v20221111;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.xrengine.transform.v20221111.QueryBuildBreakpointResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryBuildBreakpointResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private String errorName;

	private Integer httpCode;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
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

	public String getErrorName() {
		return this.errorName;
	}

	public void setErrorName(String errorName) {
		this.errorName = errorName;
	}

	public Integer getHttpCode() {
		return this.httpCode;
	}

	public void setHttpCode(Integer httpCode) {
		this.httpCode = httpCode;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String projectId;

		private List<BreakpointsItem> breakpoints;

		public String getProjectId() {
			return this.projectId;
		}

		public void setProjectId(String projectId) {
			this.projectId = projectId;
		}

		public List<BreakpointsItem> getBreakpoints() {
			return this.breakpoints;
		}

		public void setBreakpoints(List<BreakpointsItem> breakpoints) {
			this.breakpoints = breakpoints;
		}

		public static class BreakpointsItem {

			private String algorithm;

			private String jobId;

			public String getAlgorithm() {
				return this.algorithm;
			}

			public void setAlgorithm(String algorithm) {
				this.algorithm = algorithm;
			}

			public String getJobId() {
				return this.jobId;
			}

			public void setJobId(String jobId) {
				this.jobId = jobId;
			}
		}
	}

	@Override
	public QueryBuildBreakpointResponse getInstance(UnmarshallerContext context) {
		return	QueryBuildBreakpointResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
