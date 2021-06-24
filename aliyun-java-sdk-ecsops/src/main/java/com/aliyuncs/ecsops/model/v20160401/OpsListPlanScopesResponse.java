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
import com.aliyuncs.ecsops.transform.v20160401.OpsListPlanScopesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsListPlanScopesResponse extends AcsResponse {

	private String message;

	private String requestId;

	private String code;

	private String success;

	private List<PlanScope> planScopes;

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

	public List<PlanScope> getPlanScopes() {
		return this.planScopes;
	}

	public void setPlanScopes(List<PlanScope> planScopes) {
		this.planScopes = planScopes;
	}

	public static class PlanScope {

		private String scopeName;

		private List<String> scopeValue;

		public String getScopeName() {
			return this.scopeName;
		}

		public void setScopeName(String scopeName) {
			this.scopeName = scopeName;
		}

		public List<String> getScopeValue() {
			return this.scopeValue;
		}

		public void setScopeValue(List<String> scopeValue) {
			this.scopeValue = scopeValue;
		}
	}

	@Override
	public OpsListPlanScopesResponse getInstance(UnmarshallerContext context) {
		return	OpsListPlanScopesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
