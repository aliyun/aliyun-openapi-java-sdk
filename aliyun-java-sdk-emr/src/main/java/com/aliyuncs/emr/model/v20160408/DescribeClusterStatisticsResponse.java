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
import com.aliyuncs.emr.transform.v20160408.DescribeClusterStatisticsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeClusterStatisticsResponse extends AcsResponse {

	private String requestId;

	private Integer totalCount;

	private List<ClusterStatistics> clusterStatisticsList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<ClusterStatistics> getClusterStatisticsList() {
		return this.clusterStatisticsList;
	}

	public void setClusterStatisticsList(List<ClusterStatistics> clusterStatisticsList) {
		this.clusterStatisticsList = clusterStatisticsList;
	}

	public static class ClusterStatistics {

		private String clusterType;

		private Integer count;

		private String clusterStatus;

		public String getClusterType() {
			return this.clusterType;
		}

		public void setClusterType(String clusterType) {
			this.clusterType = clusterType;
		}

		public Integer getCount() {
			return this.count;
		}

		public void setCount(Integer count) {
			this.count = count;
		}

		public String getClusterStatus() {
			return this.clusterStatus;
		}

		public void setClusterStatus(String clusterStatus) {
			this.clusterStatus = clusterStatus;
		}
	}

	@Override
	public DescribeClusterStatisticsResponse getInstance(UnmarshallerContext context) {
		return	DescribeClusterStatisticsResponseUnmarshaller.unmarshall(this, context);
	}
}
