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
public class DescribeInstanceTypesRequest extends RpcAcsRequest<DescribeInstanceTypesResponse> {
	   

	private String gPUSpec;

	private Long resourceOwnerId;

	private Integer maximumCpuCoreCount;

	private Integer maximumGPUAmount;

	private String localStorageCategory;

	private Float maximumMemorySize;

	private String instanceCategory;

	private Long minimumInstancePpsTx;

	private Integer minimumCpuCoreCount;

	private Integer minimumPrimaryEniQueueNumber;

	private Integer minimumBaselineCredit;

	private Integer minimumSecondaryEniQueueNumber;

	private Integer minimumInstanceBandwidthTx;

	private Integer minimumGPUAmount;

	private Float maximumCpuSpeedFrequency;

	private String cpuArchitecture;

	private Long ownerId;

	private Float minimumMemorySize;

	private Integer minimumEniQuantity;

	private String instanceFamilyLevel;

	private Integer minimumQueuePairNumber;

	private Integer minimumLocalStorageAmount;

	private Long maxResults;

	private String physicalProcessorModel;

	private Float maximumCpuTurboFrequency;

	private List<String> instanceTypess;

	private Long minimumInstancePpsRx;

	private Integer minimumEniIpv6AddressQuantity;

	private Integer minimumEriQuantity;

	private Integer minimumDiskQuantity;

	private Float minimumCpuTurboFrequency;

	private String nextToken;

	private Integer minimumInstanceBandwidthRx;

	private Float minimumCpuSpeedFrequency;

	private String nvmeSupport;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private Integer minimumInitialCredit;

	private String instanceTypeFamily;

	private Integer minimumEniPrivateIpAddressQuantity;

