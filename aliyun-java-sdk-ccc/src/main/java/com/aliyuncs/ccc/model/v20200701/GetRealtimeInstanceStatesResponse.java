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

import com.aliyuncs.AcsResponse;
import com.aliyuncs.ccc.transform.v20200701.GetRealtimeInstanceStatesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetRealtimeInstanceStatesResponse extends AcsResponse {

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

		private Long breakingAgents;

		private String instanceId;

		private Long interactiveCalls;

		private Long loggedInAgents;

		private Long longestCall;

		private Long readyAgents;

		private Long talkingAgents;

		private Long totalAgents;

		private Long waitingCalls;

		private Long workingAgents;

		public Long getBreakingAgents() {
			return this.breakingAgents;
		}

		public void setBreakingAgents(Long breakingAgents) {
			this.breakingAgents = breakingAgents;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public Long getInteractiveCalls() {
			return this.interactiveCalls;
		}

		public void setInteractiveCalls(Long interactiveCalls) {
			this.interactiveCalls = interactiveCalls;
		}

		public Long getLoggedInAgents() {
			return this.loggedInAgents;
		}

		public void setLoggedInAgents(Long loggedInAgents) {
			this.loggedInAgents = loggedInAgents;
		}

		public Long getLongestCall() {
			return this.longestCall;
		}

		public void setLongestCall(Long longestCall) {
			this.longestCall = longestCall;
		}

		public Long getReadyAgents() {
			return this.readyAgents;
		}

		public void setReadyAgents(Long readyAgents) {
			this.readyAgents = readyAgents;
		}

		public Long getTalkingAgents() {
			return this.talkingAgents;
		}

		public void setTalkingAgents(Long talkingAgents) {
			this.talkingAgents = talkingAgents;
		}

		public Long getTotalAgents() {
			return this.totalAgents;
		}

		public void setTotalAgents(Long totalAgents) {
			this.totalAgents = totalAgents;
		}

		public Long getWaitingCalls() {
			return this.waitingCalls;
		}

		public void setWaitingCalls(Long waitingCalls) {
			this.waitingCalls = waitingCalls;
		}

		public Long getWorkingAgents() {
			return this.workingAgents;
		}

		public void setWorkingAgents(Long workingAgents) {
			this.workingAgents = workingAgents;
		}
	}

	@Override
	public GetRealtimeInstanceStatesResponse getInstance(UnmarshallerContext context) {
		return	GetRealtimeInstanceStatesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
