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
import com.aliyuncs.advisor_share.transform.v20180608.QueryInstanceDetailsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryInstanceDetailsResponse extends AcsResponse {

	private Boolean success;

	private Data data;

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String chargeType;

		private String instanceId;

		private Double payOfCurrentMonth;

		private String resourceSpec;

		private String departmentName;

		private String appName;

		private String userId;

		private List<AdviceItemsItem> adviceItems;

		public String getChargeType() {
			return this.chargeType;
		}

		public void setChargeType(String chargeType) {
			this.chargeType = chargeType;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public Double getPayOfCurrentMonth() {
			return this.payOfCurrentMonth;
		}

		public void setPayOfCurrentMonth(Double payOfCurrentMonth) {
			this.payOfCurrentMonth = payOfCurrentMonth;
		}

		public String getResourceSpec() {
			return this.resourceSpec;
		}

		public void setResourceSpec(String resourceSpec) {
			this.resourceSpec = resourceSpec;
		}

		public String getDepartmentName() {
			return this.departmentName;
		}

		public void setDepartmentName(String departmentName) {
			this.departmentName = departmentName;
		}

		public String getAppName() {
			return this.appName;
		}

		public void setAppName(String appName) {
			this.appName = appName;
		}

		public String getUserId() {
			return this.userId;
		}

		public void setUserId(String userId) {
			this.userId = userId;
		}

		public List<AdviceItemsItem> getAdviceItems() {
			return this.adviceItems;
		}

		public void setAdviceItems(List<AdviceItemsItem> adviceItems) {
			this.adviceItems = adviceItems;
		}

		public static class AdviceItemsItem {

			private String advice;

			private String ruleType;

			public String getAdvice() {
				return this.advice;
			}

			public void setAdvice(String advice) {
				this.advice = advice;
			}

			public String getRuleType() {
				return this.ruleType;
			}

			public void setRuleType(String ruleType) {
				this.ruleType = ruleType;
			}
		}
	}

	@Override
	public QueryInstanceDetailsResponse getInstance(UnmarshallerContext context) {
		return	QueryInstanceDetailsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
