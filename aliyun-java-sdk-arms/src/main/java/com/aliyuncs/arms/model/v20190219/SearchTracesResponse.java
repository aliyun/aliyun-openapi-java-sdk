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

package com.aliyuncs.arms.model.v20190219;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.arms.transform.v20190219.SearchTracesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class SearchTracesResponse extends AcsResponse {

	private String requestId;

	private List<TraceInfo> data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<TraceInfo> getData() {
		return this.data;
	}

	public void setData(List<TraceInfo> data) {
		this.data = data;
	}

	public static class TraceInfo {

		private String traceID;

		private String operationName;

		private Integer duration;

		private String serviceName;

		private String serviceIp;

		private Long timestamp;

		public String getTraceID() {
			return this.traceID;
		}

		public void setTraceID(String traceID) {
			this.traceID = traceID;
		}

		public String getOperationName() {
			return this.operationName;
		}

		public void setOperationName(String operationName) {
			this.operationName = operationName;
		}

		public Integer getDuration() {
			return this.duration;
		}

		public void setDuration(Integer duration) {
			this.duration = duration;
		}

		public String getServiceName() {
			return this.serviceName;
		}

		public void setServiceName(String serviceName) {
			this.serviceName = serviceName;
		}

		public String getServiceIp() {
			return this.serviceIp;
		}

		public void setServiceIp(String serviceIp) {
			this.serviceIp = serviceIp;
		}

		public Long getTimestamp() {
			return this.timestamp;
		}

		public void setTimestamp(Long timestamp) {
			this.timestamp = timestamp;
		}
	}

	@Override
	public SearchTracesResponse getInstance(UnmarshallerContext context) {
		return	SearchTracesResponseUnmarshaller.unmarshall(this, context);
	}
}
