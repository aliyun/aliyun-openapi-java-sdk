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

package com.aliyuncs.quickbi_public.model.v20220101;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class CreateTicket4CopilotRequest extends RpcAcsRequest<CreateTicket4CopilotResponse> {
	   

	private String copilotId;

	private Integer accountType;

	private String userId;

	private String accountName;

	private Integer expireTime;

	private Integer ticketNum;
	public CreateTicket4CopilotRequest() {
		super("quickbi-public", "2022-01-01", "CreateTicket4Copilot", "2.2.0");
		setMethod(MethodType.POST);
	}

	public String getCopilotId() {
		return this.copilotId;
	}

	public void setCopilotId(String copilotId) {
		this.copilotId = copilotId;
		if(copilotId != null){
			putQueryParameter("CopilotId", copilotId);
		}
	}

	public Integer getAccountType() {
		return this.accountType;
	}

	public void setAccountType(Integer accountType) {
		this.accountType = accountType;
		if(accountType != null){
			putQueryParameter("AccountType", accountType.toString());
		}
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
		if(userId != null){
			putQueryParameter("UserId", userId);
		}
	}

	public String getAccountName() {
		return this.accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
		if(accountName != null){
			putQueryParameter("AccountName", accountName);
		}
	}

	public Integer getExpireTime() {
		return this.expireTime;
	}

	public void setExpireTime(Integer expireTime) {
		this.expireTime = expireTime;
		if(expireTime != null){
			putQueryParameter("ExpireTime", expireTime.toString());
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
	public Class<CreateTicket4CopilotResponse> getResponseClass() {
		return CreateTicket4CopilotResponse.class;
	}

}
