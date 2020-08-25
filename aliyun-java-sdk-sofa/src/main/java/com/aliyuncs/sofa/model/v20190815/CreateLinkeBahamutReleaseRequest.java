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
public class CreateLinkeBahamutReleaseRequest extends RpcAcsRequest<CreateLinkeBahamutReleaseResponse> {
	   

	private Long releaseDate;

	private Long mergeDeadline;

	private String tenantId;

	private String aoneReleaseId;

	private Long prePubDeadline;

	private List<String> managersRepeatLists;

	private Long mergeStartTime;

	private String appGroup;

	private String name;

	private Long submitDeadline;
	public CreateLinkeBahamutReleaseRequest() {
		super("SOFA", "2019-08-15", "CreateLinkeBahamutRelease", "sofa");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getReleaseDate() {
		return this.releaseDate;
	}

	public void setReleaseDate(Long releaseDate) {
		this.releaseDate = releaseDate;
		if(releaseDate != null){
			putBodyParameter("ReleaseDate", releaseDate.toString());
		}
	}

	public Long getMergeDeadline() {
		return this.mergeDeadline;
	}

	public void setMergeDeadline(Long mergeDeadline) {
		this.mergeDeadline = mergeDeadline;
		if(mergeDeadline != null){
			putBodyParameter("MergeDeadline", mergeDeadline.toString());
		}
	}

	public String getTenantId() {
		return this.tenantId;
	}

	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
		if(tenantId != null){
			putBodyParameter("TenantId", tenantId);
		}
	}

	public String getAoneReleaseId() {
		return this.aoneReleaseId;
	}

	public void setAoneReleaseId(String aoneReleaseId) {
		this.aoneReleaseId = aoneReleaseId;
		if(aoneReleaseId != null){
			putBodyParameter("AoneReleaseId", aoneReleaseId);
		}
	}

	public Long getPrePubDeadline() {
		return this.prePubDeadline;
	}

	public void setPrePubDeadline(Long prePubDeadline) {
		this.prePubDeadline = prePubDeadline;
		if(prePubDeadline != null){
			putBodyParameter("PrePubDeadline", prePubDeadline.toString());
		}
	}

	public List<String> getManagersRepeatLists() {
		return this.managersRepeatLists;
	}

	public void setManagersRepeatLists(List<String> managersRepeatLists) {
		this.managersRepeatLists = managersRepeatLists;	
		if (managersRepeatLists != null) {
			for (int i = 0; i < managersRepeatLists.size(); i++) {
				putBodyParameter("ManagersRepeatList." + (i + 1) , managersRepeatLists.get(i));
			}
		}	
	}

	public Long getMergeStartTime() {
		return this.mergeStartTime;
	}

	public void setMergeStartTime(Long mergeStartTime) {
		this.mergeStartTime = mergeStartTime;
		if(mergeStartTime != null){
			putBodyParameter("MergeStartTime", mergeStartTime.toString());
		}
	}

	public String getAppGroup() {
		return this.appGroup;
	}

	public void setAppGroup(String appGroup) {
		this.appGroup = appGroup;
		if(appGroup != null){
			putBodyParameter("AppGroup", appGroup);
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putBodyParameter("Name", name);
		}
	}

	public Long getSubmitDeadline() {
		return this.submitDeadline;
	}

	public void setSubmitDeadline(Long submitDeadline) {
		this.submitDeadline = submitDeadline;
		if(submitDeadline != null){
			putBodyParameter("SubmitDeadline", submitDeadline.toString());
		}
	}

	@Override
	public Class<CreateLinkeBahamutReleaseResponse> getResponseClass() {
		return CreateLinkeBahamutReleaseResponse.class;
	}

}
