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

package com.aliyuncs.vpc.model.v20160428;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.vpc.transform.v20160428.ListNatGatewayEcsMetricResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListNatGatewayEcsMetricResponse extends AcsResponse {

	private String requestId;

	private String nextToken;

	private Integer maxResults;

	private List<MetricData> metricDataList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public Integer getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(Integer maxResults) {
		this.maxResults = maxResults;
	}

	public List<MetricData> getMetricDataList() {
		return this.metricDataList;
	}

	public void setMetricDataList(List<MetricData> metricDataList) {
		this.metricDataList = metricDataList;
	}

	public static class MetricData {

		private String natGatewayId;

		private String privateIpAddress;

		private Long timestamp;

		private Long activeSessionNum;

		private Long newSessionRate;

		private Long rxBps;

		private Long txBps;

		private Long txBps1;

		private Long rxPps;

		private Long txPps;

		public String getNatGatewayId() {
			return this.natGatewayId;
		}

		public void setNatGatewayId(String natGatewayId) {
			this.natGatewayId = natGatewayId;
		}

		public String getPrivateIpAddress() {
			return this.privateIpAddress;
		}

		public void setPrivateIpAddress(String privateIpAddress) {
			this.privateIpAddress = privateIpAddress;
		}

		public Long getTimestamp() {
			return this.timestamp;
		}

		public void setTimestamp(Long timestamp) {
			this.timestamp = timestamp;
		}

		public Long getActiveSessionNum() {
			return this.activeSessionNum;
		}

		public void setActiveSessionNum(Long activeSessionNum) {
			this.activeSessionNum = activeSessionNum;
		}

		public Long getNewSessionRate() {
			return this.newSessionRate;
		}

		public void setNewSessionRate(Long newSessionRate) {
			this.newSessionRate = newSessionRate;
		}

		public Long getRxBps() {
			return this.rxBps;
		}

		public void setRxBps(Long rxBps) {
			this.rxBps = rxBps;
		}

		public Long getTxBps() {
			return this.txBps;
		}

		public void setTxBps(Long txBps) {
			this.txBps = txBps;
		}

		public Long getTxBps1() {
			return this.txBps1;
		}

		public void setTxBps1(Long txBps1) {
			this.txBps1 = txBps1;
		}

		public Long getRxPps() {
			return this.rxPps;
		}

		public void setRxPps(Long rxPps) {
			this.rxPps = rxPps;
		}

		public Long getTxPps() {
			return this.txPps;
		}

		public void setTxPps(Long txPps) {
			this.txPps = txPps;
		}
	}

	@Override
	public ListNatGatewayEcsMetricResponse getInstance(UnmarshallerContext context) {
		return	ListNatGatewayEcsMetricResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
