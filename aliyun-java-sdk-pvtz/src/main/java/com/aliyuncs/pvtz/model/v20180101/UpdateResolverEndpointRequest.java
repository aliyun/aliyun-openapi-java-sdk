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
public class UpdateResolverEndpointRequest extends RpcAcsRequest<UpdateResolverEndpointResponse> {
	   

	private String endpointId;

	private String name;

	private String lang;

	private List<IpConfig> ipConfigs;
	public UpdateResolverEndpointRequest() {
		super("pvtz", "2018-01-01", "UpdateResolverEndpoint", "pvtz");
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

	public List<IpConfig> getIpConfigs() {
		return this.ipConfigs;
	}

	public void setIpConfigs(List<IpConfig> ipConfigs) {
		this.ipConfigs = ipConfigs;	
		if (ipConfigs != null) {
			for (int depth1 = 0; depth1 < ipConfigs.size(); depth1++) {
				putQueryParameter("IpConfig." + (depth1 + 1) + ".VSwitchId" , ipConfigs.get(depth1).getVSwitchId());
				putQueryParameter("IpConfig." + (depth1 + 1) + ".Ip" , ipConfigs.get(depth1).getIp());
				putQueryParameter("IpConfig." + (depth1 + 1) + ".CidrBlock" , ipConfigs.get(depth1).getCidrBlock());
				putQueryParameter("IpConfig." + (depth1 + 1) + ".AzId" , ipConfigs.get(depth1).getAzId());
			}
		}	
	}

	public static class IpConfig {

		private String vSwitchId;

		private String ip;

		private String cidrBlock;

		private String azId;

		public String getVSwitchId() {
			return this.vSwitchId;
		}

		public void setVSwitchId(String vSwitchId) {
			this.vSwitchId = vSwitchId;
		}

		public String getIp() {
			return this.ip;
		}

		public void setIp(String ip) {
			this.ip = ip;
		}

		public String getCidrBlock() {
			return this.cidrBlock;
		}

		public void setCidrBlock(String cidrBlock) {
			this.cidrBlock = cidrBlock;
		}

		public String getAzId() {
			return this.azId;
		}

		public void setAzId(String azId) {
			this.azId = azId;
		}
	}

	@Override
	public Class<UpdateResolverEndpointResponse> getResponseClass() {
		return UpdateResolverEndpointResponse.class;
	}

}
