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

package com.aliyuncs.ens.model.v20171110;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ens.transform.v20171110.DescribeNetworkAttributeResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeNetworkAttributeResponse extends AcsResponse {

	private String requestId;

	private String ensRegionId;

	private String networkId;

	private String networkName;

	private String cidrBlock;

	private String status;

	private String description;

	private String createdTime;

	private String routerTableId;

	private String networkAclId;

	private String routeTableId;

	private String gatewayRouteTableId;

	private List<CloudResourceSetType> cloudResources;

	private List<String> vSwitchIds;

	private List<String> instanceIds;

	private List<String> routeTableIds;

	private List<String> networkInterfaceIds;

	private List<String> loadBalancerIds;

	private List<String> natGatewayIds;

	private List<String> haVipIds;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getEnsRegionId() {
		return this.ensRegionId;
	}

	public void setEnsRegionId(String ensRegionId) {
		this.ensRegionId = ensRegionId;
	}

	public String getNetworkId() {
		return this.networkId;
	}

	public void setNetworkId(String networkId) {
		this.networkId = networkId;
	}

	public String getNetworkName() {
		return this.networkName;
	}

	public void setNetworkName(String networkName) {
		this.networkName = networkName;
	}

	public String getCidrBlock() {
		return this.cidrBlock;
	}

	public void setCidrBlock(String cidrBlock) {
		this.cidrBlock = cidrBlock;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCreatedTime() {
		return this.createdTime;
	}

	public void setCreatedTime(String createdTime) {
		this.createdTime = createdTime;
	}

	public String getRouterTableId() {
		return this.routerTableId;
	}

	public void setRouterTableId(String routerTableId) {
		this.routerTableId = routerTableId;
	}

	public String getNetworkAclId() {
		return this.networkAclId;
	}

	public void setNetworkAclId(String networkAclId) {
		this.networkAclId = networkAclId;
	}

	public String getRouteTableId() {
		return this.routeTableId;
	}

	public void setRouteTableId(String routeTableId) {
		this.routeTableId = routeTableId;
	}

	public String getGatewayRouteTableId() {
		return this.gatewayRouteTableId;
	}

	public void setGatewayRouteTableId(String gatewayRouteTableId) {
		this.gatewayRouteTableId = gatewayRouteTableId;
	}

	public List<CloudResourceSetType> getCloudResources() {
		return this.cloudResources;
	}

	public void setCloudResources(List<CloudResourceSetType> cloudResources) {
		this.cloudResources = cloudResources;
	}

	public List<String> getVSwitchIds() {
		return this.vSwitchIds;
	}

	public void setVSwitchIds(List<String> vSwitchIds) {
		this.vSwitchIds = vSwitchIds;
	}

	public List<String> getInstanceIds() {
		return this.instanceIds;
	}

	public void setInstanceIds(List<String> instanceIds) {
		this.instanceIds = instanceIds;
	}

	public List<String> getRouteTableIds() {
		return this.routeTableIds;
	}

	public void setRouteTableIds(List<String> routeTableIds) {
		this.routeTableIds = routeTableIds;
	}

	public List<String> getNetworkInterfaceIds() {
		return this.networkInterfaceIds;
	}

	public void setNetworkInterfaceIds(List<String> networkInterfaceIds) {
		this.networkInterfaceIds = networkInterfaceIds;
	}

	public List<String> getLoadBalancerIds() {
		return this.loadBalancerIds;
	}

	public void setLoadBalancerIds(List<String> loadBalancerIds) {
		this.loadBalancerIds = loadBalancerIds;
	}

	public List<String> getNatGatewayIds() {
		return this.natGatewayIds;
	}

	public void setNatGatewayIds(List<String> natGatewayIds) {
		this.natGatewayIds = natGatewayIds;
	}

	public List<String> getHaVipIds() {
		return this.haVipIds;
	}

	public void setHaVipIds(List<String> haVipIds) {
		this.haVipIds = haVipIds;
	}

	public static class CloudResourceSetType {

		private Integer resourceCount;

		private String resourceType;

		public Integer getResourceCount() {
			return this.resourceCount;
		}

		public void setResourceCount(Integer resourceCount) {
			this.resourceCount = resourceCount;
		}

		public String getResourceType() {
			return this.resourceType;
		}

		public void setResourceType(String resourceType) {
			this.resourceType = resourceType;
		}
	}

	@Override
	public DescribeNetworkAttributeResponse getInstance(UnmarshallerContext context) {
		return	DescribeNetworkAttributeResponseUnmarshaller.unmarshall(this, context);
	}
}
