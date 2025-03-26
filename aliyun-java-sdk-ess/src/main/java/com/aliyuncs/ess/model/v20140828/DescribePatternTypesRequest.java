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

package com.aliyuncs.ess.model.v20140828;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ess.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribePatternTypesRequest extends RpcAcsRequest<DescribePatternTypesResponse> {
	   

	private Integer maximumCpuCoreCount;

	private Integer maximumGpuAmount;

	private Float maximumMemorySize;

	private Integer minimumCpuCoreCount;

	private Integer cores;

	private List<String> instanceTypeFamiliess;

	private Integer minimumBaselineCredit;

	private List<String> cpuArchitecturess;

	private List<String> instanceCategoriess;

	private Float maxPrice;

	private Integer minimumGpuAmount;

	private String burstablePerformance;

	private List<String> physicalProcessorModelss;

	private String spotStrategy;

	private List<String> vSwitchIds;

	private Integer minimumEniQuantity;

	private Float minimumMemorySize;

	private String instanceFamilyLevel;

	private List<String> zoneIds;

	private List<Float> memoryLists;

	private Float memory;

	private Integer minimumEniIpv6AddressQuantity;

	private List<Integer> coresLists;

	private List<String> architectures;

	private Integer minimumInitialCredit;

	private List<String> excludedInstanceTypes;

	private Integer minimumEniPrivateIpAddressQuantity;

	private List<String> gpuSpecss;

	private Long channelId;
	public DescribePatternTypesRequest() {
		super("Ess", "2014-08-28", "DescribePatternTypes", "ess");
		setMethod(MethodType.GET);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public Integer getMaximumGpuAmount() {
		return this.maximumGpuAmount;
	}

	public void setMaximumGpuAmount(Integer maximumGpuAmount) {
		this.maximumGpuAmount = maximumGpuAmount;
		if(maximumGpuAmount != null){
			putQueryParameter("MaximumGpuAmount", maximumGpuAmount.toString());
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

	public Integer getMinimumCpuCoreCount() {
		return this.minimumCpuCoreCount;
	}

	public void setMinimumCpuCoreCount(Integer minimumCpuCoreCount) {
		this.minimumCpuCoreCount = minimumCpuCoreCount;
		if(minimumCpuCoreCount != null){
			putQueryParameter("MinimumCpuCoreCount", minimumCpuCoreCount.toString());
		}
	}

	public Integer getCores() {
		return this.cores;
	}

	public void setCores(Integer cores) {
		this.cores = cores;
		if(cores != null){
			putQueryParameter("Cores", cores.toString());
		}
	}

	public List<String> getInstanceTypeFamiliess() {
		return this.instanceTypeFamiliess;
	}

	public void setInstanceTypeFamiliess(List<String> instanceTypeFamiliess) {
		this.instanceTypeFamiliess = instanceTypeFamiliess;	
		if (instanceTypeFamiliess != null) {
			for (int i = 0; i < instanceTypeFamiliess.size(); i++) {
				putQueryParameter("InstanceTypeFamilies." + (i + 1) , instanceTypeFamiliess.get(i));
			}
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

	public List<String> getCpuArchitecturess() {
		return this.cpuArchitecturess;
	}

	public void setCpuArchitecturess(List<String> cpuArchitecturess) {
		this.cpuArchitecturess = cpuArchitecturess;	
		if (cpuArchitecturess != null) {
			for (int i = 0; i < cpuArchitecturess.size(); i++) {
				putQueryParameter("CpuArchitectures." + (i + 1) , cpuArchitecturess.get(i));
			}
		}	
	}

	public List<String> getInstanceCategoriess() {
		return this.instanceCategoriess;
	}

	public void setInstanceCategoriess(List<String> instanceCategoriess) {
		this.instanceCategoriess = instanceCategoriess;	
		if (instanceCategoriess != null) {
			for (int i = 0; i < instanceCategoriess.size(); i++) {
				putQueryParameter("InstanceCategories." + (i + 1) , instanceCategoriess.get(i));
			}
		}	
	}

	public Float getMaxPrice() {
		return this.maxPrice;
	}

	public void setMaxPrice(Float maxPrice) {
		this.maxPrice = maxPrice;
		if(maxPrice != null){
			putQueryParameter("MaxPrice", maxPrice.toString());
		}
	}

	public Integer getMinimumGpuAmount() {
		return this.minimumGpuAmount;
	}

	public void setMinimumGpuAmount(Integer minimumGpuAmount) {
		this.minimumGpuAmount = minimumGpuAmount;
		if(minimumGpuAmount != null){
			putQueryParameter("MinimumGpuAmount", minimumGpuAmount.toString());
		}
	}

	public String getBurstablePerformance() {
		return this.burstablePerformance;
	}

	public void setBurstablePerformance(String burstablePerformance) {
		this.burstablePerformance = burstablePerformance;
		if(burstablePerformance != null){
			putQueryParameter("BurstablePerformance", burstablePerformance);
		}
	}

	public List<String> getPhysicalProcessorModelss() {
		return this.physicalProcessorModelss;
	}

	public void setPhysicalProcessorModelss(List<String> physicalProcessorModelss) {
		this.physicalProcessorModelss = physicalProcessorModelss;	
		if (physicalProcessorModelss != null) {
			for (int i = 0; i < physicalProcessorModelss.size(); i++) {
				putQueryParameter("PhysicalProcessorModels." + (i + 1) , physicalProcessorModelss.get(i));
			}
		}	
	}

	public String getSpotStrategy() {
		return this.spotStrategy;
	}

	public void setSpotStrategy(String spotStrategy) {
		this.spotStrategy = spotStrategy;
		if(spotStrategy != null){
			putQueryParameter("SpotStrategy", spotStrategy);
		}
	}

	public List<String> getVSwitchIds() {
		return this.vSwitchIds;
	}

	public void setVSwitchIds(List<String> vSwitchIds) {
		this.vSwitchIds = vSwitchIds;	
		if (vSwitchIds != null) {
			for (int i = 0; i < vSwitchIds.size(); i++) {
				putQueryParameter("VSwitchId." + (i + 1) , vSwitchIds.get(i));
			}
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

	public Float getMinimumMemorySize() {
		return this.minimumMemorySize;
	}

	public void setMinimumMemorySize(Float minimumMemorySize) {
		this.minimumMemorySize = minimumMemorySize;
		if(minimumMemorySize != null){
			putQueryParameter("MinimumMemorySize", minimumMemorySize.toString());
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

	public List<String> getZoneIds() {
		return this.zoneIds;
	}

	public void setZoneIds(List<String> zoneIds) {
		this.zoneIds = zoneIds;	
		if (zoneIds != null) {
			for (int i = 0; i < zoneIds.size(); i++) {
				putQueryParameter("ZoneId." + (i + 1) , zoneIds.get(i));
			}
		}	
	}

	public List<Float> getMemoryLists() {
		return this.memoryLists;
	}

	public void setMemoryLists(List<Float> memoryLists) {
		this.memoryLists = memoryLists;	
		if (memoryLists != null) {
			for (int i = 0; i < memoryLists.size(); i++) {
				putQueryParameter("MemoryList." + (i + 1) , memoryLists.get(i));
			}
		}	
	}

	public Float getMemory() {
		return this.memory;
	}

	public void setMemory(Float memory) {
		this.memory = memory;
		if(memory != null){
			putQueryParameter("Memory", memory.toString());
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

	public List<Integer> getCoresLists() {
		return this.coresLists;
	}

	public void setCoresLists(List<Integer> coresLists) {
		this.coresLists = coresLists;	
		if (coresLists != null) {
			for (int i = 0; i < coresLists.size(); i++) {
				putQueryParameter("CoresList." + (i + 1) , coresLists.get(i));
			}
		}	
	}

	public List<String> getArchitectures() {
		return this.architectures;
	}

	public void setArchitectures(List<String> architectures) {
		this.architectures = architectures;	
		if (architectures != null) {
			for (int i = 0; i < architectures.size(); i++) {
				putQueryParameter("Architecture." + (i + 1) , architectures.get(i));
			}
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

	public List<String> getExcludedInstanceTypes() {
		return this.excludedInstanceTypes;
	}

	public void setExcludedInstanceTypes(List<String> excludedInstanceTypes) {
		this.excludedInstanceTypes = excludedInstanceTypes;	
		if (excludedInstanceTypes != null) {
			for (int i = 0; i < excludedInstanceTypes.size(); i++) {
				putQueryParameter("ExcludedInstanceType." + (i + 1) , excludedInstanceTypes.get(i));
			}
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

	public List<String> getGpuSpecss() {
		return this.gpuSpecss;
	}

	public void setGpuSpecss(List<String> gpuSpecss) {
		this.gpuSpecss = gpuSpecss;	
		if (gpuSpecss != null) {
			for (int i = 0; i < gpuSpecss.size(); i++) {
				putQueryParameter("GpuSpecs." + (i + 1) , gpuSpecss.get(i));
			}
		}	
	}

	public Long getChannelId() {
		return this.channelId;
	}

	public void setChannelId(Long channelId) {
		this.channelId = channelId;
		if(channelId != null){
			putQueryParameter("ChannelId", channelId.toString());
		}
	}

	@Override
	public Class<DescribePatternTypesResponse> getResponseClass() {
		return DescribePatternTypesResponse.class;
	}

}
