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

package com.aliyuncs.cloudcallcenter.model.v20170705;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cloudcallcenter.transform.v20170705.ListAgentEventsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListAgentEventsResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private Integer httpStatusCode;

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

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Integer totalCount;

		private Integer pageNumber;

		private Integer pageSize;

		private List<AgentEvent> list;

		public Integer getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Integer totalCount) {
			this.totalCount = totalCount;
		}

		public Integer getPageNumber() {
			return this.pageNumber;
		}

		public void setPageNumber(Integer pageNumber) {
			this.pageNumber = pageNumber;
		}

		public Integer getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Integer pageSize) {
			this.pageSize = pageSize;
		}

		public List<AgentEvent> getList() {
			return this.list;
		}

		public void setList(List<AgentEvent> list) {
			this.list = list;
		}

		public static class AgentEvent {

			private String instanceId;

			private Long ramId;

			private String loginName;

			private String event;

			private Long eventTime;

			private List<SkillGroup> skillGroupIds;

			public String getInstanceId() {
				return this.instanceId;
			}

			public void setInstanceId(String instanceId) {
				this.instanceId = instanceId;
			}

			public Long getRamId() {
				return this.ramId;
			}

			public void setRamId(Long ramId) {
				this.ramId = ramId;
			}

			public String getLoginName() {
				return this.loginName;
			}

			public void setLoginName(String loginName) {
				this.loginName = loginName;
			}

			public String getEvent() {
				return this.event;
			}

			public void setEvent(String event) {
				this.event = event;
			}

			public Long getEventTime() {
				return this.eventTime;
			}

			public void setEventTime(Long eventTime) {
				this.eventTime = eventTime;
			}

			public List<SkillGroup> getSkillGroupIds() {
				return this.skillGroupIds;
			}

			public void setSkillGroupIds(List<SkillGroup> skillGroupIds) {
				this.skillGroupIds = skillGroupIds;
			}

			public static class SkillGroup {

				private String skillGroupId;

				private String skillGroupName;

				public String getSkillGroupId() {
					return this.skillGroupId;
				}

				public void setSkillGroupId(String skillGroupId) {
					this.skillGroupId = skillGroupId;
				}

				public String getSkillGroupName() {
					return this.skillGroupName;
				}

				public void setSkillGroupName(String skillGroupName) {
					this.skillGroupName = skillGroupName;
				}
			}
		}
	}

	@Override
	public ListAgentEventsResponse getInstance(UnmarshallerContext context) {
		return	ListAgentEventsResponseUnmarshaller.unmarshall(this, context);
	}
}
