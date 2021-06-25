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

package com.aliyuncs.outboundbot.model.v20191226;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.outboundbot.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class SaveContactBlockListRequest extends RpcAcsRequest<SaveContactBlockListResponse> {
	   

	private List<String> contactBlockListLists;

	private String instanceId;

	private String contactBlockListsJson;
	public SaveContactBlockListRequest() {
		super("OutboundBot", "2019-12-26", "SaveContactBlockList", "outboundbot");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<String> getContactBlockListLists() {
		return this.contactBlockListLists;
	}

	public void setContactBlockListLists(List<String> contactBlockListLists) {
		this.contactBlockListLists = contactBlockListLists;	
		if (contactBlockListLists != null) {
			for (int i = 0; i < contactBlockListLists.size(); i++) {
				putQueryParameter("ContactBlockListList." + (i + 1) , contactBlockListLists.get(i));
			}
		}	
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putQueryParameter("InstanceId", instanceId);
		}
	}

	public String getContactBlockListsJson() {
		return this.contactBlockListsJson;
	}

	public void setContactBlockListsJson(String contactBlockListsJson) {
		this.contactBlockListsJson = contactBlockListsJson;
		if(contactBlockListsJson != null){
			putQueryParameter("ContactBlockListsJson", contactBlockListsJson);
		}
	}

	@Override
	public Class<SaveContactBlockListResponse> getResponseClass() {
		return SaveContactBlockListResponse.class;
	}

}
