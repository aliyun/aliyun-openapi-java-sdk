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
import com.aliyuncs.ens.transform.v20171110.DescribeServerLoadBalancerMonitorResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeServerLoadBalancerMonitorResponse extends AcsResponse {

	private String requestId;

	private List<EslbMonitorList> serverLoadBalancerMonitorData;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<EslbMonitorList> getServerLoadBalancerMonitorData() {
		return this.serverLoadBalancerMonitorData;
	}

	public void setServerLoadBalancerMonitorData(List<EslbMonitorList> serverLoadBalancerMonitorData) {
		this.serverLoadBalancerMonitorData = serverLoadBalancerMonitorData;
	}

	public static class EslbMonitorList {

		private String loadBalancerId;

		private String loadBalancerName;

		private String ensRegionId;

		private String loadBalancerSpec;

		private String vip;

		private Integer vni;

		private Integer acc;

		private Integer reqs2xx;

		private Integer reqs3xx;

		private Integer reqs4xx;

		private Integer reqs5xx;

		private Integer rtAvg;

		private String bizTime;

		public String getLoadBalancerId() {
			return this.loadBalancerId;
		}

		public void setLoadBalancerId(String loadBalancerId) {
			this.loadBalancerId = loadBalancerId;
		}

		public String getLoadBalancerName() {
			return this.loadBalancerName;
		}

		public void setLoadBalancerName(String loadBalancerName) {
			this.loadBalancerName = loadBalancerName;
		}

		public String getEnsRegionId() {
			return this.ensRegionId;
		}

		public void setEnsRegionId(String ensRegionId) {
			this.ensRegionId = ensRegionId;
		}

		public String getLoadBalancerSpec() {
			return this.loadBalancerSpec;
		}

		public void setLoadBalancerSpec(String loadBalancerSpec) {
			this.loadBalancerSpec = loadBalancerSpec;
		}

		public String getVip() {
			return this.vip;
		}

		public void setVip(String vip) {
			this.vip = vip;
		}

		public Integer getVni() {
			return this.vni;
		}

		public void setVni(Integer vni) {
			this.vni = vni;
		}

		public Integer getAcc() {
			return this.acc;
		}

		public void setAcc(Integer acc) {
			this.acc = acc;
		}

		public Integer getReqs2xx() {
			return this.reqs2xx;
		}

		public void setReqs2xx(Integer reqs2xx) {
			this.reqs2xx = reqs2xx;
		}

		public Integer getReqs3xx() {
			return this.reqs3xx;
		}

		public void setReqs3xx(Integer reqs3xx) {
			this.reqs3xx = reqs3xx;
		}

		public Integer getReqs4xx() {
			return this.reqs4xx;
		}

		public void setReqs4xx(Integer reqs4xx) {
			this.reqs4xx = reqs4xx;
		}

		public Integer getReqs5xx() {
			return this.reqs5xx;
		}

		public void setReqs5xx(Integer reqs5xx) {
			this.reqs5xx = reqs5xx;
		}

		public Integer getRtAvg() {
			return this.rtAvg;
		}

		public void setRtAvg(Integer rtAvg) {
			this.rtAvg = rtAvg;
		}

		public String getBizTime() {
			return this.bizTime;
		}

		public void setBizTime(String bizTime) {
			this.bizTime = bizTime;
		}
	}

	@Override
	public DescribeServerLoadBalancerMonitorResponse getInstance(UnmarshallerContext context) {
		return	DescribeServerLoadBalancerMonitorResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
