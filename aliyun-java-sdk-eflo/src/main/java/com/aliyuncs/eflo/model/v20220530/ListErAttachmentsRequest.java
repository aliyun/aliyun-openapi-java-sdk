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

package com.aliyuncs.eflo.model.v20220530;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ListErAttachmentsRequest extends RpcAcsRequest<ListErAttachmentsResponse> {
	   

	private Integer pageNumber;

	private String resourceTenantId;

	private Boolean autoReceiveAllRoute;

	private Integer pageSize;

	private String instanceType;

	private String erAttachmentName;

	private String erId;

	private String instanceId;

	private String erAttachmentId;

	private Boolean enablePage;

	private String status;
	public ListErAttachmentsRequest() {
		super("eflo", "2022-05-30", "ListErAttachments", "eflo");
		setMethod(MethodType.POST);
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
		if(pageNumber != null){
			putBodyParameter("PageNumber", pageNumber.toString());
		}
	}

	public String getResourceTenantId() {
		return this.resourceTenantId;
	}

	public void setResourceTenantId(String resourceTenantId) {
		this.resourceTenantId = resourceTenantId;
		if(resourceTenantId != null){
			putBodyParameter("ResourceTenantId", resourceTenantId);
		}
	}

	public Boolean getAutoReceiveAllRoute() {
		return this.autoReceiveAllRoute;
	}

	public void setAutoReceiveAllRoute(Boolean autoReceiveAllRoute) {
		this.autoReceiveAllRoute = autoReceiveAllRoute;
		if(autoReceiveAllRoute != null){
			putBodyParameter("AutoReceiveAllRoute", autoReceiveAllRoute.toString());
		}
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putBodyParameter("PageSize", pageSize.toString());
		}
	}

	public String getInstanceType() {
		return this.instanceType;
	}

	public void setInstanceType(String instanceType) {
		this.instanceType = instanceType;
		if(instanceType != null){
			putBodyParameter("InstanceType", instanceType);
		}
	}

	public String getErAttachmentName() {
		return this.erAttachmentName;
	}

	public void setErAttachmentName(String erAttachmentName) {
		this.erAttachmentName = erAttachmentName;
		if(erAttachmentName != null){
			putBodyParameter("ErAttachmentName", erAttachmentName);
		}
	}

	public String getErId() {
		return this.erId;
	}

	public void setErId(String erId) {
		this.erId = erId;
		if(erId != null){
			putBodyParameter("ErId", erId);
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

	public String getErAttachmentId() {
		return this.erAttachmentId;
	}

	public void setErAttachmentId(String erAttachmentId) {
		this.erAttachmentId = erAttachmentId;
		if(erAttachmentId != null){
			putBodyParameter("ErAttachmentId", erAttachmentId);
		}
	}

	public Boolean getEnablePage() {
		return this.enablePage;
	}

	public void setEnablePage(Boolean enablePage) {
		this.enablePage = enablePage;
		if(enablePage != null){
			putBodyParameter("EnablePage", enablePage.toString());
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
	public Class<ListErAttachmentsResponse> getResponseClass() {
		return ListErAttachmentsResponse.class;
	}

}
