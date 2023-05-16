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

package com.aliyuncs.agency.model.v20180703;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.agency.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateNormalAccountRequest extends RpcAcsRequest<CreateNormalAccountResponse> {
	   

	private List<CreateNormalAccountInfoList> createNormalAccountInfoLists;
	public CreateNormalAccountRequest() {
		super("Agency", "2018-07-03", "CreateNormalAccount", "openApi");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<CreateNormalAccountInfoList> getCreateNormalAccountInfoLists() {
		return this.createNormalAccountInfoLists;
	}

	public void setCreateNormalAccountInfoLists(List<CreateNormalAccountInfoList> createNormalAccountInfoLists) {
		this.createNormalAccountInfoLists = createNormalAccountInfoLists;	
		if (createNormalAccountInfoLists != null) {
			for (int depth1 = 0; depth1 < createNormalAccountInfoLists.size(); depth1++) {
				putQueryParameter("CreateNormalAccountInfoList." + (depth1 + 1) + ".AliyunPk" , createNormalAccountInfoLists.get(depth1).getAliyunPk());
				putQueryParameter("CreateNormalAccountInfoList." + (depth1 + 1) + ".CustomNick" , createNormalAccountInfoLists.get(depth1).getCustomNick());
				putQueryParameter("CreateNormalAccountInfoList." + (depth1 + 1) + ".CustomCredit" , createNormalAccountInfoLists.get(depth1).getCustomCredit());
				putQueryParameter("CreateNormalAccountInfoList." + (depth1 + 1) + ".FxShutdownstatus" , createNormalAccountInfoLists.get(depth1).getFxShutdownstatus());
				putQueryParameter("CreateNormalAccountInfoList." + (depth1 + 1) + ".CustomerAccount" , createNormalAccountInfoLists.get(depth1).getCustomerAccount());
				putQueryParameter("CreateNormalAccountInfoList." + (depth1 + 1) + ".FxDescription" , createNormalAccountInfoLists.get(depth1).getFxDescription());
				putQueryParameter("CreateNormalAccountInfoList." + (depth1 + 1) + ".CustomerRebateType" , createNormalAccountInfoLists.get(depth1).getCustomerRebateType());
				putQueryParameter("CreateNormalAccountInfoList." + (depth1 + 1) + ".isEnterprise" , createNormalAccountInfoLists.get(depth1).getIsEnterprise());
				putQueryParameter("CreateNormalAccountInfoList." + (depth1 + 1) + ".Cid" , createNormalAccountInfoLists.get(depth1).getCid());
			}
		}	
	}

	public static class CreateNormalAccountInfoList {

		private Long aliyunPk;

		private String customNick;

		private String customCredit;

		private String fxShutdownstatus;

		private String customerAccount;

		private String fxDescription;

		private String customerRebateType;

		private Integer isEnterprise;

		private Long cid;

		public Long getAliyunPk() {
			return this.aliyunPk;
		}

		public void setAliyunPk(Long aliyunPk) {
			this.aliyunPk = aliyunPk;
		}

		public String getCustomNick() {
			return this.customNick;
		}

		public void setCustomNick(String customNick) {
			this.customNick = customNick;
		}

		public String getCustomCredit() {
			return this.customCredit;
		}

		public void setCustomCredit(String customCredit) {
			this.customCredit = customCredit;
		}

		public String getFxShutdownstatus() {
			return this.fxShutdownstatus;
		}

		public void setFxShutdownstatus(String fxShutdownstatus) {
			this.fxShutdownstatus = fxShutdownstatus;
		}

		public String getCustomerAccount() {
			return this.customerAccount;
		}

		public void setCustomerAccount(String customerAccount) {
			this.customerAccount = customerAccount;
		}

		public String getFxDescription() {
			return this.fxDescription;
		}

		public void setFxDescription(String fxDescription) {
			this.fxDescription = fxDescription;
		}

		public String getCustomerRebateType() {
			return this.customerRebateType;
		}

		public void setCustomerRebateType(String customerRebateType) {
			this.customerRebateType = customerRebateType;
		}

		public Integer getIsEnterprise() {
			return this.isEnterprise;
		}

		public void setIsEnterprise(Integer isEnterprise) {
			this.isEnterprise = isEnterprise;
		}

		public Long getCid() {
			return this.cid;
		}

		public void setCid(Long cid) {
			this.cid = cid;
		}
	}

	@Override
	public Class<CreateNormalAccountResponse> getResponseClass() {
		return CreateNormalAccountResponse.class;
	}

}
