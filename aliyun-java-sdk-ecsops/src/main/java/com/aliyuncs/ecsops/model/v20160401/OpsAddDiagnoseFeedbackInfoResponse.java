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

package com.aliyuncs.ecsops.model.v20160401;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecsops.transform.v20160401.OpsAddDiagnoseFeedbackInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsAddDiagnoseFeedbackInfoResponse extends AcsResponse {

	private String requestId;

	private String result;

	private List<DiagnoseFeedbackContent> diagnoseFeedbackContents;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getResult() {
		return this.result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public List<DiagnoseFeedbackContent> getDiagnoseFeedbackContents() {
		return this.diagnoseFeedbackContents;
	}

	public void setDiagnoseFeedbackContents(List<DiagnoseFeedbackContent> diagnoseFeedbackContents) {
		this.diagnoseFeedbackContents = diagnoseFeedbackContents;
	}

	public static class DiagnoseFeedbackContent {

		private String srcErrorDesc;

		private String compareResult;

		private String srcExceptionName;

		private String suggestExceptionName;

		private String feedbackUserId;

		private String ncIp;

		private String srcTeams;

		private String srcExceptionTime;

		private String gmtCreated;

		private String srcExceptionType;

		private String matchedFeatures;

		private String suggestErrorDesc;

		private String suggestTeams;

		private String feedbackUserName;

		private String suggestOthers;

		private String srcReason;

		private String suggestReason;

		private String machineId;

		public String getSrcErrorDesc() {
			return this.srcErrorDesc;
		}

		public void setSrcErrorDesc(String srcErrorDesc) {
			this.srcErrorDesc = srcErrorDesc;
		}

		public String getCompareResult() {
			return this.compareResult;
		}

		public void setCompareResult(String compareResult) {
			this.compareResult = compareResult;
		}

		public String getSrcExceptionName() {
			return this.srcExceptionName;
		}

		public void setSrcExceptionName(String srcExceptionName) {
			this.srcExceptionName = srcExceptionName;
		}

		public String getSuggestExceptionName() {
			return this.suggestExceptionName;
		}

		public void setSuggestExceptionName(String suggestExceptionName) {
			this.suggestExceptionName = suggestExceptionName;
		}

		public String getFeedbackUserId() {
			return this.feedbackUserId;
		}

		public void setFeedbackUserId(String feedbackUserId) {
			this.feedbackUserId = feedbackUserId;
		}

		public String getNcIp() {
			return this.ncIp;
		}

		public void setNcIp(String ncIp) {
			this.ncIp = ncIp;
		}

		public String getSrcTeams() {
			return this.srcTeams;
		}

		public void setSrcTeams(String srcTeams) {
			this.srcTeams = srcTeams;
		}

		public String getSrcExceptionTime() {
			return this.srcExceptionTime;
		}

		public void setSrcExceptionTime(String srcExceptionTime) {
			this.srcExceptionTime = srcExceptionTime;
		}

		public String getGmtCreated() {
			return this.gmtCreated;
		}

		public void setGmtCreated(String gmtCreated) {
			this.gmtCreated = gmtCreated;
		}

		public String getSrcExceptionType() {
			return this.srcExceptionType;
		}

		public void setSrcExceptionType(String srcExceptionType) {
			this.srcExceptionType = srcExceptionType;
		}

		public String getMatchedFeatures() {
			return this.matchedFeatures;
		}

		public void setMatchedFeatures(String matchedFeatures) {
			this.matchedFeatures = matchedFeatures;
		}

		public String getSuggestErrorDesc() {
			return this.suggestErrorDesc;
		}

		public void setSuggestErrorDesc(String suggestErrorDesc) {
			this.suggestErrorDesc = suggestErrorDesc;
		}

		public String getSuggestTeams() {
			return this.suggestTeams;
		}

		public void setSuggestTeams(String suggestTeams) {
			this.suggestTeams = suggestTeams;
		}

		public String getFeedbackUserName() {
			return this.feedbackUserName;
		}

		public void setFeedbackUserName(String feedbackUserName) {
			this.feedbackUserName = feedbackUserName;
		}

		public String getSuggestOthers() {
			return this.suggestOthers;
		}

		public void setSuggestOthers(String suggestOthers) {
			this.suggestOthers = suggestOthers;
		}

		public String getSrcReason() {
			return this.srcReason;
		}

		public void setSrcReason(String srcReason) {
			this.srcReason = srcReason;
		}

		public String getSuggestReason() {
			return this.suggestReason;
		}

		public void setSuggestReason(String suggestReason) {
			this.suggestReason = suggestReason;
		}

		public String getMachineId() {
			return this.machineId;
		}

		public void setMachineId(String machineId) {
			this.machineId = machineId;
		}
	}

	@Override
	public OpsAddDiagnoseFeedbackInfoResponse getInstance(UnmarshallerContext context) {
		return	OpsAddDiagnoseFeedbackInfoResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
