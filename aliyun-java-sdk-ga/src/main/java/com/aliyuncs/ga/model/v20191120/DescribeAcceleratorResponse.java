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

package com.aliyuncs.ga.model.v20191120;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.ga.transform.v20191120.DescribeAcceleratorResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeAcceleratorResponse extends AcsResponse {

	private String requestId;

	private String acceleratorId;

	private String name;

	private String description;

	private String instanceChargeType;

	private Long expiredTime;

	private String cenId;

	private String state;

	private String dnsName;

	private Long createTime;

	private String spec;

	private String regionId;

	private BasicBandwidthPackage basicBandwidthPackage;

	private CrossDomainBandwidthPackage crossDomainBandwidthPackage;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getAcceleratorId() {
		return this.acceleratorId;
	}

	public void setAcceleratorId(String acceleratorId) {
		this.acceleratorId = acceleratorId;
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

	public String getInstanceChargeType() {
		return this.instanceChargeType;
	}

	public void setInstanceChargeType(String instanceChargeType) {
		this.instanceChargeType = instanceChargeType;
	}

	public Long getExpiredTime() {
		return this.expiredTime;
	}

	public void setExpiredTime(Long expiredTime) {
		this.expiredTime = expiredTime;
	}

	public String getCenId() {
		return this.cenId;
	}

	public void setCenId(String cenId) {
		this.cenId = cenId;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getDnsName() {
		return this.dnsName;
	}

	public void setDnsName(String dnsName) {
		this.dnsName = dnsName;
	}

	public Long getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Long createTime) {
		this.createTime = createTime;
	}

	public String getSpec() {
		return this.spec;
	}

	public void setSpec(String spec) {
		this.spec = spec;
	}

	public String getRegionId() {
		return this.regionId;
	}

	public void setRegionId(String regionId) {
		this.regionId = regionId;
	}

	public BasicBandwidthPackage getBasicBandwidthPackage() {
		return this.basicBandwidthPackage;
	}

	public void setBasicBandwidthPackage(BasicBandwidthPackage basicBandwidthPackage) {
		this.basicBandwidthPackage = basicBandwidthPackage;
	}

	public CrossDomainBandwidthPackage getCrossDomainBandwidthPackage() {
		return this.crossDomainBandwidthPackage;
	}

	public void setCrossDomainBandwidthPackage(CrossDomainBandwidthPackage crossDomainBandwidthPackage) {
		this.crossDomainBandwidthPackage = crossDomainBandwidthPackage;
	}

	public static class BasicBandwidthPackage {

		private String instanceId;

		private Integer bandwidth;

		private String bandwidthType;

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public Integer getBandwidth() {
			return this.bandwidth;
		}

		public void setBandwidth(Integer bandwidth) {
			this.bandwidth = bandwidth;
		}

		public String getBandwidthType() {
			return this.bandwidthType;
		}

		public void setBandwidthType(String bandwidthType) {
			this.bandwidthType = bandwidthType;
		}
	}

	public static class CrossDomainBandwidthPackage {

		private String instanceId;

		private Integer bandwidth;

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public Integer getBandwidth() {
			return this.bandwidth;
		}

		public void setBandwidth(Integer bandwidth) {
			this.bandwidth = bandwidth;
		}
	}

	@Override
	public DescribeAcceleratorResponse getInstance(UnmarshallerContext context) {
		return	DescribeAcceleratorResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
