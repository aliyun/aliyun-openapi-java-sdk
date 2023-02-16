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

package com.aliyuncs.eventbridge.model.v20200401;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.eventbridge.transform.v20200401.ListAliyunOfficialEventSourcesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListAliyunOfficialEventSourcesResponse extends AcsResponse {

	private String message;

	private String requestId;

	private String code;

	private Boolean success;

	private Data data;

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

		private String nextToken;

		private Float total;

		private List<EventSourceListItem> eventSourceList;

		public String getNextToken() {
			return this.nextToken;
		}

		public void setNextToken(String nextToken) {
			this.nextToken = nextToken;
		}

		public Float getTotal() {
			return this.total;
		}

		public void setTotal(Float total) {
			this.total = total;
		}

		public List<EventSourceListItem> getEventSourceList() {
			return this.eventSourceList;
		}

		public void setEventSourceList(List<EventSourceListItem> eventSourceList) {
			this.eventSourceList = eventSourceList;
		}

		public static class EventSourceListItem {

			private String name;

			private String arn;

			private String status;

			private String type;

			private Float ctime;

			private String description;

			private String eventBusName;

			private List<EventTypesItem> eventTypes;

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getArn() {
				return this.arn;
			}

			public void setArn(String arn) {
				this.arn = arn;
			}

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public Float getCtime() {
				return this.ctime;
			}

			public void setCtime(Float ctime) {
				this.ctime = ctime;
			}

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

			public String getEventBusName() {
				return this.eventBusName;
			}

			public void setEventBusName(String eventBusName) {
				this.eventBusName = eventBusName;
			}

			public List<EventTypesItem> getEventTypes() {
				return this.eventTypes;
			}

			public void setEventTypes(List<EventTypesItem> eventTypes) {
				this.eventTypes = eventTypes;
			}

			public static class EventTypesItem {

				private String name;

				private String shortName;

				private String groupName;

				private String description;

				private String eventSourceName;

				public String getName() {
					return this.name;
				}

				public void setName(String name) {
					this.name = name;
				}

				public String getShortName() {
					return this.shortName;
				}

				public void setShortName(String shortName) {
					this.shortName = shortName;
				}

				public String getGroupName() {
					return this.groupName;
				}

				public void setGroupName(String groupName) {
					this.groupName = groupName;
				}

				public String getDescription() {
					return this.description;
				}

				public void setDescription(String description) {
					this.description = description;
				}

				public String getEventSourceName() {
					return this.eventSourceName;
				}

				public void setEventSourceName(String eventSourceName) {
					this.eventSourceName = eventSourceName;
				}
			}
		}
	}

	@Override
	public ListAliyunOfficialEventSourcesResponse getInstance(UnmarshallerContext context) {
		return	ListAliyunOfficialEventSourcesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
