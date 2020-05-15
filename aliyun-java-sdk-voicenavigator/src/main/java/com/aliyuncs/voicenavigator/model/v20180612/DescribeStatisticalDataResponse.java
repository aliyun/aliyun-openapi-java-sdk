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

package com.aliyuncs.voicenavigator.model.v20180612;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.voicenavigator.transform.v20180612.DescribeStatisticalDataResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeStatisticalDataResponse extends AcsResponse {

	private String requestId;

	private Long resolvedQuestionTotalNum;

	private Long conversationTotalNum;

	private String totalResolutionRate;

	private String totalValidAnswerRate;

	private String totalDialoguePassRate;

	private String totalKnowledgeHitRate;

	private List<StatisticalDataReport> statisticalDataReports;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Long getResolvedQuestionTotalNum() {
		return this.resolvedQuestionTotalNum;
	}

	public void setResolvedQuestionTotalNum(Long resolvedQuestionTotalNum) {
		this.resolvedQuestionTotalNum = resolvedQuestionTotalNum;
	}

	public Long getConversationTotalNum() {
		return this.conversationTotalNum;
	}

	public void setConversationTotalNum(Long conversationTotalNum) {
		this.conversationTotalNum = conversationTotalNum;
	}

	public String getTotalResolutionRate() {
		return this.totalResolutionRate;
	}

	public void setTotalResolutionRate(String totalResolutionRate) {
		this.totalResolutionRate = totalResolutionRate;
	}

	public String getTotalValidAnswerRate() {
		return this.totalValidAnswerRate;
	}

	public void setTotalValidAnswerRate(String totalValidAnswerRate) {
		this.totalValidAnswerRate = totalValidAnswerRate;
	}

	public String getTotalDialoguePassRate() {
		return this.totalDialoguePassRate;
	}

	public void setTotalDialoguePassRate(String totalDialoguePassRate) {
		this.totalDialoguePassRate = totalDialoguePassRate;
	}

	public String getTotalKnowledgeHitRate() {
		return this.totalKnowledgeHitRate;
	}

	public void setTotalKnowledgeHitRate(String totalKnowledgeHitRate) {
		this.totalKnowledgeHitRate = totalKnowledgeHitRate;
	}

	public List<StatisticalDataReport> getStatisticalDataReports() {
		return this.statisticalDataReports;
	}

	public void setStatisticalDataReports(List<StatisticalDataReport> statisticalDataReports) {
		this.statisticalDataReports = statisticalDataReports;
	}

	public static class StatisticalDataReport {

		private String statisticalDate;

		private Integer resolvedQuestionNum;

		private Integer totalConversationNum;

		private String resolutionRate;

		private String validAnswerRate;

		private String dialoguePassRate;

		private String knowledgeHitRate;

		public String getStatisticalDate() {
			return this.statisticalDate;
		}

		public void setStatisticalDate(String statisticalDate) {
			this.statisticalDate = statisticalDate;
		}

		public Integer getResolvedQuestionNum() {
			return this.resolvedQuestionNum;
		}

		public void setResolvedQuestionNum(Integer resolvedQuestionNum) {
			this.resolvedQuestionNum = resolvedQuestionNum;
		}

		public Integer getTotalConversationNum() {
			return this.totalConversationNum;
		}

		public void setTotalConversationNum(Integer totalConversationNum) {
			this.totalConversationNum = totalConversationNum;
		}

		public String getResolutionRate() {
			return this.resolutionRate;
		}

		public void setResolutionRate(String resolutionRate) {
			this.resolutionRate = resolutionRate;
		}

		public String getValidAnswerRate() {
			return this.validAnswerRate;
		}

		public void setValidAnswerRate(String validAnswerRate) {
			this.validAnswerRate = validAnswerRate;
		}

		public String getDialoguePassRate() {
			return this.dialoguePassRate;
		}

		public void setDialoguePassRate(String dialoguePassRate) {
			this.dialoguePassRate = dialoguePassRate;
		}

		public String getKnowledgeHitRate() {
			return this.knowledgeHitRate;
		}

		public void setKnowledgeHitRate(String knowledgeHitRate) {
			this.knowledgeHitRate = knowledgeHitRate;
		}
	}

	@Override
	public DescribeStatisticalDataResponse getInstance(UnmarshallerContext context) {
		return	DescribeStatisticalDataResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
