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
	   

	private String expectedCompletionDate;

	private String remark;

	private String title;

	private Long id;

	private String cc;

	private String level;

	private String assignedTo;

	private String status;
	public UpdateLinkeLinktRiskRequest() {
		super("SOFA", "2019-08-15", "UpdateLinkeLinktRisk", "sofacafedeps");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getExpectedCompletionDate() {
		return this.expectedCompletionDate;
	}

	public void setExpectedCompletionDate(String expectedCompletionDate) {
		this.expectedCompletionDate = expectedCompletionDate;
		if(expectedCompletionDate != null){
			putBodyParameter("ExpectedCompletionDate", expectedCompletionDate);
		}
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
		if(remark != null){
			putBodyParameter("Remark", remark);
		}
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
		if(title != null){
			putBodyParameter("Title", title);
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

	public String getCc() {
		return this.cc;
	}

	public void setCc(String cc) {
		this.cc = cc;
		if(cc != null){
			putBodyParameter("Cc", cc);
		}
	}

	public String getLevel() {
		return this.level;
	}

	public void setLevel(String level) {
		this.level = level;
		if(level != null){
			putBodyParameter("Level", level);
		}
	}

	public String getAssignedTo() {
		return this.assignedTo;
	}

	public void setAssignedTo(String assignedTo) {
		this.assignedTo = assignedTo;
		if(assignedTo != null){
			putBodyParameter("AssignedTo", assignedTo);
		}
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
		if(status != null){
			putBodyParameter("Status", status);
		}
	}

	@Override
	public Class<UpdateLinkeLinktRiskResponse> getResponseClass() {
		return UpdateLinkeLinktRiskResponse.class;
	}

}
