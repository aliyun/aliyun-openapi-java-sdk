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

package com.aliyuncs.quickbi_public.model.v20210325;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.quickbi_public.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateTicketNumRequest extends RpcAcsRequest<UpdateTicketNumResponse> {
	   

	private String ticket;

	private Integer ticketNum;
	public UpdateTicketNumRequest() {
		super("quickbi-public", "2021-03-25", "UpdateTicketNum", "quickbi");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getTicket() {
		return this.ticket;
	}

	public void setTicket(String ticket) {
		this.ticket = ticket;
		if(ticket != null){
			putQueryParameter("Ticket", ticket);
		}
	}

	public Integer getTicketNum() {
		return this.ticketNum;
	}

	public void setTicketNum(Integer ticketNum) {
		this.ticketNum = ticketNum;
		if(ticketNum != null){
			putQueryParameter("TicketNum", ticketNum.toString());
		}
	}

	@Override
	public Class<UpdateTicketNumResponse> getResponseClass() {
		return UpdateTicketNumResponse.class;
	}

}
