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
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.scsp.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class QueryTicketActionsRequest extends RpcAcsRequest<QueryTicketActionsResponse> {
	   

	private String instanceId;

	private String ticketId;

	private List<Integer> actionCodeLists;
	public QueryTicketActionsRequest() {
		super("scsp", "2020-07-02", "QueryTicketActions", "scsp");
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

	public String getTicketId() {
		return this.ticketId;
	}

	public void setTicketId(String ticketId) {
		this.ticketId = ticketId;
		if(ticketId != null){
			putBodyParameter("TicketId", ticketId);
		}
	}

	public List<Integer> getActionCodeLists() {
		return this.actionCodeLists;
	}

	public void setActionCodeLists(List<Integer> actionCodeLists) {
		this.actionCodeLists = actionCodeLists;	
		if (actionCodeLists != null) {
			for (int i = 0; i < actionCodeLists.size(); i++) {
				putBodyParameter("ActionCodeList." + (i + 1) , actionCodeLists.get(i));
			}
		}	
	}

	@Override
	public Class<QueryTicketActionsResponse> getResponseClass() {
		return QueryTicketActionsResponse.class;
	}

}
