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
import com.aliyuncs.ccc.transform.v20200701.ListSkillGroupStatesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListSkillGroupStatesResponse extends AcsResponse {

	private Integer httpStatusCode;

	private String code;

	private String message;

	private String requestId;

	private Boolean success;

	private Data data;

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
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

		private List<RealTimeSkillGroupState> list;

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

		public List<RealTimeSkillGroupState> getList() {
			return this.list;
		}

		public void setList(List<RealTimeSkillGroupState> list) {
			this.list = list;
		}

		public static class RealTimeSkillGroupState {

			private Long workingAgents;

			private Long loggedInAgents;

			private Long breakingAgents;

			private Long longestCall;

			private Long waitingCalls;

			private Long talkingAgents;

			private String skillGroupName;

			private String skillGroupId;

			private Long readyAgents;

			private String instanceId;

			private Long averageWaitingTime;

			private Long waitingCallsLevel10;

			private Long waitingCallsLevel20;

			private Long waitingCallsLevel30;

			public Long getWorkingAgents() {
				return this.workingAgents;
			}

			public void setWorkingAgents(Long workingAgents) {
				this.workingAgents = workingAgents;
			}

			public Long getLoggedInAgents() {
				return this.loggedInAgents;
			}

			public void setLoggedInAgents(Long loggedInAgents) {
				this.loggedInAgents = loggedInAgents;
			}

			public Long getBreakingAgents() {
				return this.breakingAgents;
			}

			public void setBreakingAgents(Long breakingAgents) {
				this.breakingAgents = breakingAgents;
			}

			public Long getLongestCall() {
				return this.longestCall;
			}

			public void setLongestCall(Long longestCall) {
				this.longestCall = longestCall;
			}

			public Long getWaitingCalls() {
				return this.waitingCalls;
			}

			public void setWaitingCalls(Long waitingCalls) {
				this.waitingCalls = waitingCalls;
			}

			public Long getTalkingAgents() {
				return this.talkingAgents;
			}

			public void setTalkingAgents(Long talkingAgents) {
				this.talkingAgents = talkingAgents;
			}

			public String getSkillGroupName() {
				return this.skillGroupName;
			}

			public void setSkillGroupName(String skillGroupName) {
				this.skillGroupName = skillGroupName;
			}

			public String getSkillGroupId() {
				return this.skillGroupId;
			}

			public void setSkillGroupId(String skillGroupId) {
				this.skillGroupId = skillGroupId;
			}

			public Long getReadyAgents() {
				return this.readyAgents;
			}

			public void setReadyAgents(Long readyAgents) {
				this.readyAgents = readyAgents;
			}

			public String getInstanceId() {
				return this.instanceId;
			}

			public void setInstanceId(String instanceId) {
				this.instanceId = instanceId;
			}

			public Long getAverageWaitingTime() {
				return this.averageWaitingTime;
			}

			public void setAverageWaitingTime(Long averageWaitingTime) {
				this.averageWaitingTime = averageWaitingTime;
			}

			public Long getWaitingCallsLevel10() {
				return this.waitingCallsLevel10;
			}

			public void setWaitingCallsLevel10(Long waitingCallsLevel10) {
				this.waitingCallsLevel10 = waitingCallsLevel10;
			}

			public Long getWaitingCallsLevel20() {
				return this.waitingCallsLevel20;
			}

			public void setWaitingCallsLevel20(Long waitingCallsLevel20) {
				this.waitingCallsLevel20 = waitingCallsLevel20;
			}

			public Long getWaitingCallsLevel30() {
				return this.waitingCallsLevel30;
			}

			public void setWaitingCallsLevel30(Long waitingCallsLevel30) {
				this.waitingCallsLevel30 = waitingCallsLevel30;
			}
		}
	}

	@Override
	public ListSkillGroupStatesResponse getInstance(UnmarshallerContext context) {
		return	ListSkillGroupStatesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
