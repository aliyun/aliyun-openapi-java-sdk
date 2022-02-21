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

package com.aliyuncs.sae.model.v20190506;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.sae.transform.v20190506.QueryResourceStaticsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryResourceStaticsResponse extends AcsResponse {

	private String requestId;

	private String message;

	private String traceId;

	private String errorCode;

	private String code;

	private Boolean success;

	private Data data;

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

	public String getTraceId() {
		return this.traceId;
	}

	public void setTraceId(String traceId) {
		this.traceId = traceId;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String workload;

		private Summary summary;

		private RealTimeRes realTimeRes;

		public String getWorkload() {
			return this.workload;
		}

		public void setWorkload(String workload) {
			this.workload = workload;
		}

		public Summary getSummary() {
			return this.summary;
		}

		public void setSummary(Summary summary) {
			this.summary = summary;
		}

		public RealTimeRes getRealTimeRes() {
			return this.realTimeRes;
		}

		public void setRealTimeRes(RealTimeRes realTimeRes) {
			this.realTimeRes = realTimeRes;
		}

		public static class Summary {

			private Float cpu;

			private Float memory;

			public Float getCpu() {
				return this.cpu;
			}

			public void setCpu(Float cpu) {
				this.cpu = cpu;
			}

			public Float getMemory() {
				return this.memory;
			}

			public void setMemory(Float memory) {
				this.memory = memory;
			}
		}

		public static class RealTimeRes {

			private Float cpu;

			private Float memory;

			public Float getCpu() {
				return this.cpu;
			}

			public void setCpu(Float cpu) {
				this.cpu = cpu;
			}

			public Float getMemory() {
				return this.memory;
			}

			public void setMemory(Float memory) {
				this.memory = memory;
			}
		}
	}

	@Override
	public QueryResourceStaticsResponse getInstance(UnmarshallerContext context) {
		return	QueryResourceStaticsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
