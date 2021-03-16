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

package com.aliyuncs.cccxspaceinner.model.v20191227;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class CustomActionsOrdersRequest extends RpcAcsRequest<CustomActionsOrdersResponse> {
	   

	private Long buId;

	private Long cmsId;

	private String actorName;

	private Long caseId;

	private String activityCode;

	private String from;

	private String formData;
	public CustomActionsOrdersRequest() {
		super("CCCXSpaceInner", "2019-12-27", "CustomActionsOrders");
		setMethod(MethodType.POST);
	}

	public Long getBuId() {
		return this.buId;
	}

	public void setBuId(Long buId) {
		this.buId = buId;
		if(buId != null){
			putBodyParameter("BuId", buId.toString());
		}
	}

	public Long getCmsId() {
		return this.cmsId;
	}

	public void setCmsId(Long cmsId) {
		this.cmsId = cmsId;
		if(cmsId != null){
			putBodyParameter("CmsId", cmsId.toString());
		}
	}

	public String getActorName() {
		return this.actorName;
	}

	public void setActorName(String actorName) {
		this.actorName = actorName;
		if(actorName != null){
			putBodyParameter("ActorName", actorName);
		}
	}

	public Long getCaseId() {
		return this.caseId;
	}

	public void setCaseId(Long caseId) {
		this.caseId = caseId;
		if(caseId != null){
			putBodyParameter("CaseId", caseId.toString());
		}
	}

	public String getActivityCode() {
		return this.activityCode;
	}

	public void setActivityCode(String activityCode) {
		this.activityCode = activityCode;
		if(activityCode != null){
			putBodyParameter("ActivityCode", activityCode);
		}
	}

	public String getFrom() {
		return this.from;
	}

	public void setFrom(String from) {
		this.from = from;
		if(from != null){
			putBodyParameter("From", from);
		}
	}

	public String getFormData() {
		return this.formData;
	}

	public void setFormData(String formData) {
		this.formData = formData;
		if(formData != null){
			putBodyParameter("FormData", formData);
		}
	}

	@Override
	public Class<CustomActionsOrdersResponse> getResponseClass() {
		return CustomActionsOrdersResponse.class;
	}

}
