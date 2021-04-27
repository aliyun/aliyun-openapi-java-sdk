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

package com.aliyuncs.cro.model.v20200102;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class GetVerifyTokenRequest extends RpcAcsRequest<GetVerifyTokenResponse> {
	   

	private String clientInfo;

	private String source;

	private String accountId;

	private String biz;

	private Long privacyPolicyId;

	private String name;

	private String cardType;

	private String cardNumber;

	private String ticketId;
	public GetVerifyTokenRequest() {
		super("CRO", "2020-01-02", "GetVerifyToken", "cro");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public String getClientInfo() {
		return this.clientInfo;
	}

	public void setClientInfo(String clientInfo) {
		this.clientInfo = clientInfo;
		if(clientInfo != null){
			putQueryParameter("ClientInfo", clientInfo);
		}
	}

	public String getSource() {
		return this.source;
	}

	public void setSource(String source) {
		this.source = source;
		if(source != null){
			putQueryParameter("Source", source);
		}
	}

	public String getAccountId() {
		return this.accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
		if(accountId != null){
			putQueryParameter("AccountId", accountId);
		}
	}

	public String getBiz() {
		return this.biz;
	}

	public void setBiz(String biz) {
		this.biz = biz;
		if(biz != null){
			putQueryParameter("Biz", biz);
		}
	}

	public Long getPrivacyPolicyId() {
		return this.privacyPolicyId;
	}

	public void setPrivacyPolicyId(Long privacyPolicyId) {
		this.privacyPolicyId = privacyPolicyId;
		if(privacyPolicyId != null){
			putQueryParameter("PrivacyPolicyId", privacyPolicyId.toString());
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putQueryParameter("Name", name);
		}
	}

	public String getCardType() {
		return this.cardType;
	}

	public void setCardType(String cardType) {
		this.cardType = cardType;
		if(cardType != null){
			putQueryParameter("CardType", cardType);
		}
	}

	public String getCardNumber() {
		return this.cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
		if(cardNumber != null){
			putQueryParameter("CardNumber", cardNumber);
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
	public Class<GetVerifyTokenResponse> getResponseClass() {
		return GetVerifyTokenResponse.class;
	}

}
