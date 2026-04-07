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

package com.aliyuncs.vpc.model.v20160428;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.vpc.transform.v20160428.UpdateEnhancedVpnGatewayResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class UpdateEnhancedVpnGatewayResponse extends AcsResponse {

	private String vpnType;

	private String status;

	private String vpcId;

	private Long createTime;

	private Boolean autoPropagate;

	private String vpnGatewayId;

	private String tag;

	private String vSwitchId;

	private String requestId;

	private Boolean enableBgp;

	private String name;

	private String description;

	private String networkType;

	private String disasterRecoveryVSwitchId;

	private String resourceGroupId;

	private String gatewayType;

	private List<Tag> tags;

	private List<String> eniInstanceIds;

	public String getVpnType() {
		return this.vpnType;
	}

	public void setVpnType(String vpnType) {
		this.vpnType = vpnType;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getVpcId() {
		return this.vpcId;
	}

	public void setVpcId(String vpcId) {
		this.vpcId = vpcId;
	}

	public Long getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Long createTime) {
		this.createTime = createTime;
	}

	public Boolean getAutoPropagate() {
		return this.autoPropagate;
	}

	public void setAutoPropagate(Boolean autoPropagate) {
		this.autoPropagate = autoPropagate;
	}

	public String getVpnGatewayId() {
		return this.vpnGatewayId;
	}

	public void setVpnGatewayId(String vpnGatewayId) {
		this.vpnGatewayId = vpnGatewayId;
	}

	public String getTag() {
		return this.tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	public String getVSwitchId() {
		return this.vSwitchId;
	}

	public void setVSwitchId(String vSwitchId) {
		this.vSwitchId = vSwitchId;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getEnableBgp() {
		return this.enableBgp;
	}

	public void setEnableBgp(Boolean enableBgp) {
		this.enableBgp = enableBgp;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getNetworkType() {
		return this.networkType;
	}

	public void setNetworkType(String networkType) {
		this.networkType = networkType;
	}

	public String getDisasterRecoveryVSwitchId() {
		return this.disasterRecoveryVSwitchId;
	}

	public void setDisasterRecoveryVSwitchId(String disasterRecoveryVSwitchId) {
		this.disasterRecoveryVSwitchId = disasterRecoveryVSwitchId;
	}

	public String getResourceGroupId() {
		return this.resourceGroupId;
	}

	public void setResourceGroupId(String resourceGroupId) {
		this.resourceGroupId = resourceGroupId;
	}

	public String getGatewayType() {
		return this.gatewayType;
	}

	public void setGatewayType(String gatewayType) {
		this.gatewayType = gatewayType;
	}

	public List<Tag> getTags() {
		return this.tags;
	}

	public void setTags(List<Tag> tags) {
		this.tags = tags;
	}

	public List<String> getEniInstanceIds() {
		return this.eniInstanceIds;
	}

	public void setEniInstanceIds(List<String> eniInstanceIds) {
		this.eniInstanceIds = eniInstanceIds;
	}

	public static class Tag {

		private String key;

		private String value;

		public String getKey() {
			return this.key;
		}

		public void setKey(String key) {
			this.key = key;
		}

		public String getValue() {
			return this.value;
		}

		public void setValue(String value) {
			this.value = value;
		}
	}

	@Override
	public UpdateEnhancedVpnGatewayResponse getInstance(UnmarshallerContext context) {
		return	UpdateEnhancedVpnGatewayResponseUnmarshaller.unmarshall(this, context);
	}
}
