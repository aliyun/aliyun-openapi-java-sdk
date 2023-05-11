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

package com.aliyuncs.iot.model.v20180120;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.iot.transform.v20180120.GetEdgeInstanceMessageRoutingResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetEdgeInstanceMessageRoutingResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String errorMessage;

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

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String topicFilter;

		private String sourceType;

		private String name;

		private String sourceData;

		private String targetType;

		private String targetData;

		private String gmtCreate;

		private String gmtModified;

		private Long gmtCreateTimestamp;

		private Long gmtModifiedTimestamp;

		private RouteContext routeContext;

		public String getTopicFilter() {
			return this.topicFilter;
		}

		public void setTopicFilter(String topicFilter) {
			this.topicFilter = topicFilter;
		}

		public String getSourceType() {
			return this.sourceType;
		}

		public void setSourceType(String sourceType) {
			this.sourceType = sourceType;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getSourceData() {
			return this.sourceData;
		}

		public void setSourceData(String sourceData) {
			this.sourceData = sourceData;
		}

		public String getTargetType() {
			return this.targetType;
		}

		public void setTargetType(String targetType) {
			this.targetType = targetType;
		}

		public String getTargetData() {
			return this.targetData;
		}

		public void setTargetData(String targetData) {
			this.targetData = targetData;
		}

		public String getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(String gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public String getGmtModified() {
			return this.gmtModified;
		}

		public void setGmtModified(String gmtModified) {
			this.gmtModified = gmtModified;
		}

		public Long getGmtCreateTimestamp() {
			return this.gmtCreateTimestamp;
		}

		public void setGmtCreateTimestamp(Long gmtCreateTimestamp) {
			this.gmtCreateTimestamp = gmtCreateTimestamp;
		}

		public Long getGmtModifiedTimestamp() {
			return this.gmtModifiedTimestamp;
		}

		public void setGmtModifiedTimestamp(Long gmtModifiedTimestamp) {
			this.gmtModifiedTimestamp = gmtModifiedTimestamp;
		}

		public RouteContext getRouteContext() {
			return this.routeContext;
		}

		public void setRouteContext(RouteContext routeContext) {
			this.routeContext = routeContext;
		}

		public static class RouteContext {

			private String sourceFcServiceName;

			private String sourceFcFunctionName;

			private String sourceStreamName;

			private String sourceApplicationName;

			private String targetFcServiceName;

			private String targetFcFunctionName;

			private String targetStreamName;

			private String targetApplicationName;

			private String qos;

			public String getSourceFcServiceName() {
				return this.sourceFcServiceName;
			}

			public void setSourceFcServiceName(String sourceFcServiceName) {
				this.sourceFcServiceName = sourceFcServiceName;
			}

			public String getSourceFcFunctionName() {
				return this.sourceFcFunctionName;
			}

			public void setSourceFcFunctionName(String sourceFcFunctionName) {
				this.sourceFcFunctionName = sourceFcFunctionName;
			}

			public String getSourceStreamName() {
				return this.sourceStreamName;
			}

			public void setSourceStreamName(String sourceStreamName) {
				this.sourceStreamName = sourceStreamName;
			}

			public String getSourceApplicationName() {
				return this.sourceApplicationName;
			}

			public void setSourceApplicationName(String sourceApplicationName) {
				this.sourceApplicationName = sourceApplicationName;
			}

			public String getTargetFcServiceName() {
				return this.targetFcServiceName;
			}

			public void setTargetFcServiceName(String targetFcServiceName) {
				this.targetFcServiceName = targetFcServiceName;
			}

			public String getTargetFcFunctionName() {
				return this.targetFcFunctionName;
			}

			public void setTargetFcFunctionName(String targetFcFunctionName) {
				this.targetFcFunctionName = targetFcFunctionName;
			}

			public String getTargetStreamName() {
				return this.targetStreamName;
			}

			public void setTargetStreamName(String targetStreamName) {
				this.targetStreamName = targetStreamName;
			}

			public String getTargetApplicationName() {
				return this.targetApplicationName;
			}

			public void setTargetApplicationName(String targetApplicationName) {
				this.targetApplicationName = targetApplicationName;
			}

			public String getQos() {
				return this.qos;
			}

			public void setQos(String qos) {
				this.qos = qos;
			}
		}
	}

	@Override
	public GetEdgeInstanceMessageRoutingResponse getInstance(UnmarshallerContext context) {
		return	GetEdgeInstanceMessageRoutingResponseUnmarshaller.unmarshall(this, context);
	}
}
