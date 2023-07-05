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

package com.aliyuncs.advisor_share.model.v20180608;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.advisor_share.transform.v20180608.DescribeResourceDistributionResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeResourceDistributionResponse extends AcsResponse {

	private String requestId;

	private List<ResourceDistribution> data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<ResourceDistribution> getData() {
		return this.data;
	}

	public void setData(List<ResourceDistribution> data) {
		this.data = data;
	}

	public static class ResourceDistribution {

		private Integer checksNumOn;

		private String product;

		private Integer failCount;

		private Integer normalCount;

		private Integer checksNumOff;

		private Integer warningCount;

		private String riskRate;

		private Integer checkItemCount;

		private Integer totalCount;

		private Integer criticalCount;

		private String details;

		public Integer getChecksNumOn() {
			return this.checksNumOn;
		}

		public void setChecksNumOn(Integer checksNumOn) {
			this.checksNumOn = checksNumOn;
		}

		public String getProduct() {
			return this.product;
		}

		public void setProduct(String product) {
			this.product = product;
		}

		public Integer getFailCount() {
			return this.failCount;
		}

		public void setFailCount(Integer failCount) {
			this.failCount = failCount;
		}

		public Integer getNormalCount() {
			return this.normalCount;
		}

		public void setNormalCount(Integer normalCount) {
			this.normalCount = normalCount;
		}

		public Integer getChecksNumOff() {
			return this.checksNumOff;
		}

		public void setChecksNumOff(Integer checksNumOff) {
			this.checksNumOff = checksNumOff;
		}

		public Integer getWarningCount() {
			return this.warningCount;
		}

		public void setWarningCount(Integer warningCount) {
			this.warningCount = warningCount;
		}

		public String getRiskRate() {
			return this.riskRate;
		}

		public void setRiskRate(String riskRate) {
			this.riskRate = riskRate;
		}

		public Integer getCheckItemCount() {
			return this.checkItemCount;
		}

		public void setCheckItemCount(Integer checkItemCount) {
			this.checkItemCount = checkItemCount;
		}

		public Integer getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Integer totalCount) {
			this.totalCount = totalCount;
		}

		public Integer getCriticalCount() {
			return this.criticalCount;
		}

		public void setCriticalCount(Integer criticalCount) {
			this.criticalCount = criticalCount;
		}

		public String getDetails() {
			return this.details;
		}

		public void setDetails(String details) {
			this.details = details;
		}
	}

	@Override
	public DescribeResourceDistributionResponse getInstance(UnmarshallerContext context) {
		return	DescribeResourceDistributionResponseUnmarshaller.unmarshall(this, context);
	}
}
