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

package com.aliyuncs.xtrace.model.v20190808;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.xtrace.transform.v20190808.GetTraceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetTraceResponse extends AcsResponse {

	private String requestId;

	private List<Span> spans;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Span> getSpans() {
		return this.spans;
	}

	public void setSpans(List<Span> spans) {
		this.spans = spans;
	}

	public static class Span {

		private String traceID;

		private String operationName;

		private Long duration;

		private String serviceName;

		private String serviceIp;

		private Long timestamp;

		private String rpcId;

		private String resultCode;

		private Boolean haveStack;

		private List<TagEntry> tagEntryList;

		private List<LogEvent> logEventList;

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

		public Long getDuration() {
			return this.duration;
		}

		public void setDuration(Long duration) {
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

		public String getRpcId() {
			return this.rpcId;
		}

		public void setRpcId(String rpcId) {
			this.rpcId = rpcId;
		}

		public String getResultCode() {
			return this.resultCode;
		}

		public void setResultCode(String resultCode) {
			this.resultCode = resultCode;
		}

		public Boolean getHaveStack() {
			return this.haveStack;
		}

		public void setHaveStack(Boolean haveStack) {
			this.haveStack = haveStack;
		}

		public List<TagEntry> getTagEntryList() {
			return this.tagEntryList;
		}

		public void setTagEntryList(List<TagEntry> tagEntryList) {
			this.tagEntryList = tagEntryList;
		}

		public List<LogEvent> getLogEventList() {
			return this.logEventList;
		}

		public void setLogEventList(List<LogEvent> logEventList) {
			this.logEventList = logEventList;
		}

		public static class TagEntry {

			private String key;

			private String value;

			public String getKey() {
				return this.key;
			}

			public void setKey(String key) {
				this.key = key;
			}

			public String getValue() {
				return this.value;
			}

			public void setValue(String value) {
				this.value = value;
			}
		}

		public static class LogEvent {

			private Long timestamp;

			private List<TagEntry2> tagEntryList1;

			public Long getTimestamp() {
				return this.timestamp;
			}

			public void setTimestamp(Long timestamp) {
				this.timestamp = timestamp;
			}

			public List<TagEntry2> getTagEntryList1() {
				return this.tagEntryList1;
			}

			public void setTagEntryList1(List<TagEntry2> tagEntryList1) {
				this.tagEntryList1 = tagEntryList1;
			}

			public static class TagEntry2 {

				private String key;

				private String value;

				public String getKey() {
					return this.key;
				}

				public void setKey(String key) {
					this.key = key;
				}

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}
			}
		}
	}

	@Override
	public GetTraceResponse getInstance(UnmarshallerContext context) {
		return	GetTraceResponseUnmarshaller.unmarshall(this, context);
	}
}
