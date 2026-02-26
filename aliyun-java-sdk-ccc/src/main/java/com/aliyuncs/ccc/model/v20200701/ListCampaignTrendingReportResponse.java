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
import com.aliyuncs.ccc.transform.v20200701.ListCampaignTrendingReportResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListCampaignTrendingReportResponse extends AcsResponse {

	private String code;

	private Integer httpStatusCode;

	private String message;

	private String requestId;

	private List<TrendingList> data;

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

	public List<TrendingList> getData() {
		return this.data;
	}

	public void setData(List<TrendingList> data) {
		this.data = data;
	}

	public static class TrendingList {

		private Long datetime;

		private Long concurrency;

		private Long talkAgents;

		private Long readyAgents;

		private Long workAgents;

		private Long loggedInAgents;

		private Long breakAgents;

		private Long statsTime;

		private Long talkingAgents;

		private Long workingAgents;

		private Long breakingAgents;

		private Long outboundScenarioReadyAgents;

		private Long outboundScenarioBreakingAgents;

		private Long outboundScenarioTalkingAgents;

		private Long outboundScenarioWorkingAgents;

		public Long getDatetime() {
			return this.datetime;
		}

		public void setDatetime(Long datetime) {
			this.datetime = datetime;
		}

		public Long getConcurrency() {
			return this.concurrency;
		}

		public void setConcurrency(Long concurrency) {
			this.concurrency = concurrency;
		}

		public Long getTalkAgents() {
			return this.talkAgents;
		}

		public void setTalkAgents(Long talkAgents) {
			this.talkAgents = talkAgents;
		}

		public Long getReadyAgents() {
			return this.readyAgents;
		}

		public void setReadyAgents(Long readyAgents) {
			this.readyAgents = readyAgents;
		}

		public Long getWorkAgents() {
			return this.workAgents;
		}

		public void setWorkAgents(Long workAgents) {
			this.workAgents = workAgents;
		}

		public Long getLoggedInAgents() {
			return this.loggedInAgents;
		}

		public void setLoggedInAgents(Long loggedInAgents) {
			this.loggedInAgents = loggedInAgents;
		}

		public Long getBreakAgents() {
			return this.breakAgents;
		}

		public void setBreakAgents(Long breakAgents) {
			this.breakAgents = breakAgents;
		}

		public Long getStatsTime() {
			return this.statsTime;
		}

		public void setStatsTime(Long statsTime) {
			this.statsTime = statsTime;
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

		public Long getBreakingAgents() {
			return this.breakingAgents;
		}

		public void setBreakingAgents(Long breakingAgents) {
			this.breakingAgents = breakingAgents;
		}

		public Long getOutboundScenarioReadyAgents() {
			return this.outboundScenarioReadyAgents;
		}

		public void setOutboundScenarioReadyAgents(Long outboundScenarioReadyAgents) {
			this.outboundScenarioReadyAgents = outboundScenarioReadyAgents;
		}

		public Long getOutboundScenarioBreakingAgents() {
			return this.outboundScenarioBreakingAgents;
		}

		public void setOutboundScenarioBreakingAgents(Long outboundScenarioBreakingAgents) {
			this.outboundScenarioBreakingAgents = outboundScenarioBreakingAgents;
		}

		public Long getOutboundScenarioTalkingAgents() {
			return this.outboundScenarioTalkingAgents;
		}

		public void setOutboundScenarioTalkingAgents(Long outboundScenarioTalkingAgents) {
			this.outboundScenarioTalkingAgents = outboundScenarioTalkingAgents;
		}

		public Long getOutboundScenarioWorkingAgents() {
			return this.outboundScenarioWorkingAgents;
		}

		public void setOutboundScenarioWorkingAgents(Long outboundScenarioWorkingAgents) {
			this.outboundScenarioWorkingAgents = outboundScenarioWorkingAgents;
		}
	}

	@Override
	public ListCampaignTrendingReportResponse getInstance(UnmarshallerContext context) {
		return	ListCampaignTrendingReportResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