	private Long minimumLocalStorageCapacity;
	public DescribeInstanceTypesRequest() {
		super("Ecs", "2014-05-26", "DescribeInstanceTypes", "ecs");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getGPUSpec() {
		return this.gPUSpec;
	}

	public void setGPUSpec(String gPUSpec) {
		this.gPUSpec = gPUSpec;
		if(gPUSpec != null){
			putQueryParameter("GPUSpec", gPUSpec);
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

	public Integer getMaximumCpuCoreCount() {
		return this.maximumCpuCoreCount;
	}

	public void setMaximumCpuCoreCount(Integer maximumCpuCoreCount) {
		this.maximumCpuCoreCount = maximumCpuCoreCount;
		if(maximumCpuCoreCount != null){
			putQueryParameter("MaximumCpuCoreCount", maximumCpuCoreCount.toString());
		}
	}

	public Integer getMaximumGPUAmount() {
		return this.maximumGPUAmount;
	}

	public void setMaximumGPUAmount(Integer maximumGPUAmount) {
		this.maximumGPUAmount = maximumGPUAmount;
		if(maximumGPUAmount != null){
			putQueryParameter("MaximumGPUAmount", maximumGPUAmount.toString());
		}
	}

	public String getLocalStorageCategory() {
		return this.localStorageCategory;
	}

	public void setLocalStorageCategory(String localStorageCategory) {
		this.localStorageCategory = localStorageCategory;
		if(localStorageCategory != null){
			putQueryParameter("LocalStorageCategory", localStorageCategory);
		}
	}

	public Float getMaximumMemorySize() {
		return this.maximumMemorySize;
	}

	public void setMaximumMemorySize(Float maximumMemorySize) {
		this.maximumMemorySize = maximumMemorySize;
		if(maximumMemorySize != null){
			putQueryParameter("MaximumMemorySize", maximumMemorySize.toString());
		}
	}

	public String getInstanceCategory() {
		return this.instanceCategory;
	}

	public void setInstanceCategory(String instanceCategory) {
		this.instanceCategory = instanceCategory;
		if(instanceCategory != null){
			putQueryParameter("InstanceCategory", instanceCategory);
		}
	}

	public Long getMinimumInstancePpsTx() {
		return this.minimumInstancePpsTx;
	}

	public void setMinimumInstancePpsTx(Long minimumInstancePpsTx) {
		this.minimumInstancePpsTx = minimumInstancePpsTx;
		if(minimumInstancePpsTx != null){
			putQueryParameter("MinimumInstancePpsTx", minimumInstancePpsTx.toString());
		}
	}

	public Integer getMinimumCpuCoreCount() {
		return this.minimumCpuCoreCount;
	}

	public void setMinimumCpuCoreCount(Integer minimumCpuCoreCount) {
		this.minimumCpuCoreCount = minimumCpuCoreCount;
		if(minimumCpuCoreCount != null){
			putQueryParameter("MinimumCpuCoreCount", minimumCpuCoreCount.toString());
		}
	}

	public Integer getMinimumPrimaryEniQueueNumber() {
		return this.minimumPrimaryEniQueueNumber;
	}

	public void setMinimumPrimaryEniQueueNumber(Integer minimumPrimaryEniQueueNumber) {
		this.minimumPrimaryEniQueueNumber = minimumPrimaryEniQueueNumber;
		if(minimumPrimaryEniQueueNumber != null){
			putQueryParameter("MinimumPrimaryEniQueueNumber", minimumPrimaryEniQueueNumber.toString());
		}
	}

	public Integer getMinimumBaselineCredit() {
		return this.minimumBaselineCredit;
	}

	public void setMinimumBaselineCredit(Integer minimumBaselineCredit) {
		this.minimumBaselineCredit = minimumBaselineCredit;
		if(minimumBaselineCredit != null){
			putQueryParameter("MinimumBaselineCredit", minimumBaselineCredit.toString());
		}
	}

	public Integer getMinimumSecondaryEniQueueNumber() {
		return this.minimumSecondaryEniQueueNumber;
	}

	public void setMinimumSecondaryEniQueueNumber(Integer minimumSecondaryEniQueueNumber) {
		this.minimumSecondaryEniQueueNumber = minimumSecondaryEniQueueNumber;
		if(minimumSecondaryEniQueueNumber != null){
			putQueryParameter("MinimumSecondaryEniQueueNumber", minimumSecondaryEniQueueNumber.toString());
		}
	}

	public Integer getMinimumInstanceBandwidthTx() {
		return this.minimumInstanceBandwidthTx;
	}

	public void setMinimumInstanceBandwidthTx(Integer minimumInstanceBandwidthTx) {
		this.minimumInstanceBandwidthTx = minimumInstanceBandwidthTx;
		if(minimumInstanceBandwidthTx != null){
			putQueryParameter("MinimumInstanceBandwidthTx", minimumInstanceBandwidthTx.toString());
		}
	}

	public Integer getMinimumGPUAmount() {
		return this.minimumGPUAmount;
	}

	public void setMinimumGPUAmount(Integer minimumGPUAmount) {
		this.minimumGPUAmount = minimumGPUAmount;
		if(minimumGPUAmount != null){
			putQueryParameter("MinimumGPUAmount", minimumGPUAmount.toString());
		}
	}

	public Float getMaximumCpuSpeedFrequency() {
		return this.maximumCpuSpeedFrequency;
	}

	public void setMaximumCpuSpeedFrequency(Float maximumCpuSpeedFrequency) {
		this.maximumCpuSpeedFrequency = maximumCpuSpeedFrequency;
		if(maximumCpuSpeedFrequency != null){
			putQueryParameter("MaximumCpuSpeedFrequency", maximumCpuSpeedFrequency.toString());
		}
	}

	public String getCpuArchitecture() {
		return this.cpuArchitecture;
	}

	public void setCpuArchitecture(String cpuArchitecture) {
		this.cpuArchitecture = cpuArchitecture;
		if(cpuArchitecture != null){
			putQueryParameter("CpuArchitecture", cpuArchitecture);
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

	public Float getMinimumMemorySize() {
		return this.minimumMemorySize;
	}

	public void setMinimumMemorySize(Float minimumMemorySize) {
		this.minimumMemorySize = minimumMemorySize;
		if(minimumMemorySize != null){
			putQueryParameter("MinimumMemorySize", minimumMemorySize.toString());
		}
	}

	public Integer getMinimumEniQuantity() {
		return this.minimumEniQuantity;
	}

	public void setMinimumEniQuantity(Integer minimumEniQuantity) {
		this.minimumEniQuantity = minimumEniQuantity;
		if(minimumEniQuantity != null){
			putQueryParameter("MinimumEniQuantity", minimumEniQuantity.toString());
		}
	}

	public String getInstanceFamilyLevel() {
		return this.instanceFamilyLevel;
	}

	public void setInstanceFamilyLevel(String instanceFamilyLevel) {
		this.instanceFamilyLevel = instanceFamilyLevel;
		if(instanceFamilyLevel != null){
			putQueryParameter("InstanceFamilyLevel", instanceFamilyLevel);
		}
	}

	public Integer getMinimumQueuePairNumber() {
		return this.minimumQueuePairNumber;
	}

	public void setMinimumQueuePairNumber(Integer minimumQueuePairNumber) {
		this.minimumQueuePairNumber = minimumQueuePairNumber;
		if(minimumQueuePairNumber != null){
			putQueryParameter("MinimumQueuePairNumber", minimumQueuePairNumber.toString());
		}
	}

	public Integer getMinimumLocalStorageAmount() {
		return this.minimumLocalStorageAmount;
	}

	public void setMinimumLocalStorageAmount(Integer minimumLocalStorageAmount) {
		this.minimumLocalStorageAmount = minimumLocalStorageAmount;
		if(minimumLocalStorageAmount != null){
			putQueryParameter("MinimumLocalStorageAmount", minimumLocalStorageAmount.toString());
		}
	}

	public Long getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(Long maxResults) {
		this.maxResults = maxResults;
		if(maxResults != null){
			putQueryParameter("MaxResults", maxResults.toString());
		}
	}

	public String getPhysicalProcessorModel() {
		return this.physicalProcessorModel;
	}

	public void setPhysicalProcessorModel(String physicalProcessorModel) {
		this.physicalProcessorModel = physicalProcessorModel;
		if(physicalProcessorModel != null){
			putQueryParameter("PhysicalProcessorModel", physicalProcessorModel);
		}
	}

	public Float getMaximumCpuTurboFrequency() {
		return this.maximumCpuTurboFrequency;
	}

	public void setMaximumCpuTurboFrequency(Float maximumCpuTurboFrequency) {
		this.maximumCpuTurboFrequency = maximumCpuTurboFrequency;
		if(maximumCpuTurboFrequency != null){
			putQueryParameter("MaximumCpuTurboFrequency", maximumCpuTurboFrequency.toString());
		}
	}

	public List<String> getInstanceTypess() {
		return this.instanceTypess;
	}

	public void setInstanceTypess(List<String> instanceTypess) {
		this.instanceTypess = instanceTypess;	
		if (instanceTypess != null) {
			for (int i = 0; i < instanceTypess.size(); i++) {
				putQueryParameter("InstanceTypes." + (i + 1) , instanceTypess.get(i));
			}
		}	
	}

	public Long getMinimumInstancePpsRx() {
		return this.minimumInstancePpsRx;
	}

	public void setMinimumInstancePpsRx(Long minimumInstancePpsRx) {
		this.minimumInstancePpsRx = minimumInstancePpsRx;
		if(minimumInstancePpsRx != null){
			putQueryParameter("MinimumInstancePpsRx", minimumInstancePpsRx.toString());
		}
	}

	public Integer getMinimumEniIpv6AddressQuantity() {
		return this.minimumEniIpv6AddressQuantity;
	}

	public void setMinimumEniIpv6AddressQuantity(Integer minimumEniIpv6AddressQuantity) {
		this.minimumEniIpv6AddressQuantity = minimumEniIpv6AddressQuantity;
		if(minimumEniIpv6AddressQuantity != null){
			putQueryParameter("MinimumEniIpv6AddressQuantity", minimumEniIpv6AddressQuantity.toString());
		}
	}

	public Integer getMinimumEriQuantity() {
		return this.minimumEriQuantity;
	}

	public void setMinimumEriQuantity(Integer minimumEriQuantity) {
		this.minimumEriQuantity = minimumEriQuantity;
		if(minimumEriQuantity != null){
			putQueryParameter("MinimumEriQuantity", minimumEriQuantity.toString());
		}
	}

	public Integer getMinimumDiskQuantity() {
		return this.minimumDiskQuantity;
	}

	public void setMinimumDiskQuantity(Integer minimumDiskQuantity) {
		this.minimumDiskQuantity = minimumDiskQuantity;
		if(minimumDiskQuantity != null){
			putQueryParameter("MinimumDiskQuantity", minimumDiskQuantity.toString());
		}
	}

	public Float getMinimumCpuTurboFrequency() {
		return this.minimumCpuTurboFrequency;
	}

	public void setMinimumCpuTurboFrequency(Float minimumCpuTurboFrequency) {
		this.minimumCpuTurboFrequency = minimumCpuTurboFrequency;
		if(minimumCpuTurboFrequency != null){
			putQueryParameter("MinimumCpuTurboFrequency", minimumCpuTurboFrequency.toString());
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

	public Integer getMinimumInstanceBandwidthRx() {
		return this.minimumInstanceBandwidthRx;
	}

	public void setMinimumInstanceBandwidthRx(Integer minimumInstanceBandwidthRx) {
		this.minimumInstanceBandwidthRx = minimumInstanceBandwidthRx;
		if(minimumInstanceBandwidthRx != null){
			putQueryParameter("MinimumInstanceBandwidthRx", minimumInstanceBandwidthRx.toString());
		}
	}

	public Float getMinimumCpuSpeedFrequency() {
		return this.minimumCpuSpeedFrequency;
	}

	public void setMinimumCpuSpeedFrequency(Float minimumCpuSpeedFrequency) {
		this.minimumCpuSpeedFrequency = minimumCpuSpeedFrequency;
		if(minimumCpuSpeedFrequency != null){
			putQueryParameter("MinimumCpuSpeedFrequency", minimumCpuSpeedFrequency.toString());
		}
	}

	public String getNvmeSupport() {
		return this.nvmeSupport;
	}

	public void setNvmeSupport(String nvmeSupport) {
		this.nvmeSupport = nvmeSupport;
		if(nvmeSupport != null){
			putQueryParameter("NvmeSupport", nvmeSupport);
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

	public Integer getMinimumInitialCredit() {
		return this.minimumInitialCredit;
	}

	public void setMinimumInitialCredit(Integer minimumInitialCredit) {
		this.minimumInitialCredit = minimumInitialCredit;
		if(minimumInitialCredit != null){
			putQueryParameter("MinimumInitialCredit", minimumInitialCredit.toString());
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

	public Integer getMinimumEniPrivateIpAddressQuantity() {
		return this.minimumEniPrivateIpAddressQuantity;
	}

	public void setMinimumEniPrivateIpAddressQuantity(Integer minimumEniPrivateIpAddressQuantity) {
		this.minimumEniPrivateIpAddressQuantity = minimumEniPrivateIpAddressQuantity;
		if(minimumEniPrivateIpAddressQuantity != null){
			putQueryParameter("MinimumEniPrivateIpAddressQuantity", minimumEniPrivateIpAddressQuantity.toString());
		}
	}

	public Long getMinimumLocalStorageCapacity() {
		return this.minimumLocalStorageCapacity;
	}

	public void setMinimumLocalStorageCapacity(Long minimumLocalStorageCapacity) {
		this.minimumLocalStorageCapacity = minimumLocalStorageCapacity;
		if(minimumLocalStorageCapacity != null){
			putQueryParameter("MinimumLocalStorageCapacity", minimumLocalStorageCapacity.toString());
		}
	}

	@Override
	public Class<DescribeInstanceTypesResponse> getResponseClass() {
		return DescribeInstanceTypesResponse.class;
	}

}
