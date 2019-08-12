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

package com.aliyuncs.arms.model.v20190808;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.arms.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateAlertContactGroupRequest extends RpcAcsRequest<CreateAlertContactGroupResponse> {
	
	public CreateAlertContactGroupRequest() {
		super("ARMS", "2019-08-08", "CreateAlertContactGroup", "arms");
		try {
			this.getClass().getDeclaredField("ProductEndpointMap").set(this, Endpoint.endpointMap);
			this.getClass().getDeclaredField("ProductEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	private String contactGroupName;

	private String contactIds;

	public String getContactGroupName() {
		return this.contactGroupName;
	}

	public void setContactGroupName(String contactGroupName) {
		this.contactGroupName = contactGroupName;
		if(contactGroupName != null){
			putQueryParameter("ContactGroupName", contactGroupName);
		}
	}

	public String getContactIds() {
		return this.contactIds;
	}

	public void setContactIds(String contactIds) {
		this.contactIds = contactIds;
		if(contactIds != null){
			putQueryParameter("ContactIds", contactIds);
		}
	}

	@Override
	public Class<CreateAlertContactGroupResponse> getResponseClass() {
		return CreateAlertContactGroupResponse.class;
	}

}
