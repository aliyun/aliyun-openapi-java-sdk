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

package com.aliyuncs.rds.model.v20140815;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.rds.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateMaskingRulesRequest extends RpcAcsRequest<CreateMaskingRulesResponse> {
	   

	private String dBInstanceName;

	private Long resourceOwnerId;

	private String maskingAlgo;

	private String ruleName;

	private String resourceOwnerAccount;

	private String ownerId;

	private String defaultAlgo;

	@SerializedName("ruleConfig")
	private RuleConfig ruleConfig;
	public CreateMaskingRulesRequest() {
		super("Rds", "2014-08-15", "CreateMaskingRules", "rds");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getDBInstanceName() {
		return this.dBInstanceName;
	}

	public void setDBInstanceName(String dBInstanceName) {
		this.dBInstanceName = dBInstanceName;
		if(dBInstanceName != null){
			putQueryParameter("DBInstanceName", dBInstanceName);
		}
	}

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public String getMaskingAlgo() {
		return this.maskingAlgo;
	}

	public void setMaskingAlgo(String maskingAlgo) {
		this.maskingAlgo = maskingAlgo;
		if(maskingAlgo != null){
			putQueryParameter("MaskingAlgo", maskingAlgo);
		}
	}

	public String getRuleName() {
		return this.ruleName;
	}

	public void setRuleName(String ruleName) {
		this.ruleName = ruleName;
		if(ruleName != null){
			putQueryParameter("RuleName", ruleName);
		}
	}

	public String getResourceOwnerAccount() {
		return this.resourceOwnerAccount;
	}

	public void setResourceOwnerAccount(String resourceOwnerAccount) {
		this.resourceOwnerAccount = resourceOwnerAccount;
		if(resourceOwnerAccount != null){
			putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
		}
	}

	public String getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(String ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId);
		}
	}

	public String getDefaultAlgo() {
		return this.defaultAlgo;
	}

	public void setDefaultAlgo(String defaultAlgo) {
		this.defaultAlgo = defaultAlgo;
		if(defaultAlgo != null){
			putQueryParameter("DefaultAlgo", defaultAlgo);
		}
	}

	public RuleConfig getRuleConfig() {
		return this.ruleConfig;
	}

	public void setRuleConfig(RuleConfig ruleConfig) {
		this.ruleConfig = ruleConfig;	
		if (ruleConfig != null) {
			putQueryParameter("RuleConfig" , new Gson().toJson(ruleConfig));
		}	
	}

	public static class RuleConfig {

		@SerializedName("Databases")
		private List<String> databases;

		@SerializedName("Tables")
		private List<String> tables;

		@SerializedName("Columns")
		private List<String> columns;

		public List<String> getDatabases() {
			return this.databases;
		}

		public void setDatabases(List<String> databases) {
			this.databases = databases;
		}

		public List<String> getTables() {
			return this.tables;
		}

		public void setTables(List<String> tables) {
			this.tables = tables;
		}

		public List<String> getColumns() {
			return this.columns;
		}

		public void setColumns(List<String> columns) {
			this.columns = columns;
		}
	}

	@Override
	public Class<CreateMaskingRulesResponse> getResponseClass() {
		return CreateMaskingRulesResponse.class;
	}

}
