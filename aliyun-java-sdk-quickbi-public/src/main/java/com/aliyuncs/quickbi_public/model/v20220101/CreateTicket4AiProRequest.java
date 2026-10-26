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
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class CreateTicket4AiProRequest extends RpcAcsRequest<CreateTicket4AiProResponse> {
	   

	private Integer accountType;

	private String customParam;

	private String systemUid;

	private String accountName;

	private Integer expireTime;

	private String aiProId;

	private Integer ticketNum;

	private String quickBIUserId;
	public CreateTicket4AiProRequest() {
		super("quickbi-public", "2022-01-01", "CreateTicket4AiPro", "QuickBI");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
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

	public String getCustomParam() {
		return this.customParam;
	}

	public void setCustomParam(String customParam) {
		this.customParam = customParam;
		if(customParam != null){
			putQueryParameter("CustomParam", customParam);
		}
	}

	public String getSystemUid() {
		return this.systemUid;
	}

	public void setSystemUid(String systemUid) {
		this.systemUid = systemUid;
		if(systemUid != null){
			putQueryParameter("SystemUid", systemUid);
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

	public String getAiProId() {
		return this.aiProId;
	}

	public void setAiProId(String aiProId) {
		this.aiProId = aiProId;
		if(aiProId != null){
			putQueryParameter("AiProId", aiProId);
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

	public String getQuickBIUserId() {
		return this.quickBIUserId;
	}

	public void setQuickBIUserId(String quickBIUserId) {
		this.quickBIUserId = quickBIUserId;
		if(quickBIUserId != null){
			putQueryParameter("QuickBIUserId", quickBIUserId);
		}
	}

	@Override
	public Class<CreateTicket4AiProResponse> getResponseClass() {
		return CreateTicket4AiProResponse.class;
	}

}
