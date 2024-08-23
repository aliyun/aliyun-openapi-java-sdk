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

package com.aliyuncs.governance.model.v20210120;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.governance.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class BatchEnrollAccountsRequest extends RpcAcsRequest<BatchEnrollAccountsResponse> {
	   

	private String baselineId;

	private List<BaselineItems> baselineItems;

	private List<Accounts> accounts;
	public BatchEnrollAccountsRequest() {
		super("governance", "2021-01-20", "BatchEnrollAccounts", "governance");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getBaselineId() {
		return this.baselineId;
	}

	public void setBaselineId(String baselineId) {
		this.baselineId = baselineId;
		if(baselineId != null){
			putQueryParameter("BaselineId", baselineId);
		}
	}

	public List<BaselineItems> getBaselineItems() {
		return this.baselineItems;
	}

	public void setBaselineItems(List<BaselineItems> baselineItems) {
		this.baselineItems = baselineItems;	
		if (baselineItems != null) {
			for (int depth1 = 0; depth1 < baselineItems.size(); depth1++) {
				if (baselineItems.get(depth1) != null) {
					
						putQueryParameter("BaselineItems." + (depth1 + 1) + ".Name" , baselineItems.get(depth1).getName());
						putQueryParameter("BaselineItems." + (depth1 + 1) + ".Skip" , baselineItems.get(depth1).getSkip());
						putQueryParameter("BaselineItems." + (depth1 + 1) + ".Config" , baselineItems.get(depth1).getConfig());
						putQueryParameter("BaselineItems." + (depth1 + 1) + ".Version" , baselineItems.get(depth1).getVersion());
				}
			}
		}	
	}

	public List<Accounts> getAccounts() {
		return this.accounts;
	}

	public void setAccounts(List<Accounts> accounts) {
		this.accounts = accounts;	
		if (accounts != null) {
			for (int depth1 = 0; depth1 < accounts.size(); depth1++) {
				if (accounts.get(depth1) != null) {
					
						putQueryParameter("Accounts." + (depth1 + 1) + ".AccountUid" , accounts.get(depth1).getAccountUid());
				}
			}
		}	
	}

	public static class BaselineItems {

		private String name;

		private Boolean skip;

		private String config;

		private String version;

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Boolean getSkip() {
			return this.skip;
		}

		public void setSkip(Boolean skip) {
			this.skip = skip;
		}

		public String getConfig() {
			return this.config;
		}

		public void setConfig(String config) {
			this.config = config;
		}

		public String getVersion() {
			return this.version;
		}

		public void setVersion(String version) {
			this.version = version;
		}
	}

	public static class Accounts {

		private Long accountUid;

		public Long getAccountUid() {
			return this.accountUid;
		}

		public void setAccountUid(Long accountUid) {
			this.accountUid = accountUid;
		}
	}

	@Override
	public Class<BatchEnrollAccountsResponse> getResponseClass() {
		return BatchEnrollAccountsResponse.class;
	}

}
