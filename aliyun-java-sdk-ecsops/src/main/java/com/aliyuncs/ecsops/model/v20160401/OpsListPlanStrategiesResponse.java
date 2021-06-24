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
import com.aliyuncs.ecsops.transform.v20160401.OpsListPlanStrategiesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsListPlanStrategiesResponse extends AcsResponse {

	private String message;

	private String requestId;

	private String code;

	private String success;

	private List<PlanStrategy> planStrategies;

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

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getSuccess() {
		return this.success;
	}

	public void setSuccess(String success) {
		this.success = success;
	}

	public List<PlanStrategy> getPlanStrategies() {
		return this.planStrategies;
	}

	public void setPlanStrategies(List<PlanStrategy> planStrategies) {
		this.planStrategies = planStrategies;
	}

	public static class PlanStrategy {

		private String step;

		private String model;

		private String strategyName;

		private String description;

		private String orders;

		private Integer forks;

		public String getStep() {
			return this.step;
		}

		public void setStep(String step) {
			this.step = step;
		}

		public String getModel() {
			return this.model;
		}

		public void setModel(String model) {
			this.model = model;
		}

		public String getStrategyName() {
			return this.strategyName;
		}

		public void setStrategyName(String strategyName) {
			this.strategyName = strategyName;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getOrders() {
			return this.orders;
		}

		public void setOrders(String orders) {
			this.orders = orders;
		}

		public Integer getForks() {
			return this.forks;
		}

		public void setForks(Integer forks) {
			this.forks = forks;
		}
	}

	@Override
	public OpsListPlanStrategiesResponse getInstance(UnmarshallerContext context) {
		return	OpsListPlanStrategiesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
