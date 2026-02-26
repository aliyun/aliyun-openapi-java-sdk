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

package com.aliyuncs.cloud_siem.model.v20220616;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.cloud_siem.transform.v20220616.DescribeCustomizeRuleCountResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeCustomizeRuleCountResponse extends AcsResponse {

	private Boolean success;

	private Integer code;

	private String message;

	private String requestId;

	private Data data;

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Integer inUseRuleNum;

		private Integer highRuleNum;

		private Integer mediumRuleNum;

		private Integer lowRuleNum;

		private Integer totalRuleNum;

		private Integer customizeRuleNum;

		private Integer predefinedRuleNum;

		private Integer unEventRuleNum;

		private Integer expertRuleNum;

		private Integer graphComputingRuleNum;

		private Integer singleAlertRuleNum;

		private Integer aggregationRuleNum;

		public Integer getInUseRuleNum() {
			return this.inUseRuleNum;
		}

		public void setInUseRuleNum(Integer inUseRuleNum) {
			this.inUseRuleNum = inUseRuleNum;
		}

		public Integer getHighRuleNum() {
			return this.highRuleNum;
		}

		public void setHighRuleNum(Integer highRuleNum) {
			this.highRuleNum = highRuleNum;
		}

		public Integer getMediumRuleNum() {
			return this.mediumRuleNum;
		}

		public void setMediumRuleNum(Integer mediumRuleNum) {
			this.mediumRuleNum = mediumRuleNum;
		}

		public Integer getLowRuleNum() {
			return this.lowRuleNum;
		}

		public void setLowRuleNum(Integer lowRuleNum) {
			this.lowRuleNum = lowRuleNum;
		}

		public Integer getTotalRuleNum() {
			return this.totalRuleNum;
		}

		public void setTotalRuleNum(Integer totalRuleNum) {
			this.totalRuleNum = totalRuleNum;
		}

		public Integer getCustomizeRuleNum() {
			return this.customizeRuleNum;
		}

		public void setCustomizeRuleNum(Integer customizeRuleNum) {
			this.customizeRuleNum = customizeRuleNum;
		}

		public Integer getPredefinedRuleNum() {
			return this.predefinedRuleNum;
		}

		public void setPredefinedRuleNum(Integer predefinedRuleNum) {
			this.predefinedRuleNum = predefinedRuleNum;
		}

		public Integer getUnEventRuleNum() {
			return this.unEventRuleNum;
		}

		public void setUnEventRuleNum(Integer unEventRuleNum) {
			this.unEventRuleNum = unEventRuleNum;
		}

		public Integer getExpertRuleNum() {
			return this.expertRuleNum;
		}

		public void setExpertRuleNum(Integer expertRuleNum) {
			this.expertRuleNum = expertRuleNum;
		}

		public Integer getGraphComputingRuleNum() {
			return this.graphComputingRuleNum;
		}

		public void setGraphComputingRuleNum(Integer graphComputingRuleNum) {
			this.graphComputingRuleNum = graphComputingRuleNum;
		}

		public Integer getSingleAlertRuleNum() {
			return this.singleAlertRuleNum;
		}

		public void setSingleAlertRuleNum(Integer singleAlertRuleNum) {
			this.singleAlertRuleNum = singleAlertRuleNum;
		}

		public Integer getAggregationRuleNum() {
			return this.aggregationRuleNum;
		}

		public void setAggregationRuleNum(Integer aggregationRuleNum) {
			this.aggregationRuleNum = aggregationRuleNum;
		}
	}

	@Override
	public DescribeCustomizeRuleCountResponse getInstance(UnmarshallerContext context) {
		return	DescribeCustomizeRuleCountResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
