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

package com.aliyuncs.mns.model.v20210319;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.mns.transform.v20210319.ListEventNotificationResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListEventNotificationResponse extends AcsResponse {

	private String requestId;

	private Long code;

	private String status;

	private String message;

	private Boolean success;

	private List<DataItem> data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Long getCode() {
		return this.code;
	}

	public void setCode(Long code) {
		this.code = code;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public List<DataItem> getData() {
		return this.data;
	}

	public void setData(List<DataItem> data) {
		this.data = data;
	}

	public static class DataItem {

		private String identifier;

		private String topicName;

		private Boolean isDefaultRule;

		private List<ResourceItem> resource;

		private List<String> eventType;

		private List<String> endpoint;

		public String getIdentifier() {
			return this.identifier;
		}

		public void setIdentifier(String identifier) {
			this.identifier = identifier;
		}

		public String getTopicName() {
			return this.topicName;
		}

		public void setTopicName(String topicName) {
			this.topicName = topicName;
		}

		public Boolean getIsDefaultRule() {
			return this.isDefaultRule;
		}

		public void setIsDefaultRule(Boolean isDefaultRule) {
			this.isDefaultRule = isDefaultRule;
		}

		public List<ResourceItem> getResource() {
			return this.resource;
		}

		public void setResource(List<ResourceItem> resource) {
			this.resource = resource;
		}

		public List<String> getEventType() {
			return this.eventType;
		}

		public void setEventType(List<String> eventType) {
			this.eventType = eventType;
		}

		public List<String> getEndpoint() {
			return this.endpoint;
		}

		public void setEndpoint(List<String> endpoint) {
			this.endpoint = endpoint;
		}

		public static class ResourceItem {

			private String name;

			private String prefix;

			private String suffix;

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getPrefix() {
				return this.prefix;
			}

			public void setPrefix(String prefix) {
				this.prefix = prefix;
			}

			public String getSuffix() {
				return this.suffix;
			}

			public void setSuffix(String suffix) {
				this.suffix = suffix;
			}
		}
	}

	@Override
	public ListEventNotificationResponse getInstance(UnmarshallerContext context) {
		return	ListEventNotificationResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
