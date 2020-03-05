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

package com.aliyuncs.ehpc.model.v20180412;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ehpc.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class GetWorkbenchTokenRequest extends RpcAcsRequest<GetWorkbenchTokenResponse> {
	   

	private String clusterId;

	private String userPassword;

	private String instanceId;

	private Integer port;

	private String accountSessionTicket;

	private String accountUid;

	private String userName;
	public GetWorkbenchTokenRequest() {
		super("EHPC", "2018-04-12", "GetWorkbenchToken", "ehs");
		setMethod(MethodType.GET);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getClusterId() {
		return this.clusterId;
	}

	public void setClusterId(String clusterId) {
		this.clusterId = clusterId;
		if(clusterId != null){
			putQueryParameter("ClusterId", clusterId);
		}
	}

	public String getUserPassword() {
		return this.userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
		if(userPassword != null){
			putQueryParameter("UserPassword", userPassword);
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

	public Integer getPort() {
		return this.port;
	}

	public void setPort(Integer port) {
		this.port = port;
		if(port != null){
			putQueryParameter("Port", port.toString());
		}
	}

	public String getAccountSessionTicket() {
		return this.accountSessionTicket;
	}

	public void setAccountSessionTicket(String accountSessionTicket) {
		this.accountSessionTicket = accountSessionTicket;
		if(accountSessionTicket != null){
			putQueryParameter("AccountSessionTicket", accountSessionTicket);
		}
	}

	public String getAccountUid() {
		return this.accountUid;
	}

	public void setAccountUid(String accountUid) {
		this.accountUid = accountUid;
		if(accountUid != null){
			putQueryParameter("AccountUid", accountUid);
		}
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
		if(userName != null){
			putQueryParameter("UserName", userName);
		}
	}

	@Override
	public Class<GetWorkbenchTokenResponse> getResponseClass() {
		return GetWorkbenchTokenResponse.class;
	}

}
