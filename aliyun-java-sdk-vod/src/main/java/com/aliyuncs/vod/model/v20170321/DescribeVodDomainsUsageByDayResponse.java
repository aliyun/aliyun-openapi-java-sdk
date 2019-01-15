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

package com.aliyuncs.vod.model.v20170321;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.vod.transform.v20170321.DescribeVodDomainsUsageByDayResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeVodDomainsUsageByDayResponse extends AcsResponse {

	private String requestId;

	private String domainName;

	private String dataInterval;

	private String startTime;

	private String endTime;

	private List<UsageByDay> usageByDays;

	private UsageTotal usageTotal;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getDomainName() {
		return this.domainName;
	}

	public void setDomainName(String domainName) {
		this.domainName = domainName;
	}

	public String getDataInterval() {
		return this.dataInterval;
	}

	public void setDataInterval(String dataInterval) {
		this.dataInterval = dataInterval;
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

	public List<UsageByDay> getUsageByDays() {
		return this.usageByDays;
	}

	public void setUsageByDays(List<UsageByDay> usageByDays) {
		this.usageByDays = usageByDays;
	}

	public UsageTotal getUsageTotal() {
		return this.usageTotal;
	}

	public void setUsageTotal(UsageTotal usageTotal) {
		this.usageTotal = usageTotal;
	}

	public static class UsageByDay {

		private String timeStamp;

		private String qps;

		private String bytesHitRate;

		private String requestHitRate;

		private String maxBps;

		private String maxBpsTime;

		private String maxSrcBps;

		private String maxSrcBpsTime;

		private String totalAccess;

		private String totalTraffic;

		public String getTimeStamp() {
			return this.timeStamp;
		}

		public void setTimeStamp(String timeStamp) {
			this.timeStamp = timeStamp;
		}

		public String getQps() {
			return this.qps;
		}

		public void setQps(String qps) {
			this.qps = qps;
		}

		public String getBytesHitRate() {
			return this.bytesHitRate;
		}

		public void setBytesHitRate(String bytesHitRate) {
			this.bytesHitRate = bytesHitRate;
		}

		public String getRequestHitRate() {
			return this.requestHitRate;
		}

		public void setRequestHitRate(String requestHitRate) {
			this.requestHitRate = requestHitRate;
		}

		public String getMaxBps() {
			return this.maxBps;
		}

		public void setMaxBps(String maxBps) {
			this.maxBps = maxBps;
		}

		public String getMaxBpsTime() {
			return this.maxBpsTime;
		}

		public void setMaxBpsTime(String maxBpsTime) {
			this.maxBpsTime = maxBpsTime;
		}

		public String getMaxSrcBps() {
			return this.maxSrcBps;
		}

		public void setMaxSrcBps(String maxSrcBps) {
			this.maxSrcBps = maxSrcBps;
		}

		public String getMaxSrcBpsTime() {
			return this.maxSrcBpsTime;
		}

		public void setMaxSrcBpsTime(String maxSrcBpsTime) {
			this.maxSrcBpsTime = maxSrcBpsTime;
		}

		public String getTotalAccess() {
			return this.totalAccess;
		}

		public void setTotalAccess(String totalAccess) {
			this.totalAccess = totalAccess;
		}

		public String getTotalTraffic() {
			return this.totalTraffic;
		}

		public void setTotalTraffic(String totalTraffic) {
			this.totalTraffic = totalTraffic;
		}
	}

	public static class UsageTotal {

		private String bytesHitRate;

		private String requestHitRate;

		private String maxBps;

		private String maxBpsTime;

		private String maxSrcBps;

		private String maxSrcBpsTime;

		private String totalAccess;

		private String totalTraffic;

		public String getBytesHitRate() {
			return this.bytesHitRate;
		}

		public void setBytesHitRate(String bytesHitRate) {
			this.bytesHitRate = bytesHitRate;
		}

		public String getRequestHitRate() {
			return this.requestHitRate;
		}

		public void setRequestHitRate(String requestHitRate) {
			this.requestHitRate = requestHitRate;
		}

		public String getMaxBps() {
			return this.maxBps;
		}

		public void setMaxBps(String maxBps) {
			this.maxBps = maxBps;
		}

		public String getMaxBpsTime() {
			return this.maxBpsTime;
		}

		public void setMaxBpsTime(String maxBpsTime) {
			this.maxBpsTime = maxBpsTime;
		}

		public String getMaxSrcBps() {
			return this.maxSrcBps;
		}

		public void setMaxSrcBps(String maxSrcBps) {
			this.maxSrcBps = maxSrcBps;
		}

		public String getMaxSrcBpsTime() {
			return this.maxSrcBpsTime;
		}

		public void setMaxSrcBpsTime(String maxSrcBpsTime) {
			this.maxSrcBpsTime = maxSrcBpsTime;
		}

		public String getTotalAccess() {
			return this.totalAccess;
		}

		public void setTotalAccess(String totalAccess) {
			this.totalAccess = totalAccess;
		}

		public String getTotalTraffic() {
			return this.totalTraffic;
		}

		public void setTotalTraffic(String totalTraffic) {
			this.totalTraffic = totalTraffic;
		}
	}

	@Override
	public DescribeVodDomainsUsageByDayResponse getInstance(UnmarshallerContext context) {
		return	DescribeVodDomainsUsageByDayResponseUnmarshaller.unmarshall(this, context);
	}
}
