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

package com.aliyuncs.ecsinc.model.v20160314;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecsinc.transform.v20160314.QueryEcsElasticUpgradeInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryEcsElasticUpgradeInfoResponse extends AcsResponse {

	private String requestId;

	private String instanceId;

	private String baseInstanceType;

	private String currentInstanceType;

	private String elasticModificationUtcStartTime;

	private String elasticModificationUtcEndTime;

	private Integer baseBandwidth;

	private Integer currentBandwidth;

	private List<BandwidthTimeRange> bandwidthTimeRangeList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
	}

	public String getBaseInstanceType() {
		return this.baseInstanceType;
	}

	public void setBaseInstanceType(String baseInstanceType) {
		this.baseInstanceType = baseInstanceType;
	}

	public String getCurrentInstanceType() {
		return this.currentInstanceType;
	}

	public void setCurrentInstanceType(String currentInstanceType) {
		this.currentInstanceType = currentInstanceType;
	}

	public String getElasticModificationUtcStartTime() {
		return this.elasticModificationUtcStartTime;
	}

	public void setElasticModificationUtcStartTime(String elasticModificationUtcStartTime) {
		this.elasticModificationUtcStartTime = elasticModificationUtcStartTime;
	}

	public String getElasticModificationUtcEndTime() {
		return this.elasticModificationUtcEndTime;
	}

	public void setElasticModificationUtcEndTime(String elasticModificationUtcEndTime) {
		this.elasticModificationUtcEndTime = elasticModificationUtcEndTime;
	}

	public Integer getBaseBandwidth() {
		return this.baseBandwidth;
	}

	public void setBaseBandwidth(Integer baseBandwidth) {
		this.baseBandwidth = baseBandwidth;
	}

	public Integer getCurrentBandwidth() {
		return this.currentBandwidth;
	}

	public void setCurrentBandwidth(Integer currentBandwidth) {
		this.currentBandwidth = currentBandwidth;
	}

	public List<BandwidthTimeRange> getBandwidthTimeRangeList() {
		return this.bandwidthTimeRangeList;
	}

	public void setBandwidthTimeRangeList(List<BandwidthTimeRange> bandwidthTimeRangeList) {
		this.bandwidthTimeRangeList = bandwidthTimeRangeList;
	}

	public static class BandwidthTimeRange {

		private String startUtcTime;

		private String endUtcTime;

		private Integer bandwidthValue;

		public String getStartUtcTime() {
			return this.startUtcTime;
		}

		public void setStartUtcTime(String startUtcTime) {
			this.startUtcTime = startUtcTime;
		}

		public String getEndUtcTime() {
			return this.endUtcTime;
		}

		public void setEndUtcTime(String endUtcTime) {
			this.endUtcTime = endUtcTime;
		}

		public Integer getBandwidthValue() {
			return this.bandwidthValue;
		}

		public void setBandwidthValue(Integer bandwidthValue) {
			this.bandwidthValue = bandwidthValue;
		}
	}

	@Override
	public QueryEcsElasticUpgradeInfoResponse getInstance(UnmarshallerContext context) {
		return	QueryEcsElasticUpgradeInfoResponseUnmarshaller.unmarshall(this, context);
	}
}
