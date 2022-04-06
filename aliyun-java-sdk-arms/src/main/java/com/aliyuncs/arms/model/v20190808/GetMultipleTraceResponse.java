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

package com.aliyuncs.arms.model.v20190808;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.arms.transform.v20190808.GetMultipleTraceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetMultipleTraceResponse extends AcsResponse {

	private String requestId;

	private List<MultiCallChainInfo> multiCallChainInfos;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<MultiCallChainInfo> getMultiCallChainInfos() {
		return this.multiCallChainInfos;
	}

	public void setMultiCallChainInfos(List<MultiCallChainInfo> multiCallChainInfos) {
		this.multiCallChainInfos = multiCallChainInfos;
	}

	public static class MultiCallChainInfo {

		private String traceID;

		private List<Span> spans;

		public String getTraceID() {
			return this.traceID;
		}

		public void setTraceID(String traceID) {
			this.traceID = traceID;
		}

		public List<Span> getSpans() {
			return this.spans;
		}

		public void setSpans(List<Span> spans) {
			this.spans = spans;
		}

		public static class Span {

			private String spanId;

			private String operationName;

			private String resultCode;

			private Long timestamp;

			private Integer rpcType;

			private String serviceIp;

			private Boolean haveStack;

			private String parentSpanId;

			private Long duration;

			private String rpcId;

			private String serviceName;

			private String traceID;

			private List<TagEntry> tagEntryList;

			private List<LogEvent> logEventList;

			public String getSpanId() {
				return this.spanId;
			}

			public void setSpanId(String spanId) {
				this.spanId = spanId;
			}

			public String getOperationName() {
				return this.operationName;
			}

			public void setOperationName(String operationName) {
				this.operationName = operationName;
			}

			public String getResultCode() {
				return this.resultCode;
			}

			public void setResultCode(String resultCode) {
				this.resultCode = resultCode;
			}

			public Long getTimestamp() {
				return this.timestamp;
			}

			public void setTimestamp(Long timestamp) {
				this.timestamp = timestamp;
			}

			public Integer getRpcType() {
				return this.rpcType;
			}

			public void setRpcType(Integer rpcType) {
				this.rpcType = rpcType;
			}

			public String getServiceIp() {
				return this.serviceIp;
			}

			public void setServiceIp(String serviceIp) {
				this.serviceIp = serviceIp;
			}

			public Boolean getHaveStack() {
				return this.haveStack;
			}

			public void setHaveStack(Boolean haveStack) {
				this.haveStack = haveStack;
			}

			public String getParentSpanId() {
				return this.parentSpanId;
			}

			public void setParentSpanId(String parentSpanId) {
				this.parentSpanId = parentSpanId;
			}

			public Long getDuration() {
				return this.duration;
			}

			public void setDuration(Long duration) {
				this.duration = duration;
			}

			public String getRpcId() {
				return this.rpcId;
			}

			public void setRpcId(String rpcId) {
				this.rpcId = rpcId;
			}

			public String getServiceName() {
				return this.serviceName;
			}

			public void setServiceName(String serviceName) {
				this.serviceName = serviceName;
			}

			public String getTraceID() {
				return this.traceID;
			}

			public void setTraceID(String traceID) {
				this.traceID = traceID;
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
	}

	@Override
	public GetMultipleTraceResponse getInstance(UnmarshallerContext context) {
		return	GetMultipleTraceResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
