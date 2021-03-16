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

package com.aliyuncs.ecsops.model.v20160401;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecsops.transform.v20160401.OpsDescribeChangePlansResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsDescribeChangePlansResponse extends AcsResponse {

	private String requestId;

	private Data data;

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

		private List<Plan> plans;

		public List<Plan> getPlans() {
			return this.plans;
		}

		public void setPlans(List<Plan> plans) {
			this.plans = plans;
		}

		public static class Plan {

			private String planId;

			private String planningStatus;

			private String operationStatus;

			private String strategy;

			private String strategyModel;

			private String groups;

			private String scopes;

			private String gmtCreated;

			private String gmtModified;

			private String operator;

			private String extensions;

			private String changeDescription;

			public String getPlanId() {
				return this.planId;
			}

			public void setPlanId(String planId) {
				this.planId = planId;
			}

			public String getPlanningStatus() {
				return this.planningStatus;
			}

			public void setPlanningStatus(String planningStatus) {
				this.planningStatus = planningStatus;
			}

			public String getOperationStatus() {
				return this.operationStatus;
			}

			public void setOperationStatus(String operationStatus) {
				this.operationStatus = operationStatus;
			}

			public String getStrategy() {
				return this.strategy;
			}

			public void setStrategy(String strategy) {
				this.strategy = strategy;
			}

			public String getStrategyModel() {
				return this.strategyModel;
			}

			public void setStrategyModel(String strategyModel) {
				this.strategyModel = strategyModel;
			}

			public String getGroups() {
				return this.groups;
			}

			public void setGroups(String groups) {
				this.groups = groups;
			}

			public String getScopes() {
				return this.scopes;
			}

			public void setScopes(String scopes) {
				this.scopes = scopes;
			}

			public String getGmtCreated() {
				return this.gmtCreated;
			}

			public void setGmtCreated(String gmtCreated) {
				this.gmtCreated = gmtCreated;
			}

			public String getGmtModified() {
				return this.gmtModified;
			}

			public void setGmtModified(String gmtModified) {
				this.gmtModified = gmtModified;
			}

			public String getOperator() {
				return this.operator;
			}

			public void setOperator(String operator) {
				this.operator = operator;
			}

			public String getExtensions() {
				return this.extensions;
			}

			public void setExtensions(String extensions) {
				this.extensions = extensions;
			}

			public String getChangeDescription() {
				return this.changeDescription;
			}

			public void setChangeDescription(String changeDescription) {
				this.changeDescription = changeDescription;
			}
		}
	}

	@Override
	public OpsDescribeChangePlansResponse getInstance(UnmarshallerContext context) {
		return	OpsDescribeChangePlansResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
