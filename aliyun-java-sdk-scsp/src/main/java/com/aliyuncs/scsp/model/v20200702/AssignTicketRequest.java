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
public class AssignTicketRequest extends RpcAcsRequest<AssignTicketResponse> {
	   

	private String instanceId;

	private String clientToken;

	private Long ticketId;

	private Long operatorId;

	private Long acceptorId;
	public AssignTicketRequest() {
		super("scsp", "2020-07-02", "AssignTicket");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		if(clientToken != null){
			putBodyParameter("ClientToken", clientToken);
		}
	}

	public Long getTicketId() {
		return this.ticketId;
	}

	public void setTicketId(Long ticketId) {
		this.ticketId = ticketId;
		if(ticketId != null){
			putBodyParameter("TicketId", ticketId.toString());
		}
	}

	public Long getOperatorId() {
		return this.operatorId;
	}

	public void setOperatorId(Long operatorId) {
		this.operatorId = operatorId;
		if(operatorId != null){
			putBodyParameter("OperatorId", operatorId.toString());
		}
	}

	public Long getAcceptorId() {
		return this.acceptorId;
	}

	public void setAcceptorId(Long acceptorId) {
		this.acceptorId = acceptorId;
		if(acceptorId != null){
			putBodyParameter("AcceptorId", acceptorId.toString());
		}
	}

	@Override
	public Class<AssignTicketResponse> getResponseClass() {
		return AssignTicketResponse.class;
	}

}
