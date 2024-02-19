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

package com.aliyuncs.pvtz.model.v20180101;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.pvtz.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class BindResolverRuleVpcRequest extends RpcAcsRequest<BindResolverRuleVpcResponse> {
	   

	private List<Vpc> vpcs;

	private String lang;

	private String ruleId;
	public BindResolverRuleVpcRequest() {
		super("pvtz", "2018-01-01", "BindResolverRuleVpc", "pvtz");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<Vpc> getVpcs() {
		return this.vpcs;
	}

	public void setVpcs(List<Vpc> vpcs) {
		this.vpcs = vpcs;	
		if (vpcs != null) {
			for (int depth1 = 0; depth1 < vpcs.size(); depth1++) {
				putQueryParameter("Vpc." + (depth1 + 1) + ".VpcType" , vpcs.get(depth1).getVpcType());
				putQueryParameter("Vpc." + (depth1 + 1) + ".RegionId" , vpcs.get(depth1).getRegionId());
				putQueryParameter("Vpc." + (depth1 + 1) + ".VpcId" , vpcs.get(depth1).getVpcId());
			}
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

	public String getRuleId() {
		return this.ruleId;
	}

	public void setRuleId(String ruleId) {
		this.ruleId = ruleId;
		if(ruleId != null){
			putQueryParameter("RuleId", ruleId);
		}
	}

	public static class Vpc {

		private String vpcType;

		private String regionId;

		private String vpcId;

		public String getVpcType() {
			return this.vpcType;
		}

		public void setVpcType(String vpcType) {
			this.vpcType = vpcType;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getVpcId() {
			return this.vpcId;
		}

		public void setVpcId(String vpcId) {
			this.vpcId = vpcId;
		}
	}

	@Override
	public Class<BindResolverRuleVpcResponse> getResponseClass() {
		return BindResolverRuleVpcResponse.class;
	}

}
