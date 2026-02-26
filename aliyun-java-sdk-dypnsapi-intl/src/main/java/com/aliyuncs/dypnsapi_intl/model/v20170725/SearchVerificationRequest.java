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

package com.aliyuncs.dypnsapi_intl.model.v20170725;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class SearchVerificationRequest extends RpcAcsRequest<SearchVerificationResponse> {
	   

	private Long resourceOwnerId;

	private String code;

	private String serviceSid;

	private Long sendDate;

	private Long pageSize;

	private String verificationId;

	private String resourceOwnerAccount;

	private Long currentPage;

	private Long ownerId;

	private String to;
	public SearchVerificationRequest() {
		super("Dypnsapi-intl", "2017-07-25", "SearchVerification");
		setMethod(MethodType.POST);
	}

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
		if(code != null){
			putQueryParameter("Code", code);
		}
	}

	public String getServiceSid() {
		return this.serviceSid;
	}

	public void setServiceSid(String serviceSid) {
		this.serviceSid = serviceSid;
		if(serviceSid != null){
			putQueryParameter("ServiceSid", serviceSid);
		}
	}

	public Long getSendDate() {
		return this.sendDate;
	}

	public void setSendDate(Long sendDate) {
		this.sendDate = sendDate;
		if(sendDate != null){
			putQueryParameter("SendDate", sendDate.toString());
		}
	}

	public Long getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize.toString());
		}
	}

	public String getVerificationId() {
		return this.verificationId;
	}

	public void setVerificationId(String verificationId) {
		this.verificationId = verificationId;
		if(verificationId != null){
			putQueryParameter("VerificationId", verificationId);
		}
	}

	public String getResourceOwnerAccount() {
		return this.resourceOwnerAccount;
	}

	public void setResourceOwnerAccount(String resourceOwnerAccount) {
		this.resourceOwnerAccount = resourceOwnerAccount;
		if(resourceOwnerAccount != null){
			putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
		}
	}

	public Long getCurrentPage() {
		return this.currentPage;
	}

	public void setCurrentPage(Long currentPage) {
		this.currentPage = currentPage;
		if(currentPage != null){
			putQueryParameter("CurrentPage", currentPage.toString());
		}
	}

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	public String getTo() {
		return this.to;
	}

	public void setTo(String to) {
		this.to = to;
		if(to != null){
			putQueryParameter("To", to);
		}
	}

	@Override
	public Class<SearchVerificationResponse> getResponseClass() {
		return SearchVerificationResponse.class;
	}

}
