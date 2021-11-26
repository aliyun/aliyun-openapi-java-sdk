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

package com.aliyuncs.cbn.model.v20170912;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cbn.transform.v20170912.ListCenInterRegionTrafficQosPoliciesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListCenInterRegionTrafficQosPoliciesResponse extends AcsResponse {

	private String nextToken;

	private String requestId;

	private Integer totalCount;

	private Integer maxResults;

	private List<TrafficQosPolicy> trafficQosPolicies;

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

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

	public Integer getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(Integer maxResults) {
		this.maxResults = maxResults;
	}

	public List<TrafficQosPolicy> getTrafficQosPolicies() {
		return this.trafficQosPolicies;
	}

	public void setTrafficQosPolicies(List<TrafficQosPolicy> trafficQosPolicies) {
		this.trafficQosPolicies = trafficQosPolicies;
	}

	public static class TrafficQosPolicy {

		private String trafficQosPolicyName;

		private String trafficQosPolicyStatus;

		private String trafficQosPolicyId;

		private String trafficQosPolicyDescription;

		private List<TrafficQosQueue> trafficQosQueues;

		public String getTrafficQosPolicyName() {
			return this.trafficQosPolicyName;
		}

		public void setTrafficQosPolicyName(String trafficQosPolicyName) {
			this.trafficQosPolicyName = trafficQosPolicyName;
		}

		public String getTrafficQosPolicyStatus() {
			return this.trafficQosPolicyStatus;
		}

		public void setTrafficQosPolicyStatus(String trafficQosPolicyStatus) {
			this.trafficQosPolicyStatus = trafficQosPolicyStatus;
		}

		public String getTrafficQosPolicyId() {
			return this.trafficQosPolicyId;
		}

		public void setTrafficQosPolicyId(String trafficQosPolicyId) {
			this.trafficQosPolicyId = trafficQosPolicyId;
		}

		public String getTrafficQosPolicyDescription() {
			return this.trafficQosPolicyDescription;
		}

		public void setTrafficQosPolicyDescription(String trafficQosPolicyDescription) {
			this.trafficQosPolicyDescription = trafficQosPolicyDescription;
		}

		public List<TrafficQosQueue> getTrafficQosQueues() {
			return this.trafficQosQueues;
		}

		public void setTrafficQosQueues(List<TrafficQosQueue> trafficQosQueues) {
			this.trafficQosQueues = trafficQosQueues;
		}

		public static class TrafficQosQueue {

			private String qosQueueName;

			private Integer remainBandwidthPercent;

			private String qosQueueId;

			private String qosQueueDescription;

			private List<Integer> dscps;

			public String getQosQueueName() {
				return this.qosQueueName;
			}

			public void setQosQueueName(String qosQueueName) {
				this.qosQueueName = qosQueueName;
			}

			public Integer getRemainBandwidthPercent() {
				return this.remainBandwidthPercent;
			}

			public void setRemainBandwidthPercent(Integer remainBandwidthPercent) {
				this.remainBandwidthPercent = remainBandwidthPercent;
			}

			public String getQosQueueId() {
				return this.qosQueueId;
			}

			public void setQosQueueId(String qosQueueId) {
				this.qosQueueId = qosQueueId;
			}

			public String getQosQueueDescription() {
				return this.qosQueueDescription;
			}

			public void setQosQueueDescription(String qosQueueDescription) {
				this.qosQueueDescription = qosQueueDescription;
			}

			public List<Integer> getDscps() {
				return this.dscps;
			}

			public void setDscps(List<Integer> dscps) {
				this.dscps = dscps;
			}
		}
	}

	@Override
	public ListCenInterRegionTrafficQosPoliciesResponse getInstance(UnmarshallerContext context) {
		return	ListCenInterRegionTrafficQosPoliciesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
