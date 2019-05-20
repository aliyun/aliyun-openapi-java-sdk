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
import com.aliyuncs.cloudcallcenter.transform.v20170705.DescribeVnDashboardResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeVnDashboardResponse extends AcsResponse {

	private String requestId;

	private Long availableConcurrencyCount;

	private Long totalConcurrencyCount;

	private Long occupiedConcurrencyCount;

	private Long totalSolvedQuestionCount;

	private Long maxConcurrencyCount;

	private Long totalConversationCount;

	private String solvedQuestionRate;

	private Integer interval;

	private List<Report> reports;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Long getAvailableConcurrencyCount() {
		return this.availableConcurrencyCount;
	}

	public void setAvailableConcurrencyCount(Long availableConcurrencyCount) {
		this.availableConcurrencyCount = availableConcurrencyCount;
	}

	public Long getTotalConcurrencyCount() {
		return this.totalConcurrencyCount;
	}

	public void setTotalConcurrencyCount(Long totalConcurrencyCount) {
		this.totalConcurrencyCount = totalConcurrencyCount;
	}

	public Long getOccupiedConcurrencyCount() {
		return this.occupiedConcurrencyCount;
	}

	public void setOccupiedConcurrencyCount(Long occupiedConcurrencyCount) {
		this.occupiedConcurrencyCount = occupiedConcurrencyCount;
	}

	public Long getTotalSolvedQuestionCount() {
		return this.totalSolvedQuestionCount;
	}

	public void setTotalSolvedQuestionCount(Long totalSolvedQuestionCount) {
		this.totalSolvedQuestionCount = totalSolvedQuestionCount;
	}

	public Long getMaxConcurrencyCount() {
		return this.maxConcurrencyCount;
	}

	public void setMaxConcurrencyCount(Long maxConcurrencyCount) {
		this.maxConcurrencyCount = maxConcurrencyCount;
	}

	public Long getTotalConversationCount() {
		return this.totalConversationCount;
	}

	public void setTotalConversationCount(Long totalConversationCount) {
		this.totalConversationCount = totalConversationCount;
	}

	public String getSolvedQuestionRate() {
		return this.solvedQuestionRate;
	}

	public void setSolvedQuestionRate(String solvedQuestionRate) {
		this.solvedQuestionRate = solvedQuestionRate;
	}

	public Integer getInterval() {
		return this.interval;
	}

	public void setInterval(Integer interval) {
		this.interval = interval;
	}

	public List<Report> getReports() {
		return this.reports;
	}

	public void setReports(List<Report> reports) {
		this.reports = reports;
	}

	public static class Report {

		private Long reportDate;

		private Long solvedQuestionCount;

		private Long conversationCount;

		public Long getReportDate() {
			return this.reportDate;
		}

		public void setReportDate(Long reportDate) {
			this.reportDate = reportDate;
		}

		public Long getSolvedQuestionCount() {
			return this.solvedQuestionCount;
		}

		public void setSolvedQuestionCount(Long solvedQuestionCount) {
			this.solvedQuestionCount = solvedQuestionCount;
		}

		public Long getConversationCount() {
			return this.conversationCount;
		}

		public void setConversationCount(Long conversationCount) {
			this.conversationCount = conversationCount;
		}
	}

	@Override
	public DescribeVnDashboardResponse getInstance(UnmarshallerContext context) {
		return	DescribeVnDashboardResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
