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

package com.aliyuncs.gwlb.model.v20240415;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class UpdateListenerAttributeRequest extends RpcAcsRequest<UpdateListenerAttributeResponse> {
	   

	private String clientToken;

	private String serverGroupId;

	private String listenerId;

	private Boolean dryRun;

	private String listenerDescription;
	public UpdateListenerAttributeRequest() {
		super("Gwlb", "2024-04-15", "UpdateListenerAttribute");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
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

	public String getServerGroupId() {
		return this.serverGroupId;
	}

	public void setServerGroupId(String serverGroupId) {
		this.serverGroupId = serverGroupId;
		if(serverGroupId != null){
			putBodyParameter("ServerGroupId", serverGroupId);
		}
	}

	public String getListenerId() {
		return this.listenerId;
	}

	public void setListenerId(String listenerId) {
		this.listenerId = listenerId;
		if(listenerId != null){
			putBodyParameter("ListenerId", listenerId);
		}
	}

	public Boolean getDryRun() {
		return this.dryRun;
	}

	public void setDryRun(Boolean dryRun) {
		this.dryRun = dryRun;
		if(dryRun != null){
			putBodyParameter("DryRun", dryRun.toString());
		}
	}

	public String getListenerDescription() {
		return this.listenerDescription;
	}

	public void setListenerDescription(String listenerDescription) {
		this.listenerDescription = listenerDescription;
		if(listenerDescription != null){
			putBodyParameter("ListenerDescription", listenerDescription);
		}
	}

	@Override
	public Class<UpdateListenerAttributeResponse> getResponseClass() {
		return UpdateListenerAttributeResponse.class;
	}

}
