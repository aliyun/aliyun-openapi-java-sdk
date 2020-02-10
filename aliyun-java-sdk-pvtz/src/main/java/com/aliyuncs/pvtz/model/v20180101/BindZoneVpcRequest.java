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
public class BindZoneVpcRequest extends RpcAcsRequest<BindZoneVpcResponse> {
	   

	private String userClientIp;

	private String zoneId;

	private String lang;

	private List<Vpcs> vpcss;
	public BindZoneVpcRequest() {
		super("pvtz", "2018-01-01", "BindZoneVpc", "pvtz");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public String getZoneId() {
		return this.zoneId;
	}

	public void setZoneId(String zoneId) {
		this.zoneId = zoneId;
		if(zoneId != null){
			putQueryParameter("ZoneId", zoneId);
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

	public List<Vpcs> getVpcss() {
		return this.vpcss;
	}

	public void setVpcss(List<Vpcs> vpcss) {
		this.vpcss = vpcss;	
		if (vpcss != null) {
			for (int depth1 = 0; depth1 < vpcss.size(); depth1++) {
				putQueryParameter("Vpcs." + (depth1 + 1) + ".RegionId" , vpcss.get(depth1).getRegionId());
				putQueryParameter("Vpcs." + (depth1 + 1) + ".VpcId" , vpcss.get(depth1).getVpcId());
			}
		}	
	}

	public static class Vpcs {

		private String regionId;

		private String vpcId;

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
	public Class<BindZoneVpcResponse> getResponseClass() {
		return BindZoneVpcResponse.class;
	}

}
