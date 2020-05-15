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
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sofa.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateLinkeLinktRiskRequest extends RpcAcsRequest<CreateLinkeLinktRiskResponse> {
	   

	private Long expectedCompletionDate;

	private String remark;

	private String title;

	private List<String> ccRepeatLists;

	private String projectSign;

	private String creator;

	private String level;

	private String assignedTo;

	private String region;
	public CreateLinkeLinktRiskRequest() {
		super("SOFA", "2019-08-15", "CreateLinkeLinktRisk", "ApplySidecarCert");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getExpectedCompletionDate() {
		return this.expectedCompletionDate;
	}

	public void setExpectedCompletionDate(Long expectedCompletionDate) {
		this.expectedCompletionDate = expectedCompletionDate;
		if(expectedCompletionDate != null){
			putBodyParameter("ExpectedCompletionDate", expectedCompletionDate.toString());
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

	public List<String> getCcRepeatLists() {
		return this.ccRepeatLists;
	}

	public void setCcRepeatLists(List<String> ccRepeatLists) {
		this.ccRepeatLists = ccRepeatLists;	
		if (ccRepeatLists != null) {
			for (int i = 0; i < ccRepeatLists.size(); i++) {
				putBodyParameter("CcRepeatList." + (i + 1) , ccRepeatLists.get(i));
			}
		}	
	}

	public String getProjectSign() {
		return this.projectSign;
	}

	public void setProjectSign(String projectSign) {
		this.projectSign = projectSign;
		if(projectSign != null){
			putBodyParameter("ProjectSign", projectSign);
		}
	}

	public String getCreator() {
		return this.creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
		if(creator != null){
			putBodyParameter("Creator", creator);
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

	public String getRegion() {
		return this.region;
	}

	public void setRegion(String region) {
		this.region = region;
		if(region != null){
			putBodyParameter("Region", region);
		}
	}

	@Override
	public Class<CreateLinkeLinktRiskResponse> getResponseClass() {
		return CreateLinkeLinktRiskResponse.class;
	}

}
