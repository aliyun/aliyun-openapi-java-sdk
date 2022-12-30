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

package com.aliyuncs.eflo.model.v20220530;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class CreateVpdRequest extends RpcAcsRequest<CreateVpdResponse> {
	   

	private String name;

	private String cidr;

	private List<Subnets> subnetss;
	public CreateVpdRequest() {
		super("eflo", "2022-05-30", "CreateVpd", "eflo");
		setMethod(MethodType.POST);
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putBodyParameter("Name", name);
		}
	}

	public String getCidr() {
		return this.cidr;
	}

	public void setCidr(String cidr) {
		this.cidr = cidr;
		if(cidr != null){
			putBodyParameter("Cidr", cidr);
		}
	}

	public List<Subnets> getSubnetss() {
		return this.subnetss;
	}

	public void setSubnetss(List<Subnets> subnetss) {
		this.subnetss = subnetss;	
		if (subnetss != null) {
			for (int depth1 = 0; depth1 < subnetss.size(); depth1++) {
				putBodyParameter("Subnets." + (depth1 + 1) + ".RegionId" , subnetss.get(depth1).getRegionId());
				putBodyParameter("Subnets." + (depth1 + 1) + ".Name" , subnetss.get(depth1).getName());
				putBodyParameter("Subnets." + (depth1 + 1) + ".ZoneId" , subnetss.get(depth1).getZoneId());
				putBodyParameter("Subnets." + (depth1 + 1) + ".Cidr" , subnetss.get(depth1).getCidr());
				putBodyParameter("Subnets." + (depth1 + 1) + ".Type" , subnetss.get(depth1).getType());
			}
		}	
	}

	public static class Subnets {

		private String regionId;

		private String name;

		private String zoneId;

		private String cidr;

		private String type;

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getZoneId() {
			return this.zoneId;
		}

		public void setZoneId(String zoneId) {
			this.zoneId = zoneId;
		}

		public String getCidr() {
			return this.cidr;
		}

		public void setCidr(String cidr) {
			this.cidr = cidr;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}
	}

	@Override
	public Class<CreateVpdResponse> getResponseClass() {
		return CreateVpdResponse.class;
	}

}
