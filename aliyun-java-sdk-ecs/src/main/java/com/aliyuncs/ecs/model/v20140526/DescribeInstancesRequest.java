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

package com.aliyuncs.ecs.model.v20140526;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ecs.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeInstancesRequest extends RpcAcsRequest<DescribeInstancesResponse> {
	   

	private String innerIpAddresses;

	private Long resourceOwnerId;

	private String privateIpAddresses;

	private String hpcClusterId;

	private Integer httpPutResponseHopLimit;

	private String filter2Value;

	private String keyPairName;

	private String resourceGroupId;

	private String lockReason;

	private String filter1Key;

	private Boolean deviceAvailable;

	private List<Tag> tags;

	private String filter3Value;

	private Boolean dryRun;

	private String filter1Value;

	private Boolean needSaleCycle;

	private Long ownerId;

	private String vSwitchId;

	private List<String> additionalAttributess;

	private String instanceName;

	private String instanceIds;

	private String internetChargeType;

	private String zoneId;

	private Integer maxResults;

	private List<String> ipv6Addresss;

	private String instanceNetworkType;

	private String status;

	private String imageId;

	private String filter4Value;

	private Boolean ioOptimized;

	private String securityGroupId;

	private String filter4Key;

	private Integer pageNumber;

	private String nextToken;

	private String rdmaIpAddresses;

	private String httpEndpoint;

	private Integer pageSize;

	private String publicIpAddresses;

	private String instanceType;

	private String instanceChargeType;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private String instanceTypeFamily;

	private String filter2Key;

	private String eipAddresses;

	private String vpcId;

	private String httpTokens;

	private String filter3Key;
	public DescribeInstancesRequest() {
		super("Ecs", "2014-05-26", "DescribeInstances", "ecs");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getInnerIpAddresses() {
		return this.innerIpAddresses;
	}

	public void setInnerIpAddresses(String innerIpAddresses) {
		this.innerIpAddresses = innerIpAddresses;
		if(innerIpAddresses != null){
			putQueryParameter("InnerIpAddresses", innerIpAddresses);
		}
	}

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public String getPrivateIpAddresses() {
		return this.privateIpAddresses;
	}

	public void setPrivateIpAddresses(String privateIpAddresses) {
		this.privateIpAddresses = privateIpAddresses;
		if(privateIpAddresses != null){
			putQueryParameter("PrivateIpAddresses", privateIpAddresses);
		}
	}

	public String getHpcClusterId() {
		return this.hpcClusterId;
	}

	public void setHpcClusterId(String hpcClusterId) {
		this.hpcClusterId = hpcClusterId;
		if(hpcClusterId != null){
			putQueryParameter("HpcClusterId", hpcClusterId);
		}
	}

	public Integer getHttpPutResponseHopLimit() {
		return this.httpPutResponseHopLimit;
	}

	public void setHttpPutResponseHopLimit(Integer httpPutResponseHopLimit) {
		this.httpPutResponseHopLimit = httpPutResponseHopLimit;
		if(httpPutResponseHopLimit != null){
			putQueryParameter("HttpPutResponseHopLimit", httpPutResponseHopLimit.toString());
		}
	}

	public String getFilter2Value() {
		return this.filter2Value;
	}

	public void setFilter2Value(String filter2Value) {
		this.filter2Value = filter2Value;
		if(filter2Value != null){
			putQueryParameter("Filter.2.Value", filter2Value);
		}
	}

	public String getKeyPairName() {
		return this.keyPairName;
	}

	public void setKeyPairName(String keyPairName) {
		this.keyPairName = keyPairName;
		if(keyPairName != null){
			putQueryParameter("KeyPairName", keyPairName);
		}
	}

	public String getResourceGroupId() {
		return this.resourceGroupId;
	}

	public void setResourceGroupId(String resourceGroupId) {
		this.resourceGroupId = resourceGroupId;
		if(resourceGroupId != null){
			putQueryParameter("ResourceGroupId", resourceGroupId);
		}
	}

	public String getLockReason() {
		return this.lockReason;
	}

	public void setLockReason(String lockReason) {
		this.lockReason = lockReason;
		if(lockReason != null){
			putQueryParameter("LockReason", lockReason);
		}
	}

	public String getFilter1Key() {
		return this.filter1Key;
	}

	public void setFilter1Key(String filter1Key) {
		this.filter1Key = filter1Key;
		if(filter1Key != null){
			putQueryParameter("Filter.1.Key", filter1Key);
		}
	}

	public Boolean getDeviceAvailable() {
		return this.deviceAvailable;
	}

	public void setDeviceAvailable(Boolean deviceAvailable) {
		this.deviceAvailable = deviceAvailable;
		if(deviceAvailable != null){
			putQueryParameter("DeviceAvailable", deviceAvailable.toString());
		}
	}

	public List<Tag> getTags() {
		return this.tags;
	}

	public void setTags(List<Tag> tags) {
		this.tags = tags;	
		if (tags != null) {
			for (int depth1 = 0; depth1 < tags.size(); depth1++) {
				putQueryParameter("Tag." + (depth1 + 1) + ".value" , tags.get(depth1).getValue());
				putQueryParameter("Tag." + (depth1 + 1) + ".Key" , tags.get(depth1).getKey());
			}
		}	
	}

	public String getFilter3Value() {
		return this.filter3Value;
	}

	public void setFilter3Value(String filter3Value) {
		this.filter3Value = filter3Value;
		if(filter3Value != null){
			putQueryParameter("Filter.3.Value", filter3Value);
		}
	}

	public Boolean getDryRun() {
		return this.dryRun;
	}

	public void setDryRun(Boolean dryRun) {
		this.dryRun = dryRun;
		if(dryRun != null){
			putQueryParameter("DryRun", dryRun.toString());
		}
	}

	public String getFilter1Value() {
		return this.filter1Value;
	}

	public void setFilter1Value(String filter1Value) {
		this.filter1Value = filter1Value;
		if(filter1Value != null){
			putQueryParameter("Filter.1.Value", filter1Value);
		}
	}

	public Boolean getNeedSaleCycle() {
		return this.needSaleCycle;
	}

	public void setNeedSaleCycle(Boolean needSaleCycle) {
		this.needSaleCycle = needSaleCycle;
		if(needSaleCycle != null){
			putQueryParameter("NeedSaleCycle", needSaleCycle.toString());
		}
	}

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	public String getVSwitchId() {
		return this.vSwitchId;
	}

	public void setVSwitchId(String vSwitchId) {
		this.vSwitchId = vSwitchId;
		if(vSwitchId != null){
			putQueryParameter("VSwitchId", vSwitchId);
		}
	}

	public List<String> getAdditionalAttributess() {
		return this.additionalAttributess;
	}

	public void setAdditionalAttributess(List<String> additionalAttributess) {
		this.additionalAttributess = additionalAttributess;	
		if (additionalAttributess != null) {
			for (int i = 0; i < additionalAttributess.size(); i++) {
				putQueryParameter("AdditionalAttributes." + (i + 1) , additionalAttributess.get(i));
			}
		}	
	}

	public String getInstanceName() {
		return this.instanceName;
	}

	public void setInstanceName(String instanceName) {
		this.instanceName = instanceName;
		if(instanceName != null){
			putQueryParameter("InstanceName", instanceName);
		}
	}

	public String getInstanceIds() {
		return this.instanceIds;
	}

	public void setInstanceIds(String instanceIds) {
		this.instanceIds = instanceIds;
		if(instanceIds != null){
			putQueryParameter("InstanceIds", instanceIds);
		}
	}

	public String getInternetChargeType() {
		return this.internetChargeType;
	}

	public void setInternetChargeType(String internetChargeType) {
		this.internetChargeType = internetChargeType;
		if(internetChargeType != null){
			putQueryParameter("InternetChargeType", internetChargeType);
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

	public Integer getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(Integer maxResults) {
		this.maxResults = maxResults;
		if(maxResults != null){
			putQueryParameter("MaxResults", maxResults.toString());
		}
	}

	public List<String> getIpv6Addresss() {
		return this.ipv6Addresss;
	}

	public void setIpv6Addresss(List<String> ipv6Addresss) {
		this.ipv6Addresss = ipv6Addresss;	
		if (ipv6Addresss != null) {
			for (int i = 0; i < ipv6Addresss.size(); i++) {
				putQueryParameter("Ipv6Address." + (i + 1) , ipv6Addresss.get(i));
			}
		}	
	}

	public String getInstanceNetworkType() {
		return this.instanceNetworkType;
	}

	public void setInstanceNetworkType(String instanceNetworkType) {
		this.instanceNetworkType = instanceNetworkType;
		if(instanceNetworkType != null){
			putQueryParameter("InstanceNetworkType", instanceNetworkType);
		}
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
		if(status != null){
			putQueryParameter("Status", status);
		}
	}

	public String getImageId() {
		return this.imageId;
	}

	public void setImageId(String imageId) {
		this.imageId = imageId;
		if(imageId != null){
			putQueryParameter("ImageId", imageId);
		}
	}

	public String getFilter4Value() {
		return this.filter4Value;
	}

	public void setFilter4Value(String filter4Value) {
		this.filter4Value = filter4Value;
		if(filter4Value != null){
			putQueryParameter("Filter.4.Value", filter4Value);
		}
	}

	public Boolean getIoOptimized() {
		return this.ioOptimized;
	}

	public void setIoOptimized(Boolean ioOptimized) {
		this.ioOptimized = ioOptimized;
		if(ioOptimized != null){
			putQueryParameter("IoOptimized", ioOptimized.toString());
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

	public String getFilter4Key() {
		return this.filter4Key;
	}

	public void setFilter4Key(String filter4Key) {
		this.filter4Key = filter4Key;
		if(filter4Key != null){
			putQueryParameter("Filter.4.Key", filter4Key);
		}
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
		if(pageNumber != null){
			putQueryParameter("PageNumber", pageNumber.toString());
		}
	}

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
		if(nextToken != null){
			putQueryParameter("NextToken", nextToken);
		}
	}

	public String getRdmaIpAddresses() {
		return this.rdmaIpAddresses;
	}

	public void setRdmaIpAddresses(String rdmaIpAddresses) {
		this.rdmaIpAddresses = rdmaIpAddresses;
		if(rdmaIpAddresses != null){
			putQueryParameter("RdmaIpAddresses", rdmaIpAddresses);
		}
	}

	public String getHttpEndpoint() {
		return this.httpEndpoint;
	}

	public void setHttpEndpoint(String httpEndpoint) {
		this.httpEndpoint = httpEndpoint;
		if(httpEndpoint != null){
			putQueryParameter("HttpEndpoint", httpEndpoint);
		}
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize.toString());
		}
	}

	public String getPublicIpAddresses() {
		return this.publicIpAddresses;
	}

	public void setPublicIpAddresses(String publicIpAddresses) {
		this.publicIpAddresses = publicIpAddresses;
		if(publicIpAddresses != null){
			putQueryParameter("PublicIpAddresses", publicIpAddresses);
		}
	}

	public String getInstanceType() {
		return this.instanceType;
	}

	public void setInstanceType(String instanceType) {
		this.instanceType = instanceType;
		if(instanceType != null){
			putQueryParameter("InstanceType", instanceType);
		}
	}

	public String getInstanceChargeType() {
		return this.instanceChargeType;
	}

	public void setInstanceChargeType(String instanceChargeType) {
		this.instanceChargeType = instanceChargeType;
		if(instanceChargeType != null){
			putQueryParameter("InstanceChargeType", instanceChargeType);
		}
	}

	public String getResourceOwnerAccount() {
		return this.resourceOwnerAccount;
	}

	public void setResourceOwnerAccount(String resourceOwnerAccount) {
		this.resourceOwnerAccount = resourceOwnerAccount;
		if(resourceOwnerAccount != null){
			putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
		}
	}

	public String getOwnerAccount() {
		return this.ownerAccount;
	}

	public void setOwnerAccount(String ownerAccount) {
		this.ownerAccount = ownerAccount;
		if(ownerAccount != null){
			putQueryParameter("OwnerAccount", ownerAccount);
		}
	}

	public String getInstanceTypeFamily() {
		return this.instanceTypeFamily;
	}

	public void setInstanceTypeFamily(String instanceTypeFamily) {
		this.instanceTypeFamily = instanceTypeFamily;
		if(instanceTypeFamily != null){
			putQueryParameter("InstanceTypeFamily", instanceTypeFamily);
		}
	}

	public String getFilter2Key() {
		return this.filter2Key;
	}

	public void setFilter2Key(String filter2Key) {
		this.filter2Key = filter2Key;
		if(filter2Key != null){
			putQueryParameter("Filter.2.Key", filter2Key);
		}
	}

	public String getEipAddresses() {
		return this.eipAddresses;
	}

	public void setEipAddresses(String eipAddresses) {
		this.eipAddresses = eipAddresses;
		if(eipAddresses != null){
			putQueryParameter("EipAddresses", eipAddresses);
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

	public String getHttpTokens() {
		return this.httpTokens;
	}

	public void setHttpTokens(String httpTokens) {
		this.httpTokens = httpTokens;
		if(httpTokens != null){
			putQueryParameter("HttpTokens", httpTokens);
		}
	}

	public String getFilter3Key() {
		return this.filter3Key;
	}

	public void setFilter3Key(String filter3Key) {
		this.filter3Key = filter3Key;
		if(filter3Key != null){
			putQueryParameter("Filter.3.Key", filter3Key);
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
	public Class<DescribeInstancesResponse> getResponseClass() {
		return DescribeInstancesResponse.class;
	}

}
