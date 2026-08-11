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

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecs.transform.v20140526.DescribeInstanceTypesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeInstanceTypesResponse extends AcsResponse {

	private String requestId;

	private String nextToken;

	private List<InstanceType> instanceTypes;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public List<InstanceType> getInstanceTypes() {
		return this.instanceTypes;
	}

	public void setInstanceTypes(List<InstanceType> instanceTypes) {
		this.instanceTypes = instanceTypes;
	}

	public static class InstanceType {

		private Long instancePpsTx;

		private String nvmeSupport;

		private Integer primaryEniQueueNumber;

		private Long localStorageCapacity;

		private Integer totalEniQueueQuantity;

		private Boolean eniTrunkSupported;

		private String instanceTypeFamily;

		private Long instancePpsRx;

		private Boolean networkEncryptionSupport;

		private Integer eriQuantity;

		private Integer instanceBandwidthRx;

		private Integer instanceBandwidthTx;

		private Integer localStorageAmount;

		private Integer secondaryEniQueueNumber;

		private String physicalProcessorModel;

		private String localStorageCategory;

		private String gPUSpec;

		private String cpuArchitecture;

		private String instanceTypeId;

		private Float memorySize;

		private Integer maximumQueueNumberPerEni;

		private Integer eniIpv6AddressQuantity;

		private Float gPUMemorySize;

		private Integer eniTotalQuantity;

		private Integer cpuCoreCount;

		private Integer initialCredit;

		private Integer networkCardQuantity;

		private String instanceCategory;

		private Integer eniQuantity;

		private Integer gPUAmount;

		private Integer diskQuantity;

		private Float cpuSpeedFrequency;

		private Integer queuePairNumber;

		private Integer baselineCredit;

		private String instanceFamilyLevel;

		private Boolean jumboFrameSupport;

		private Float cpuTurboFrequency;

		private Integer eniPrivateIpAddressQuantity;

		private List<Attribute> attributes;

		private List<NetworkCardInfo> networkCards;

		private List<String> supportedBootModes;

		private Clock clock;

		private EnhancedNetwork enhancedNetwork;

		private NetworkInfo networkInfo;

		private CpuOptions cpuOptions;

		private SecurityOptions securityOptions;

		public Long getInstancePpsTx() {
			return this.instancePpsTx;
		}

		public void setInstancePpsTx(Long instancePpsTx) {
			this.instancePpsTx = instancePpsTx;
		}

		public String getNvmeSupport() {
			return this.nvmeSupport;
		}

		public void setNvmeSupport(String nvmeSupport) {
			this.nvmeSupport = nvmeSupport;
		}

		public Integer getPrimaryEniQueueNumber() {
			return this.primaryEniQueueNumber;
		}

		public void setPrimaryEniQueueNumber(Integer primaryEniQueueNumber) {
			this.primaryEniQueueNumber = primaryEniQueueNumber;
		}

		public Long getLocalStorageCapacity() {
			return this.localStorageCapacity;
		}

		public void setLocalStorageCapacity(Long localStorageCapacity) {
			this.localStorageCapacity = localStorageCapacity;
		}

		public Integer getTotalEniQueueQuantity() {
			return this.totalEniQueueQuantity;
		}

		public void setTotalEniQueueQuantity(Integer totalEniQueueQuantity) {
			this.totalEniQueueQuantity = totalEniQueueQuantity;
		}

		public Boolean getEniTrunkSupported() {
			return this.eniTrunkSupported;
		}

		public void setEniTrunkSupported(Boolean eniTrunkSupported) {
			this.eniTrunkSupported = eniTrunkSupported;
		}

		public String getInstanceTypeFamily() {
			return this.instanceTypeFamily;
		}

		public void setInstanceTypeFamily(String instanceTypeFamily) {
			this.instanceTypeFamily = instanceTypeFamily;
		}

		public Long getInstancePpsRx() {
			return this.instancePpsRx;
		}

		public void setInstancePpsRx(Long instancePpsRx) {
			this.instancePpsRx = instancePpsRx;
		}

		public Boolean getNetworkEncryptionSupport() {
			return this.networkEncryptionSupport;
		}

		public void setNetworkEncryptionSupport(Boolean networkEncryptionSupport) {
			this.networkEncryptionSupport = networkEncryptionSupport;
		}

		public Integer getEriQuantity() {
			return this.eriQuantity;
		}

		public void setEriQuantity(Integer eriQuantity) {
			this.eriQuantity = eriQuantity;
		}

		public Integer getInstanceBandwidthRx() {
			return this.instanceBandwidthRx;
		}

		public void setInstanceBandwidthRx(Integer instanceBandwidthRx) {
			this.instanceBandwidthRx = instanceBandwidthRx;
		}

		public Integer getInstanceBandwidthTx() {
			return this.instanceBandwidthTx;
		}

		public void setInstanceBandwidthTx(Integer instanceBandwidthTx) {
			this.instanceBandwidthTx = instanceBandwidthTx;
		}

		public Integer getLocalStorageAmount() {
			return this.localStorageAmount;
		}

		public void setLocalStorageAmount(Integer localStorageAmount) {
			this.localStorageAmount = localStorageAmount;
		}

		public Integer getSecondaryEniQueueNumber() {
			return this.secondaryEniQueueNumber;
		}

		public void setSecondaryEniQueueNumber(Integer secondaryEniQueueNumber) {
			this.secondaryEniQueueNumber = secondaryEniQueueNumber;
		}

		public String getPhysicalProcessorModel() {
			return this.physicalProcessorModel;
		}

		public void setPhysicalProcessorModel(String physicalProcessorModel) {
			this.physicalProcessorModel = physicalProcessorModel;
		}

		public String getLocalStorageCategory() {
			return this.localStorageCategory;
		}

		public void setLocalStorageCategory(String localStorageCategory) {
			this.localStorageCategory = localStorageCategory;
		}

		public String getGPUSpec() {
			return this.gPUSpec;
		}

		public void setGPUSpec(String gPUSpec) {
			this.gPUSpec = gPUSpec;
		}

		public String getCpuArchitecture() {
			return this.cpuArchitecture;
		}

		public void setCpuArchitecture(String cpuArchitecture) {
			this.cpuArchitecture = cpuArchitecture;
		}

		public String getInstanceTypeId() {
			return this.instanceTypeId;
		}

		public void setInstanceTypeId(String instanceTypeId) {
			this.instanceTypeId = instanceTypeId;
		}

		public Float getMemorySize() {
			return this.memorySize;
		}

		public void setMemorySize(Float memorySize) {
			this.memorySize = memorySize;
		}

		public Integer getMaximumQueueNumberPerEni() {
			return this.maximumQueueNumberPerEni;
		}

		public void setMaximumQueueNumberPerEni(Integer maximumQueueNumberPerEni) {
			this.maximumQueueNumberPerEni = maximumQueueNumberPerEni;
		}

		public Integer getEniIpv6AddressQuantity() {
			return this.eniIpv6AddressQuantity;
		}

		public void setEniIpv6AddressQuantity(Integer eniIpv6AddressQuantity) {
			this.eniIpv6AddressQuantity = eniIpv6AddressQuantity;
		}

		public Float getGPUMemorySize() {
			return this.gPUMemorySize;
		}

		public void setGPUMemorySize(Float gPUMemorySize) {
			this.gPUMemorySize = gPUMemorySize;
		}

		public Integer getEniTotalQuantity() {
			return this.eniTotalQuantity;
		}

		public void setEniTotalQuantity(Integer eniTotalQuantity) {
			this.eniTotalQuantity = eniTotalQuantity;
		}

		public Integer getCpuCoreCount() {
			return this.cpuCoreCount;
		}

		public void setCpuCoreCount(Integer cpuCoreCount) {
			this.cpuCoreCount = cpuCoreCount;
		}

		public Integer getInitialCredit() {
			return this.initialCredit;
		}

		public void setInitialCredit(Integer initialCredit) {
			this.initialCredit = initialCredit;
		}

		public Integer getNetworkCardQuantity() {
			return this.networkCardQuantity;
		}

		public void setNetworkCardQuantity(Integer networkCardQuantity) {
			this.networkCardQuantity = networkCardQuantity;
		}

		public String getInstanceCategory() {
			return this.instanceCategory;
		}

		public void setInstanceCategory(String instanceCategory) {
			this.instanceCategory = instanceCategory;
		}

		public Integer getEniQuantity() {
			return this.eniQuantity;
		}

		public void setEniQuantity(Integer eniQuantity) {
			this.eniQuantity = eniQuantity;
		}

		public Integer getGPUAmount() {
			return this.gPUAmount;
		}

		public void setGPUAmount(Integer gPUAmount) {
			this.gPUAmount = gPUAmount;
		}

		public Integer getDiskQuantity() {
			return this.diskQuantity;
		}

		public void setDiskQuantity(Integer diskQuantity) {
			this.diskQuantity = diskQuantity;
		}

		public Float getCpuSpeedFrequency() {
			return this.cpuSpeedFrequency;
		}

		public void setCpuSpeedFrequency(Float cpuSpeedFrequency) {
			this.cpuSpeedFrequency = cpuSpeedFrequency;
		}

		public Integer getQueuePairNumber() {
			return this.queuePairNumber;
		}

		public void setQueuePairNumber(Integer queuePairNumber) {
			this.queuePairNumber = queuePairNumber;
		}

		public Integer getBaselineCredit() {
			return this.baselineCredit;
		}

		public void setBaselineCredit(Integer baselineCredit) {
			this.baselineCredit = baselineCredit;
		}

		public String getInstanceFamilyLevel() {
			return this.instanceFamilyLevel;
		}

		public void setInstanceFamilyLevel(String instanceFamilyLevel) {
			this.instanceFamilyLevel = instanceFamilyLevel;
		}

		public Boolean getJumboFrameSupport() {
			return this.jumboFrameSupport;
		}

		public void setJumboFrameSupport(Boolean jumboFrameSupport) {
			this.jumboFrameSupport = jumboFrameSupport;
		}

		public Float getCpuTurboFrequency() {
			return this.cpuTurboFrequency;
		}

		public void setCpuTurboFrequency(Float cpuTurboFrequency) {
			this.cpuTurboFrequency = cpuTurboFrequency;
		}

		public Integer getEniPrivateIpAddressQuantity() {
			return this.eniPrivateIpAddressQuantity;
		}

		public void setEniPrivateIpAddressQuantity(Integer eniPrivateIpAddressQuantity) {
			this.eniPrivateIpAddressQuantity = eniPrivateIpAddressQuantity;
		}

		public List<Attribute> getAttributes() {
			return this.attributes;
		}

		public void setAttributes(List<Attribute> attributes) {
			this.attributes = attributes;
		}

		public List<NetworkCardInfo> getNetworkCards() {
			return this.networkCards;
		}

		public void setNetworkCards(List<NetworkCardInfo> networkCards) {
			this.networkCards = networkCards;
		}

		public List<String> getSupportedBootModes() {
			return this.supportedBootModes;
		}

		public void setSupportedBootModes(List<String> supportedBootModes) {
			this.supportedBootModes = supportedBootModes;
		}

		public Clock getClock() {
			return this.clock;
		}

		public void setClock(Clock clock) {
			this.clock = clock;
		}

		public EnhancedNetwork getEnhancedNetwork() {
			return this.enhancedNetwork;
		}

		public void setEnhancedNetwork(EnhancedNetwork enhancedNetwork) {
			this.enhancedNetwork = enhancedNetwork;
		}

		public NetworkInfo getNetworkInfo() {
			return this.networkInfo;
		}

		public void setNetworkInfo(NetworkInfo networkInfo) {
			this.networkInfo = networkInfo;
		}

		public CpuOptions getCpuOptions() {
			return this.cpuOptions;
		}

		public void setCpuOptions(CpuOptions cpuOptions) {
			this.cpuOptions = cpuOptions;
		}

		public SecurityOptions getSecurityOptions() {
			return this.securityOptions;
		}

		public void setSecurityOptions(SecurityOptions securityOptions) {
			this.securityOptions = securityOptions;
		}

		public static class Attribute {

			private String value;

			private String name;

			public String getValue() {
				return this.value;
			}

			public void setValue(String value) {
				this.value = value;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}
		}

		public static class NetworkCardInfo {

			private Integer networkCardIndex;

			public Integer getNetworkCardIndex() {
				return this.networkCardIndex;
			}

			public void setNetworkCardIndex(Integer networkCardIndex) {
				this.networkCardIndex = networkCardIndex;
			}
		}

		public static class Clock {

			private String ptpSupport;

			public String getPtpSupport() {
				return this.ptpSupport;
			}

			public void setPtpSupport(String ptpSupport) {
				this.ptpSupport = ptpSupport;
			}
		}

		public static class EnhancedNetwork {

			private Boolean expressSupport;

			private Integer vfQueueNumberPerEni;

			private Boolean rssSupport;

			private Boolean sriovSupport;

			public Boolean getExpressSupport() {
				return this.expressSupport;
			}

			public void setExpressSupport(Boolean expressSupport) {
				this.expressSupport = expressSupport;
			}

			public Integer getVfQueueNumberPerEni() {
				return this.vfQueueNumberPerEni;
			}

			public void setVfQueueNumberPerEni(Integer vfQueueNumberPerEni) {
				this.vfQueueNumberPerEni = vfQueueNumberPerEni;
			}

			public Boolean getRssSupport() {
				return this.rssSupport;
			}

			public void setRssSupport(Boolean rssSupport) {
				this.rssSupport = rssSupport;
			}

			public Boolean getSriovSupport() {
				return this.sriovSupport;
			}

			public void setSriovSupport(Boolean sriovSupport) {
				this.sriovSupport = sriovSupport;
			}
		}

		public static class NetworkInfo {

			private BandwidthWeighting bandwidthWeighting;

			public BandwidthWeighting getBandwidthWeighting() {
				return this.bandwidthWeighting;
			}

			public void setBandwidthWeighting(BandwidthWeighting bandwidthWeighting) {
				this.bandwidthWeighting = bandwidthWeighting;
			}

			public static class BandwidthWeighting {

				private List<WeightingInfo> weightingInfos;

				public List<WeightingInfo> getWeightingInfos() {
					return this.weightingInfos;
				}

				public void setWeightingInfos(List<WeightingInfo> weightingInfos) {
					this.weightingInfos = weightingInfos;
				}

				public static class WeightingInfo {

					private Long vpcBandwidth;

					private Long ebsBurstBandwidth;

					private Long ebsBandwidth;

					private Long vpcBurstBandwidth;

					private String name;

					public Long getVpcBandwidth() {
						return this.vpcBandwidth;
					}

					public void setVpcBandwidth(Long vpcBandwidth) {
						this.vpcBandwidth = vpcBandwidth;
					}

					public Long getEbsBurstBandwidth() {
						return this.ebsBurstBandwidth;
					}

					public void setEbsBurstBandwidth(Long ebsBurstBandwidth) {
						this.ebsBurstBandwidth = ebsBurstBandwidth;
					}

					public Long getEbsBandwidth() {
						return this.ebsBandwidth;
					}

					public void setEbsBandwidth(Long ebsBandwidth) {
						this.ebsBandwidth = ebsBandwidth;
					}

					public Long getVpcBurstBandwidth() {
						return this.vpcBurstBandwidth;
					}

					public void setVpcBurstBandwidth(Long vpcBurstBandwidth) {
						this.vpcBurstBandwidth = vpcBurstBandwidth;
					}

					public String getName() {
						return this.name;
					}

					public void setName(String name) {
						this.name = name;
					}
				}
			}
		}

		public static class CpuOptions {

			private String nestedVirtualizationSupport;

			private Integer coreFactor;

			private Integer threadsPerCore;

			private Boolean hyperThreadingAdjustable;

			private Integer core;

			private List<String> supportedTopologyTypes;

			public String getNestedVirtualizationSupport() {
				return this.nestedVirtualizationSupport;
			}

			public void setNestedVirtualizationSupport(String nestedVirtualizationSupport) {
				this.nestedVirtualizationSupport = nestedVirtualizationSupport;
			}

			public Integer getCoreFactor() {
				return this.coreFactor;
			}

			public void setCoreFactor(Integer coreFactor) {
				this.coreFactor = coreFactor;
			}

			public Integer getThreadsPerCore() {
				return this.threadsPerCore;
			}

			public void setThreadsPerCore(Integer threadsPerCore) {
				this.threadsPerCore = threadsPerCore;
			}

			public Boolean getHyperThreadingAdjustable() {
				return this.hyperThreadingAdjustable;
			}

			public void setHyperThreadingAdjustable(Boolean hyperThreadingAdjustable) {
				this.hyperThreadingAdjustable = hyperThreadingAdjustable;
			}

			public Integer getCore() {
				return this.core;
			}

			public void setCore(Integer core) {
				this.core = core;
			}

			public List<String> getSupportedTopologyTypes() {
				return this.supportedTopologyTypes;
			}

			public void setSupportedTopologyTypes(List<String> supportedTopologyTypes) {
				this.supportedTopologyTypes = supportedTopologyTypes;
			}
		}

		public static class SecurityOptions {

			private String secureBootSupport;

			public String getSecureBootSupport() {
				return this.secureBootSupport;
			}

			public void setSecureBootSupport(String secureBootSupport) {
				this.secureBootSupport = secureBootSupport;
			}
		}
	}

	@Override
	public DescribeInstanceTypesResponse getInstance(UnmarshallerContext context) {
		return	DescribeInstanceTypesResponseUnmarshaller.unmarshall(this, context);
	}
}
