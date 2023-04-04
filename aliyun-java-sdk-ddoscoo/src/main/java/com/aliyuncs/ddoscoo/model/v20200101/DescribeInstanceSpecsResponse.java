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

package com.aliyuncs.ddoscoo.model.v20200101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ddoscoo.transform.v20200101.DescribeInstanceSpecsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeInstanceSpecsResponse extends AcsResponse {

	private String requestId;

	private List<InstanceSpec> instanceSpecs;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<InstanceSpec> getInstanceSpecs() {
		return this.instanceSpecs;
	}

	public void setInstanceSpecs(List<InstanceSpec> instanceSpecs) {
		this.instanceSpecs = instanceSpecs;
	}

	public static class InstanceSpec {

		private Integer baseBandwidth;

		private Integer qpsLimit;

		private Integer bandwidthMbps;

		private Integer elasticBw;

		private Integer defenseCount;

		private Integer siteLimit;

		private Integer portLimit;

		private Integer elasticBandwidth;

		private String functionVersion;

		private String instanceId;

		private Integer domainLimit;

		private String elasticBwModel;

		private Long cpsLimit;

		private Long connLimit;

		private Long realLimitBw;

		public Integer getBaseBandwidth() {
			return this.baseBandwidth;
		}

		public void setBaseBandwidth(Integer baseBandwidth) {
			this.baseBandwidth = baseBandwidth;
		}

		public Integer getQpsLimit() {
			return this.qpsLimit;
		}

		public void setQpsLimit(Integer qpsLimit) {
			this.qpsLimit = qpsLimit;
		}

		public Integer getBandwidthMbps() {
			return this.bandwidthMbps;
		}

		public void setBandwidthMbps(Integer bandwidthMbps) {
			this.bandwidthMbps = bandwidthMbps;
		}

		public Integer getElasticBw() {
			return this.elasticBw;
		}

		public void setElasticBw(Integer elasticBw) {
			this.elasticBw = elasticBw;
		}

		public Integer getDefenseCount() {
			return this.defenseCount;
		}

		public void setDefenseCount(Integer defenseCount) {
			this.defenseCount = defenseCount;
		}

		public Integer getSiteLimit() {
			return this.siteLimit;
		}

		public void setSiteLimit(Integer siteLimit) {
			this.siteLimit = siteLimit;
		}

		public Integer getPortLimit() {
			return this.portLimit;
		}

		public void setPortLimit(Integer portLimit) {
			this.portLimit = portLimit;
		}

		public Integer getElasticBandwidth() {
			return this.elasticBandwidth;
		}

		public void setElasticBandwidth(Integer elasticBandwidth) {
			this.elasticBandwidth = elasticBandwidth;
		}

		public String getFunctionVersion() {
			return this.functionVersion;
		}

		public void setFunctionVersion(String functionVersion) {
			this.functionVersion = functionVersion;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public Integer getDomainLimit() {
			return this.domainLimit;
		}

		public void setDomainLimit(Integer domainLimit) {
			this.domainLimit = domainLimit;
		}

		public String getElasticBwModel() {
			return this.elasticBwModel;
		}

		public void setElasticBwModel(String elasticBwModel) {
			this.elasticBwModel = elasticBwModel;
		}

		public Long getCpsLimit() {
			return this.cpsLimit;
		}

		public void setCpsLimit(Long cpsLimit) {
			this.cpsLimit = cpsLimit;
		}

		public Long getConnLimit() {
			return this.connLimit;
		}

		public void setConnLimit(Long connLimit) {
			this.connLimit = connLimit;
		}

		public Long getRealLimitBw() {
			return this.realLimitBw;
		}

		public void setRealLimitBw(Long realLimitBw) {
			this.realLimitBw = realLimitBw;
		}
	}

	@Override
	public DescribeInstanceSpecsResponse getInstance(UnmarshallerContext context) {
		return	DescribeInstanceSpecsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
