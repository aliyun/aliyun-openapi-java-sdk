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

package com.aliyuncs.cccxspaceinner.model.v20191227;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class CloseTicketRequest extends RpcAcsRequest<CloseTicketResponse> {
	   

	private String clientToken;

	private Long tenantId;

	private Long ticketId;

	private String actionItems;

	private Long operatorId;
	public CloseTicketRequest() {
		super("CCCXSpaceInner", "2019-12-27", "CloseTicket");
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

	public Long getTenantId() {
		return this.tenantId;
	}

	public void setTenantId(Long tenantId) {
		this.tenantId = tenantId;
		if(tenantId != null){
			putBodyParameter("TenantId", tenantId.toString());
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

	public String getActionItems() {
		return this.actionItems;
	}

	public void setActionItems(String actionItems) {
		this.actionItems = actionItems;
		if(actionItems != null){
			putBodyParameter("ActionItems", actionItems);
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

	@Override
	public Class<CloseTicketResponse> getResponseClass() {
		return CloseTicketResponse.class;
	}

}
