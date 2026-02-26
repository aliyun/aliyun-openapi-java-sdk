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

package com.aliyuncs.ccc.model.v20200701;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ccc.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateTicketRequest extends RpcAcsRequest<UpdateTicketResponse> {
	   

	private String instanceId;

	private String customerId;

	private String context;

	private String title;

	private String ticketId;
	public UpdateTicketRequest() {
		super("CCC", "2020-07-01", "UpdateTicket", "CCC");
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
			putQueryParameter("InstanceId", instanceId);
		}
	}

	public String getCustomerId() {
		return this.customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
		if(customerId != null){
			putQueryParameter("CustomerId", customerId);
		}
	}

	public String getContext() {
		return this.context;
	}

	public void setContext(String context) {
		this.context = context;
		if(context != null){
			putQueryParameter("Context", context);
		}
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
		if(title != null){
			putQueryParameter("Title", title);
		}
	}

	public String getTicketId() {
		return this.ticketId;
	}

	public void setTicketId(String ticketId) {
		this.ticketId = ticketId;
		if(ticketId != null){
			putQueryParameter("TicketId", ticketId);
		}
	}

	@Override
	public Class<UpdateTicketResponse> getResponseClass() {
		return UpdateTicketResponse.class;
	}

}
