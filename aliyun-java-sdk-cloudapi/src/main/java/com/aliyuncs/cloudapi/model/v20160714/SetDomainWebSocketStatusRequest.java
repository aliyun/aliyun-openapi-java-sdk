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
package com.aliyuncs.cloudapi.model.v20160714;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class SetDomainWebSocketStatusRequest extends RpcAcsRequest<SetDomainWebSocketStatusResponse> {
	
	public SetDomainWebSocketStatusRequest() {
		super("CloudAPI", "2016-07-14", "SetDomainWebSocketStatus", "apigateway");
	}

	private String groupId;

	private String domainName;

	private String actionValue;

	public String getGroupId() {
		return this.groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
		if(groupId != null){
			putQueryParameter("GroupId", groupId);
		}
	}

	public String getDomainName() {
		return this.domainName;
	}

	public void setDomainName(String domainName) {
		this.domainName = domainName;
		if(domainName != null){
			putQueryParameter("DomainName", domainName);
		}
	}

	public String getActionValue() {
		return this.actionValue;
	}

	public void setActionValue(String actionValue) {
		this.actionValue = actionValue;
		if(actionValue != null){
			putQueryParameter("ActionValue", actionValue);
		}
	}

	@Override
	public Class<SetDomainWebSocketStatusResponse> getResponseClass() {
		return SetDomainWebSocketStatusResponse.class;
	}

}
