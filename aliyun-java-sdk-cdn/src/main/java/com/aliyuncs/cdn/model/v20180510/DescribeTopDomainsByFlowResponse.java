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

package com.aliyuncs.cdn.model.v20180510;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cdn.transform.v20180510.DescribeTopDomainsByFlowResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeTopDomainsByFlowResponse extends AcsResponse {

	private String requestId;

	private String startTime;

	private String endTime;

	private Long domainCount;

	private Long domainOnlineCount;

	private List<TopDomain> topDomains;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getStartTime() {
		return this.startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return this.endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public Long getDomainCount() {
		return this.domainCount;
	}

	public void setDomainCount(Long domainCount) {
		this.domainCount = domainCount;
	}

	public Long getDomainOnlineCount() {
		return this.domainOnlineCount;
	}

	public void setDomainOnlineCount(Long domainOnlineCount) {
		this.domainOnlineCount = domainOnlineCount;
	}

	public List<TopDomain> getTopDomains() {
		return this.topDomains;
	}

	public void setTopDomains(List<TopDomain> topDomains) {
		this.topDomains = topDomains;
	}

	public static class TopDomain {

		private String domainName;

		private Long rank;

		private String totalTraffic;

		private String trafficPercent;

		private Float maxBps;

		private String maxBpsTime;

		private Long totalAccess;

		public String getDomainName() {
			return this.domainName;
		}

		public void setDomainName(String domainName) {
			this.domainName = domainName;
		}

		public Long getRank() {
			return this.rank;
		}

		public void setRank(Long rank) {
			this.rank = rank;
		}

		public String getTotalTraffic() {
			return this.totalTraffic;
		}

		public void setTotalTraffic(String totalTraffic) {
			this.totalTraffic = totalTraffic;
		}

		public String getTrafficPercent() {
			return this.trafficPercent;
		}

		public void setTrafficPercent(String trafficPercent) {
			this.trafficPercent = trafficPercent;
		}

		public Float getMaxBps() {
			return this.maxBps;
		}

		public void setMaxBps(Float maxBps) {
			this.maxBps = maxBps;
		}

		public String getMaxBpsTime() {
			return this.maxBpsTime;
		}

		public void setMaxBpsTime(String maxBpsTime) {
			this.maxBpsTime = maxBpsTime;
		}

		public Long getTotalAccess() {
			return this.totalAccess;
		}

		public void setTotalAccess(Long totalAccess) {
			this.totalAccess = totalAccess;
		}
	}

	@Override
	public DescribeTopDomainsByFlowResponse getInstance(UnmarshallerContext context) {
		return	DescribeTopDomainsByFlowResponseUnmarshaller.unmarshall(this, context);
	}
}
