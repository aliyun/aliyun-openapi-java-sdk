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
import com.aliyuncs.ccc.transform.v20200701.GetRealtimeCampaignStatsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetRealtimeCampaignStatsResponse extends AcsResponse {

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

		private Long loggedInAgents;

		private Long readyAgents;

		private Long breakingAgents;

		private Long talkingAgents;

		private Long workingAgents;

		private Long caps;

		private Long totalAgents;

		public Long getLoggedInAgents() {
			return this.loggedInAgents;
		}

		public void setLoggedInAgents(Long loggedInAgents) {
			this.loggedInAgents = loggedInAgents;
		}

		public Long getReadyAgents() {
			return this.readyAgents;
		}

		public void setReadyAgents(Long readyAgents) {
			this.readyAgents = readyAgents;
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

		public Long getWorkingAgents() {
			return this.workingAgents;
		}

		public void setWorkingAgents(Long workingAgents) {
			this.workingAgents = workingAgents;
		}

		public Long getCaps() {
			return this.caps;
		}

		public void setCaps(Long caps) {
			this.caps = caps;
		}

		public Long getTotalAgents() {
			return this.totalAgents;
		}

		public void setTotalAgents(Long totalAgents) {
			this.totalAgents = totalAgents;
		}
	}

	@Override
	public GetRealtimeCampaignStatsResponse getInstance(UnmarshallerContext context) {
		return	GetRealtimeCampaignStatsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
