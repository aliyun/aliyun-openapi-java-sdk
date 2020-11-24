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

		private String instanceId;

		private Integer baseBandwidth;

		private Integer elasticBandwidth;

		private Integer portLimit;

		private Integer siteLimit;

		private Integer domainLimit;

		private Integer bandwidthMbps;

		private Integer defenseCount;

		private String functionVersion;

		private Integer qpsLimit;

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public Integer getBaseBandwidth() {
			return this.baseBandwidth;
		}

		public void setBaseBandwidth(Integer baseBandwidth) {
			this.baseBandwidth = baseBandwidth;
		}

		public Integer getElasticBandwidth() {
			return this.elasticBandwidth;
		}

		public void setElasticBandwidth(Integer elasticBandwidth) {
			this.elasticBandwidth = elasticBandwidth;
		}

		public Integer getPortLimit() {
			return this.portLimit;
		}

		public void setPortLimit(Integer portLimit) {
			this.portLimit = portLimit;
		}

		public Integer getSiteLimit() {
			return this.siteLimit;
		}

		public void setSiteLimit(Integer siteLimit) {
			this.siteLimit = siteLimit;
		}

		public Integer getDomainLimit() {
			return this.domainLimit;
		}

		public void setDomainLimit(Integer domainLimit) {
			this.domainLimit = domainLimit;
		}

		public Integer getBandwidthMbps() {
			return this.bandwidthMbps;
		}

		public void setBandwidthMbps(Integer bandwidthMbps) {
			this.bandwidthMbps = bandwidthMbps;
		}

		public Integer getDefenseCount() {
			return this.defenseCount;
		}

		public void setDefenseCount(Integer defenseCount) {
			this.defenseCount = defenseCount;
		}

		public String getFunctionVersion() {
			return this.functionVersion;
		}

		public void setFunctionVersion(String functionVersion) {
			this.functionVersion = functionVersion;
		}

		public Integer getQpsLimit() {
			return this.qpsLimit;
		}

		public void setQpsLimit(Integer qpsLimit) {
			this.qpsLimit = qpsLimit;
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
