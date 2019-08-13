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
import com.aliyuncs.emr.transform.v20160408.GetHdfsCapacityStatisticInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetHdfsCapacityStatisticInfoResponse extends AcsResponse {

	private String requestId;

	private List<ClusterStatHdfsCapacity> hdfsCapacityList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<ClusterStatHdfsCapacity> getHdfsCapacityList() {
		return this.hdfsCapacityList;
	}

	public void setHdfsCapacityList(List<ClusterStatHdfsCapacity> hdfsCapacityList) {
		this.hdfsCapacityList = hdfsCapacityList;
	}

	public static class ClusterStatHdfsCapacity {

		private Long capacityTotal;

		private Long capacityTotalGB;

		private Long capacityUsed;

		private Long capacityUsedGB;

		private Long capacityRemaining;

		private Long capacityRemainingGB;

		private Long capacityUsedNonDfs;

		private String clusterBizId;

		private String dateTime;

		public Long getCapacityTotal() {
			return this.capacityTotal;
		}

		public void setCapacityTotal(Long capacityTotal) {
			this.capacityTotal = capacityTotal;
		}

		public Long getCapacityTotalGB() {
			return this.capacityTotalGB;
		}

		public void setCapacityTotalGB(Long capacityTotalGB) {
			this.capacityTotalGB = capacityTotalGB;
		}

		public Long getCapacityUsed() {
			return this.capacityUsed;
		}

		public void setCapacityUsed(Long capacityUsed) {
			this.capacityUsed = capacityUsed;
		}

		public Long getCapacityUsedGB() {
			return this.capacityUsedGB;
		}

		public void setCapacityUsedGB(Long capacityUsedGB) {
			this.capacityUsedGB = capacityUsedGB;
		}

		public Long getCapacityRemaining() {
			return this.capacityRemaining;
		}

		public void setCapacityRemaining(Long capacityRemaining) {
			this.capacityRemaining = capacityRemaining;
		}

		public Long getCapacityRemainingGB() {
			return this.capacityRemainingGB;
		}

		public void setCapacityRemainingGB(Long capacityRemainingGB) {
			this.capacityRemainingGB = capacityRemainingGB;
		}

		public Long getCapacityUsedNonDfs() {
			return this.capacityUsedNonDfs;
		}

		public void setCapacityUsedNonDfs(Long capacityUsedNonDfs) {
			this.capacityUsedNonDfs = capacityUsedNonDfs;
		}

		public String getClusterBizId() {
			return this.clusterBizId;
		}

		public void setClusterBizId(String clusterBizId) {
			this.clusterBizId = clusterBizId;
		}

		public String getDateTime() {
			return this.dateTime;
		}

		public void setDateTime(String dateTime) {
			this.dateTime = dateTime;
		}
	}

	@Override
	public GetHdfsCapacityStatisticInfoResponse getInstance(UnmarshallerContext context) {
		return	GetHdfsCapacityStatisticInfoResponseUnmarshaller.unmarshall(this, context);
	}
}
