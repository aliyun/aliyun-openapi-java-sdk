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
public class UpdateLinkeLinktRiskRequest extends RpcAcsRequest<UpdateLinkeLinktRiskResponse> {
	   

	private String ccJsonStr;

	private String assignedToJsonStr;

	private String statusJsonStr;

	private String remarkJsonStr;

	private Long id;

	private String titleJsonStr;

	private String levelJsonStr;

	private String expectedCompletionDateJsonStr;
	public UpdateLinkeLinktRiskRequest() {
		super("SOFA", "2019-08-15", "UpdateLinkeLinktRisk", "ApplySidecarCert");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getCcJsonStr() {
		return this.ccJsonStr;
	}

	public void setCcJsonStr(String ccJsonStr) {
		this.ccJsonStr = ccJsonStr;
		if(ccJsonStr != null){
			putBodyParameter("CcJsonStr", ccJsonStr);
		}
	}

	public String getAssignedToJsonStr() {
		return this.assignedToJsonStr;
	}

	public void setAssignedToJsonStr(String assignedToJsonStr) {
		this.assignedToJsonStr = assignedToJsonStr;
		if(assignedToJsonStr != null){
			putBodyParameter("AssignedToJsonStr", assignedToJsonStr);
		}
	}

	public String getStatusJsonStr() {
		return this.statusJsonStr;
	}

	public void setStatusJsonStr(String statusJsonStr) {
		this.statusJsonStr = statusJsonStr;
		if(statusJsonStr != null){
			putBodyParameter("StatusJsonStr", statusJsonStr);
		}
	}

	public String getRemarkJsonStr() {
		return this.remarkJsonStr;
	}

	public void setRemarkJsonStr(String remarkJsonStr) {
		this.remarkJsonStr = remarkJsonStr;
		if(remarkJsonStr != null){
			putBodyParameter("RemarkJsonStr", remarkJsonStr);
		}
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
		if(id != null){
			putBodyParameter("Id", id.toString());
		}
	}

	public String getTitleJsonStr() {
		return this.titleJsonStr;
	}

	public void setTitleJsonStr(String titleJsonStr) {
		this.titleJsonStr = titleJsonStr;
		if(titleJsonStr != null){
			putBodyParameter("TitleJsonStr", titleJsonStr);
		}
	}

	public String getLevelJsonStr() {
		return this.levelJsonStr;
	}

	public void setLevelJsonStr(String levelJsonStr) {
		this.levelJsonStr = levelJsonStr;
		if(levelJsonStr != null){
			putBodyParameter("LevelJsonStr", levelJsonStr);
		}
	}

	public String getExpectedCompletionDateJsonStr() {
		return this.expectedCompletionDateJsonStr;
	}

	public void setExpectedCompletionDateJsonStr(String expectedCompletionDateJsonStr) {
		this.expectedCompletionDateJsonStr = expectedCompletionDateJsonStr;
		if(expectedCompletionDateJsonStr != null){
			putBodyParameter("ExpectedCompletionDateJsonStr", expectedCompletionDateJsonStr);
		}
	}

	@Override
	public Class<UpdateLinkeLinktRiskResponse> getResponseClass() {
		return UpdateLinkeLinktRiskResponse.class;
	}

}
