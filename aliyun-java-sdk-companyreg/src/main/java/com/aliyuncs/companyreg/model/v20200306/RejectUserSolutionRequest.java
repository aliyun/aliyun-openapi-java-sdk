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

package com.aliyuncs.companyreg.model.v20200306;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.companyreg.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class RejectUserSolutionRequest extends RpcAcsRequest<RejectUserSolutionResponse> {
	   

	private String bizType;

	private String note;

	private String solutionBizId;
	public RejectUserSolutionRequest() {
		super("companyreg", "2020-03-06", "RejectUserSolution", "companyreg");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getBizType() {
		return this.bizType;
	}

	public void setBizType(String bizType) {
		this.bizType = bizType;
		if(bizType != null){
			putQueryParameter("BizType", bizType);
		}
	}

	public String getNote() {
		return this.note;
	}

	public void setNote(String note) {
		this.note = note;
		if(note != null){
			putQueryParameter("Note", note);
		}
	}

	public String getSolutionBizId() {
		return this.solutionBizId;
	}

	public void setSolutionBizId(String solutionBizId) {
		this.solutionBizId = solutionBizId;
		if(solutionBizId != null){
			putQueryParameter("SolutionBizId", solutionBizId);
		}
	}

	@Override
	public Class<RejectUserSolutionResponse> getResponseClass() {
		return RejectUserSolutionResponse.class;
	}

}
