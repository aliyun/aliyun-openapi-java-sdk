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

package com.aliyuncs.uisplus.model.v20200707;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.uisplus.transform.v20200707.DescribeUisResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeUisResponse extends AcsResponse {

	private String uisId;

	private String requestId;

	private String networkMode;

	private String wildcardDomainState;

	private String state;

	private String uisName;

	private String regionId;

	private Long mbpsQuota;

	private Long kppsQuota;

	private Long flowQuota;

	private Long usedMBpsQuota;

	private Long usedKPpsQuota;

	private Long usedFlowQuota;

	private String spec;

	private List<InternetIpsItem> internetIps;

	private List<String> uisNodes;

	public String getUisId() {
		return this.uisId;
	}

	public void setUisId(String uisId) {
		this.uisId = uisId;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getNetworkMode() {
		return this.networkMode;
	}

	public void setNetworkMode(String networkMode) {
		this.networkMode = networkMode;
	}

	public String getWildcardDomainState() {
		return this.wildcardDomainState;
	}

	public void setWildcardDomainState(String wildcardDomainState) {
		this.wildcardDomainState = wildcardDomainState;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getUisName() {
		return this.uisName;
	}

	public void setUisName(String uisName) {
		this.uisName = uisName;
	}

	public String getRegionId() {
		return this.regionId;
	}

	public void setRegionId(String regionId) {
		this.regionId = regionId;
	}

	public Long getMbpsQuota() {
		return this.mbpsQuota;
	}

	public void setMbpsQuota(Long mbpsQuota) {
		this.mbpsQuota = mbpsQuota;
	}

	public Long getKppsQuota() {
		return this.kppsQuota;
	}

	public void setKppsQuota(Long kppsQuota) {
		this.kppsQuota = kppsQuota;
	}

	public Long getFlowQuota() {
		return this.flowQuota;
	}

	public void setFlowQuota(Long flowQuota) {
		this.flowQuota = flowQuota;
	}

	public Long getUsedMBpsQuota() {
		return this.usedMBpsQuota;
	}

	public void setUsedMBpsQuota(Long usedMBpsQuota) {
		this.usedMBpsQuota = usedMBpsQuota;
	}

	public Long getUsedKPpsQuota() {
		return this.usedKPpsQuota;
	}

	public void setUsedKPpsQuota(Long usedKPpsQuota) {
		this.usedKPpsQuota = usedKPpsQuota;
	}

	public Long getUsedFlowQuota() {
		return this.usedFlowQuota;
	}

	public void setUsedFlowQuota(Long usedFlowQuota) {
		this.usedFlowQuota = usedFlowQuota;
	}

	public String getSpec() {
		return this.spec;
	}

	public void setSpec(String spec) {
		this.spec = spec;
	}

	public List<InternetIpsItem> getInternetIps() {
		return this.internetIps;
	}

	public void setInternetIps(List<InternetIpsItem> internetIps) {
		this.internetIps = internetIps;
	}

	public List<String> getUisNodes() {
		return this.uisNodes;
	}

	public void setUisNodes(List<String> uisNodes) {
		this.uisNodes = uisNodes;
	}

	public static class InternetIpsItem {

		private String type;

		private String ip;

		private String uisNodeId;

		private String eipId;

		private String role;

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getIp() {
			return this.ip;
		}

		public void setIp(String ip) {
			this.ip = ip;
		}

		public String getUisNodeId() {
			return this.uisNodeId;
		}

		public void setUisNodeId(String uisNodeId) {
			this.uisNodeId = uisNodeId;
		}

		public String getEipId() {
			return this.eipId;
		}

		public void setEipId(String eipId) {
			this.eipId = eipId;
		}

		public String getRole() {
			return this.role;
		}

		public void setRole(String role) {
			this.role = role;
		}
	}

	@Override
	public DescribeUisResponse getInstance(UnmarshallerContext context) {
		return	DescribeUisResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
