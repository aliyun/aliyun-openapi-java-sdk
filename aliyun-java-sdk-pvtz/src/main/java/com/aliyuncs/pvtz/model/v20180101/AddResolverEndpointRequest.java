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
public class AddResolverEndpointRequest extends RpcAcsRequest<AddResolverEndpointResponse> {
	   

	private String vpcRegionId;

	private String securityGroupId;

	private String vpcId;

	private String name;

	private String lang;

	private List<IpConfig> ipConfigs;
	public AddResolverEndpointRequest() {
		super("pvtz", "2018-01-01", "AddResolverEndpoint", "pvtz");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getVpcRegionId() {
		return this.vpcRegionId;
	}

	public void setVpcRegionId(String vpcRegionId) {
		this.vpcRegionId = vpcRegionId;
		if(vpcRegionId != null){
			putQueryParameter("VpcRegionId", vpcRegionId);
		}
	}

	public String getSecurityGroupId() {
		return this.securityGroupId;
	}

	public void setSecurityGroupId(String securityGroupId) {
		this.securityGroupId = securityGroupId;
		if(securityGroupId != null){
			putQueryParameter("SecurityGroupId", securityGroupId);
		}
	}

	public String getVpcId() {
		return this.vpcId;
	}

	public void setVpcId(String vpcId) {
		this.vpcId = vpcId;
		if(vpcId != null){
			putQueryParameter("VpcId", vpcId);
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
	public Class<AddResolverEndpointResponse> getResponseClass() {
		return AddResolverEndpointResponse.class;
	}

}
