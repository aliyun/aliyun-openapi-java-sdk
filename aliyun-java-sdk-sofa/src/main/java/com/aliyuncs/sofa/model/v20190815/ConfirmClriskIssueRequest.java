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

package com.aliyuncs.sofa.model.v20190815;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sofa.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ConfirmClriskIssueRequest extends RpcAcsRequest<ConfirmClriskIssueResponse> {
	   

	private Long issueId;

	private String memo;

	private Boolean falseAlarm;

	private Boolean fundLoss;
	public ConfirmClriskIssueRequest() {
		super("SOFA", "2019-08-15", "ConfirmClriskIssue", "sofacaferms");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getIssueId() {
		return this.issueId;
	}

	public void setIssueId(Long issueId) {
		this.issueId = issueId;
		if(issueId != null){
			putBodyParameter("IssueId", issueId.toString());
		}
	}

	public String getMemo() {
		return this.memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
		if(memo != null){
			putBodyParameter("Memo", memo);
		}
	}

	public Boolean getFalseAlarm() {
		return this.falseAlarm;
	}

	public void setFalseAlarm(Boolean falseAlarm) {
		this.falseAlarm = falseAlarm;
		if(falseAlarm != null){
			putBodyParameter("FalseAlarm", falseAlarm.toString());
		}
	}

	public Boolean getFundLoss() {
		return this.fundLoss;
	}

	public void setFundLoss(Boolean fundLoss) {
		this.fundLoss = fundLoss;
		if(fundLoss != null){
			putBodyParameter("FundLoss", fundLoss.toString());
		}
	}

	@Override
	public Class<ConfirmClriskIssueResponse> getResponseClass() {
		return ConfirmClriskIssueResponse.class;
	}

}
