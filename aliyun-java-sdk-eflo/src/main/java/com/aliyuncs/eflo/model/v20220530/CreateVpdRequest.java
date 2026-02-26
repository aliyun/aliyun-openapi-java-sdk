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
	   

	private String vpdName;

	private String resourceGroupId;

	private String cidr;

	private List<Subnets> subnetss;

	private List<Tag> tags;
	public CreateVpdRequest() {
		super("eflo", "2022-05-30", "CreateVpd", "eflo");
		setMethod(MethodType.POST);
	}

	public String getVpdName() {
		return this.vpdName;
	}

	public void setVpdName(String vpdName) {
		this.vpdName = vpdName;
		if(vpdName != null){
			putBodyParameter("VpdName", vpdName);
		}
	}

	public String getResourceGroupId() {
		return this.resourceGroupId;
	}

	public void setResourceGroupId(String resourceGroupId) {
		this.resourceGroupId = resourceGroupId;
		if(resourceGroupId != null){
			putBodyParameter("ResourceGroupId", resourceGroupId);
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
				putBodyParameter("Subnets." + (depth1 + 1) + ".ZoneId" , subnetss.get(depth1).getZoneId());
				putBodyParameter("Subnets." + (depth1 + 1) + ".Cidr" , subnetss.get(depth1).getCidr());
				putBodyParameter("Subnets." + (depth1 + 1) + ".SubnetName" , subnetss.get(depth1).getSubnetName());
				putBodyParameter("Subnets." + (depth1 + 1) + ".Type" , subnetss.get(depth1).getType());
			}
		}	
	}

	public List<Tag> getTags() {
		return this.tags;
	}

	public void setTags(List<Tag> tags) {
		this.tags = tags;	
		if (tags != null) {
			for (int depth1 = 0; depth1 < tags.size(); depth1++) {
				putBodyParameter("Tag." + (depth1 + 1) + ".Value" , tags.get(depth1).getValue());
				putBodyParameter("Tag." + (depth1 + 1) + ".Key" , tags.get(depth1).getKey());
			}
		}	
	}

	public static class Subnets {

		private String regionId;

		private String zoneId;

		private String cidr;

		private String subnetName;

		private String type;

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
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

		public String getSubnetName() {
			return this.subnetName;
		}

		public void setSubnetName(String subnetName) {
			this.subnetName = subnetName;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}
	}

	public static class Tag {

		private String value;

		private String key;

		public String getValue() {
			return this.value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		public String getKey() {
			return this.key;
		}

		public void setKey(String key) {
			this.key = key;
		}
	}

	@Override
	public Class<CreateVpdResponse> getResponseClass() {
		return CreateVpdResponse.class;
	}

}
