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
public class CreateVccRequest extends RpcAcsRequest<CreateVccResponse> {
	   

	private String bgpCidr;

	private String cenId;

	private String description;

	private String cenOwnerId;

	private Long bgpAsn;

	private Boolean accessCouldService;

	private String resourceGroupId;

	private String vccName;

	private List<Tag> tags;

	private String vccId;

	private String connectionType;

	private Integer bandwidth;

	private String vSwitchId;

	private String vpdId;

	private String vpcId;

	private String zoneId;
	public CreateVccRequest() {
		super("eflo", "2022-05-30", "CreateVcc", "eflo");
		setMethod(MethodType.POST);
	}

	public String getBgpCidr() {
		return this.bgpCidr;
	}

	public void setBgpCidr(String bgpCidr) {
		this.bgpCidr = bgpCidr;
		if(bgpCidr != null){
			putBodyParameter("BgpCidr", bgpCidr);
		}
	}

	public String getCenId() {
		return this.cenId;
	}

	public void setCenId(String cenId) {
		this.cenId = cenId;
		if(cenId != null){
			putBodyParameter("CenId", cenId);
		}
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putBodyParameter("Description", description);
		}
	}

	public String getCenOwnerId() {
		return this.cenOwnerId;
	}

	public void setCenOwnerId(String cenOwnerId) {
		this.cenOwnerId = cenOwnerId;
		if(cenOwnerId != null){
			putBodyParameter("CenOwnerId", cenOwnerId);
		}
	}

	public Long getBgpAsn() {
		return this.bgpAsn;
	}

	public void setBgpAsn(Long bgpAsn) {
		this.bgpAsn = bgpAsn;
		if(bgpAsn != null){
			putBodyParameter("BgpAsn", bgpAsn.toString());
		}
	}

	public Boolean getAccessCouldService() {
		return this.accessCouldService;
	}

	public void setAccessCouldService(Boolean accessCouldService) {
		this.accessCouldService = accessCouldService;
		if(accessCouldService != null){
			putBodyParameter("AccessCouldService", accessCouldService.toString());
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

	public String getVccName() {
		return this.vccName;
	}

	public void setVccName(String vccName) {
		this.vccName = vccName;
		if(vccName != null){
			putBodyParameter("VccName", vccName);
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

	public String getVccId() {
		return this.vccId;
	}

	public void setVccId(String vccId) {
		this.vccId = vccId;
		if(vccId != null){
			putBodyParameter("VccId", vccId);
		}
	}

	public String getConnectionType() {
		return this.connectionType;
	}

	public void setConnectionType(String connectionType) {
		this.connectionType = connectionType;
		if(connectionType != null){
			putBodyParameter("ConnectionType", connectionType);
		}
	}

	public Integer getBandwidth() {
		return this.bandwidth;
	}

	public void setBandwidth(Integer bandwidth) {
		this.bandwidth = bandwidth;
		if(bandwidth != null){
			putBodyParameter("Bandwidth", bandwidth.toString());
		}
	}

	public String getVSwitchId() {
		return this.vSwitchId;
	}

	public void setVSwitchId(String vSwitchId) {
		this.vSwitchId = vSwitchId;
		if(vSwitchId != null){
			putBodyParameter("VSwitchId", vSwitchId);
		}
	}

	public String getVpdId() {
		return this.vpdId;
	}

	public void setVpdId(String vpdId) {
		this.vpdId = vpdId;
		if(vpdId != null){
			putBodyParameter("VpdId", vpdId);
		}
	}

	public String getVpcId() {
		return this.vpcId;
	}

	public void setVpcId(String vpcId) {
		this.vpcId = vpcId;
		if(vpcId != null){
			putBodyParameter("VpcId", vpcId);
		}
	}

	public String getZoneId() {
		return this.zoneId;
	}

	public void setZoneId(String zoneId) {
		this.zoneId = zoneId;
		if(zoneId != null){
			putBodyParameter("ZoneId", zoneId);
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
	public Class<CreateVccResponse> getResponseClass() {
		return CreateVccResponse.class;
	}

}
