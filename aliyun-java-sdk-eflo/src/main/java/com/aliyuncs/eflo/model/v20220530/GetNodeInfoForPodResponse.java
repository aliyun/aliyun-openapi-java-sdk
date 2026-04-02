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

package com.aliyuncs.eflo.model.v20220530;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.eflo.transform.v20220530.GetNodeInfoForPodResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetNodeInfoForPodResponse extends AcsResponse {

	private Integer code;

	private String message;

	private String requestId;

	private String accessDeniedDetail;

	private Content content;

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getAccessDeniedDetail() {
		return this.accessDeniedDetail;
	}

	public void setAccessDeniedDetail(String accessDeniedDetail) {
		this.accessDeniedDetail = accessDeniedDetail;
	}

	public Content getContent() {
		return this.content;
	}

	public void setContent(Content content) {
		this.content = content;
	}

	public static class Content {

		private String regionId;

		private String zoneId;

		private String clusterId;

		private String vpcId;

		private String nodeId;

		private Integer leniQuota;

		private Integer lniSipQuota;

		private Integer leniSipQuota;

		private Integer hdeniQuota;

		private Integer leniIpv6SipQuota;

		private Integer hdeniSipQuota;

		private Integer hdeniIpv6SipQuota;

		private List<String> vSwitches;

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getZoneId() {
			return this.zoneId;
		}

		public void setZoneId(String zoneId) {
			this.zoneId = zoneId;
		}

		public String getClusterId() {
			return this.clusterId;
		}

		public void setClusterId(String clusterId) {
			this.clusterId = clusterId;
		}

		public String getVpcId() {
			return this.vpcId;
		}

		public void setVpcId(String vpcId) {
			this.vpcId = vpcId;
		}

		public String getNodeId() {
			return this.nodeId;
		}

		public void setNodeId(String nodeId) {
			this.nodeId = nodeId;
		}

		public Integer getLeniQuota() {
			return this.leniQuota;
		}

		public void setLeniQuota(Integer leniQuota) {
			this.leniQuota = leniQuota;
		}

		public Integer getLniSipQuota() {
			return this.lniSipQuota;
		}

		public void setLniSipQuota(Integer lniSipQuota) {
			this.lniSipQuota = lniSipQuota;
		}

		public Integer getLeniSipQuota() {
			return this.leniSipQuota;
		}

		public void setLeniSipQuota(Integer leniSipQuota) {
			this.leniSipQuota = leniSipQuota;
		}

		public Integer getHdeniQuota() {
			return this.hdeniQuota;
		}

		public void setHdeniQuota(Integer hdeniQuota) {
			this.hdeniQuota = hdeniQuota;
		}

		public Integer getLeniIpv6SipQuota() {
			return this.leniIpv6SipQuota;
		}

		public void setLeniIpv6SipQuota(Integer leniIpv6SipQuota) {
			this.leniIpv6SipQuota = leniIpv6SipQuota;
		}

		public Integer getHdeniSipQuota() {
			return this.hdeniSipQuota;
		}

		public void setHdeniSipQuota(Integer hdeniSipQuota) {
			this.hdeniSipQuota = hdeniSipQuota;
		}

		public Integer getHdeniIpv6SipQuota() {
			return this.hdeniIpv6SipQuota;
		}

		public void setHdeniIpv6SipQuota(Integer hdeniIpv6SipQuota) {
			this.hdeniIpv6SipQuota = hdeniIpv6SipQuota;
		}

		public List<String> getVSwitches() {
			return this.vSwitches;
		}

		public void setVSwitches(List<String> vSwitches) {
			this.vSwitches = vSwitches;
		}
	}

	@Override
	public GetNodeInfoForPodResponse getInstance(UnmarshallerContext context) {
		return	GetNodeInfoForPodResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
