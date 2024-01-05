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

package com.aliyuncs.config.model.v20200907;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.config.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateAggregatorRequest extends RpcAcsRequest<UpdateAggregatorResponse> {
	   

	private String clientToken;

	private String aggregatorName;

	private String description;

	private String aggregatorId;

	@SerializedName("aggregatorAccounts")
	private List<AggregatorAccounts> aggregatorAccounts;
	public UpdateAggregatorRequest() {
		super("Config", "2020-09-07", "UpdateAggregator", "config");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public String getAggregatorName() {
		return this.aggregatorName;
	}

	public void setAggregatorName(String aggregatorName) {
		this.aggregatorName = aggregatorName;
		if(aggregatorName != null){
			putBodyParameter("AggregatorName", aggregatorName);
		}
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putBodyParameter("Description", description);
		}
	}

	public String getAggregatorId() {
		return this.aggregatorId;
	}

	public void setAggregatorId(String aggregatorId) {
		this.aggregatorId = aggregatorId;
		if(aggregatorId != null){
			putBodyParameter("AggregatorId", aggregatorId);
		}
	}

	public List<AggregatorAccounts> getAggregatorAccounts() {
		return this.aggregatorAccounts;
	}

	public void setAggregatorAccounts(List<AggregatorAccounts> aggregatorAccounts) {
		this.aggregatorAccounts = aggregatorAccounts;	
		if (aggregatorAccounts != null) {
			putBodyParameter("AggregatorAccounts" , new Gson().toJson(aggregatorAccounts));
		}	
	}

	public static class AggregatorAccounts {

		@SerializedName("AccountId")
		private Long accountId;

		@SerializedName("AccountName")
		private String accountName;

		@SerializedName("AccountType")
		private String accountType;

		public Long getAccountId() {
			return this.accountId;
		}

		public void setAccountId(Long accountId) {
			this.accountId = accountId;
		}

		public String getAccountName() {
			return this.accountName;
		}

		public void setAccountName(String accountName) {
			this.accountName = accountName;
		}

		public String getAccountType() {
			return this.accountType;
		}

		public void setAccountType(String accountType) {
			this.accountType = accountType;
		}
	}

	@Override
	public Class<UpdateAggregatorResponse> getResponseClass() {
		return UpdateAggregatorResponse.class;
	}

}
