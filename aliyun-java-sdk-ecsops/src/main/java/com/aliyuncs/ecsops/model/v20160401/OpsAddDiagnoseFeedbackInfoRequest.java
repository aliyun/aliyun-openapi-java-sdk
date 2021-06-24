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

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class OpsAddDiagnoseFeedbackInfoRequest extends RpcAcsRequest<OpsAddDiagnoseFeedbackInfoResponse> {
	   

	private String compareResult;

	private String feedbackUserName;

	private String feedbackUserId;

	private String diagnoseFeedbackParam;

	private String feedbackType;

	private String auditParamStr;
	public OpsAddDiagnoseFeedbackInfoRequest() {
		super("Ecsops", "2016-04-01", "OpsAddDiagnoseFeedbackInfo", "ecsops");
		setMethod(MethodType.POST);
	}

	public String getCompareResult() {
		return this.compareResult;
	}

	public void setCompareResult(String compareResult) {
		this.compareResult = compareResult;
		if(compareResult != null){
			putQueryParameter("CompareResult", compareResult);
		}
	}

	public String getFeedbackUserName() {
		return this.feedbackUserName;
	}

	public void setFeedbackUserName(String feedbackUserName) {
		this.feedbackUserName = feedbackUserName;
		if(feedbackUserName != null){
			putQueryParameter("FeedbackUserName", feedbackUserName);
		}
	}

	public String getFeedbackUserId() {
		return this.feedbackUserId;
	}

	public void setFeedbackUserId(String feedbackUserId) {
		this.feedbackUserId = feedbackUserId;
		if(feedbackUserId != null){
			putQueryParameter("FeedbackUserId", feedbackUserId);
		}
	}

	public String getDiagnoseFeedbackParam() {
		return this.diagnoseFeedbackParam;
	}

	public void setDiagnoseFeedbackParam(String diagnoseFeedbackParam) {
		this.diagnoseFeedbackParam = diagnoseFeedbackParam;
		if(diagnoseFeedbackParam != null){
			putQueryParameter("DiagnoseFeedbackParam", diagnoseFeedbackParam);
		}
	}

	public String getFeedbackType() {
		return this.feedbackType;
	}

	public void setFeedbackType(String feedbackType) {
		this.feedbackType = feedbackType;
		if(feedbackType != null){
			putQueryParameter("FeedbackType", feedbackType);
		}
	}

	public String getAuditParamStr() {
		return this.auditParamStr;
	}

	public void setAuditParamStr(String auditParamStr) {
		this.auditParamStr = auditParamStr;
		if(auditParamStr != null){
			putQueryParameter("AuditParamStr", auditParamStr);
		}
	}

	@Override
	public Class<OpsAddDiagnoseFeedbackInfoResponse> getResponseClass() {
		return OpsAddDiagnoseFeedbackInfoResponse.class;
	}

}
