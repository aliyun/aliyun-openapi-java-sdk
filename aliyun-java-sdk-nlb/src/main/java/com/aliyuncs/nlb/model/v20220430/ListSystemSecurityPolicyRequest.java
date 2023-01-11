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

package com.aliyuncs.nlb.model.v20220430;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.nlb.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ListSystemSecurityPolicyRequest extends RpcAcsRequest<ListSystemSecurityPolicyResponse> {
	   

	private String channel;

	private String ownerIdLoginEmail;

	private String callerBidLoginEmail;

	private String callerUidLoginEmail;

	private String requestContent;

	private String resourceOwnerAccount;

	private String ownerAccount;
	public ListSystemSecurityPolicyRequest() {
		super("Nlb", "2022-04-30", "ListSystemSecurityPolicy", "nlb");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getChannel() {
		return this.channel;
	}

	public void setChannel(String channel) {
		this.channel = channel;
		if(channel != null){
			putBodyParameter("Channel", channel);
		}
	}

	public String getOwnerIdLoginEmail() {
		return this.ownerIdLoginEmail;
	}

	public void setOwnerIdLoginEmail(String ownerIdLoginEmail) {
		this.ownerIdLoginEmail = ownerIdLoginEmail;
		if(ownerIdLoginEmail != null){
			putBodyParameter("OwnerIdLoginEmail", ownerIdLoginEmail);
		}
	}

	public String getCallerBidLoginEmail() {
		return this.callerBidLoginEmail;
	}

	public void setCallerBidLoginEmail(String callerBidLoginEmail) {
		this.callerBidLoginEmail = callerBidLoginEmail;
		if(callerBidLoginEmail != null){
			putBodyParameter("CallerBidLoginEmail", callerBidLoginEmail);
		}
	}

	public String getCallerUidLoginEmail() {
		return this.callerUidLoginEmail;
	}

	public void setCallerUidLoginEmail(String callerUidLoginEmail) {
		this.callerUidLoginEmail = callerUidLoginEmail;
		if(callerUidLoginEmail != null){
			putBodyParameter("CallerUidLoginEmail", callerUidLoginEmail);
		}
	}

	public String getRequestContent() {
		return this.requestContent;
	}

	public void setRequestContent(String requestContent) {
		this.requestContent = requestContent;
		if(requestContent != null){
			putBodyParameter("RequestContent", requestContent);
		}
	}

	public String getResourceOwnerAccount() {
		return this.resourceOwnerAccount;
	}

	public void setResourceOwnerAccount(String resourceOwnerAccount) {
		this.resourceOwnerAccount = resourceOwnerAccount;
		if(resourceOwnerAccount != null){
			putBodyParameter("ResourceOwnerAccount", resourceOwnerAccount);
		}
	}

	public String getOwnerAccount() {
		return this.ownerAccount;
	}

	public void setOwnerAccount(String ownerAccount) {
		this.ownerAccount = ownerAccount;
		if(ownerAccount != null){
			putBodyParameter("OwnerAccount", ownerAccount);
		}
	}

	@Override
	public Class<ListSystemSecurityPolicyResponse> getResponseClass() {
		return ListSystemSecurityPolicyResponse.class;
	}

}
