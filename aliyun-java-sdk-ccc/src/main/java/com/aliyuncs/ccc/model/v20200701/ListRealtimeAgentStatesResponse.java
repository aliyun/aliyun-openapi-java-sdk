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

package com.aliyuncs.ccc.model.v20200701;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ccc.transform.v20200701.ListRealtimeAgentStatesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListRealtimeAgentStatesResponse extends AcsResponse {

	private String code;

	private Integer httpStatusCode;

	private String message;

	private String requestId;

	private Data data;

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

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

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Integer pageNumber;

		private Integer pageSize;

		private Integer totalCount;

		private List<AgentState> list;

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

		public Integer getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Integer totalCount) {
			this.totalCount = totalCount;
		}

		public List<AgentState> getList() {
			return this.list;
		}

		public void setList(List<AgentState> list) {
			this.list = list;
		}

		public static class AgentState {

			private String agentId;

			private String agentName;

			private String counterParty;

			private String extension;

			private String instanceId;

			private String state;

			private String stateCode;

			private Long stateTime;

			private List<String> skillGroupIdList;

			public String getAgentId() {
				return this.agentId;
			}

			public void setAgentId(String agentId) {
				this.agentId = agentId;
			}

			public String getAgentName() {
				return this.agentName;
			}

			public void setAgentName(String agentName) {
				this.agentName = agentName;
			}

			public String getCounterParty() {
				return this.counterParty;
			}

			public void setCounterParty(String counterParty) {
				this.counterParty = counterParty;
			}

			public String getExtension() {
				return this.extension;
			}

			public void setExtension(String extension) {
				this.extension = extension;
			}

			public String getInstanceId() {
				return this.instanceId;
			}

			public void setInstanceId(String instanceId) {
				this.instanceId = instanceId;
			}

			public String getState() {
				return this.state;
			}

			public void setState(String state) {
				this.state = state;
			}

			public String getStateCode() {
				return this.stateCode;
			}

			public void setStateCode(String stateCode) {
				this.stateCode = stateCode;
			}

			public Long getStateTime() {
				return this.stateTime;
			}

			public void setStateTime(Long stateTime) {
				this.stateTime = stateTime;
			}

			public List<String> getSkillGroupIdList() {
				return this.skillGroupIdList;
			}

			public void setSkillGroupIdList(List<String> skillGroupIdList) {
				this.skillGroupIdList = skillGroupIdList;
			}
		}
	}

	@Override
	public ListRealtimeAgentStatesResponse getInstance(UnmarshallerContext context) {
		return	ListRealtimeAgentStatesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
