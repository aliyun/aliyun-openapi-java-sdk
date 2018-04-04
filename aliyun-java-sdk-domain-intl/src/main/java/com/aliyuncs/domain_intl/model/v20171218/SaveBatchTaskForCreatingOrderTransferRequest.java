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

package com.aliyuncs.domain_intl.model.v20171218;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;

/**
 * @author auto create
 * @version 
 */
public class SaveBatchTaskForCreatingOrderTransferRequest extends RpcAcsRequest<SaveBatchTaskForCreatingOrderTransferResponse> {
	
	public SaveBatchTaskForCreatingOrderTransferRequest() {
		super("Domain-intl", "2017-12-18", "SaveBatchTaskForCreatingOrderTransfer", "domain");
	}

	private List<OrderTransferParam> orderTransferParams;

	private String userClientIp;

	private String lang;

	public List<OrderTransferParam> getOrderTransferParams() {
		return this.orderTransferParams;
	}

	public void setOrderTransferParams(List<OrderTransferParam> orderTransferParams) {
		this.orderTransferParams = orderTransferParams;	
		if (orderTransferParams != null) {
			for (int depth1 = 0; depth1 < orderTransferParams.size(); depth1++) {
				putQueryParameter("OrderTransferParam." + (depth1 + 1) + ".DomainName" , orderTransferParams.get(depth1).getDomainName());
				putQueryParameter("OrderTransferParam." + (depth1 + 1) + ".AuthorizationCode" , orderTransferParams.get(depth1).getAuthorizationCode());
				putQueryParameter("OrderTransferParam." + (depth1 + 1) + ".RegistrantProfileId" , orderTransferParams.get(depth1).getRegistrantProfileId());
				putQueryParameter("OrderTransferParam." + (depth1 + 1) + ".PermitPremiumTransfer" , orderTransferParams.get(depth1).getPermitPremiumTransfer());
			}
		}	
	}

	public String getUserClientIp() {
		return this.userClientIp;
	}

	public void setUserClientIp(String userClientIp) {
		this.userClientIp = userClientIp;
		if(userClientIp != null){
			putQueryParameter("UserClientIp", userClientIp);
		}
	}

	public String getLang() {
		return this.lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
		if(lang != null){
			putQueryParameter("Lang", lang);
		}
	}

	public static class OrderTransferParam {

		private String domainName;

		private String authorizationCode;

		private Long registrantProfileId;

		private Boolean permitPremiumTransfer;

		public String getDomainName() {
			return this.domainName;
		}

		public void setDomainName(String domainName) {
			this.domainName = domainName;
		}

		public String getAuthorizationCode() {
			return this.authorizationCode;
		}

		public void setAuthorizationCode(String authorizationCode) {
			this.authorizationCode = authorizationCode;
		}

		public Long getRegistrantProfileId() {
			return this.registrantProfileId;
		}

		public void setRegistrantProfileId(Long registrantProfileId) {
			this.registrantProfileId = registrantProfileId;
		}

		public Boolean getPermitPremiumTransfer() {
			return this.permitPremiumTransfer;
		}

		public void setPermitPremiumTransfer(Boolean permitPremiumTransfer) {
			this.permitPremiumTransfer = permitPremiumTransfer;
		}
	}

	@Override
	public Class<SaveBatchTaskForCreatingOrderTransferResponse> getResponseClass() {
		return SaveBatchTaskForCreatingOrderTransferResponse.class;
	}

}
