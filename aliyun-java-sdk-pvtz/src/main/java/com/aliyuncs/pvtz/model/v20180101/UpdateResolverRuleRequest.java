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
public class UpdateResolverRuleRequest extends RpcAcsRequest<UpdateResolverRuleResponse> {
	   

	private List<ForwardIp> forwardIps;

	private String name;

	private String lang;

	private String ruleId;
	public UpdateResolverRuleRequest() {
		super("pvtz", "2018-01-01", "UpdateResolverRule", "pvtz");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<ForwardIp> getForwardIps() {
		return this.forwardIps;
	}

	public void setForwardIps(List<ForwardIp> forwardIps) {
		this.forwardIps = forwardIps;	
		if (forwardIps != null) {
			for (int depth1 = 0; depth1 < forwardIps.size(); depth1++) {
				putQueryParameter("ForwardIp." + (depth1 + 1) + ".Port" , forwardIps.get(depth1).getPort());
				putQueryParameter("ForwardIp." + (depth1 + 1) + ".Ip" , forwardIps.get(depth1).getIp());
			}
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

	public static class ForwardIp {

		private Integer port;

		private String ip;

		public Integer getPort() {
			return this.port;
		}

		public void setPort(Integer port) {
			this.port = port;
		}

		public String getIp() {
			return this.ip;
		}

		public void setIp(String ip) {
			this.ip = ip;
		}
	}

	@Override
	public Class<UpdateResolverRuleResponse> getResponseClass() {
		return UpdateResolverRuleResponse.class;
	}

}
