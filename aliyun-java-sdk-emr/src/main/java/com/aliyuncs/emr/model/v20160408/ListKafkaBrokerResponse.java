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

package com.aliyuncs.emr.model.v20160408;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.emr.transform.v20160408.ListKafkaBrokerResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListKafkaBrokerResponse extends AcsResponse {

	private String requestId;

	private Integer total;

	private Integer pageSize;

	private Integer pageNumber;

	private List<Broker> brokerList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotal() {
		return this.total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public List<Broker> getBrokerList() {
		return this.brokerList;
	}

	public void setBrokerList(List<Broker> brokerList) {
		this.brokerList = brokerList;
	}

	public static class Broker {

		private Integer brokerId;

		private String hostId;

		private String hostName;

		private String hostIp;

		private String status;

		private Integer partitionCount;

		private Integer leaderCount;

		private Integer topicCount;

		private String diskUnbalanceRate;

		private String diskUsageMean;

		private String diskUsageMax;

		private Integer diskCapacity;

		private String trafficIn;

		private String trafficOut;

		public Integer getBrokerId() {
			return this.brokerId;
		}

		public void setBrokerId(Integer brokerId) {
			this.brokerId = brokerId;
		}

		public String getHostId() {
			return this.hostId;
		}

		public void setHostId(String hostId) {
			this.hostId = hostId;
		}

		public String getHostName() {
			return this.hostName;
		}

		public void setHostName(String hostName) {
			this.hostName = hostName;
		}

		public String getHostIp() {
			return this.hostIp;
		}

		public void setHostIp(String hostIp) {
			this.hostIp = hostIp;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public Integer getPartitionCount() {
			return this.partitionCount;
		}

		public void setPartitionCount(Integer partitionCount) {
			this.partitionCount = partitionCount;
		}

		public Integer getLeaderCount() {
			return this.leaderCount;
		}

		public void setLeaderCount(Integer leaderCount) {
			this.leaderCount = leaderCount;
		}

		public Integer getTopicCount() {
			return this.topicCount;
		}

		public void setTopicCount(Integer topicCount) {
			this.topicCount = topicCount;
		}

		public String getDiskUnbalanceRate() {
			return this.diskUnbalanceRate;
		}

		public void setDiskUnbalanceRate(String diskUnbalanceRate) {
			this.diskUnbalanceRate = diskUnbalanceRate;
		}

		public String getDiskUsageMean() {
			return this.diskUsageMean;
		}

		public void setDiskUsageMean(String diskUsageMean) {
			this.diskUsageMean = diskUsageMean;
		}

		public String getDiskUsageMax() {
			return this.diskUsageMax;
		}

		public void setDiskUsageMax(String diskUsageMax) {
			this.diskUsageMax = diskUsageMax;
		}

		public Integer getDiskCapacity() {
			return this.diskCapacity;
		}

		public void setDiskCapacity(Integer diskCapacity) {
			this.diskCapacity = diskCapacity;
		}

		public String getTrafficIn() {
			return this.trafficIn;
		}

		public void setTrafficIn(String trafficIn) {
			this.trafficIn = trafficIn;
		}

		public String getTrafficOut() {
			return this.trafficOut;
		}

		public void setTrafficOut(String trafficOut) {
			this.trafficOut = trafficOut;
		}
	}

	@Override
	public ListKafkaBrokerResponse getInstance(UnmarshallerContext context) {
		return	ListKafkaBrokerResponseUnmarshaller.unmarshall(this, context);
	}
}
