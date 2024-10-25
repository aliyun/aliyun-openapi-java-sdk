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

import com.aliyuncs.AcsResponse;
import com.aliyuncs.vpc.transform.v20160428.ModifyVpnGatewayAttributeResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ModifyVpnGatewayAttributeResponse extends AcsResponse {

	private String vpcId;

	private String status;

	private String internetIp;

	private String spec;

	private Long createTime;

	private Boolean autoPropagate;

	private String vpnGatewayId;

	private String intranetIp;

	private Long endTime;

	private String vSwitchId;

	private String requestId;

	private String description;

	private Boolean enableBgp;

	private String businessStatus;

	private String name;

	private String disasterRecoveryInternetIp;

	private String disasterRecoveryVSwitchId;

	private String sslVpnInternetIp;

	private String resourceGroupId;

	public String getVpcId() {
		return this.vpcId;
	}

	public void setVpcId(String vpcId) {
		this.vpcId = vpcId;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getInternetIp() {
		return this.internetIp;
	}

	public void setInternetIp(String internetIp) {
		this.internetIp = internetIp;
	}

	public String getSpec() {
		return this.spec;
	}

	public void setSpec(String spec) {
		this.spec = spec;
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

	public String getIntranetIp() {
		return this.intranetIp;
	}

	public void setIntranetIp(String intranetIp) {
		this.intranetIp = intranetIp;
	}

	public Long getEndTime() {
		return this.endTime;
	}

	public void setEndTime(Long endTime) {
		this.endTime = endTime;
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

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Boolean getEnableBgp() {
		return this.enableBgp;
	}

	public void setEnableBgp(Boolean enableBgp) {
		this.enableBgp = enableBgp;
	}

	public String getBusinessStatus() {
		return this.businessStatus;
	}

	public void setBusinessStatus(String businessStatus) {
		this.businessStatus = businessStatus;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDisasterRecoveryInternetIp() {
		return this.disasterRecoveryInternetIp;
	}

	public void setDisasterRecoveryInternetIp(String disasterRecoveryInternetIp) {
		this.disasterRecoveryInternetIp = disasterRecoveryInternetIp;
	}

	public String getDisasterRecoveryVSwitchId() {
		return this.disasterRecoveryVSwitchId;
	}

	public void setDisasterRecoveryVSwitchId(String disasterRecoveryVSwitchId) {
		this.disasterRecoveryVSwitchId = disasterRecoveryVSwitchId;
	}

	public String getSslVpnInternetIp() {
		return this.sslVpnInternetIp;
	}

	public void setSslVpnInternetIp(String sslVpnInternetIp) {
		this.sslVpnInternetIp = sslVpnInternetIp;
	}

	public String getResourceGroupId() {
		return this.resourceGroupId;
	}

	public void setResourceGroupId(String resourceGroupId) {
		this.resourceGroupId = resourceGroupId;
	}

	@Override
	public ModifyVpnGatewayAttributeResponse getInstance(UnmarshallerContext context) {
		return	ModifyVpnGatewayAttributeResponseUnmarshaller.unmarshall(this, context);
	}
}
