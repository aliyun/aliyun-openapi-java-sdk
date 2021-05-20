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

package com.aliyuncs.scsp.model.v20200702;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.scsp.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateTicketWithBizDataRequest extends RpcAcsRequest<CreateTicketWithBizDataResponse> {
	   

	private String fromInfo;

	private String clientToken;

	private String carbonCopy;

	private Long creatorId;

	private String bizData;

	private Long templateId;

	private Integer priority;

	private String formData;

	private String instanceId;

	private Integer creatorType;

	private String creatorName;

	private Long categoryId;

	private String memberName;

	private Long memberId;
	public CreateTicketWithBizDataRequest() {
		super("scsp", "2020-07-02", "CreateTicketWithBizData");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getFromInfo() {
		return this.fromInfo;
	}

	public void setFromInfo(String fromInfo) {
		this.fromInfo = fromInfo;
		if(fromInfo != null){
			putBodyParameter("FromInfo", fromInfo);
		}
	}

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		if(clientToken != null){
			putBodyParameter("ClientToken", clientToken);
		}
	}

	public String getCarbonCopy() {
		return this.carbonCopy;
	}

	public void setCarbonCopy(String carbonCopy) {
		this.carbonCopy = carbonCopy;
		if(carbonCopy != null){
			putBodyParameter("CarbonCopy", carbonCopy);
		}
	}

	public Long getCreatorId() {
		return this.creatorId;
	}

	public void setCreatorId(Long creatorId) {
		this.creatorId = creatorId;
		if(creatorId != null){
			putBodyParameter("CreatorId", creatorId.toString());
		}
	}

	public String getBizData() {
		return this.bizData;
	}

	public void setBizData(String bizData) {
		this.bizData = bizData;
		if(bizData != null){
			putBodyParameter("BizData", bizData);
		}
	}

	public Long getTemplateId() {
		return this.templateId;
	}

	public void setTemplateId(Long templateId) {
		this.templateId = templateId;
		if(templateId != null){
			putBodyParameter("TemplateId", templateId.toString());
		}
	}

	public Integer getPriority() {
		return this.priority;
	}

	public void setPriority(Integer priority) {
		this.priority = priority;
		if(priority != null){
			putBodyParameter("Priority", priority.toString());
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

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putBodyParameter("InstanceId", instanceId);
		}
	}

	public Integer getCreatorType() {
		return this.creatorType;
	}

	public void setCreatorType(Integer creatorType) {
		this.creatorType = creatorType;
		if(creatorType != null){
			putBodyParameter("CreatorType", creatorType.toString());
		}
	}

	public String getCreatorName() {
		return this.creatorName;
	}

	public void setCreatorName(String creatorName) {
		this.creatorName = creatorName;
		if(creatorName != null){
			putBodyParameter("CreatorName", creatorName);
		}
	}

	public Long getCategoryId() {
		return this.categoryId;
	}

	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
		if(categoryId != null){
			putBodyParameter("CategoryId", categoryId.toString());
		}
	}

	public String getMemberName() {
		return this.memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
		if(memberName != null){
			putBodyParameter("MemberName", memberName);
		}
	}

	public Long getMemberId() {
		return this.memberId;
	}

	public void setMemberId(Long memberId) {
		this.memberId = memberId;
		if(memberId != null){
			putBodyParameter("MemberId", memberId.toString());
		}
	}

	@Override
	public Class<CreateTicketWithBizDataResponse> getResponseClass() {
		return CreateTicketWithBizDataResponse.class;
	}

}
