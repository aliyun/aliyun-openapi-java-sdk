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
import com.aliyuncs.ccc.transform.v20200701.ListCampaignsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListCampaignsResponse extends AcsResponse {

	private String requestId;

	private String message;

	private Long httpStatusCode;

	private String code;

	private Boolean success;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Long getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Long httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
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

		private Long pageNumber;

		private Long pageSize;

		private Long totalCount;

		private List<ListItem> list;

		public Long getPageNumber() {
			return this.pageNumber;
		}

		public void setPageNumber(Long pageNumber) {
			this.pageNumber = pageNumber;
		}

		public Long getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Long pageSize) {
			this.pageSize = pageSize;
		}

		public Long getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Long totalCount) {
			this.totalCount = totalCount;
		}

		public List<ListItem> getList() {
			return this.list;
		}

		public void setList(List<ListItem> list) {
			this.list = list;
		}

		public static class ListItem {

			private Long actualEndTime;

			private Long actualStartTime;

			private Long casesAborted;

			private Long casesUncompleted;

			private Long casesConnected;

			private Long completedRate;

			private Long maxAttemptCount;

			private Long minAttemptInterval;

			private String name;

			private Long planedEndTime;

			private Long planedStartTime;

			private String queueName;

			private Long totalCases;

			private String state;

			private String campaignId;

			private String strategyType;

			private String strategyParameters;

			private String queueId;

			private Boolean simulation;

			public Long getActualEndTime() {
				return this.actualEndTime;
			}

			public void setActualEndTime(Long actualEndTime) {
				this.actualEndTime = actualEndTime;
			}

			public Long getActualStartTime() {
				return this.actualStartTime;
			}

			public void setActualStartTime(Long actualStartTime) {
				this.actualStartTime = actualStartTime;
			}

			public Long getCasesAborted() {
				return this.casesAborted;
			}

			public void setCasesAborted(Long casesAborted) {
				this.casesAborted = casesAborted;
			}

			public Long getCasesUncompleted() {
				return this.casesUncompleted;
			}

			public void setCasesUncompleted(Long casesUncompleted) {
				this.casesUncompleted = casesUncompleted;
			}

			public Long getCasesConnected() {
				return this.casesConnected;
			}

			public void setCasesConnected(Long casesConnected) {
				this.casesConnected = casesConnected;
			}

			public Long getCompletedRate() {
				return this.completedRate;
			}

			public void setCompletedRate(Long completedRate) {
				this.completedRate = completedRate;
			}

			public Long getMaxAttemptCount() {
				return this.maxAttemptCount;
			}

			public void setMaxAttemptCount(Long maxAttemptCount) {
				this.maxAttemptCount = maxAttemptCount;
			}

			public Long getMinAttemptInterval() {
				return this.minAttemptInterval;
			}

			public void setMinAttemptInterval(Long minAttemptInterval) {
				this.minAttemptInterval = minAttemptInterval;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public Long getPlanedEndTime() {
				return this.planedEndTime;
			}

			public void setPlanedEndTime(Long planedEndTime) {
				this.planedEndTime = planedEndTime;
			}

			public Long getPlanedStartTime() {
				return this.planedStartTime;
			}

			public void setPlanedStartTime(Long planedStartTime) {
				this.planedStartTime = planedStartTime;
			}

			public String getQueueName() {
				return this.queueName;
			}

			public void setQueueName(String queueName) {
				this.queueName = queueName;
			}

			public Long getTotalCases() {
				return this.totalCases;
			}

			public void setTotalCases(Long totalCases) {
				this.totalCases = totalCases;
			}

			public String getState() {
				return this.state;
			}

			public void setState(String state) {
				this.state = state;
			}

			public String getCampaignId() {
				return this.campaignId;
			}

			public void setCampaignId(String campaignId) {
				this.campaignId = campaignId;
			}

			public String getStrategyType() {
				return this.strategyType;
			}

			public void setStrategyType(String strategyType) {
				this.strategyType = strategyType;
			}

			public String getStrategyParameters() {
				return this.strategyParameters;
			}

			public void setStrategyParameters(String strategyParameters) {
				this.strategyParameters = strategyParameters;
			}

			public String getQueueId() {
				return this.queueId;
			}

			public void setQueueId(String queueId) {
				this.queueId = queueId;
			}

			public Boolean getSimulation() {
				return this.simulation;
			}

			public void setSimulation(Boolean simulation) {
				this.simulation = simulation;
			}
		}
	}

	@Override
	public ListCampaignsResponse getInstance(UnmarshallerContext context) {
		return	ListCampaignsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
