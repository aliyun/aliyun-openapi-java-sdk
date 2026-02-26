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
import com.aliyuncs.cbn.transform.v20170912.ListCenInterRegionTrafficQosQueuesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListCenInterRegionTrafficQosQueuesResponse extends AcsResponse {

	private String nextToken;

	private String requestId;

	private List<TrafficQosQueue> trafficQosQueues;

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

	public List<TrafficQosQueue> getTrafficQosQueues() {
		return this.trafficQosQueues;
	}

	public void setTrafficQosQueues(List<TrafficQosQueue> trafficQosQueues) {
		this.trafficQosQueues = trafficQosQueues;
	}

	public static class TrafficQosQueue {

		private String transitRouterAttachmentId;

		private String transitRouterId;

		private String trafficQosQueueName;

		private Integer remainBandwidthPercent;

		private String bandwidth;

		private String effectiveBandwidth;

		private String trafficQosPolicyId;

		private String trafficQosQueueId;

		private String trafficQosQueueDescription;

		private String status;

		private List<Integer> dscps;

		public String getTransitRouterAttachmentId() {
			return this.transitRouterAttachmentId;
		}

		public void setTransitRouterAttachmentId(String transitRouterAttachmentId) {
			this.transitRouterAttachmentId = transitRouterAttachmentId;
		}

		public String getTransitRouterId() {
			return this.transitRouterId;
		}

		public void setTransitRouterId(String transitRouterId) {
			this.transitRouterId = transitRouterId;
		}

		public String getTrafficQosQueueName() {
			return this.trafficQosQueueName;
		}

		public void setTrafficQosQueueName(String trafficQosQueueName) {
			this.trafficQosQueueName = trafficQosQueueName;
		}

		public Integer getRemainBandwidthPercent() {
			return this.remainBandwidthPercent;
		}

		public void setRemainBandwidthPercent(Integer remainBandwidthPercent) {
			this.remainBandwidthPercent = remainBandwidthPercent;
		}

		public String getBandwidth() {
			return this.bandwidth;
		}

		public void setBandwidth(String bandwidth) {
			this.bandwidth = bandwidth;
		}

		public String getEffectiveBandwidth() {
			return this.effectiveBandwidth;
		}

		public void setEffectiveBandwidth(String effectiveBandwidth) {
			this.effectiveBandwidth = effectiveBandwidth;
		}

		public String getTrafficQosPolicyId() {
			return this.trafficQosPolicyId;
		}

		public void setTrafficQosPolicyId(String trafficQosPolicyId) {
			this.trafficQosPolicyId = trafficQosPolicyId;
		}

		public String getTrafficQosQueueId() {
			return this.trafficQosQueueId;
		}

		public void setTrafficQosQueueId(String trafficQosQueueId) {
			this.trafficQosQueueId = trafficQosQueueId;
		}

		public String getTrafficQosQueueDescription() {
			return this.trafficQosQueueDescription;
		}

		public void setTrafficQosQueueDescription(String trafficQosQueueDescription) {
			this.trafficQosQueueDescription = trafficQosQueueDescription;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public List<Integer> getDscps() {
			return this.dscps;
		}

		public void setDscps(List<Integer> dscps) {
			this.dscps = dscps;
		}
	}

	@Override
	public ListCenInterRegionTrafficQosQueuesResponse getInstance(UnmarshallerContext context) {
		return	ListCenInterRegionTrafficQosQueuesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
