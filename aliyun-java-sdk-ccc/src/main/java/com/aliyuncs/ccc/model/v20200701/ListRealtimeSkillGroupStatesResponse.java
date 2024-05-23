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
import com.aliyuncs.ccc.transform.v20200701.ListRealtimeSkillGroupStatesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListRealtimeSkillGroupStatesResponse extends AcsResponse {

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

		private List<SkillGroupState> list;

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

		public List<SkillGroupState> getList() {
			return this.list;
		}

		public void setList(List<SkillGroupState> list) {
			this.list = list;
		}

		public static class SkillGroupState {

			private Long workingAgents;

			private Long longestWaitingTime;

			private Long loggedInAgents;

			private Long waitingCalls;

			private Long breakingAgents;

			private Long talkingAgents;

			private String skillGroupName;

			private String skillGroupId;

			private Long readyAgents;

			private String instanceId;

			private Long outboundScenarioReadyAgents;

			private Long totalAgents;

			private List<BreakCodeDetail> breakCodeDetailList;

			public Long getWorkingAgents() {
				return this.workingAgents;
			}

			public void setWorkingAgents(Long workingAgents) {
				this.workingAgents = workingAgents;
			}

			public Long getLongestWaitingTime() {
				return this.longestWaitingTime;
			}

			public void setLongestWaitingTime(Long longestWaitingTime) {
				this.longestWaitingTime = longestWaitingTime;
			}

			public Long getLoggedInAgents() {
				return this.loggedInAgents;
			}

			public void setLoggedInAgents(Long loggedInAgents) {
				this.loggedInAgents = loggedInAgents;
			}

			public Long getWaitingCalls() {
				return this.waitingCalls;
			}

			public void setWaitingCalls(Long waitingCalls) {
				this.waitingCalls = waitingCalls;
			}

			public Long getBreakingAgents() {
				return this.breakingAgents;
			}

			public void setBreakingAgents(Long breakingAgents) {
				this.breakingAgents = breakingAgents;
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

			public Long getOutboundScenarioReadyAgents() {
				return this.outboundScenarioReadyAgents;
			}

			public void setOutboundScenarioReadyAgents(Long outboundScenarioReadyAgents) {
				this.outboundScenarioReadyAgents = outboundScenarioReadyAgents;
			}

			public Long getTotalAgents() {
				return this.totalAgents;
			}

			public void setTotalAgents(Long totalAgents) {
				this.totalAgents = totalAgents;
			}

			public List<BreakCodeDetail> getBreakCodeDetailList() {
				return this.breakCodeDetailList;
			}

			public void setBreakCodeDetailList(List<BreakCodeDetail> breakCodeDetailList) {
				this.breakCodeDetailList = breakCodeDetailList;
			}

			public static class BreakCodeDetail {

				private String breakCode;

				private Long count;

				public String getBreakCode() {
					return this.breakCode;
				}

				public void setBreakCode(String breakCode) {
					this.breakCode = breakCode;
				}

				public Long getCount() {
					return this.count;
				}

				public void setCount(Long count) {
					this.count = count;
				}
			}
		}
	}

	@Override
	public ListRealtimeSkillGroupStatesResponse getInstance(UnmarshallerContext context) {
		return	ListRealtimeSkillGroupStatesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
