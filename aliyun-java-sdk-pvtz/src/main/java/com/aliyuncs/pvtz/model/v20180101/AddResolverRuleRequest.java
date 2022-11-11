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
public class AddResolverRuleRequest extends RpcAcsRequest<AddResolverRuleResponse> {
	   

	private String endpointId;

	private List<ForwardIp> forwardIps;

	private String type;

	private String zoneName;

	private String name;

	private String lang;
	public AddResolverRuleRequest() {
		super("pvtz", "2018-01-01", "AddResolverRule", "pvtz");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getEndpointId() {
		return this.endpointId;
	}

	public void setEndpointId(String endpointId) {
		this.endpointId = endpointId;
		if(endpointId != null){
			putQueryParameter("EndpointId", endpointId);
		}
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

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
		if(type != null){
			putQueryParameter("Type", type);
		}
	}

	public String getZoneName() {
		return this.zoneName;
	}

	public void setZoneName(String zoneName) {
		this.zoneName = zoneName;
		if(zoneName != null){
			putQueryParameter("ZoneName", zoneName);
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
	public Class<AddResolverRuleResponse> getResponseClass() {
		return AddResolverRuleResponse.class;
	}

}
